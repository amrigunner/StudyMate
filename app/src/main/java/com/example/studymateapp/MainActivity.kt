package com.example.studymateapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Memanggil fungsi LoginScreen daripada LoginScreen.kt
        setContent {
            LoginScreen(onLoginClick = {
                val intent = Intent(this, NotesActivity::class.java)
                startActivity(intent)
                finish()
            })
        }
    }
}