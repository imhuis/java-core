configure(subprojects - project(':onjava')) {
    dependencies {
        compile project(':onjava')
        compile 'com.google.guava:guava:21.0'
        compileOnly "org.openjdk.jmh:jmh-core:${jmh.jmhVersion}"
    }
}