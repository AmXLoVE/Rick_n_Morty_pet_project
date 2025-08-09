package com.rick_n_morty_pet_project.android.core_network.api

import com.rick_n_morty_pet_project.android.core_network_data.CharactersResultDTO
import com.rick_n_morty_pet_project.android.core_network_data.GetCharacter
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterApi {
    @GET("character/1")
    suspend fun getAllCharacters(): GetCharacter

    @GET("character/{id}")
    suspend fun getCharacterById(
        @Path("id") id: Int,
    ): GetCharacter

    @GET("character/?page={page}")
    suspend fun getAllCharactersByPage(
        @Path("page") page: Int
    ): GetCharacter

    @GET("character/?name={name}&status={status}&species={species}&type={type}&gender={gender}")
    suspend fun getCharactersByNameFilter(
        @Path("name") name: String?,
        @Path("status") status: String?,
        @Path("species") species: String?,
        @Path("type") type: String?,
        @Path("gender") gender: String?,
    ): CharactersResultDTO

    @GET("location/?name={name}&type={type}&dimension={dimension}")
    suspend fun getCharactersByLocationFilter(
        @Path("name") name: String?,
        @Path("type") type: String?,
        @Path("dimension") dimension: String?,
    ): CharactersResultDTO

    @GET("episode/?name={name}&episode={episode}")
    suspend fun getCharactersByEpisodeFilter(
        @Path("name") name: String?,
        @Path("episode") episode: String?,
    ): CharactersResultDTO
}