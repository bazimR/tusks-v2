package com.example.tusks.model

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class TodoRepository {
    private val _todos = MutableStateFlow<List<TodoData>>(emptyList())
    val todos = _todos.asStateFlow()

    fun addTodo(todo: TodoData) {
        _todos.update {
            it + todo
        }
    }
}