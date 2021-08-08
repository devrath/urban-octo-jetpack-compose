package com.example.code

import android.app.ListActivity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.ScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

class SampleSelection : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ScrollableOptions()
        }
    }

}

@Composable
fun ScrollableOptions(){
    Column(
        modifier = Modifier
            // Add a scroll for the views
            .verticalScroll(rememberScrollState())
            // Fill to entire parent
            .fillMaxSize()
            // Add a padding of 10 around
            .padding(10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        CollectionOfOptions()
    }
}

@Composable
fun CollectionOfOptions(){

    // Get the local context
    val context = LocalContext.current

    Button(onClick = {
        context.startActivity(Intent(context, MainActivity::class.java))
    },  modifier = 
        Modifier.fillMaxWidth()
    ) {
        Text(text = context.resources.getString(R.string.sel_simple_sample))
    }
    
    Spacer(modifier = Modifier.height(10.dp))

    Button(onClick = {
                     
    },  modifier =
        Modifier.fillMaxWidth()
    ) {
        Text(text = context.resources.getString(R.string.sel_card_view_sample))
    }

}