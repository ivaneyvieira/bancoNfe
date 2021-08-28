import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.5.30"
}

group = "me.ivaneyvieira"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

dependencies {
  testImplementation(kotlin("test"))
  implementation("org.apache.commons:commons-lang3:3.0")
}

tasks.test {
  useJUnit()
}

tasks.withType<KotlinCompile>() {
  kotlinOptions.jvmTarget = "1.8"
}