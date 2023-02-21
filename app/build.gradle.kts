repositories {
    mavenCentral()
}

plugins {
    id("org.jetbrains.compose") version "1.2.1"
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    js(IR) {
        browser()
    }
}
