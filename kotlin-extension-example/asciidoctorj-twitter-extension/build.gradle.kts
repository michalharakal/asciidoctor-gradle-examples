plugins {
    kotlin("jvm") version "1.3.61"
}

repositories {
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("org.asciidoctor:asciidoctorj:2.2.0")
}
