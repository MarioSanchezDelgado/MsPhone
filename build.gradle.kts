// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    kotlin("jvm") version "2.1.20"
    kotlin("plugin.serialization") version "2.1.20"

    id("com.google.devtools.ksp") version "2.0.0-1.0.23" apply false
    id("androidx.room") version "2.7.0" apply false
}
