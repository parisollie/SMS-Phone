package com.pjff.intentsapp.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.ui.graphics.vector.ImageVector//Vid

//Vid 160, creamos una clase sellada, sirven para tener diferentes opciones.
sealed class Routes(
    val icon: ImageVector,
    val title: String,
    val route: String,
){
    //Estos objetos son de tipo Routes
    object PhoneView: Routes(Icons.Default.Phone, "Phone", "PhoneView")
    object SmsView: Routes(Icons.Default.Person, "SMS", "SmsView")
    object EmailView: Routes(Icons.Default.Email, "Email", "EmailView")
}
