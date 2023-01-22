package com.istudio.code.demos.sideeffect.demos.sideEffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class SideEffectActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {}
    }
}