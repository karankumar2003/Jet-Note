package com.example.jetnote.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetnote.components.NoteTextField
import com.example.jetnote.ui.theme.JetNoteTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NoteScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Jet Note")
                },
                actions = {
                    Icon(
                        imageVector = Icons.Rounded.Notifications,
                        contentDescription = "Notifications",
                        modifier = Modifier.padding(end = 4.dp)
                    )
                }
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            var title by remember{
                mutableStateOf("")
            }
            var description by remember{
                mutableStateOf("")
            }
            NoteTextField(
                modifier = Modifier
                    .padding(8.dp),
                text = title,
                onValueChange = {
                    title = it
                },
                label = "Title"
            )

            NoteTextField(
                modifier = Modifier,
                text = description,
                onValueChange = {
                    description = it
                },
                label = "Description"
            )

            Button(
                onClick = { /*TODO*/ },
                enabled = true,
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .padding(8.dp)
            ) {
                Text("Save")
            }


        }
    }
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    JetNoteTheme {
        NoteScreen()
    }
}