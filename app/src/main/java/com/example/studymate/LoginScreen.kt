// File: LoginScreen.kt
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.studymate.ui.theme.ButtonPink
import com.example.studymate.ui.theme.SoftCream
import com.example.studymate.ui.theme.SoftPink

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(SoftCream)
    ) {
        // Top Decorative Semi-Circle
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp)
                .offset(y = (-100).dp)
                .clip(CircleShape)
                .background(SoftPink),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(bottom = 20.dp)
            ) {
                Text("StudyMate", fontWeight = FontWeight.Bold, fontSize = 18.sp)
            }
        }

        // Center Content
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "WELCOME",
                fontSize = 36.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 2.sp
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Google Button
            Button(
                onClick = { /* Handle Login */ },
                colors = ButtonDefaults.buttonColors(containerColor = ButtonPink),
                shape = RoundedCornerShape(8.dp),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 4.dp),
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .height(50.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {

                    Spacer(modifier = Modifier.width(12.dp))
                    Text("Continue with Google", color = Color.Black)
                }
            }
        }

        // Bottom Decorative Circle
        Box(
            modifier = Modifier
                .size(300.dp)
                .align(Alignment.BottomCenter)
                .offset(y = 150.dp)
                .clip(CircleShape)
                .background(SoftPink)
        )
    }
}