package com.example.code.demos.surfaceComposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class SurfaceComposableActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetScreen()
        }


    }

    @Composable
    private fun SetScreen() {
        Surface(modifier = Modifier
                            .fillMaxSize()
                            .background(color = Color.Gray)
        ) {

        }
    }


    @Preview(showBackground = true)
    @Composable
    private fun SetScreenPreview() {
        SetScreen()
    }
}
