package com.istudio.compose_tasks.views.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.lifecycle.viewmodel.compose.viewModel
import com.istudio.compose_tasks.R
import com.istudio.compose_tasks.data.TaskList
import com.istudio.compose_tasks.viewmodel.ListDataManager
import com.istudio.compose_tasks.views.TaskDetailScreenContent
import com.istudio.compose_tasks.views.TasksActionButton
import com.istudio.compose_tasks.views.TasksAppBar
import androidx.compose.runtime.mutableStateOf


@SuppressLint("MutableCollectionMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskDetailScreen(
    taskName: String?,
    onBackPressed : () -> Unit
){
    val viewModel: ListDataManager = viewModel()

    var tasksList  by remember {
        mutableStateOf(viewModel.readLists().firstOrNull() { it.name == taskName}
            ?.tasks ?: emptyList())
    }

    Scaffold(
        topBar = {
            TasksAppBar(
                title = taskName ?: stringResource(id = R.string.label_task_list),
                showBackButton = true,
                backButtonAction = onBackPressed
            )
        },
        content = {
            TaskDetailScreenContent(
                modifier = Modifier.padding(it),
                listOfToDo = tasksList
            )
        },
        floatingActionButton = {
            TasksActionButton(
                title = stringResource(id = R.string.str_task_to_add),
                hint = stringResource(id = R.string.str_task_hint),
                onFabClick = { todoName ->
                    viewModel.saveList(TaskList(
                        taskName ?: "",
                        tasksList + listOf(todoName)
                    ))
                    tasksList = viewModel.readLists().firstOrNull {
                        it.name == taskName
                    }?.tasks ?: emptyList()
                }
            )
        }
    )

}