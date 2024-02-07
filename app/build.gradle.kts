plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "exampleapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.username.exampleapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

    sourceSets.all {
        kotlin.srcDir("src")
        manifest.srcFile("AndroidManifest.xml")
        res.srcDirs("res")
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.12.0")
}
