package com.istudio.code

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.istudio.code.ui.theme.CodeTheme

class MainActivity : ComponentActivity() {

    val tag = "DiaplayMessage";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }

        diaplayLog("onCreate")
    }

    override fun onStart() {
        super.onStart()
        diaplayLog("onStart")
    }

    override fun onResume() {
        super.onResume()
        diaplayLog("onResume")
    }

    override fun onPause() {
        super.onPause()
        diaplayLog("onPause")
    }

    override fun onStop() {
        super.onStop()
        diaplayLog("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        diaplayLog("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        diaplayLog("onRestart")
    }

    private fun diaplayLog(message: String) { Log.d(tag,message) }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CodeTheme {
        Greeting("Android")
    }
}