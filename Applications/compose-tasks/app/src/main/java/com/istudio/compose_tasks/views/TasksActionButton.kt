package com.istudio.compose_tasks.views

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.istudio.compose_tasks.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksActionButton(
    title: String,
    hint : String,
    onFabClick : (String) -> Unit
){

    var showDlg by remember { mutableStateOf(false) }
    var taskName by remember { mutableStateOf("") }

    FloatingActionButton(
        onClick = {
            showDlg = true
        }
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = stringResource(id = R.string.str_add)
        )
    }

    if(showDlg){
        AlertDialog(
            title = { Text(text = title) },
            text = {
                   OutlinedTextField(
                       value = taskName,
                       onValueChange = { taskName = it },
                       singleLine = true,
                       label = { Text(text = hint) }
                   )
            },
            onDismissRequest = { showDlg = false },
            confirmButton = {
                Button(
                    onClick = {
                        showDlg = false
                        onFabClick(taskName)
                        taskName = ""
                    },
                    content = {
                        Text(text = stringResource(id = R.string.str_create_label))
                    }
                )
            }
        )
    }
}


@Composable
@Preview
private fun DisplayPreview(){
    TasksActionButton(
        title = "Task title",
        hint = "Task hint",
        onFabClick = {}
    )
}