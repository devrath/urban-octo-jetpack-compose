package com.istudio.code.demos.sideeffect.demos.launchedEffect

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect

class LaunchedEffectActivity  : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrentScreen()
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
}