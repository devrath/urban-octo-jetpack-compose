package com.istudio.compose_tasks.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.istudio.compose_tasks.R

@Composable
fun EmptyList(
    modifier : Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        Text( text = stringResource(id = R.string.str_no_todos_yet) )
    }
}