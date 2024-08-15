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

