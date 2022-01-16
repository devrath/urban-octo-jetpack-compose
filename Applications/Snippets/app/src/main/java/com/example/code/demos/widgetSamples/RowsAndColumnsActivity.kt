package com.example.code.demos.widgetSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.code.ui.theme.CodeTheme

class RowsAndColumnsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrentScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    CurrentScreen()
}

@Composable
private fun CurrentScreen() {
    CodeTheme {
        Surface(color = MaterialTheme.colors.background) {
           Row(Modifier.fillMaxSize().background(Color.Gray),
               horizontalArrangement = Arrangement.SpaceAround
           ) {
               Text(
                   modifier = Modifier.background(Color.Magenta),
                   text = "Text1",
                   style = TextStyle(color = Color.White)
               )
               Text(
                   modifier = Modifier.background(Color.Blue),
                   text = "Text2",
                   style = TextStyle(color = Color.White)
               )
           }
        }
    }
}

