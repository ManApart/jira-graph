import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}
group = "me.austin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}
dependencies {
    implementation("com.github.doyaaaaaken:kotlin-csv-jvm:0.12.0")
    implementation("org.graphstream:gs-core:2.0")
    implementation("org.graphstream:gs-ui-swing:2.0")
//    implementation("org.graphstream:gs-ui-javafx:2.0")
    implementation("org.graphstream:gs-algo:2.0")
    testImplementation(kotlin("test-junit5"))
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}