buildscript {
    repositories {
        mavenCentral()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
    }
}

repositories {
    jcenter()
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()
    }
}
