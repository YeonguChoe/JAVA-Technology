# Gradle

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

## gradle init


- 추가 할것
1) gradle init
2) dependencies 종류
3) 노트 UI적으로 발전 시키지