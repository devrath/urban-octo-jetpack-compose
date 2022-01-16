package com.example.code.demos.stylingSamples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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

class StylingSampleDemo  : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() { CurrentScreen() }

@Composable
private fun CurrentScreen() {
    CodeTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                Modifier.background(Color.Gray)
                    .width(300.dp)
                    .fillMaxHeight(0.5F)
                    .border(5.dp, Color.Blue, shape = RectangleShape)
                    .padding(50.dp)
                    .border(5.dp, Color.Red, shape = RectangleShape)
                    .padding(50.dp)
                    .border(5.dp, Color.Cyan, shape = RectangleShape)
                    .clickable {}

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