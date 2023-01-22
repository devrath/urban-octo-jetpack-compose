package com.istudio.code.demos.sideeffect.demos.sideEffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect

class SideEffectActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {}
    }

    @Composable
    fun CurrentScreen(){
        SideEffect {
            // This block of code is called everytime when the composable is recomposed
        }
    }
}