package com.example.studymate // Ensure this matches YOUR package name

import LoginScreen
import SplashScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import com.example.studymate.ui.theme.StudyMateTheme // Check this import!

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // StudyMateTheme comes from your Theme.kt file
            StudyMateTheme {
                // State to manage which screen to show
                var showSplash by remember { mutableStateOf(true) }

                if (showSplash) {
                    SplashScreen(onTimeout = { showSplash = false })
                } else {
                    LoginScreen()
                }
            }
        }
    }
}