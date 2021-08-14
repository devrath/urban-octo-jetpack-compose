package com.example.code.demos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.code.R

class ApplyingFontsActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SetText()
        }
    }


}

@Preview
@Composable
fun ComposablePreview() {
    SetText()
}

@Composable
fun SetText() {

    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        contentAlignment = Alignment.Center
    ){
        TestText()
    }
}

@Composable
fun TestText() {

    val fontFamily = FontFamily(
        Font(R.font.lexend_bold, FontWeight.Bold),
        Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
        Font(R.font.lexend_light, FontWeight.Light),
        Font(R.font.lexend_medium, FontWeight.Medium),
        Font(R.font.lexend_regular, FontWeight.Normal),
        Font(R.font.lexend_semibold, FontWeight.SemiBold),
        Font(R.font.lexend_thin, FontWeight.Thin),
    )

    Text(
        textAlign = TextAlign.Center,
        text = buildAnnotatedString {
                 // Applying styles to different sections of the string
                 withStyle(
                     style = SpanStyle(
                         color = Color.Black,
                         fontSize = 50.sp
                     )
                 ){
                        append("S")
                 }
                 append("imp")
                 withStyle(
                    style = SpanStyle(
                        color = Color.Blue,
                        fontSize = 20.sp
                    )
                 ){
                    append("le")
                 }
                 withStyle(
                    style = SpanStyle(
                        color = Color.Blue,
                        fontSize = 30.sp
                    )
                 ){
                    append("Sample")
                 }
        },
        color = Color.Red,
        fontSize = 40.sp,
        fontFamily = fontFamily,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
    )
}