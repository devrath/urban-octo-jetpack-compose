package com.example.code.demos.widgetSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.code.ui.theme.CodeTheme

class BoxComposableDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrentScreen()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        CodeTheme {
            CurrentScreen()
        }
    }
}

@Composable
private fun CurrentScreen() {
    CodeTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {

        }
    }
}


