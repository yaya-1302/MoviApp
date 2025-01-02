package com.example.moviapp.model

data class GenreResponse(
    val genres: List<Genre>
)

data class Genre(
    val id: Int,
    val name: String
)