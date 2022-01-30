package com.example.code.demos.stylingSamples

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import com.example.code.ui.theme.CodeTheme

class ProfileListDemo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { CurrentScreen() }
    }

    @Composable
    private fun CurrentScreen() {
        CodeTheme {
            Surface(modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background) {
                ProfileCard()
            }
        }
    }

    @Composable
    private fun ProfileCard() {
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = 10.dp
        ) {
            Row(
                modifier = Modifier.wrapContentSize(),
            ) {
                ProfilePic()
                ProfileContent()
            }
        }
    }

    @Composable
    private fun ProfileContent() {

    }

    @Composable
    private fun ProfilePic() {
        val mContext = LocalContext.current
        Image(
            painter = painterResource(id = R.drawable.mario),
            modifier = Modifier.size(72.dp),
            contentScale = ContentScale.Crop,
            contentDescription = "Content description"
        )

        Image(painterResource(R.drawable.ic_xxxx),"content description")

    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() { CurrentScreen() }
}
