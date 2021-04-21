plugins {
    `kotlin-dsl`
}

apply(from = "../repositories.gradle")

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.20")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.20")
    implementation("com.android.tools.build:gradle:4.1.0")
    implementation("com.google.gms:google-services:4.3.5")
}
