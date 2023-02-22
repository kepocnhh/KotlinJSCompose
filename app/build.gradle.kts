repositories {
    mavenCentral()
}

plugins {
    id("org.jetbrains.compose") version Version.compose
    id("org.jetbrains.kotlin.multiplatform")
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }
    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(compose.web.core)
                implementation(compose.runtime)
            }
        }
    }
}
