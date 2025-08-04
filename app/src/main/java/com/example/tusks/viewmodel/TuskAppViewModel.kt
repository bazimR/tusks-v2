package com.example.tusks.viewmodel

import androidx.lifecycle.ViewModel
import com.example.tusks.model.TodoData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TuskAppViewModel : ViewModel() {
    private val _todos = MutableStateFlow<List<TodoData>>(emptyList())
    val todos = _todos.asStateFlow()

    fun addTodo(todo: TodoData) {
        _todos.update {
            it + todo
        }
    }
}