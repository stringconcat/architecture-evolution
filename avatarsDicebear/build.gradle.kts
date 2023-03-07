

dependencies {
    implementation(project(":businessPeople"))
    implementation("javax.inject:javax.inject:1")
    // kotlin
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    // tests
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}