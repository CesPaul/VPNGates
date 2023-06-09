//buildscript {
//    ext {
//        compose_version = "1.2.0"
//    }
//}// Top-level build file where you can add configuration options common to all sub-projects/modules.

val composeVersion by extra { "1.2.0" }

plugins {
    id("com.android.application") version "7.4.0" apply false
    id("com.android.library") version "7.4.0" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.21" apply false
}