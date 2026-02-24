package com.example.kotlinfirstapp.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kotlinfirstapp.ui.theme.LightBrown
import com.example.kotlinfirstapp.ui.theme.LightGray


@Composable
fun CategoryChip (title:String, isSelected:Boolean, onSelected:() -> Unit) {
    Box(

        modifier = Modifier.width(110.dp).height(35.dp)
            .clip(RoundedCornerShape(6.dp))
            .background(color = if(isSelected) LightBrown else LightGray.copy(alpha = 0.6f))
            .clickable{onSelected()},
        contentAlignment = Alignment.Center


    ) {
        Text(
            text = title,
            fontSize =14.sp,
            fontWeight = FontWeight.SemiBold,
            maxLines = 1
            )
    }
}