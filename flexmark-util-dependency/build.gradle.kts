/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":flexmark-util-collection"))
    api(project(":flexmark-util-misc"))
    api(project(":flexmark-util-data"))
    api(libs.org.jetbrains.annotations)
    testImplementation(libs.junit.junit)
}

description = "flexmark-java dependency utilities"
