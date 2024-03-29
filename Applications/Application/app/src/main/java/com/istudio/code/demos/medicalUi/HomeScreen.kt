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
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.istudio.code.R
import com.istudio.code.demos.medicalUi.composables.ChipsSection
import com.istudio.code.demos.medicalUi.composables.DailyThought
import com.istudio.code.demos.medicalUi.composables.FeatureSection
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
            FeatureSection()
        }
    }
}

