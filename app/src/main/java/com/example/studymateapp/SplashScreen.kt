package com.example.studymateapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimeout: () -> Unit) { // Tukar NavController kepada onTimeout
    LaunchedEffect(Unit) {
        delay(3000) // Tunggu 3 saat
        onTimeout() // Jalankan arahan untuk tukar ke skrin Login
    }

    // UI Logo Splash Screen anda
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF9F5)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "StudyMate",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3F51B5)
        )
    }
}