plugins {
    id("java")
    id("io.papermc.paperweight.userdev") version "2.0.0-beta.14"
    id("io.github.goooler.shadow") version "8.1.7"
}

group = "me.kryz.dedsacore"
version = "1.0-SNAPSHOT"

paperweight.reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.REOBF_PRODUCTION

allprojects {
    apply(plugin = "java")
    apply(plugin = "io.github.goooler.shadow")

    repositories {
        mavenCentral()
        mavenLocal()
        maven {
            name = "papermc"
            url = uri("https://repo.papermc.io/repository/maven-public/")
        }
    }
}

repositories {
    mavenCentral()
    mavenLocal()
    maven("https://oss.sonatype.org/content/repositories/snapshots/") {
        name = "sonatype-snapshots"
        mavenContent {
            snapshotsOnly()
        }
    }
}

dependencies {
    implementation(project(":common"))
    implementation(project(":api"))
    implementation(project(":v1_21_R2"))
    implementation(project(":v1_21_R1"))
    implementation(project(":v1_20_R3"))


    paperweight.paperDevBundle("1.21.3-R0.1-SNAPSHOT")
}
