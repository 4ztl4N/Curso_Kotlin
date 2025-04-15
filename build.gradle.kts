import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    kotlin("jvm") version "2.1.20"
    id("com.adarshr.test-logger") version "4.0.0" // Optionally update to latest if available
    id("com.diffplug.spotless") version "6.25.0" // 6.25.0+ is recommended for Gradle 8/9 compatibility
}

repositories {
    mavenCentral()
    maven("https://plugins.gradle.org/m2/")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.12.2")
    testImplementation("org.amshove.kluent:kluent:1.73")
}

// sourceSets block is not needed unless you have custom source sets
// If you do, use setSrcDirs or srcDir for modern DSL
// Example:
// sourceSets["test"].java.srcDir("src/test")

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
            dependencies {
                implementation("org.junit.jupiter:junit-jupiter:5.12.2")
                implementation("org.amshove.kluent:kluent:1.73")
            }
        }
    }
}
// Optionally, configure test logging for all test tasks
// tasks.withType<Test>().configureEach {
//     testLogging {
//         events("failed")
//         exceptionFormat = TestExceptionFormat.FULL
//     }
// }

kotlin {
    jvmToolchain(21)
}

spotless {
    kotlin {
        target("test/com/igorwojda/**/*.kt")
        ktlint()
        indentWithSpaces()
        endWithNewline()
    }
}
