package com.rick_n_morty_pet_project.android.core_network.api

import com.rick_n_morty_pet_project.android.core_network_data.GetCharacter
import retrofit2.http.GET

interface CharacterApi {
    @GET("character/1")
    suspend fun getAllCharacters(): GetCharacter
}