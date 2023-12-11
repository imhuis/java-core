plugins {
    `java-library`
    `maven-publish`
    id("application")
}

repositories {
    mavenLocal()
    maven {
        mavenCentral()
        url = uri("https://repo.maven.apache.org/maven2/")
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

group = "com.imhuis.code.java"
version = "1.0-SNAPSHOT"
description = "java-core"

tasks.withType<JavaCompile> {
//    java-code platform("org.openjdk:jdkabi:17:ea")
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

allprojects {
    tasks.withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-Xlint:unchecked")
        options.compilerArgs.add("-Xlint:deprecation")
    }
}

subprojects {
    apply(plugin = "java-library")

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
        testImplementation(platform("org.junit:junit-bom:5.7.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")
        api("junit:junit:4.13.2")
        api("com.google.guava:guava:31.1-jre")
        api("ch.qos.logback:logback-classic:1.4.7")
        api("cn.hutool:hutool-all:5.8.18")
        compileOnly("org.projectlombok:lombok:1.18.30")
        annotationProcessor("org.projectlombok:lombok:1.18.30")
        testCompileOnly("org.projectlombok:lombok:1.18.30")
        testAnnotationProcessor("org.projectlombok:lombok:1.18.30")
    }

//    test {
//        useJUnitPlatform()
//        testLogging {
//            events "passed", "skipped", "failed"
//        }
//    }

}

publishing {
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}
