package com.example.code.demos.statesSamples.textFieldDemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.code.ui.theme.CodeTheme

class DemoTextField : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview2() { CurrentScreen() }

    @Composable
    private fun CurrentScreen() {

        val dynamicTextState = remember{ mutableStateOf("") }
        val staticTextState = remember{ mutableStateOf("") }

        CodeTheme {
            ScreenUi(dynamicTextState,staticTextState)
        }

    }

    @Composable
    private fun ScreenUi(
        dynamicTextState: MutableState<String>,
        staticTextState: MutableState<String>
    ) {
        Surface(
            color = MaterialTheme.colors.background,
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                DisplayUiForOneClickUpdating(staticTextState)
                DisplayUiForContinuousUpdating(dynamicTextState)
                InputUi(dynamicTextState.value) { dynamicTextState.value = it }
                ActionUi {
                    updateText(
                        newValue = staticTextState,valueToUpdate = dynamicTextState
                    )
                }

            }
        }
    }

    /**
     * Important Point To Observe:
     * Here we can set the new value for the latest value
     */
    private fun updateText(newValue: MutableState<String>, valueToUpdate: MutableState<String>) {
        newValue.value = valueToUpdate.value
    }

    /**
     * Important Point To Observe:
     * inputUiValue :-> This acts as a input to the current composable
     * inputUiUpdate :-> This acts as a output to the parent composable
     */
    @Composable
    private fun InputUi(
        inputUiValue: String,
        inputUiUpdate : (newValue:String) -> Unit
    ) {
        TextField(
            modifier = Modifier.padding(bottom = 20.dp),
            value = inputUiValue, onValueChange = inputUiUpdate
        )
    }

    /**
     * Important Point To Observe:
     * Here the UI is updating continuously when we type on edit text
     * More Information: We can just pass the mutable state and just update the content
     */
    @Composable
    private fun DisplayUiForContinuousUpdating(newNameStateContent: MutableState<String>) {
        Text(
            text = newNameStateContent.value,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            style = TextStyle(
                color = Color.Magenta,
                fontSize = 28.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
    }

    @Composable
    private fun DisplayUiForOneClickUpdating(newNameClickStateContent: MutableState<String>) {

        val textField by newNameClickStateContent

        Text(
            text = textField,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp),
            style = TextStyle(
                color = Color.Green,
                fontSize = 28.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
    }


    /**
     * Important Point To Observe:
     * This returns the action back via the lambda function call to parent
     */
    @Composable
    private fun ActionUi(buttonClick : () -> Unit) {
        Button(
            onClick = buttonClick,
            modifier = Modifier.wrapContentSize()
        ) {
            Text(
                text = "Change Text",
                textAlign = TextAlign.Center,
                modifier = Modifier.wrapContentSize(),
            )
        }
    }

}