plugins {
    kotlin("jvm") version "2.1.10"
}

group = "com.github.azimsh3r.mergebasediff"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.mockito.kotlin:mockito-kotlin:4.1.0")
    testImplementation("io.mockk:mockk:1.12.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:1.5.2")
    testImplementation("io.ktor:ktor-client-mock:3.1.1")

    implementation("io.ktor:ktor-client-core-jvm:3.1.1")
    implementation("io.ktor:ktor-client-cio-jvm:3.1.1")
    implementation("io.ktor:ktor-client-serialization:3.1.1")
    implementation("io.ktor:ktor-client-logging:3.1.1")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}
