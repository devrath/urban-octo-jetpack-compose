package com.istudio.code.demos.books.basicComposableFunction.app

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.istudio.code.demos.books.basicComposableFunction.router.JetFundamentalsRouter
import com.istudio.code.demos.books.basicComposableFunction.router.Screen
import com.istudio.code.demos.books.basicComposableFunction.screens.NavigationScreen
import com.istudio.code.demos.books.basicComposableFunction.screens.TextFieldScreen
import com.istudio.code.demos.books.basicComposableFunction.screens.TextScreen

@Composable
fun JetFundamentalsApp() {
    // Add a surface
    Surface(color = MaterialTheme.colors.background) {
        // Crossroad is used to switch between the screens with a animation
        Crossfade(targetState = JetFundamentalsRouter.currentScreen) { screenState ->
            when(screenState.value){
                is Screen.Navigation -> NavigationScreen()
                is Screen.AlertDialog -> TODO()
                is Screen.Buttons -> TODO()
                is Screen.ProgressIndicator -> TODO()
                is Screen.Text -> TextScreen()
                is Screen.TextField -> TextFieldScreen()
            }
        }
    }
}