plugins {
    `java-library`
    `maven-publish`
}

repositories {
    mavenLocal()
    maven {
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
    compileOnly("org.projectlombok:lombok:1.18.26")
    annotationProcessor("org.projectlombok:lombok:1.18.26")
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