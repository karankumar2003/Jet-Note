package com.example.jetnote.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import com.example.jetnote.Utils.Utils
import com.example.jetnote.model.Note


@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun NoteTextField(
    modifier: Modifier = Modifier,
    text: String = "Hello",
    onValueChange: (String) -> Unit,
    label: String = "Label"


) {
    var keyboardController = LocalSoftwareKeyboardController.current

    OutlinedTextField(
        modifier = modifier,
        value = text,
        label = {
            Text(label)
        },
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = {
                keyboardController?.hide()
            }
        )

    )
}

@Composable
fun NoteRow(
    note: Note,
    modifier: Modifier = Modifier
        .padding(8.dp),
    onNoteClicked: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(topEnd = 32.dp, bottomStart = 32.dp))
            .clickable { onNoteClicked() }
        ,color = MaterialTheme.colorScheme.primaryContainer

    ) {
        Column(horizontalAlignment = Alignment.Start
            ) {

            Text(
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 4.dp),
                text = note.title,
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                modifier = Modifier
                    .padding(horizontal = 8.dp, vertical = 4.dp), text = note.description,
                style = MaterialTheme.typography.bodyMedium
            )
            Text(
                modifier = Modifier
                    .padding(horizontal = 10.dp, vertical = 4.dp),
                text = Utils.formatDate(note.date),
                style = MaterialTheme.typography.labelSmall
            )


        }
    }
}