# pom.xml 작성 방법

## xml 선언문
```xml
<?xml version="1.0" encoding="UTF-8"?>
```
- 하는일
    - xml 버전을 지정 (버전 1.0)
    - 문자 데이터를 어떤 방식으로 읽어야 하는지 지정 (인코딩: UTF-8)

## pom.xml의 루트 요소
```xml
<project
    xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">

</project>
```
- 하는일
    - `xmlns="http://maven.apache.org/POM/4.0.0"`: pom.xml 파일에 사용될수 있는 유효한 태그들만 사용될 수 있도록 제한하는 기능을 한다.
    - `xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"`: xml 문서가 올바른 구조를 유지하는지 제한하는 기능을 한다.
    - `xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd"`: xml 문서의 유효성에 대한 정보를 갖고 있는 웹페이지 주소를 정의한다.

## pom.xml 파일의 버전
```xml
<modelVersion>4.0.0</modelVersion>
```
- 하는일
    - pom.xml의 규격을 4.0.0 버전으로 지정한다.

## 다른 pom.xml에서 내용 가져오기
```xml
<parent></parent>
```
- 하는일
    - 다른 pom.xml 파일에 있는 내용을 현재 pom.xml 파일로 가져온다.

## 그룹 ID
```xml
<groupId>ca.hackathon</groupId>
```
- Group ID: 회사 이름; Maven Central Repository에서 사용되는 그룹 ID

## Artifact ID
```xml
<artifactId>desktop-project</artifactId>
```

- Artifact ID: 프로젝트 이름 (Artifact와 프로젝트와 같은 말이다); 만들어지는 `jar` 파일의 이름

## 버전
```xml
<version>0.0.1-SNAPSHOT</version>
```

- version: SNAPSHOT은 release 버전이 아니라 작업중인 버전이라는 의미이다.

## 프로젝트 이름 지정
```xml
<name>project1</name>
```
- 하는일
    - maven repository에서 검색될 키워드를 지정한다.

## 프로젝트에 대한 설명 지정
```xml
<description>This is the desktop application written in Java.</description>
```
- 하는일
    - maven repository에 저장되는 프로젝트에 대한 설명을 지정한다.

## 프로젝트의 웹사이트 지정
```xml
<url>https://mongodb.github.io/mongo-java-driver/</url>
```
- 하는일
    - 프로젝트의 공식 웹사이트 또는 깃허브 주소를 지정한다.

## 프로젝트의 라이선스 지정
```xml
<licenses>
    <license>
        <name>MIT License</name>
        <url>https://opensource.org/licenses/MIT</url>
        <distribution>repo</distribution>
    </license>
</licenses>
```
- 하는일
    - 프로젝트의 라이선스를 지정한다.

## 개발자 정보 지정
```xml
<developers>
    <developer>
        <id>yeongu</id>
        <name>Yeongu Choe</name>
        <email>yeongu.choe@icloud.com</email>
        <url>https://github.com/YeonguChoe</url>
        <organization>UBC</organization>
        <organizationUrl>https://www.ubc.ca/</organizationUrl>
        <roles>
            <role>Software Engineer</role>
        </roles>
        <timezone>America/Toronto</timezone>
    </developer>
</developers>
```
- 하는일
    - 프로젝트에 기여한 사람의 정보를 입력한다.

