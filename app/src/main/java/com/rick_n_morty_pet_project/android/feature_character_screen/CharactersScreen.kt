package com.rick_n_morty_pet_project.android.feature_character_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.rick_n_morty_pet_project.android.feature_character_screen_data.CharacterScreenState
import com.rick_n_morty_pet_project.android.ui.Bars.TopBar

@Composable
fun CharacterScreen(
    viewModel: ViewModel
) {
//    CharacterScreenContent()
}

@Composable
private fun CharacterScreenContent(
    state: CharacterScreenState,
) {
    Scaffold(
        topBar = {
            TopBar(
                isSearchMode = state.isSearchMode
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it)
        ) {
            CharactersGridView()
        }
    }
}

@Preview
@Composable
fun CharacterScreenPreview() {
    CharacterScreenContent(
        CharacterScreenState(
            isSearchMode = false
        )
    )
}