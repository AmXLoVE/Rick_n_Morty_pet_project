package com.rick_n_morty_pet_project.android.core_repository

import com.rick_n_morty_pet_project.android.core_network.retrofit.RetrofitInstance

class CharacterRepository() {
    suspend fun GetCharacterInfo(
        id: Int = 0,
    ) {

    }

    suspend fun GetCharactersByPage(
        page: Int = 1,
    ) {

    }

    suspend fun GetCharactersByNameFilter(
        characterName: String? = null,
        characterStatus: String? = null,
        characterSpecies: String? = null,
        characterGender: String? = null,
        characterType: String? = null,
    ) {
        RetrofitInstance.api.getCharactersByNameFilter(
            name = characterName,
            status = characterStatus,
            species = characterSpecies,
            type = characterType,
            gender = characterGender,
        )
    }

    suspend fun GetCharactersByLocationFilter(
        locationName: String? = null,
        locationType: String? = null,
        locationDimension: String? = null,
    ) {
        RetrofitInstance.api.getCharactersByNameFilter(
            name = characterName,
            status = characterStatus,
            species = characterSpecies,
            type = characterType,
            gender = characterGender,
        )
    }

    suspend fun GetCharactersByEpisodeFilter(
        episodeName: String? = null,
        episodeCode: String? = null,
    ) {
        RetrofitInstance.api.getCharactersByNameFilter(
            name = characterName,
            status = characterStatus,
            species = characterSpecies,
            type = characterType,
            gender = characterGender,
        )
    }
}