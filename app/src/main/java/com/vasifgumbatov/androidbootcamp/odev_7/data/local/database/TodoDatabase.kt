package com.vasifgumbatov.androidbootcamp.odev_7.data.local.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.dao.ToDoDao
import com.vasifgumbatov.androidbootcamp.odev_7.data.local.entity.ToDoEntity

@Database(entities = [ToDoEntity::class], version = 1)
abstract class TodoDatabase : RoomDatabase() {

    abstract fun getDao(): ToDoDao

    companion object {
        @Volatile
        private var INSTANCE: TodoDatabase? = null

        fun getDatabase(context: Context): TodoDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    TodoDatabase::class.java,
                    "todo_database"
                ).build()

                INSTANCE = instance
                instance
            }
        }
    }
}