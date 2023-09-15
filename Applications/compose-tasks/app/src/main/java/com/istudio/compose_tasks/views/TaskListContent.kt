package com.istudio.compose_tasks.views

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.istudio.compose_tasks.R
import com.istudio.compose_tasks.data.TaskList

@Composable
fun TaskListContent(
    modifier : Modifier,
    tasks : List<TaskList>,
    onClick : (String) -> Unit
){
    if(tasks.isNotEmpty()){
        LazyColumn(
            modifier = modifier,
            content = {
                items(tasks) {
                    ListItemView(
                        value = it.name,
                        onClick = onClick
                    )
                }
            }
        )
    }else{
        EmptyView(emptyStringText = stringResource(id = R.string.str_no_tasks_yet))
    }

}