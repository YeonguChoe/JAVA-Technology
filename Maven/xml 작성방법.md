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
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
</project>
``
