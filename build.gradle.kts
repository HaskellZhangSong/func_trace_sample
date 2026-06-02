plugins {
    id("org.jetbrains.kotlin.multiplatform") version "2.1.20"
    id("dev.songzh.function.trace") version "0.1.0"
}

group = "org.hw"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    macosArm64 {
        binaries {
            executable {
                entryPoint = "org.hw.main"
            }
        }
    }
    sourceSets {
        commonMain {
            dependencies {}
        }
        commonTest {
            dependencies {
                implementation(kotlin("test"))
            }
        }
    }
}

functionTracer {
    traceAll = true
    packagePath = "org.hw"
}

