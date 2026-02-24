package com.example.kotlinfirstapp.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun HomeCategories() {

    val categoryList=listOf("All Coffees","Macchiato", "Latte", "Americano","Snacks","Deserts")
    var selectedCategory by remember { mutableStateOf(categoryList.first()) }

    LazyRow(
        modifier = Modifier.padding(horizontal = 0.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(categoryList){category ->
            CategoryChip(
                title = category,
                isSelected = category == selectedCategory,
                onSelected = {selectedCategory = category}
            )
        }
    }

}