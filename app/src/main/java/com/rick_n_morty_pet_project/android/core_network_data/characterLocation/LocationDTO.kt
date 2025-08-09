package com.rick_n_morty_pet_project.android.core_network_data.characterLocation

data class LocationDTO(
    val id: Int,
    val name: String,
    val type: String,
    val dimension: String,
    val residents: ArrayList<String>,
    val url: String,
    val created: String,
)
