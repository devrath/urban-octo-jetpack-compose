package com.istudio.code.demos.medicalUi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MedicalUiActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {HomeScreen()}
    }
}