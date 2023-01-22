package com.istudio.code.demos.sideeffect.demos.rememberUpdatedState

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import kotlinx.coroutines.delay

class RememberUpdatedStateActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen(){
            // Control is received back after performing the long running operation for a certain duration
        } }
    }

    @Composable
    fun CurrentScreen(
        onCallback: ()-> Unit
    ){
        // Using the remember updated state we can prevent this and make this composable to be reused from other place also
        val rememberUpdatedState by rememberUpdatedState(newValue = onCallback)
        // We know that below block of code is executed only once,
        // Since we use LaunchedEffect and have set the key to true
        LaunchedEffect(key1 = true, block = {
            delay(2000L)
            rememberUpdatedState()
        })
    }
}