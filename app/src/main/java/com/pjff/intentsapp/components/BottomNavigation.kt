package com.pjff.intentsapp.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.pjff.intentsapp.navigation.Routes

//Vid 162
@Composable
fun BottomNav(navHostController: NavHostController, routes: List<Routes>) {
    BottomAppBar() {
        NavigationBar(
            containerColor = Color.White
        ) {
            val currentRoute = CurrentRoute(navHostController)
            routes.forEach { item ->
                NavigationBarItem(
                    selected = currentRoute == item.route,
                    onClick = { navHostController.navigate(item.route) },
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.title,
                            tint = Color.Blue
                        )
                    },
                    label = {
                        Text(text = item.title)
                    },
                    alwaysShowLabel = false
                )
            }
        }
    }
}

//vid 162
@Composable
fun CurrentRoute(navHostController: NavHostController): String? {
    val current by navHostController.currentBackStackEntryAsState()
    return current?.destination?.route
}