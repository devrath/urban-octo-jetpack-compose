package com.demo.tracker.navigation

import androidx.navigation.NavController
import com.demo.core.util.UiEvent

/**
 * Extension function for nav controller
 * Params: UI event to navigate
 * *****
 * Action: We will navigate to the route that is being passed to it
 */
fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}