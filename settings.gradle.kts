rootProject.name = "java-core"

include("cornerstone")
include("jvm")
include("learning-java")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.4.0"
}

// groovy syntax
//def isSubproject = { File file ->
//    file.isDirectory() &&
//            !file.name.startsWith('.') &&
//            !file.name.contains('build') &&
//            !file.name.contains('gradle') &&
//            !file.name.contains('test')
//}
//
//String[] subprojects = rootDir.listFiles().findAll(isSubproject).collect { it.name }
//
//include subprojects

//val isSubproject: (File) -> Boolean = { file ->
//    file.isDirectory &&
//            !file.name.startsWith('.') &&
//            !file.name.contains("build") &&
//            !file.name.contains("gradle") &&
//            !file.name.contains("test")
//}
//
//val subprojects = rootDir.listFiles()?.filter(isSubproject)?.map { it.name }
//
//subprojects?.forEach { include(it) }