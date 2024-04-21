package com.example.gymapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.gymapp.components.Payment

class MainActivity : ComponentActivity() {

    companion object{
        var items= listOf(
            Item(
                gender = "male",
                name = "Ajeesh Rawal",
                number = 7393085376,
                duration = 3,
                date = "8/9/2023"
            ),
            Item(
                gender = "male",
                name = "Ajeesh Rawal",
                number = 7393085376,
                duration = 3,
                date = "8/9/2023"
            ),
            Item(
                gender = "male",
                name = "Ajeesh Rawal",
                number = 7393085376,
                duration = 3,
                date = "8/9/2023"
            ),
            Item(
                gender = "male",
                name = "Ajeesh Rawal",
                number = 7393085376,
                duration = 3,
                date = "8/9/2023"
            ),
            Item(
                gender = "male",
                name = "Ajeesh Rawal",
                number = 7393085376,
                duration = 3,
                date = "8/9/2023"
            ),
            Item(
                gender = "male",
                name = "Ajeesh Rawal",
                number = 7393085376,
                duration = 3,
                date = "8/9/2023"
            ),
        )
    }
    private val ob: Payment = Payment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Nav(applicationContext,ob,this)


        }
    }
}

