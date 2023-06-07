package com.example.jetnote.data

import com.example.jetnote.model.Note

class DataSource {

    fun loadNotes() : List<Note>{
        return listOf(
            Note("Android","It is a popular OS"),
            Note("Windows","It is a popular OS for ease of use"),
            Note("Mac","It is a popular OS for professional usage"),
            Note("linux","It is a popular OS for stability and security"),
        )
    }
}