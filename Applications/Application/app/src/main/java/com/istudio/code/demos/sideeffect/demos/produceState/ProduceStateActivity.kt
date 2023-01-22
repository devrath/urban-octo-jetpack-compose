package com.istudio.code.demos.sideeffect.demos.produceState

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.produceState
import kotlinx.coroutines.delay

class ProduceStateActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val state = currentScreen().value
            Log.d("Matrix","Value printed is ->".plus(state))
        }
    }

    @Composable
    fun currentScreen() : State<Int> {
        val counterValue = 10
        return produceState(initialValue = 0) {
            while(value<counterValue){
                delay(1000L)
                value++
            }
        }
    }
}