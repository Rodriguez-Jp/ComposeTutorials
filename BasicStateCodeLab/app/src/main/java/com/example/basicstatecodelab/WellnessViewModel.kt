package com.example.basicstatecodelab

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel

class WellnessViewModel : ViewModel(){
    private val _tasks = getWellnessTask().toMutableStateList()
    val task: List<WellnessTask>
        get() = _tasks

    fun remove(item: WellnessTask){
        _tasks.remove(item)
    }
}

fun getWellnessTask() = List(30) { i -> WellnessTask(i, "Task #$i") }
