package com.rick_n_morty_pet_project.android.feature_characters_screen_data


data class CharactersScreenState(
    val isSearchMode: Boolean = false,
    val characters: List<CharacterState> = emptyList(),
)