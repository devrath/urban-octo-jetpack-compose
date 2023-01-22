package com.istudio.code.demos.sideeffect.demos.rememberCoroutineScope

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.istudio.code.R
import com.istudio.code.demos.constraintLayout.ConstraintLayoutActivity
import com.istudio.code.demos.imageCard.ImageCardActivity
import com.istudio.code.demos.list.ListActivity
import com.istudio.code.demos.sideeffect.SideEffectSelectionActivity
import com.istudio.code.demos.simpleform.SimpleFormActivity
import com.istudio.code.demos.state.StateActivity
import com.istudio.code.demos.stylingText.StylingTextActivity
import com.istudio.code.utils.ButtonSelection
import com.istudio.code.utils.startActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class RememberCoroutineScopeActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { ScreenContent() }
    }


    @Composable
    fun ScreenContent(){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow)
        ) {

            val custScope = rememberCoroutineScope()

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        custScope.launch {
                            delay(3000L)
                            println("Hello World!")
                        }
                    }) {
                    Text(
                        text = "Click here",
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}