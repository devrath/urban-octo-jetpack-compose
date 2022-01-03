package com.example.code.demos.statesSamples.viewModelDemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
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

class ViewModelDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CurrentScreen()
}

@Composable
private fun CurrentScreen() {

    val currentText = remember { mutableStateOf("") }

    CodeTheme {
        Surface(color = MaterialTheme.colors.background) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                DisplayText("")
                InputField(newValueStr = currentText.value) { currentText.value = it }
                ActionButton {

                }
            }
        }
    }
}

@Composable
private fun ActionButton(clickAction : () -> Unit) {
    Button(
        onClick = clickAction,
        modifier = Modifier.wrapContentSize(),
        
    ) {
        Text(text = "Click To Update Text")
    }
}

@Composable
private fun InputField(
    newValueStr:String,
    inputUiUpdate:(newValue:String) -> Unit
) {
    TextField(value = newValueStr, onValueChange = inputUiUpdate)
}

@Composable
private fun DisplayText(displayStr:String) {
    Text(
        text = displayStr,
        modifier = Modifier.wrapContentSize(),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Magenta
        ),
        textAlign = TextAlign.Center
    )
}
