package com.istudio.code.demos.books.basicComposableFunction.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import com.istudio.code.R
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
        CustomOutLineTextField()
    }

    BackButtonHandler {
        JetFundamentalsRouter.navigateTo(Screen.Navigation)
    }

}

@Composable
fun CustomOutLineTextField() {

    val text = remember { mutableStateOf("") }

    val primaryColor = colorResource(id = R.color.purple_200)

    OutlinedTextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text(text = "Enter your value") },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = primaryColor,
            focusedLabelColor = primaryColor,
            cursorColor = primaryColor
        ),
        keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email),
    )


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
