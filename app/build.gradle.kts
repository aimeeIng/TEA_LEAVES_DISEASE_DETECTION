plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.cse.cse_project"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.cse.cse_project"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}


dependencies {
    // Core Android Libraries (already in your project)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.core)

    // TensorFlow Lite for AI/ML Disease Detection
    implementation(libs.tensorflow.lite)
    implementation(libs.tensorflow.lite.support)
    implementation(libs.tensorflow.lite.gpu)

    // CameraX for capturing tea leaf images
    implementation(libs.camera.camera2)
    implementation(libs.camera.lifecycle)
    implementation(libs.camera.view)

    // Google Play Services for GPS location
    implementation(libs.play.services.location)
    implementation(libs.play.services.maps)

    // Glide for image loading and caching
    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)

    // RecyclerView & CardView for lists (History, Farmers)
    implementation(libs.recyclerview)
    implementation(libs.cardview)

    // Circular ImageView for profile pictures
    implementation(libs.circleimageview)

    // Gson for JSON parsing
    implementation(libs.gson)

    // Testing (already in your project)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}