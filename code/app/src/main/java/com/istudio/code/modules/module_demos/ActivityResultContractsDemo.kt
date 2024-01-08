package com.istudio.code.modules.module_demos

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.istudio.code.R


const val demoImage =
    "https://images.unsplash.com/photo-1628373383885-4be0bc0172fa?%20%20%20%20%20%20%20%20ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1301&q=80"

@Composable
fun ActivityResultContractsDemo(navController: NavController) {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        AsyncImage(
            model = demoImage,
            contentDescription = null,
            modifier = Modifier
                .background(color = Color.Blue)
                .fillMaxWidth()
                .weight(1f)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            val gradientColor = listOf(Color(0xFFff00cc), Color(0xFF333399))
            val buttonBrush = Brush.horizontalGradient(colors = gradientColor)
            val modifier = Modifier
                .background(brush = buttonBrush)
                .fillMaxWidth()
                .weight(1f)
            
            IconButton(
                modifier = modifier,
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_image),
                    contentDescription = "Image"
                )
            }

            Spacer(modifier = Modifier.width(5.dp))

            IconButton(
                modifier = modifier,
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_camera),
                    contentDescription = "Camera"
                )
            }

        }


    }


}

@Composable
@Preview
fun CurrentScreen() {
    ActivityResultContractsDemo(NavController(LocalContext.current))
}