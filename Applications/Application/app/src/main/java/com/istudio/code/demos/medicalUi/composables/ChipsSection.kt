package com.istudio.code.demos.medicalUi.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.istudio.code.ui.theme.ButtonBlue
import com.istudio.code.ui.theme.DarkerButtonBlue
import com.istudio.code.ui.theme.TextWhite

@Composable
fun ChipsSection(
    chips: List<String>
) {
    var selectedChipIndex by remember { mutableStateOf(0) }
    LazyRow(
        modifier = Modifier.padding(start = 12.dp, end = 12.dp)
    ) {
        items(count = chips.size) {
            val startPadding = if(it==0){0.dp}else{10.dp}

            Box(
                modifier = Modifier
                    .padding(
                        start = startPadding, end = 10.dp
                    )
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) {
                            ButtonBlue
                        } else {
                            DarkerButtonBlue
                        }
                    )
                    .padding(15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
            ){
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}