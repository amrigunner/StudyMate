package com.example.studymateapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginScreen(onLoginClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFDFBF0)) // Warna latar cream
    ) {
        // 1. Bulatan Pink Separuh di ATAS
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .offset(y = (-100).dp)
                .clip(CircleShape)
                .background(Color(0xFFFCE4EC)),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 40.dp)
            ) {
                // Logo tengah bulatan
                Image(
                    painter = painterResource(id = R.drawable.logo_img),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )
                Text(
                    text = "StudyMate",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                )
            }
        }

        // 2. Tulisan WELCOME di Tengah
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "WELCOME",
                fontSize = 40.sp,
                fontWeight = FontWeight.Black,
                fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
            )

            Spacer(modifier = Modifier.height(50.dp))

            // 3. Butang Google (Custom Design)
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(55.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(Color(0xFFF8BBD0)) // Warna butang pink
                    .border(1.dp, Color.Black, RoundedCornerShape(10.dp))
                    .clickable { onLoginClick() }
                    .padding(horizontal = 15.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    // Pastikan ada icon google dalam drawable
                    Image(
                        painter = painterResource(id = R.drawable.logo_img), // Guna logo sementara
                        contentDescription = null,
                        modifier = Modifier.size(25.dp)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        text = "Sign In",
                        fontSize = 17.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                    )
                }
            }
        }

        // 4. Bulatan Pink Separuh di BAWAH
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .align(Alignment.BottomCenter)
                .offset(y = (150).dp)
                .clip(CircleShape)
                .background(Color(0xFFFCE4EC))
        )
    }
}