package com.istudio.code.demos.books.basicComposableFunction.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.istudio.code.demos.books.basicComposableFunction.router.BackButtonHandler
import com.istudio.code.demos.books.basicComposableFunction.router.JetFundamentalsRouter
import com.istudio.code.demos.books.basicComposableFunction.router.Screen

@Composable
fun ExploreButtonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        MyButton()
        MyRadioGroup()
        MyFloatingActionButton()

        BackButtonHandler {
            JetFundamentalsRouter.navigateTo(Screen.Navigation)
        }
    }
}

@Composable
fun MyButton() {
    //TODO add your code here
}

@Composable
fun MyRadioGroup() {
    //TODO add your code here
}

@Composable
fun MyFloatingActionButton() {
    //TODO add your code here
}