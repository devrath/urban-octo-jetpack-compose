package com.istudio.compose_tasks.views

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.istudio.compose_tasks.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksAppBar(
    title: String,
    showBackButton : Boolean,
    backButtonAction: () -> Unit
){

    TopAppBar(
        title = { Text(text = title) },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            MaterialTheme.colorScheme.primaryContainer
        ),
        navigationIcon = {
            if(showBackButton){
                IconButton(onClick = backButtonAction) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(id = R.string.str_navigate_back)
                    )
                }
            }
        }
    )

}

@Composable
@Preview
private fun PreviewDemo(){
    TasksAppBar(
        title = "App bar title",
        showBackButton = true,
        backButtonAction = {}
    )
}