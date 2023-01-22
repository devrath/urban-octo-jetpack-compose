package com.istudio.code.demos.sideeffect.demos.launchedEffect

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class LaunchedEffectVm : ViewModel() {

    private val _sharedFlow = MutableSharedFlow<LaunchedEffectEvents>()
    val sharedFlow = _sharedFlow.asSharedFlow()

    init {
        viewModelScope.launch {
            _sharedFlow.emit(LaunchedEffectEvents.ShowNotification(1))
        }
    }

    sealed class LaunchedEffectEvents {
        data class DisplayErrorMessage(val message : String):LaunchedEffectEvents()
        data class ShowNotification(val count : Int):LaunchedEffectEvents()
    }

}