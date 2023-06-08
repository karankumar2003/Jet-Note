package com.example.jetnote.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date
import java.util.UUID

@Entity
data class Note(
    val title : String,
    val description:String,
    @PrimaryKey
    val id:UUID = UUID.randomUUID(),
    val date : Date = Date.from(Instant.now())
)
