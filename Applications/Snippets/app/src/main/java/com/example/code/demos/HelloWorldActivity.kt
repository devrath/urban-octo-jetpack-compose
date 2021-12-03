package com.example.code.demos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

class HelloWorldActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingScreen("Hello World")
        }
    }

    @Composable
    private fun GreetingScreen(displayText: String) {
        Text(text = displayText)
    }


}