package com.example.kotlinfirstapp.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinfirstapp.components.MyBottomNavBar
import com.example.kotlinfirstapp.components.PromoBanners
import com.example.kotlinfirstapp.R
import com.example.kotlinfirstapp.model.Product

@Preview(showBackground = true)
@Composable
fun HomeScreen () {
    val location="Sobuj-para, Tarash, Sirajganj"

    Scaffold(
        containerColor = Color.Transparent,
        bottomBar = {MyBottomNavBar()}
    ) {paddingValues ->
        Box(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth()
                .fillMaxHeight(1f/3f)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF454545),
                            Color(0xFF1F1F1F),
                            Color(0xFF121212)
                        )
                    )
            )
        )
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp).padding(paddingValues)
        ) {
            Text(
                text = "Location",
                color= Color.Gray,
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                        text = location,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp
                    )
                Icon(
                        imageVector = Icons.Default.KeyboardArrowDown,
                        contentDescription = "Change Location",
                        tint = Color.White
                    )
            }

            Spacer(modifier = Modifier.height(30.dp))
            MySearchbar()
            Spacer(modifier = Modifier.height(30.dp))
            PromoBanners(
                title = "Buy one get/one FREE",
                badgeText = "Promo",
                imageRes = R.drawable.ic_launcher_background
            )
            Spacer(modifier = Modifier.height(10.dp))
            HomeCategories()
            Spacer(modifier = Modifier.height(20.dp))

            // Displaying Products
            val products = listOf(
                Product(1, "Espresso","Strong & Rich", 3.80, R.drawable.ic_launcher_background),
                Product(2, "Latte","Smooth and Creamy", 4.50, R.drawable.ic_launcher_background),
                Product(3, "Cappuccino","Strong & Rich", 4.20, R.drawable.ic_launcher_background),
                Product(4, "Mocha","With chocolate", 4.70, R.drawable.ic_launcher_background),
                Product(5, "Macchiato","With cocoa flavor", 4.60, R.drawable.ic_launcher_background),
                Product(6, "Flat White","Velvety smooth", 4.40, R.drawable.ic_launcher_background),
                Product(7, "Iced Mocha","Refreshing and rich", 4.70, R.drawable.ic_launcher_background),
            )

            ProductGrid(products = products)
        }
    }

}