package com.istudio.compose_tasks.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.istudio.compose_tasks.R
import com.istudio.compose_tasks.data.TaskList
import com.istudio.compose_tasks.views.EmptyList
import com.istudio.compose_tasks.views.EmptyView
import com.istudio.compose_tasks.views.ListItemView

@Composable
fun TaskDetailScreenContent(
    modifier: Modifier,
    listOfToDo: List<String>
){

    if(listOfToDo.isNotEmpty()){
        LazyColumn(
            modifier = modifier,
            content = {
                items(listOfToDo) {
                    ListItemView(
                        value = it,
                        onClick = {}
                    )
                }
            }
        )
    }else{
        // Display the list
        EmptyView(emptyStringText = stringResource(id = R.string.str_no_todos_yet))
    }


}