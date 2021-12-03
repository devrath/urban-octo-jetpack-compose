package com.example.code.demos.decouplingComposables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.code.demos.helloWorld.GreetingScreen

class DecoupledComposable : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingScreen("Hello World")
        }
    }

}