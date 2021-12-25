package com.example.code.demos.simpleSamples.buttonComposable

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.code.R

class ButtonComposable : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SetTheScreen()
        }
    }

    @Composable
    private fun SetTheScreen() {
        val context = LocalContext.current
        Button(onClick = {
            Toast.makeText(
                context,
                context.resources.getString(R.string.str_button_clicked),
                Toast.LENGTH_LONG
            ).show()
        }) {
            Text(text = context.resources.getString(R.string.str_click_here))
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun SetTheDefaultPreview() {
        SetTheScreen()
    }

}
