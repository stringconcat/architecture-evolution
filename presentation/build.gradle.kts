plugins {
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":businessPeople"))
    implementation(project(":useCasePeople"))

    // spring modules
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")

    // tools
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    // view
    implementation( "org.jetbrains.kotlinx:kotlinx-html-jvm:0.6.12")

    // tests
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
}