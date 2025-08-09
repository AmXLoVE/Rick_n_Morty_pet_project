package com.rick_n_morty_pet_project.android.feature_characters_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rick_n_morty_pet_project.android.feature_characters_screen_data.CharacterState
import com.rick_n_morty_pet_project.android.feature_characters_screen_data.CharactersScreenState
import com.rick_n_morty_pet_project.android.ui.top_bars.TopBar
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun CharactersScreen(

) {
    CharactersScreenContent()
}

@Composable
private fun CharactersScreenContent(
) {
    val state by MyViewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
            TopBar(
                isSearchMode = state.isSearchMode,
                state,
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it),
        ) {
            CharactersGridView(
                state.characters,
            )
        }
    }
}

@Preview
@Composable
fun CharacterScreenPreview() {
    CharactersScreenContent()
}

object MyViewModel{
    private val _uiState = MutableStateFlow(CharactersScreenState())
    val uiState: StateFlow<CharactersScreenState> = _uiState.asStateFlow()

    init {
        _uiState.value = _uiState.value.copy(
            isSearchMode = false,
            characters = listOf(
                CharacterState(name = "Rick"),
                CharacterState(name = "Morty"),
                CharacterState(name = "Gabe"),
                CharacterState(name = "OASdios"),
                CharacterState(name = "AAAAAAAAAAAA"),
                CharacterState(name = "Rick"),
                CharacterState(name = "Morty"),
                CharacterState(name = "Gabe"),
                CharacterState(name = "OASdios"),
                CharacterState(name = "AAAAAAAAAAAA"),
            )
        )
    }
}