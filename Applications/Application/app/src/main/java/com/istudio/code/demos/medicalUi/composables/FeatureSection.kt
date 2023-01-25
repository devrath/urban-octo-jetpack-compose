package com.istudio.code.demos.medicalUi.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.istudio.code.R
import com.istudio.code.demos.medicalUi.models.Feature
import com.istudio.code.ui.theme.Beige1
import com.istudio.code.ui.theme.Beige2
import com.istudio.code.ui.theme.Beige3
import com.istudio.code.ui.theme.BlueViolet1
import com.istudio.code.ui.theme.BlueViolet2
import com.istudio.code.ui.theme.BlueViolet3
import com.istudio.code.ui.theme.LightGreen1
import com.istudio.code.ui.theme.LightGreen2
import com.istudio.code.ui.theme.LightGreen3


@Composable
fun FeatureSection() {
    val featureList = listOf(
        Feature(
            title = "Night island",
            iconId = R.drawable.ic_moon,
            lightColor = Beige1,
            mediumColor = Beige2,
            darkColor = Beige3
        ),
        Feature(
            title = "Evening island",
            iconId = R.drawable.ic_bubble,
            lightColor = LightGreen1,
            mediumColor = LightGreen2,
            darkColor = LightGreen3
        ),
        Feature(
            title = "Morning island",
            iconId = R.drawable.ic_music,
            lightColor = BlueViolet1,
            mediumColor = BlueViolet2,
            darkColor = BlueViolet3
        )
    )
    val state = rememberLazyGridState()
    Column() {
        Row(modifier = Modifier.padding(start = 12.dp, end = 12.dp)) {
            Text(
                text = "Featured",
                fontSize = 24.sp,
                color = Color.White,
                style = MaterialTheme.typography.h2
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            contentPadding = PaddingValues(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalArrangement = Arrangement.SpaceBetween,
            state = state
        ) {

            items(featureList.size) { feature ->
                FeatureItem(featureList[feature]){
                }
            }
        }
    }
}

@Composable
fun FeatureItem(feature: Feature, onclick:()->Unit) {

    val context = LocalContext.current

    Box(
        modifier = Modifier
            .padding(5.dp)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(8.dp))
            .background(feature.lightColor),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(10.dp)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = feature.title,
                color = Color.White,
                fontSize = 16.sp,
            )
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding()
            ) {
                Icon(
                    painter = painterResource(id = feature.iconId),
                    contentDescription = feature.title,
                    tint = Color.White
                )
                Button(onClick = onclick) {
                    Text(
                        text = stringResource(id = R.string.start),
                        fontSize = 12.sp,
                        color = Color.White
                    )
                }
            }
        }
    }
}