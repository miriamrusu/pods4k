plugins {
    kotlin("jvm") version libs.versions.kotlin
    alias(libs.plugins.mavenPublishing)
}

dependencies {
    api(projects.immutableArrays.core)
    api(projects.immutableArrays.transformationsToStandardCollections)
}
