package com.example.code.demos.statesSamples.stateHoisting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.code.ui.theme.CodeTheme

class HoistingStateDemo : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() { CurrentScreen() }

    @Composable
    private fun CurrentScreen() {
        var textState by remember{ mutableStateOf("Initial Text State") }
        CodeTheme {
            // A surface container using the 'background' color from the theme
            ContainerScreen(textState) { textState = "Final Text State" }
        }
    }

    @Composable
    private fun ContainerScreen(textState: String, buttonClick: () -> Unit) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Magenta),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                DisplayText(textState)
                ActionButton(textState,buttonClick)
            }
        }
    }

    @Composable
    private fun ActionButton(containerTextState: String, buttonClick : () -> Unit) {
        var buttonActionText = containerTextState
        Button(
            onClick = buttonClick,
            modifier = Modifier.wrapContentSize()
        ) {
            Text(text = "Change text")
        }
    }

    @Composable
    private fun DisplayText(containerTextState: String) {
        Text(
            text = containerTextState,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = TextStyle(
                fontSize = 24.sp, fontWeight = FontWeight.Bold
            )
        )
    }

}