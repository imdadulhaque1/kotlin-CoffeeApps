package com.example.kotlinfirstapp.screens.home

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MySearchbar () {
    var searchTxt by remember { mutableStateOf("") }
    Row() {
        TextField(
            value = "",
            onValueChange = {}
        )

        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = "Filter icons",
            tint = Color.White
        )
    }
}