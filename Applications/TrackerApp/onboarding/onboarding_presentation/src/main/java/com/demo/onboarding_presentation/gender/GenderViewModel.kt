package com.demo.onboarding_presentation.gender

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.core.domain.model.Gender
import com.demo.core.domain.preferences.Preferences
import com.demo.core.navigation.Route
import com.demo.core.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GenderViewModel @Inject constructor(
    private val preferences: Preferences
) : ViewModel() {

    // Private set helps to state that the value can be changed only by inside a view model by still observe from outside
    var selectedGender by mutableStateOf<Gender>(Gender.Male)
        private set

    // We shall use channel to send one time events to UI, These are not states so wont be triggered on screen rotation
    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()


    fun onGenderClick(gender:Gender) {
        selectedGender = gender
    }

    /**
     * On this event:
     * <*> We are sending the navigation event
     * <*> Adding the selected gender to preferences and save it
     */
    fun onNextClick() {
        // Because sending a event into a channel is a suspending operation
        viewModelScope.launch {
            // Saving the gander to preferences
            preferences.saveGender(gender = selectedGender)
            // Informing the navigation event
            _uiEvent.send(UiEvent.Navigate(Route.AGE))
        }
    }
}