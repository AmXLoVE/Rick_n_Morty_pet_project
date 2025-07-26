package com.rick_n_morty_pet_project.android.feature_character_screen_data

import com.rick_n_morty_pet_project.android.feature_character_screen.CharacterState

data class CharacterScreenState(
    val isSearchMode: Boolean = false,
    val characters: List<CharacterState> = emptyList(),
)