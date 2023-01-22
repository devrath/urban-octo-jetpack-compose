package com.istudio.code.demos.sideeffect.demos.disposableEffect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class DisposableEffectActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {}
    }
}