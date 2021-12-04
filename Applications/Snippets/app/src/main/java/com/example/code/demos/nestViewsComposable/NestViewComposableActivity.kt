package com.example.code.demos.nestViewsComposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class NestViewComposableActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetScreen()
        }
    }

    @Composable
    private fun SetScreen() {
        val context = LocalContext.current
        Surface(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        ) {

            Column(
                modifier = Modifier.fillMaxSize()
                    .background(color = Color.Green),
                verticalArrangement = Arrangement.Center
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ReusedText(
                        text =  "Text-1",color = Color.Blue,
                    )
                    ReusedText(
                        text =  "Text-2",color = Color.Red
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    ReusedText(
                        text =  "Text-3",color = Color.Black
                    )
                    ReusedText(
                        text =  "Text-4",color = Color.DarkGray
                    )
                }
            }

        }
    }

    @Composable
    private fun ReusedText(text: String, color: Color){
        Text(
            text = text,
            modifier = Modifier
                .wrapContentSize(
                    align = Alignment.Center
                )
                .background(color = color)
                .padding(20.dp),
            style = TextStyle(
                color = Color.White,
                fontSize = 21.sp
            )
        )
    }


    @Preview(showBackground = true)
    @Composable
    private fun SetScreenPreview() {
        SetScreen()
    }
}
