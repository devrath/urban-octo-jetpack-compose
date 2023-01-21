package com.istudio.code.demos.list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumnComposable()
        }
    }
}

@Composable
fun LazyColumnComposable() {
    LazyColumn {
        itemsIndexed(
            listOf(
                "Text-1","Text-2","Text-3","Text-4","Text-5",
                "Text-6","Text-7","Text-8","Text-9","Text-10",
                "Text-11","Text-12","Text-13","Text-14","Text-15")
        ){ index, item ->
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                text = item
                    .plus("--")
                    .plus("index")
                    .plus("->").plus(index),
                textAlign = TextAlign.Start,
                fontSize = 22.sp,
            )
        }
    }
}

@Composable
fun SampleColumnComposable() {
    val scrollState = rememberScrollState()
    Column(
        Modifier.verticalScroll(
            enabled = true,
            state = scrollState
        )
    ) {
        for(i in 1..50){
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                text = "Text-$i",
                textAlign = TextAlign.Start,
                fontSize = 22.sp,
            )
        }
    }
}
