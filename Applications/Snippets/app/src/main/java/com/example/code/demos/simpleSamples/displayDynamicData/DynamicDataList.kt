package com.example.code.demos.simpleSamples.displayDynamicData

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import com.example.code.ui.theme.CodeTheme


class DynamicDataList : ComponentActivity() {

    private val currentList : List<String> = arrayListOf(
        "Usa","Canada","China","Sri Lanka","Australia","Bangladesh"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CurrentScreen(currentList)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        CurrentScreen(currentList)
    }
}


@Composable
private fun CurrentScreen(currentList: List<String>) {
    val context = LocalContext.current
    CodeTheme {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Gray)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                for (country in currentList){
                    RowView(country)
                }
            }
        }
    }
}

@Composable
fun RowView(country: String) {
    Text(
        text = country,
        style = TextStyle(
            color = Black
        )
    )
}