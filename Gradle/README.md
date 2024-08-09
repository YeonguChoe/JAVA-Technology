# Gradle

## 2가지 파일 종류
- `settings.gradle.kts` (필수): 프로젝트 구조 정의, 프로젝트의 시작점 정의
- `build.gradle.kts` (비필수): 빌드 스크립트


### build.gradle.kts 파일
```kotlin
// Java를 사용하는 경우
plugins {
    id("java")
}

//// Kotlin을 사용하는 경우
//plugins {
//    kotlin("jvm") version "2.0.0"
//}
//
//kotlin {
//    jvmToolchain(17)
//}

// Maven Repository에서 ID로 사용되는 프로젝트의 그룹 ID
group = "com.apple"

//// 개발중인 버전
//version = "1.0.0-SNAPSHOT"

// 출시 버전
version = "1.0.0"

// dependency를 참조하는 저장소
repositories {
    mavenCentral() // Maven Repository
    google() // Google's Maven Repository
}

// jar 파일이 생성되는 위치
tasks.jar {
    // layout.buildDirectory.dir은 build 폴더를 의미
    destinationDirectory.set(file(layout.buildDirectory.dir("폴더명")))
}

// 사용하는 외부 라이브러리 설정
dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
//    testImplementation("org.testng:testng:7.5.1")
}

// 사용하는 유닛 테스팅 프레임워크 설정
// 오직 1개의 테스팅 프레임워크만 고를수 있다.
tasks.test {
    useJUnitPlatform() // JUnit5를 사용하는 경우
//    useTestNG() // TestNG를 사용하는 경우
}

```

### settings.gradle.kts 파일
```kotlin
rootProject.name = "javaProject"
```


## 빌드 명령어
```bash
chmod +x ./gradlew
```

```bash
./gradlew build
```

## build폴더 삭제

```bash
./gradlew clean
```

## Wrapper
- 파일 이름
    - gradlew: 맥, 리눅스 전용
    - gradlew.bat: 윈도우 전용
- 하는일: Gradle 프로그램의 버전을 지정해준다.


## settings.gradle
- 프로젝트 이름
- 사용하는 모듈 이름

## build.gradle

### 리포지토리

```groovy
repositories {
	mavenCentral()
	google()
}
```

### Plugin 추가하기

```groovy
plugins {
    // 플러그인
}
```
- 특정 dependency를 사용하려면, 그에 맞는 plugin을 추가 해야 한다.

### 패키지 추가하기
```groovy
dependencies {
    // 패키지
}
```

- 패키지 추가 후

```bash
./gradlew --refresh-dependencies
```

## dependencies 종류
- implementation
- testImplementation
- runtimeOnly
- compileOnly
- annotationProcessor
- testRuntimeOnly
- api
- testCompileOnly
- apiElements
- runtimeElements


## test 코드 실행하기
```bash
./gradlew test
```

- 특정 폴더의 테스트 실행하기
```bash
./gradlew test -p 폴더이름
```

## gradle init
1) Project type: application
2) implementation language: Java
3) Application Structure: Application and library project
4) DSL build script: Kotlin
5) Generate build using new API: Yes
