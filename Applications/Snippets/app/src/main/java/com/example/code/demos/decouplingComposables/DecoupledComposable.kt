package com.example.code.demos.decouplingComposables

import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.code.demos.helloWorld.GreetingScreen

class DecoupledComposable : ComponentActivity() {

    override fun setContentView(view: View?) {
        super.setContentView(view)
        setContent {
            GreetingScreen("Hello World")
        }
    }

}