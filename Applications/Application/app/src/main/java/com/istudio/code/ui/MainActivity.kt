package com.istudio.code.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.istudio.code.R
import com.istudio.code.demos.constraintLayout.ConstraintLayoutActivity
import com.istudio.code.demos.imageCard.ImageCardActivity
import com.istudio.code.demos.list.ListActivity
import com.istudio.code.demos.simpleform.SimpleFormActivity
import com.istudio.code.demos.state.StateActivity
import com.istudio.code.demos.stylingText.StylingTextActivity
import com.istudio.code.ui.theme.ComposeTheme
import com.istudio.code.utils.startActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            
            val columnScrollableState = rememberScrollState()
            
            Column( 
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)
                    .scrollable(
                        state = columnScrollableState,
                        orientation = Orientation.Vertical
                    ),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                // DEMO:-> Image Card
                ButtonSelection(
                    buttonText = stringResource(id = R.string.demo_image_card),
                    clickAction = { startActivity<ImageCardActivity>() }
                )
                // DEMO:-> Styling text
                ButtonSelection(
                    buttonText = stringResource(id = R.string.demo_styling_text),
                    clickAction = { startActivity<StylingTextActivity>() }
                )
                // DEMO:-> State
                ButtonSelection(
                    buttonText = stringResource(id = R.string.demo_state),
                    clickAction = { startActivity<StateActivity>() }
                )
                // DEMO:-> Simple Form
                ButtonSelection(
                    buttonText = stringResource(id = R.string.demo_simple_form),
                    clickAction = { startActivity<SimpleFormActivity>() }
                )
                // DEMO:-> List View
                ButtonSelection(
                    buttonText = stringResource(id = R.string.demo_list_view),
                    clickAction = { startActivity<ListActivity>() }
                )
                // DEMO:-> Constraint layout
                ButtonSelection(
                    buttonText = stringResource(id = R.string.demo_constraint),
                    clickAction = { startActivity<ConstraintLayoutActivity>() }
                )
            }

        }
    }


    @Composable
    private fun ButtonSelection(buttonText:String,clickAction:()->Unit){
        Button(onClick = clickAction, modifier = Modifier.fillMaxWidth()
        ) { Text(text = buttonText) }
    }
}
