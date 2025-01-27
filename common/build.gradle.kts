plugins {
    id("java")
}

group = "me.kryz.mylib"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly ("io.papermc.paper:paper-api:1.21.3-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}