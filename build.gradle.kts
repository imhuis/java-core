plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
        mavenCentral()
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

group = "com.imhuis"
version = "1.0-SNAPSHOT"
description = "java-core"
java.sourceCompatibility = JavaVersion.VERSION_17

dependencies {
    api("junit:junit:4.13.2")
    api("com.google.guava:guava:31.1-jre")
    api("ch.qos.logback:logback-classic:1.4.7")
    api("cn.hutool:hutool-all:5.8.18")
    compileOnly("org.projectlombok:lombok:1.18.30")
    annotationProcessor("org.projectlombok:lombok:1.18.30")
    testCompileOnly("org.projectlombok:lombok:1.18.30")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
}

sourceSets {
    main {
        java {
        }
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}