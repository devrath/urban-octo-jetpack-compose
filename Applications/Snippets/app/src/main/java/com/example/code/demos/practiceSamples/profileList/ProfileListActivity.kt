package com.example.code.demos.practiceSamples.profileList

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.code.R
import com.example.code.ui.theme.CodeTheme

class ProfileListActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CodeTheme { MainScreen() }
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        ProfileCard()
    }
}

@Composable
fun ProfileCard() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top),
        elevation = 8.dp
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            ProfilePicture()
            ProfileContent()
        }
    }
}

@Composable
fun ProfilePicture() {
    Card(
        shape = CircleShape,
        border = BorderStroke(width = 2.dp, color = Color.Green),
        modifier = Modifier.padding(16.dp),
        elevation = 2.dp
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_profile_pic),
            contentDescription = "Profile picture",
            modifier = Modifier.size(50.dp),
            contentScale = ContentScale.Crop
        )
    }

}

@Composable
fun ProfileContent() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = "Rahul",
            style = MaterialTheme.typography.h5
        )
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text(
                text = "Active now",
                style = MaterialTheme.typography.body1
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CodeTheme { MainScreen() }
}