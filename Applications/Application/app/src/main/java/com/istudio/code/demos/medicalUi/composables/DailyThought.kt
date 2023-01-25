package com.istudio.code.demos.medicalUi.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.istudio.code.R
import com.istudio.code.ui.theme.LightRed

@Composable
fun DailyThought(activity: String, time: String) {
    Box(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(LightRed)
                .padding(20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.background(LightRed),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {

                val description = activity.plus(" • ").plus(time)
                Text(
                    text = "Daily Thought",
                    color = Color.White,
                    fontSize = 18.sp
                )
                Text(
                    text = description,
                    color = Color.White,
                    fontSize = 12.sp
                )
            }

            Icon(
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "Play",
                tint = Color.White
            )
        }
    }
}