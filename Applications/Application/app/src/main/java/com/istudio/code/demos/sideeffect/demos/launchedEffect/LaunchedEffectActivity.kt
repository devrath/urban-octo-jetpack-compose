package com.istudio.code.demos.sideeffect.demos.launchedEffect

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

class LaunchedEffectActivity  : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NormalState()
        }
    }

    @Composable
    private fun CurrentScreen(
        vm : LaunchedEffectVm = LaunchedEffectVm()
    ){
        LaunchedEffect(key1 = true){
            vm.sharedFlow.collect{
                when(it){
                    is LaunchedEffectVm.LaunchedEffectEvents.DisplayErrorMessage -> TODO()
                    is LaunchedEffectVm.LaunchedEffectEvents.ShowNotification -> {
                        Toast.makeText(this@LaunchedEffectActivity,"Value->"+it.count,Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
    }



    @Composable
    private fun NormalState(){
        var currentState by remember{ mutableStateOf("Initial text") }
        LaunchedEffect(key1 = currentState){
            delay(20000L)
            Log.d("Naruto","Displayed value is $currentState")
        }
        currentState  = "#"
    }
}