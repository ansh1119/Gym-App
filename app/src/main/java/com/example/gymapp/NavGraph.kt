package com.example.gymapp

import android.app.Activity
import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gymapp.screens.FirstScreen
import com.example.gymapp.screens.HomeScreen
import com.example.gymapp.screens.LoginScreen
import com.example.gymapp.components.Payment
import com.example.gymapp.screens.Plans
import kotlinx.coroutines.delay

@Composable
fun Nav(context: Context, ob: Payment, activity: Activity) {

    val navController=rememberNavController()
    var show by remember { mutableStateOf(true) }

    LaunchedEffect(key1 = Unit){
        delay(1500)
        show = false
    }
    NavHost(navController = navController, startDestination = "first"){
        composable(route="first"){
            if (show){
                FirstScreen(navController)
            }
            else{
                LoginScreen(navController)
            }
        }
        composable(route="login"){
            LoginScreen(navController)
        }
        composable(route="home"){
            HomeScreen(navController)
        }
        composable(route="plans"){
            Plans(navController,context,ob, activity)
        }
    }
}