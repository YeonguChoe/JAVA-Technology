# Maven  
- Documentation: https://maven.apache.org/
- Archetype: 처음 프로젝트 만들때 template을 의미한다.

## Maven 프로젝트의 Folder Structure
- `src/main/java`: 개발에 필요한 소스코드
- `src/main/resources`: 소스코드가 사용하는 라이브러리
- `src/test/java`: 유닛 테스트 코드
- `src/test/resources`: 테스트 코드가 사용하는 라이브러리
- `pom.xml`: 프로젝트에 대한 라이브러리와 설정에 대한 내용을 담은 파일

## Maven Build Lifecycle
1. Validate
2. Compile
3. Test
4. Package
5. Integration Test
6. Verify
7. Install
8. Deploy


## Maven Wrapper
- Maven Wrapper가 있으면 maven이 컴퓨터에 다운로드 되어 있지 않아도 된다.

```bash
mvn wrapper:wrapper
```

## 프로젝트의 구조 및 pom.xml가 잘 되어 있는지 확인
```bash
mvn validate
```
또는
```bash
./mvnw validate
```

## pom.xml

### `<properties>`
- 변수 선언

```xml
<properties>
    <junit.version>5.8.2</junit.version>
</properties>
```

- 변수 사용

```xml
<version>${junit.version}</version>
```

## target 폴더 지우기

```bash
mvn clean
```

## 소스 코드를 컴파일 해서 target 폴더 만들기

```bash
mvn compile
```

## 테스트 소스코드 실행 시키기
- 소스코드를 컴파일 하고, 테스트 소스코드를 컴파일한뒤 실행 시킨다.
```bash
mvn test
```

## jar 파일 만들기
- jar 파일로 만들면 deploy가 가능해 진다.
- target 폴더에 jar 파일을 만든다.

```bash
mvn package
```

## jar 파일을 로컬 Maven 저장소에 설치하기

```bash
mvn install
```

## resources 폴더
- 이미지 파일과 같이 컴파일 되지 않는 코드를 `src/main`폴더 또는 `src/test`폴더에 `resources`폴더에 넣는다.
- `application.properties`도 resources 폴더에 넣는다.

