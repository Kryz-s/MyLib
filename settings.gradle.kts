rootProject.name = "MyLib"
pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}
include("common")
include("api")
include("v1_20_R3")
include("v1_21_R1")
include("v1_21_R2")
