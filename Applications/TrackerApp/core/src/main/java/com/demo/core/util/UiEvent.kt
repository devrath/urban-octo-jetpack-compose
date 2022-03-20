package com.demo.core.util

/**
 * In this class we define all the varieties of events that we want to send from view model
 * Everything that we want to do once and that's not a state is added inside this event
 * <*> Navigating to different screen
 * <*> Popping the back stack
 * <*> Showing a snack-bar
 *
 */
sealed class UiEvent {
    data class Navigate(val route: String) : UiEvent()
    object NavigateUp : UiEvent()
}
