package com.example.code

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageCard(
                title = "Hello World",
                "This is a card",
                painter = painterResource(id = R.drawable.mario)
                )
        }
    }


    @Composable
    fun ImageCard(
        title : String,
        contentDescription : String,
        painter : Painter,
        modifier : Modifier = Modifier
    ) {
        Card(
            modifier = modifier.fillMaxWidth(),
            shape = RoundedCornerShape(5.dp),
            elevation = 5.dp
        ) {
            Box(
                modifier = Modifier.height(200.dp)
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = title,
                        style = TextStyle(color = Color.White,fontSize = 12.sp)
                    )
                }
            }
        }
    }

    @Composable
    fun buttonClickSample() {
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
                    Toast.makeText(this@MainActivity,"Hello-1",Toast.LENGTH_LONG).show()
                }) {
                    Text(text = "Button-1")
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = {
                    Toast.makeText(this@MainActivity,"Hello-2",Toast.LENGTH_LONG).show()
                }) {
                    Text(text = "Button-2")
                }
            }

        }
    }
}

