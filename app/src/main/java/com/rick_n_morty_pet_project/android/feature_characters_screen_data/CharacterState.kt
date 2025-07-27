package com.rick_n_morty_pet_project.android.feature_characters_screen_data

import com.rick_n_morty_pet_project.android.R

data class CharacterState(
    val id: Int = 0,
    val name: String = "Alex",
    val image: Int = R.drawable._598,
    val type: String = "Rick's Toxic Side",
    val gender: String = "Male",
)