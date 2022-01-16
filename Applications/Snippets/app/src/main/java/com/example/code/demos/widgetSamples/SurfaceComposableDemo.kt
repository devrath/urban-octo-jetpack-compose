package com.example.code.demos.widgetSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.code.ui.theme.CodeTheme

class SurfaceComposableDemo : ComponentActivity() {
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
        Surface(
            color = MaterialTheme.colors.onPrimary,
            border = BorderStroke(1.dp, MaterialTheme.colors.secondary),
            shape = RoundedCornerShape(8.dp),
            elevation = 8.dp
        ) {
            Text(
                text = "example",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}


