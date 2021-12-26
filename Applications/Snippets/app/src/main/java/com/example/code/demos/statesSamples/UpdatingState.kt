package com.example.code.demos.statesSamples

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.code.demos.simpleSamples.buttonComposable.ButtonComposable
import com.example.code.demos.simpleSamples.displayDynamicData.RowView
import com.example.code.demos.statesSamples.ui.theme.CodeTheme
import com.example.code.ui.theme.Purple700
import com.example.code.ui.theme.Teal200

class UpdatingState : ComponentActivity() {

    val cityNames : ArrayList<String> = arrayListOf(
        "Russia" , "Canada" , "Australia"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Composable
    fun CurrentScreen() {
        CodeTheme {

            Surface(
                color = MaterialTheme.colors.background,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Gray)
            ) {

                val localState = remember { mutableStateListOf("Russia","France") }

                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    for (country in localState){
                        CountryComposable(country)
                    }

                    ButtonCustomComposable(localState)
                }

            }
        }
    }

    @Composable
    private fun ButtonCustomComposable(localState: SnapshotStateList<String>) {
        val context = LocalContext.current
        Button(onClick = {
            Toast.makeText(context,"City has been added",Toast.LENGTH_LONG).show()
            localState.add("Spain")
        }, modifier = Modifier.wrapContentSize(),
        ) {
            Text(
                text = "Click to Add",
                textAlign = TextAlign.Center
            )
        }
    }


    @Composable
    private fun CountryComposable(country: String) {
        Text(
            text = country,
            style = TextStyle(color = Teal200, fontSize = 20.sp)
        )
    }



    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        CurrentScreen()
    }
}

