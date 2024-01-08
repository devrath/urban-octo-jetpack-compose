package com.istudio.code.modules.module_selection

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.istudio.code.ui.composables.AppButton
import com.istudio.code.ui.composables.AppText

@Composable
fun ModuleSelectionScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        AppText(text = "Demos")

        Spacer(modifier = Modifier.height(16.dp))

        AppButton(text = "ActivityResultContract", onClick = {
            navController.navigate(ModuleDemo.ActivityResultContractsDemo.rout)
        })

    }
}