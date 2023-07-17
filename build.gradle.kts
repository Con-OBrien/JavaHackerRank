plugins {
    java
    id("org.springframework.boot") version "2.5.3" // Replace with the desired Spring Boot version
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(enforcedPlatform("org.springframework.boot:spring-boot-dependencies:2.5.3")) // Spring Boot BOM
    implementation("org.springframework.boot:spring-boot-starter-web") // Spring Web Starter
    implementation("org.springframework.boot:spring-boot-starter-data-jpa") // Spring Data JPA

    // H2 Database (in-memory database, useful for testing and development)
    implementation("com.h2database:h2")

    // Add other dependencies here as needed
}

// Task to run the Spring Boot application
tasks {
    // By default, the "bootRun" task is available to run the Spring Boot application.
    // You can use "./gradlew bootRun" to run your Spring Boot application.

    // Example:
    // bootRun {
    //     mainClassName = "com.example.MyApplication" // Replace with your main class
    //     // Other configuration settings go here
    // }
}