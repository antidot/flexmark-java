/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    id("buildlogic.java-conventions")
}

dependencies {
    api(project(":flexmark-util"))
    api(project(":flexmark"))
    api(project(":flexmark-ext-definition"))
    api(project(":flexmark-ext-emoji"))
    api(project(":flexmark-ext-footnotes"))
    api(project(":flexmark-ext-gfm-strikethrough"))
    api(project(":flexmark-ext-ins"))
    api(project(":flexmark-ext-jekyll-tag"))
    api(project(":flexmark-ext-superscript"))
    api(project(":flexmark-ext-tables"))
    api(project(":flexmark-ext-toc"))
    api(project(":flexmark-ext-wikilink"))
    api(project(":flexmark-ext-enumerated-reference"))
    api(project(":flexmark-ext-attributes"))
    api(project(":flexmark-ext-aside"))
    api(project(":flexmark-ext-gitlab"))
    api(project(":flexmark-ext-macros"))
    api(libs.org.apache.xmlgraphics.xmlgraphics.commons)
    api(libs.commons.io.commons.io)
    api(libs.org.docx4j.docx4j.jaxb.referenceimpl)
    api(libs.org.apache.logging.log4j.log4j.api)
    api(libs.org.apache.logging.log4j.log4j.core)
    api(libs.org.apache.logging.log4j.log4j.v1.v2.api)
    testImplementation(project(":flexmark-test-util"))
    testImplementation(project(":flexmark-core-test"))
    testImplementation(project(":flexmark-ext-autolink"))
}

description = "flexmark-java extension for rendering docx format"
