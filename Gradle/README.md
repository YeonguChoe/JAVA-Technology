# Gradle 사용법

## 2가지 파일 종류
- `settings.gradle.kts` (필수): 설정 파일
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
//    testImplementation("org.testng:testng:7.5.1") // TestNG를 사용하는 경우
}

// 사용하는 유닛 테스팅 프레임워크 설정
// 오직 1개의 테스팅 프레임워크만 고를수 있다.
tasks.test {
    useJUnitPlatform() // JUnit5를 사용하는 경우
//    useTestNG() // TestNG를 사용하는 경우
}
```

### settings.gradle.kts 파일
- subproject(모듈)들을 추가해서 빌드를 할수 있게 한다.
```kotlin
//// kotlin을 사용하는 경우
// 자동으로 JVM을 다운로드 해준다.
//plugins {
//    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
//}

// 최상위 프로젝트의 이름을 설정
rootProject.name = "프로젝트 이름"

// subproject 즉, 모듈을 추가
include("모듈의 디렉토리 이름")
```

## dependencies 종류
- implementation: 일반적으로 라이브러리를 추가하는 방법
- testImplementation: 테스트 코드를 작성할때 사용되는 라이브러리
- runtimeOnly: 런타임에만 필요한 라이브러리
- compileOnly: 컴파일 할때만 필요한 라이브러리
- annotationProcessor: annotation기반 코드 생성 라이브러리
- testRuntimeOnly: 런타임에서 테스트를 실핼할때 사용되는 라이브러리
- testCompileOnly: 테스트 코드를 컴파일 할때만 필요한 라이브러리
- api: 모듈의 api가 사용하는 라이브러리

## gradle init 사용법
1) Type of Build: application
2) Implementation Language: Java
3) Application Structure: Application and library project
4) DSL build script: Kotlin
5) Generate build using new API: Yes