package com.vasifgumbatov.androidbootcamp.odev_7.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.entity.ToDoEntity

interface ToDoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(todo: ToDoEntity)

    @Delete
    suspend fun delete(todo: ToDoEntity)

    @Query("SELECT * from todo_table order by id ASC")
    fun getAllTodos(): LiveData<List<ToDoEntity>>

    @Query("UPDATE todo_table set name = :name , description = :description where id = :id")
    suspend fun update(id: Int?, name: String?, description: String?)

    @Query("DELETE FROM todo_table WHERE id = :id")
    suspend fun delete(id: Int?)
}