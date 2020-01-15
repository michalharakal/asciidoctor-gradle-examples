plugins {
    id("org.asciidoctor.jvm.convert") version "2.4.0"
}

asciidoctorj {
    setVersion("2.2.0")
}

val asciidoctorExt by configurations.creating

dependencies {
    asciidoctorExt(project(":asciidoctorj-twitter-extension"))
}

tasks.named<org.asciidoctor.gradle.jvm.AsciidoctorTask>("asciidoctor") {
    configurations("asciidoctorExt")
}
