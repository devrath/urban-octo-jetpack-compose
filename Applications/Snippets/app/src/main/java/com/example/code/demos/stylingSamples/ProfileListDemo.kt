package com.example.code.demos.stylingSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.code.ui.theme.CodeTheme

class ProfileListDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Composable
    private fun CurrentScreen() {
        CodeTheme {
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background) {
                Text("Android")
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() { CurrentScreen() }
}
