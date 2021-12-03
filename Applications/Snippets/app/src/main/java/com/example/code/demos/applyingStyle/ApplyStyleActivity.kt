package com.example.code.demos.applyingStyle

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.example.code.R
import com.example.code.demos.decouplingComposables.GreetingScreen

class ApplyStyleActivity : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewOfScreen()
        }
    }

    @Composable
    private fun PreviewOfScreen() {
        val context = LocalContext.current
        Text(
            text = context.resources.getString(R.string.hello_world),
            modifier = Modifier
                .fillMaxWidth(),
            style = TextStyle(
                color = colorResource(R.color.purple_200),
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp
            )
        )
    }


    @Preview(showBackground = true)
    @Composable
    private fun DefaultPreview(){
        PreviewOfScreen()
    }

}
