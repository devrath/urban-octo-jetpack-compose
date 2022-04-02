package com.example.code.demos.statesSamples.viewModelDemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


class ViewModelDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen(viewModel: ViewModelDemoVm = ViewModelDemoVm()) {
    val newNameStateContent = viewModel.textFieldState.observeAsState("Initial State")

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GreetingMessage(newNameStateContent.value) {
                // New value to be populated
                viewModel.onTextChanged("Final Value")
        }
    }
}

@Composable
fun GreetingMessage(
    valueDisplayed: String,
    textFieldUpdate: () -> Unit
) {

    Text(text = valueDisplayed)

    Button(onClick = textFieldUpdate ) {
        Text(text = "Click to execute !")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}