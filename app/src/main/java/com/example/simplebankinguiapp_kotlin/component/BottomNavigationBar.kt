package com.example.simplebankinguiapp_kotlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simplebankinguiapp_kotlin.model.BottomNavigation

val items = listOf(
    BottomNavigation(icon = Icons.Rounded.Home, title = "Home"),
    BottomNavigation(icon = Icons.Filled.Wallet, title = "Wallet"),
    BottomNavigation(icon = Icons.Rounded.Notifications, title = "Profile"),
    BottomNavigation(icon = Icons.Rounded.AccountCircle, title = "Account"),
)

@Preview
@Composable
fun BottomNavigationBar (){
    // Bottom Navigation Bar
    // BottomNavigation(items = items)
    NavigationBar {
        Row(modifier = Modifier.background(MaterialTheme.colorScheme.inverseOnSurface)
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    onClick = { /*TODO*/ },
                    selected = index == 0,
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title
                        )
                    },
                    label = { Text(item.title, color = MaterialTheme.colorScheme.onBackground) },
                )
            }
        }
    }
}