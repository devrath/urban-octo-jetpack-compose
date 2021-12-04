package com.example.code.demos.decouplingComposable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun GreetingScreen(displayText: String) {
    Text(text = displayText)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    GreetingScreen("Hello World")
}