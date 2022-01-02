package com.example.code.demos.statesSamples.textFieldDemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
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
        CodeTheme {
            Surface(
                color = MaterialTheme.colors.background,
                modifier = Modifier.fillMaxSize()
            ) {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = "Current State",
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp),
                        style = TextStyle(
                            color = Color.Magenta,
                            fontSize = 28.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    )

                    TextField(value = "Hello", onValueChange = {

                    } , modifier = Modifier.padding(bottom = 20.dp))

                    Button(
                        onClick = {

                        },
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
        }
    }
}