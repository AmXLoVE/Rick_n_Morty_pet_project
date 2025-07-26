package com.rick_n_morty_pet_project.android.feature_info_screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.rick_n_morty_pet_project.android.feature_character_screen_data.CharacterScreenState
import com.rick_n_morty_pet_project.android.ui.Bars.TopBar

@Composable
fun CharacterInfoScreen() {
    Scaffold(
        topBar = {
            TopBar(
                isSearchMode = false,
                CharacterScreenState()
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it),
        ) {

        }
    }
}

@Preview
@Composable
fun CharacterInfoScreenPreview() {
    CharacterInfoScreen()
}
