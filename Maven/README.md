# Maven  
- Documentation: https://maven.apache.org/



- Archetype: 처음 프로젝트 만들때 template을 의미한다.

- GroupId: 회사 이름; Maven Central Repository에서 사용되는 ID
- ArtifactId: 프로젝트 이름 (Artifact와 프로젝트와 같은 말이다); 만들어지는 `jar` 파일의 이름


## Maven 프로젝트의 Folder Structure
`src/main/java`: 개발에 필요한 소스코드
`src/main/resources`: 소스코드가 사용하는 라이브러리
`src/test/java`: 유닛 테스트 코드
`src/test/resources`: 테스트 코드가 사용하는 라이브러리
`pom.xml`: 프로젝트에 대한 라이브러리와 설정에 대한 내용을 담은 파일

## Maven Build Lifecycle
1. Validate
2. Compile
3. Test
4. Package
5. Integration Test
6. Verify
7. Install
8. Deploy
