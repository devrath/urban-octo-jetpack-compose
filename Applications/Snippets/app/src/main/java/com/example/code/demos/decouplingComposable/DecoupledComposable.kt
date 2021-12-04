package com.example.code.demos.decouplingComposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class DecoupledComposable : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingScreen("Hello World")
        }
    }

}