package com.istudio.compose_tasks.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TaskList(
    val name: String,
    val tasks: List<String> = listOf()
): Parcelable