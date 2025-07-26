package com.rick_n_morty_pet_project.android.feature_character_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rick_n_morty_pet_project.android.R
import com.rick_n_morty_pet_project.android.feature_character_screen_data.CharacterScreenState
import com.rick_n_morty_pet_project.android.ui.Bars.TopBar
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun CharacterScreen(

) {
    CharacterScreenContent()
}

@Composable
private fun CharacterScreenContent(
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
    CharacterScreenContent()
}

object MyViewModel{
    private val _uiState = MutableStateFlow(CharacterScreenState())
    val uiState: StateFlow<CharacterScreenState> = _uiState.asStateFlow()

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

data class CharacterState(
    val name: String = "Alex",
    val image: Int = R.drawable._598,
    val type: String = "Rick's Toxic Side",
    val gender: String = "Male",
)