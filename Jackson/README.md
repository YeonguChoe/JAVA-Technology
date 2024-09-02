# Jackson Library


### model/MessageRecord.java

```java
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageRecord {
    private String from;
    private String to;
    private String message;
    private String time;
}
```


### service/MessageService.java

```java
@Service
public class MessageService {
    // 스프링 프로젝트가 존재하는 위치를 시작으로 FILE_PATH 경로를 지정한다.
    // 주의 사항1: FILE_PATH의 맨 앞에 '/'를 넣으면 안된다.
    // 주의 사항2: FILE_PATH의 파일 안에는 최소한 '[]'가 들어 있어야 한다.
    private static final String FILE_PATH = "src/main/resources/static/history.json";
    private ObjectMapper objectMapper = new ObjectMapper();

    public void saveMessageRecord(MessageRecord newMessage) throws IOException {
        // 파일의 경로를 절대 경로로 바꾼다.
        String absolutePath = new File(FILE_PATH).getAbsolutePath();
        File jsonFile = new File(absolutePath);

        // 메세지 리스트 초기화
        List<MessageRecord> messageList = new ArrayList<>();

        // JSON 파일에서 문자열을 읽어오기
        byte[] jsonData = Files.readAllBytes(jsonFile.toPath());

        // TypeFactory를 이용하여 List<MessageRecord> 타입을 정의 한다.
        // 제네릭 타입인 List<T>는 컴파일되어 바이트 코드로 될때, List<T> 자료구조에 대한 구분이 소멸된다.
        // 따라서, TypeFactory를 이용해서 컴파일 된후에도 사용할수 있는 List<T> 자료형을 정의한다.
        JavaType messageListType = objectMapper.getTypeFactory().constructCollectionType(List.class,
                MessageRecord.class);

        // JSON 파일 안에 있던 문자열을 List<MessageRecord> 객체로 변환한다.
        messageList = objectMapper.readValue(jsonData, messageListType);

        // 새로운 메세지를 추가한다.
        messageList.add(newMessage);

        // List<MessageRecord> 객체를 jsonFile에 저장한다.
        objectMapper.writeValue(jsonFile, messageList);

    }
}
```

