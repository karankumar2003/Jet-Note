package com.example.jetnote.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.jetnote.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    @Query("Select * From Note")
    fun getAllNotes(): Flow<List<Note>>

    @Upsert()
    suspend fun upsertNote(note : Note)

    @Delete
    suspend fun deleteNote(note:Note)
}
