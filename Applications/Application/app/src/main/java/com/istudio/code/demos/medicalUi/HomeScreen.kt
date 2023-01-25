package com.istudio.code.demos.medicalUi

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.istudio.code.R
import com.istudio.code.demos.medicalUi.composables.ChipsSection
import com.istudio.code.demos.medicalUi.composables.DailyThought
import com.istudio.code.demos.medicalUi.composables.GreetingSection
import com.istudio.code.demos.medicalUi.models.Feature
import com.istudio.code.ui.theme.Beige1
import com.istudio.code.ui.theme.Beige2
import com.istudio.code.ui.theme.Beige3
import com.istudio.code.ui.theme.BlueViolet1
import com.istudio.code.ui.theme.BlueViolet2
import com.istudio.code.ui.theme.BlueViolet3
import com.istudio.code.ui.theme.ButtonBlue
import com.istudio.code.ui.theme.DarkerButtonBlue
import com.istudio.code.ui.theme.DeepBlue
import com.istudio.code.ui.theme.LightGreen1
import com.istudio.code.ui.theme.LightGreen2
import com.istudio.code.ui.theme.LightGreen3
import com.istudio.code.ui.theme.LightRed
import com.istudio.code.ui.theme.TextWhite

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .padding(20.dp)
            .fillMaxSize()
    ) {
        Column() {
            Spacer(modifier = Modifier.height(20.dp))
            GreetingSection()
            Spacer(modifier = Modifier.height(20.dp))
            ChipsSection(listOf("Sweet sleep", "Insomnia", "Depression"))
            Spacer(modifier = Modifier.height(20.dp))
            DailyThought(activity = "Daily Thought", time = "3-10 min")
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Featured",
                fontSize = 24.sp,
                color = Color.White,
                style = MaterialTheme.typography.h2
            )
            Spacer(modifier = Modifier.height(20.dp))

            FeatureSection(
                listOf(
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
            )
        }
    }
}

@Composable
fun FeatureSection(featureList: List<Feature>) {
    val state = rememberLazyGridState()
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(12.dp),
        state = state
    ) {

        items(featureList.size) { feature ->
            FeatureItem(featureList[feature]){
            }
        }
    }
}

@Composable
fun FeatureItem(feature: Feature, onclick:()->Unit) {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(8.dp))
            .background(feature.lightColor)
            .padding(10.dp)
    ) {
        Text(text = feature.title, color = Color.White, fontSize = 14.sp)
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
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

