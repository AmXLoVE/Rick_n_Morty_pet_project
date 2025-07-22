package com.rick_n_morty_pet_project.android.core_network_data

import com.rick_n_morty_pet_project.android.core_network_data.characterLocation.LocationDTO

data class CharacterDTO(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val origin: LocationDTO,
    val location: LocationDTO,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String,
)

data class GetCharacter(
    val created: String,
    val episode: List<String>,
    val gender: String,
    val id: Int,
    val image: String,
    val location: Location,
    val name: String,
    val origin: Origin,
    val species: String,
    val status: String,
    val type: String,
    val url: String
)

data class Location(
    val name: String,
    val url: String
)

data class Origin(
    val name: String,
    val url: String
)