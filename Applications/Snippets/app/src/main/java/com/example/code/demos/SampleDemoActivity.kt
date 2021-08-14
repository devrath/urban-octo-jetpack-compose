package com.example.code.demos

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class SampleDemoActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ButtonClickSample()
        }
    }

}

@Composable
fun ButtonClickSample() {
    // Get the local context
    val context = LocalContext.current
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Column(
            Modifier
                .background(Color.Gray)
                .border(2.dp, Color.Red, shape = RectangleShape)
                .padding(all = 50.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(onClick = {
                Toast.makeText(context,"Hello-1", Toast.LENGTH_LONG).show()
            }) {
                Text(text = "Button-1")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = {
                Toast.makeText(context,"Hello-2", Toast.LENGTH_LONG).show()
            }) {
                Text(text = "Button-2")
            }
        }

    }
}