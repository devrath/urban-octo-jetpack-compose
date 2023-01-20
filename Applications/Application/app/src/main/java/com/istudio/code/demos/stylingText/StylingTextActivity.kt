package com.istudio.code.demos.stylingText

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.istudio.code.R
import com.istudio.code.demos.imageCard.ImageCard

class StylingTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.customfont, FontWeight.Thin),
            Font(R.font.customfont, FontWeight.Black),
            Font(R.font.customfont, FontWeight.Bold),
            Font(R.font.customfont, FontWeight.Medium),
            Font(R.font.customfont, FontWeight.Normal),
            Font(R.font.customfont, FontWeight.ExtraBold),
            Font(R.font.customfont, FontWeight.ExtraLight)
        )

        setContent {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Magenta),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                ) {
                    Text(
                        text = buildAnnotatedString {
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Cyan,
                                    fontSize = 32.sp
                                )
                            ) {
                                append("Hello")
                            }
                            append(" ")
                            withStyle(
                                style = SpanStyle(
                                    color = Color.Yellow,
                                    fontSize = 42.sp
                                )
                            ) {
                                append("World")
                            }
                        },
                        color = Color.White,
                        fontSize = 22.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Medium,
                        fontStyle = FontStyle.Italic,
                        textAlign = TextAlign.Center,
                        textDecoration = TextDecoration.Underline
                    )
                }
            }
        }
    }
}
