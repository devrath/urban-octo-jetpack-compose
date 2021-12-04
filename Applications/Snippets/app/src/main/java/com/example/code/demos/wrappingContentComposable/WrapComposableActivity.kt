package com.example.code.demos.wrappingContentComposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.code.R

class WrapComposableActivity : ComponentActivity(){

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
            .background(color = Color.Gray)
        ) {
                Text(
                    text = context.resources.getString(R.string.hello_world),
                    modifier = Modifier
                        .wrapContentSize()
                        .background(color = Color.Blue)
                        .padding(20.dp),
                    style = TextStyle(
                        color = Color.White,
                        fontSize = 21.sp
                    )
                )
        }
    }


    @Preview(showBackground = true)
    @Composable
    private fun SetScreenPreview() {
        SetScreen()
    }
}
