package com.istudio.compose_tasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.istudio.compose_tasks.navigation.AppNavHost
import com.istudio.compose_tasks.ui.theme.ComposetasksTheme
import com.istudio.compose_tasks.views.screens.TaskListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                ComposetasksTheme {
                    AppNavHost()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GreetingPreview() {
    ComposetasksTheme {
        TaskListScreen()
    }
}