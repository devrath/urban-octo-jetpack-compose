package com.istudio.code.demos.books.basicComposableFunction.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.istudio.code.R
import com.istudio.code.demos.books.basicComposableFunction.router.JetFundamentalsRouter
import com.istudio.code.demos.books.basicComposableFunction.router.Screen

@Composable
fun NavigationScreen() {
    Surface(
        color = Color.White,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NavigationButton(stringResource(id = R.string.text), Screen.Text)
            NavigationButton(stringResource(id = R.string.text_field), Screen.TextField)
            NavigationButton(stringResource(id = R.string.buttons), Screen.Buttons)
            NavigationButton(stringResource(id = R.string.progress_indicators), Screen.ProgressIndicator)
            NavigationButton(stringResource(id = R.string.alert_dialog), Screen.AlertDialog)
        }
    }
}

@Composable
fun NavigationButton(message: String, screen: Screen) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        shape = RoundedCornerShape(5.dp),
        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Magenta),
        onClick = { JetFundamentalsRouter.navigateTo(screen) }
    ) {
        Text(
            text = message, color = Color.White
        )
    }
}