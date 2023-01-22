package com.istudio.code.utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ButtonSelection(buttonText:String,clickAction:()->Unit){
    Button(onClick = clickAction, modifier = Modifier.fillMaxWidth()
    ) { Text(text = buttonText) }
}