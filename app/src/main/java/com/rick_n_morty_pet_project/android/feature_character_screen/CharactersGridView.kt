package com.rick_n_morty_pet_project.android.feature_character_screen

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable

@Composable
fun CharactersGridView() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {

    }
}