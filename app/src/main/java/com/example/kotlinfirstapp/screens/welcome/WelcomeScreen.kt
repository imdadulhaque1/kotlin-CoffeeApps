package com.example.kotlinfirstapp.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinfirstapp.R
import com.example.kotlinfirstapp.ui.theme.CoffeeBrown
import com.example.kotlinfirstapp.ui.theme.LightBrown

@Preview(showBackground = true)
@Composable
fun WelcomeScreen () {
    Box(
        modifier = Modifier.fillMaxSize(),
    ){
        Image(
            painter = painterResource(R.drawable.love_walpaper),
            contentDescription = "Love of Live with COFFEE",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize().padding(bottom = 50.dp).padding(horizontal = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(
                modifier = Modifier.padding(bottom = 5.dp),
                text = "Hello, Coffee Lovers !",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp

            )
            Spacer(modifier = Modifier.height(6.dp))
            Text(
                text ="Welcome to enjoy a delicious COFFEE with your PARTNERS ...",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(20.dp))
            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = LightBrown,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Get Started !",
                    fontSize = 18.sp
                    )
            }
        }
    }
}