package com.example.taskmanagementapplication

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

@Dao
interface TaskDao {

    @Insert
    suspend fun insertTask(task: Task)

    @Update
    suspend fun updateTask(task:Task)

    @Delete
    suspend fun deleteTask(task: Task)

    @Query("SELECT * From tasks")
    suspend fun getAllTask() : List<Task>

    @Query("SELECT * From tasks WHERE id = :taskId")
    suspend fun getTaskById(taskId: Long): Task?
}