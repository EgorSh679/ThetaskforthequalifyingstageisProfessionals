package com.example.thetaskforthequalifyingstageisprofessionals

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.*
import androidx.compose.runtime.*

@Composable
fun OnboardingScreen() {
    val buttonColor = Color(0xFFFFFFFF)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF2196F3))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            // Верхний текст и рисунки
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "ДОБРО\nПОЖАЛОВАТЬ",
                        color = Color.White,
                        fontSize = 28.sp,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        lineHeight = 36.sp
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    // Рисунки
                    Image(
                        painter = painterResource(id = R.drawable.vector),
                        contentDescription = "Рисунки",

                        modifier = Modifier.size(100.dp),
                    )
                }
            }

            // Кроссовок с тенью
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.group_1000000797),
                    contentDescription = "Кроссовок",
                    modifier = Modifier.size(1500.dp),
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .background(Color.White, shape = CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .background(Color.Gray, shape = CircleShape)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Box(
                    modifier = Modifier
                        .size(12.dp)
                        .background(Color.Gray, shape = CircleShape)
                )
            }

            Button(
                onClick = { /* Действие по нажатию */ },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(bottom = 32.dp),

                colors = ButtonDefaults.buttonColors(buttonColor),
            ) {
                Text(
                    text = "Начать",
                    color = Color.Black,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}

@Preview
@Composable
fun OnboardingScreenPreview() {
    OnboardingScreen()
}
