package com.example.jetnote.viewModel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.jetnote.model.Note

class NoteViewModel: ViewModel() {

    private val notes = mutableStateListOf<Note>()

    fun loadNotes():List<Note>{
        return notes
    }

    fun addNote(note:Note){
        notes.add(note)
    }

    fun removeNote(note:Note){
        notes.remove(note)
    }

}