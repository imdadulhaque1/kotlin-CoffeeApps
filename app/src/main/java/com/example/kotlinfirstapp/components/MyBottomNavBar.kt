package com.example.kotlinfirstapp.components

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlinfirstapp.R
import com.example.kotlinfirstapp.ui.theme.LightBrown

@Preview(showBackground = true)
@Composable
fun MyBottomNavBar() {

//    Bottom navbar items
    val navItems=listOf(
        NavItem("Home", R.drawable.ic_launcher_foreground),
        NavItem("Cart", R.drawable.ic_launcher_foreground),
        NavItem("Favourites", R.drawable.ic_launcher_foreground),
        NavItem("Profile", R.drawable.ic_launcher_foreground),
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)
    ) {
        navItems.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(item.icon),
                        contentDescription = item.title
                        )
                },
                label = { Text(item.title) },
                modifier = Modifier.size(30.dp),
                onClick = {},
                selected = true,
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = LightBrown,
                    selectedTextColor = LightBrown,
                    unselectedIconColor = Color.DarkGray,
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = LightBrown.copy(0.03f)
                )
            )
        }
    }

}

data class NavItem(
    val title: String,
    val icon:Int
)