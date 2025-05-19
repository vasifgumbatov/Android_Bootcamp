package com.vasifgumbatov.androidbootcamp.odev_7.data.local.repository

import androidx.lifecycle.LiveData
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.dao.ToDoDao
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.entity.ToDoEntity
import javax.inject.Inject

class TodoRepository @Inject constructor(private val dao: ToDoDao) {

    val allTodos: LiveData<List<ToDoEntity>> = dao.getAllTodos()

    suspend fun insert(todo: ToDoEntity) {
        dao.insert(todo)
    }

    suspend fun delete(todo: ToDoEntity) {
        dao.delete(todo)
    }

    suspend fun update(todo: ToDoEntity) {
        dao.update(todo.id, todo.name, todo.description)
    }
}