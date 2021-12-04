package com.example.code.demos.modifiers

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.code.R

class ModifiersActivity : ComponentActivity(){

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
                .fillMaxWidth()
                .padding(50.dp)
                .clickable (onClick = ({
                    // --> Specifying some action can be done
                    Toast.makeText(context,"Clicked !!",Toast.LENGTH_LONG).show()
                }))
        )
    }


    @Preview(showBackground = true)
    @Composable
    private fun DefaultPreview(){
        PreviewOfScreen()
    }

}
