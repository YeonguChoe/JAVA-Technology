# Apache Commons CSV

### [Maven Repository](https://mvnrepository.com/artifact/org.apache.commons/commons-csv)

```
<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-csv</artifactId>
    <version>1.11.0</version>
</dependency>
```

### model/Message.java

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private String from;
    private String to;
    private String date;
    private String time;
    private String content;
}
```

### service/MessageService.java

```java
@Service
public class MessageService {
        private final String FILE_PATH = "src/main/resources/static/history.csv";

        // from, to, time, content 순서로 csv에 저장
        public synchronized void saveMessage(String from, String to, String date, String time, String content)
                        throws Exception {
                Message message = new Message(from, to, date, time, content);
                FileWriter writer = new FileWriter(FILE_PATH, true);
                CSVFormat csvFormat = CSVFormat.Builder.create()
                                .setRecordSeparator("\n") // 레코드 구분자 설정 (선택적)
                                .build();
                CSVPrinter csvPrinter = new CSVPrinter(writer, csvFormat);
                csvPrinter.printRecord(message.getFrom(), message.getTo(), message.getDate(), message.getTime(),
                                message.getContent());
                csvPrinter.flush();
        }
}
```


### handler/ChatHandler.java

```java
...
// Message Service 주입
@Autowired
private MessageService messageService;
...
@Autowired
public ChatHandler(MessageService messageService) {
    this.messageService = messageService;
}
...
// API: 서버로 메세지가 들어왔을때, 서버가 처리하는 방법
@Override
protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
    // 메세지를 받으면, 상대방 유저에게 메세지 전달
    WebSocketSession connectedSession = connectedPair.get(session);
    if (connectedSession != null) {
        connectedSession.sendMessage(message);

        // Message를 CSV로 저장
        String from = ipAddressBook.get(session);
        String to = ipAddressBook.get(connectedSession);
        DateTimeFormatter dateFormatter = DateTimeFormatter.ISO_DATE;
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedDate = LocalDateTime.now().format(dateFormatter);
        String formattedTime = LocalDateTime.now().format(timeFormatter);
        messageService.saveMessage(from, to, formattedDate, formattedTime, message.getPayload());
    }
}
...
```

