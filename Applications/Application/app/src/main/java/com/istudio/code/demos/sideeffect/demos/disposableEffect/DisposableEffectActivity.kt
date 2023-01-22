package com.istudio.code.demos.sideeffect.demos.disposableEffect

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver

class DisposableEffectActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Composable
    fun CurrentScreen() {
        val lifeCycleOwner = LocalLifecycleOwner.current
        DisposableEffect(key1 = lifeCycleOwner) {
            val observer = LifecycleEventObserver { _ , event ->
                when (event) {
                    androidx.lifecycle.Lifecycle.Event.ON_CREATE -> {
                        android.util.Log.d("Matrix", "Triggered -> ON_CREATE")
                    }
                    androidx.lifecycle.Lifecycle.Event.ON_START -> {
                        android.util.Log.d("Matrix", "Triggered -> ON_START")
                    }
                    androidx.lifecycle.Lifecycle.Event.ON_RESUME -> {
                        android.util.Log.d("Matrix", "Triggered -> ON_RESUME")
                    }
                    androidx.lifecycle.Lifecycle.Event.ON_PAUSE -> {
                        android.util.Log.d("Matrix", "Triggered -> ON_PAUSE")
                    }
                    else -> {
                        android.util.Log.d("Matrix", "Other Event")
                    }
                }
            }
            lifeCycleOwner.lifecycle.addObserver(observer)
            onDispose {
                lifeCycleOwner.lifecycle.removeObserver(observer)
            }
        }

    }
}