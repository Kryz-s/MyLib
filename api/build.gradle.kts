plugins {
    id("java")
}

group = "me.kryz.mylib"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(project(":common"))
    compileOnly(project(":v1_21_R2"))
    compileOnly(project(":v1_21_R1"))
    compileOnly(project(":v1_20_R3"))

    compileOnly ("io.papermc.paper:paper-api:1.21.3-R0.1-SNAPSHOT")
    compileOnly("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")
}
