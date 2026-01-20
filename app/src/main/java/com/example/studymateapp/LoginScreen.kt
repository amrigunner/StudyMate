package com.example.studymate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
// Jika theme error, kita definisikan warna di sini terus
val SoftCream = Color(0xFFFFF9F5)
val SoftPink = Color(0xFFFFE4E1)
val ButtonPink = Color(0xFFFFB6C1)

@Composable
fun LoginScreen(onLoginClick: () -> Unit) { // Tambah parameter ini
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(SoftCream)
    ) {
        // Top Circle
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .offset(y = (-100).dp)
                .clip(CircleShape)
                .background(SoftPink),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text("StudyMate", modifier = Modifier.padding(bottom = 20.dp), fontWeight = FontWeight.Bold)
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "WELCOME", fontSize = 36.sp, fontWeight = FontWeight.Black)
            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = { onLoginClick() }, // Panggil fungsi navigasi
                colors = ButtonDefaults.buttonColors(containerColor = ButtonPink),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(0.8f).height(55.dp)
            ) {
                Text("Continue with Google", color = Color.Black, fontWeight = FontWeight.Bold)
            }
        }
    }
}