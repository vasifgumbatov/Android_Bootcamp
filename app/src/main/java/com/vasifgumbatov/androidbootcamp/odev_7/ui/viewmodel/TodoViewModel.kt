package com.vasifgumbatov.androidbootcamp.odev_7.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.entity.ToDoEntity
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.repository.TodoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoViewModel @Inject constructor(private val repository: TodoRepository) : ViewModel() {
    val allTodos = repository.allTodos

    suspend fun insertTodo(todo: ToDoEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.insert(todo)
    }

    suspend fun updateTodo(todo: ToDoEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.update(todo)
    }

    suspend fun deleteTodo(todo: ToDoEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.delete(todo)
    }

}