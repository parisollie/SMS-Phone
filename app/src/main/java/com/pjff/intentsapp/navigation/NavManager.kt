package com.pjff.intentsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pjff.intentsapp.views.EmailView
import com.pjff.intentsapp.views.PhoneView
import com.pjff.intentsapp.views.SmsView

@Composable
//Vid 160,
fun NavManager(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Routes.PhoneView.route ){
        //Ponemos las rutas.
        composable(Routes.PhoneView.route){
            PhoneView()
        }
        composable(Routes.SmsView.route){
            SmsView()
        }
        composable(Routes.EmailView.route){
            EmailView()
        }
    }
}