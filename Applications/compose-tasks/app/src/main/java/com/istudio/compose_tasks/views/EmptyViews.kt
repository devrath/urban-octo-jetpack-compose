package com.istudio.compose_tasks.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.istudio.compose_tasks.R

@Composable
fun EmptyView(
    emptyStringText : String
){

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Icon(
            imageVector = Icons.Default.List,
            contentDescription = emptyStringText
        )

        Spacer(modifier = Modifier.size(16.dp))

        Text( text = emptyStringText )

    }

}


@Composable
@Preview
private fun DefaultPreview(){
    EmptyView(
        emptyStringText = stringResource(id = R.string.str_no_tasks_yet)
    )
}