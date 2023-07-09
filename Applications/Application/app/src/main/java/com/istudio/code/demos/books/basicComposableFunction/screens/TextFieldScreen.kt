package com.istudio.code.demos.books.basicComposableFunction.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.istudio.code.demos.books.basicComposableFunction.router.BackButtonHandler
import com.istudio.code.demos.books.basicComposableFunction.router.JetFundamentalsRouter
import com.istudio.code.demos.books.basicComposableFunction.router.Screen

@Composable
fun TextFieldScreen(){

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        MyTextField()
    }

    BackButtonHandler {
        JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }

}

@Composable
fun MyTextField() {

    val text = remember { mutableStateOf( value = "") }

    TextField(
        // When the text state changes update the text value to Text composable
        value = text.value,
        onValueChange = {
            // On dynamically changing the text in text-field update text state
            text.value = it
        },
        label = { Text(text = "Enter your name")}
    )


}
