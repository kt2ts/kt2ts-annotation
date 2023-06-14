plugins {
    java
    kotlin("jvm") version "1.8.21"
    `maven-publish`
}

java {
    /*
     * Setup JDK and will also set target with Kotlin projects.
     * https://docs.gradle.org/current/userguide/toolchains.html
     */
    toolchain { languageVersion.set(JavaLanguageVersion.of(17)) }
}

repositories { mavenCentral() }

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "io.github.kt2ts"
            artifactId = "kt2ts-annotation"
            version = "1.0.0"

            from(components["kotlin"])
        }
    }
}
