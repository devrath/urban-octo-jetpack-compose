package com.example.code.demos.statesSamples.rememberDemo

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.code.R
import com.example.code.ui.theme.CodeTheme

class RememberDemo : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview2() {
        CurrentScreen()
    }

    @Composable
    private fun CurrentScreen() {
        val context = LocalContext.current
        var isSwitchOn by remember { mutableStateOf(false) }
        CodeTheme {
            // A surface container using the 'background' color from the theme
            Surface(color = MaterialTheme.colors.background) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(if (isSwitchOn) Color.Green else Color.Red)

                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = { isSwitchOn = !isSwitchOn },
                            modifier = Modifier.wrapContentSize(),
                        ) {
                            Text(
                                text = context.resources.getString(R.string.str_click_to_toggle),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            }
        }
    }
}
