package com.istudio.compose_tasks.views.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.istudio.compose_tasks.R
import com.istudio.compose_tasks.data.TaskList
import com.istudio.compose_tasks.viewmodel.ListDataManager
import com.istudio.compose_tasks.views.EmptyView
import com.istudio.compose_tasks.views.TaskListContent
import com.istudio.compose_tasks.views.TasksActionButton
import com.istudio.compose_tasks.views.TasksAppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskListScreen(
    navigate: (String) -> Unit = {}
) {

    val taskListViewModel: ListDataManager = viewModel()
    val viewModelTasks = taskListViewModel.readLists().toList()
    var tasks by remember { mutableStateOf(viewModelTasks) }

    Scaffold(
        topBar = {
            TasksAppBar(
                title = stringResource(id = R.string.str_label_list_maker),
                showBackButton = false,
                backButtonAction = {}
            )
        },
        content = {
            TaskListContent(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize(),
                tasks = tasks,
                onClick = { taskName ->
                    navigate(taskName)
                }
            )
        },
        floatingActionButton = {
            TasksActionButton(
                title = stringResource(id = R.string.str_name_of_list),
                hint = stringResource(id = R.string.str_task_hint),
                onFabClick = {
                    // Here add functionality of saving the task list
                    tasks = (tasks + TaskList(it))
                    taskListViewModel.saveList(TaskList(it))
                    navigate(it)
                }
            )
        }
    )
}
