package com.istudio.code.demos.books.basicComposableFunction.router

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


/**
 * Define a sealed class that will tell us the screens present in the application
 */

sealed class Screen {
    object  Navigation : Screen()

}



object JetFundamentalsRouter {
    // Define the initial screen to be Navigation - This would be a mutable state
    var currentScreen : MutableState<Screen> = mutableStateOf(Screen.Navigation)
    // Adding the navigation to particular screen
    fun navigateTo(destination : Screen) {
        currentScreen.value = destination
    }

}