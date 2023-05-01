plugins {
    java
    kotlin("jvm") version "1.8.21"
    `maven-publish`
}

repositories {
    mavenCentral()
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "ktts"
            artifactId = "ktts-annotations"
            version = "1.0.0"

            from(components["kotlin"])
        }
    }
}
