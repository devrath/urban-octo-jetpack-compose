package com.example.code.demos.statesSamples.viewModelDemo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelDemoVm : ViewModel() {

    val textFieldState = MutableLiveData("Initial State")

    fun onTextChanged(newTxt : String) {
        textFieldState.value = newTxt
    }

}