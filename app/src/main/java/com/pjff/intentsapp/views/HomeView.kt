package com.pjff.intentsapp.views

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.pjff.intentsapp.components.BottomNav
import com.pjff.intentsapp.navigation.NavManager
import com.pjff.intentsapp.navigation.Routes

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
//Vid 161
@Composable
fun HomeView(){
    val navController = rememberNavController()
    //Definimos cada una de las rutas que usaremos.
    val navigationRoutes = listOf(
        Routes.PhoneView,
        Routes.SmsView,
        Routes.EmailView
    )

    Scaffold(
        bottomBar = {
            //Vid 162
            BottomNav(navController, navigationRoutes )
        }
    ) {
        NavManager(navController)
    }

}