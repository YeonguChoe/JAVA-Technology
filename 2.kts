// Kotlin + IntelliJ

plugins {
    kotlin("jvm") version "2.0.0"
}

group = "ca.hackathon"
version = "1.0-SNAPSHOT"

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}

// setting 파일에

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "kotlinGradle"