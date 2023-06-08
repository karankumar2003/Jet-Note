package com.example.jetnote.data.repository

import com.example.jetnote.data.NoteDao
import com.example.jetnote.data.NoteDatabase
import com.example.jetnote.model.Note
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class NoteRepository @Inject constructor(val dao: NoteDao) {

    suspend fun upsertNote(note: Note) = dao.upsertNote(note)

    suspend fun delete(note: Note) = dao.deleteNote(note)

    fun getAllNotes(): Flow<List<Note>> = dao.getAllNotes().flowOn(Dispatchers.IO).conflate()
}