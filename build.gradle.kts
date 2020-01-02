import org.gradle.api.tasks.testing.logging.TestExceptionFormat

group = "com.ntthuat.spring.cloud.eureka.server"

extra["spring.version"] = "5.1.3.RELEASE"
extra["spring.boot.version"] = "2.1.6.RELEASE"
extra["spring.cloud.version"] = "Greenwich.RC2"

plugins {
    java
    idea
    id("org.springframework.boot") version "2.1.1.RELEASE"
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    jacoco
    id("org.sonarqube") version "2.6.2"
    id("io.franzbecker.gradle-lombok") version "3.1.0"
}

repositories {
    jcenter()
    maven("https://repo.spring.io/milestone")
    maven("https://dl.bintray.com/americanexpress/maven/")
}

dependencies {
    implementation(enforcedPlatform("org.springframework.cloud:spring-cloud-dependencies:${extra["spring.cloud.version"]}"))
    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-server")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
