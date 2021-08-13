package com.example.code

import android.view.View
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
import androidx.compose.ui.unit.dp

class SampleDemoActivity : ComponentActivity(){

    override fun setContentView(view: View?) {
        super.setContentView(view)
        setContent {
            ButtonClickSample()
        }
    }

    @Composable
    fun ButtonClickSample() {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color.Gray),
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
                    Toast.makeText(this@SampleDemoActivity,"Hello-1", Toast.LENGTH_LONG).show()
                }) {
                    Text(text = "Button-1")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {
                    Toast.makeText(this@SampleDemoActivity,"Hello-2", Toast.LENGTH_LONG).show()
                }) {
                    Text(text = "Button-2")
                }
            }

        }
    }
}