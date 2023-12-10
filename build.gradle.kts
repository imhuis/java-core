plugins {
    `java-library`
    `maven-publish`
    `java`
}

repositories {
    mavenLocal()
    maven {
        mavenCentral()
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

java.sourceCompatibility = JavaVersion.VERSION_17
java.targetCompatibility = JavaVersion.VERSION_17

group = "com.imhuis.code"
version = "1.0-SNAPSHOT"
description = "java-core"

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
}

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

subprojects {
    apply(plugin = "java-library")
//    apply(from = "${rootProject.projectDir}/gradle/subprojects.gradle.kts")

//    java.sourceCompatibility = JavaVersion.VERSION_17
//    java.targetCompatibility = JavaVersion.VERSION_17

    repositories {
        mavenLocal()
        maven {
            mavenCentral()
            url = uri("https://repo.maven.apache.org/maven2/")
        }
    }

    sourceSets {
        main {
            java {
                srcDirs(projectDir.resolve("src/main/java"))
            }
            resources {
                srcDirs(projectDir.resolve("src/main/resources"))
            }
        }
        test {
            java {
                srcDirs(projectDir.resolve("src/test/java"))
            }
            resources {
                srcDirs(projectDir.resolve("src/test/resources"))
            }
        }
    }

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

    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-Xlint:unchecked")
        options.compilerArgs.add("-Xlint:deprecation")
    }
}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}

//apply(from = "${rootProject.projectDir}/gradle/subprojects.gradle.kts")