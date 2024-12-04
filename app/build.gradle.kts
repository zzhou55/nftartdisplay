plugins {
    id("com.android.application")
    id("com.google.gms.google-services") // Firebase integration
    kotlin("android")
}

android {
    compileSdk = 34
    namespace = "com.example.nftartdisplay"
    defaultConfig {
        applicationId = "com.example.nftartdisplay"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.10")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation(platform("com.google.firebase:firebase-bom:33.6.0"))
    implementation("com.google.android.material:material:1.4.0")
    implementation("com.google.firebase:firebase-auth:21.0.1")
    implementation("com.google.android.gms:play-services-auth:19.2.0")
}