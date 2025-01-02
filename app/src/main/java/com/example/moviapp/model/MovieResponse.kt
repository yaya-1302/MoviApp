package com.example.moviapp.model

data class MovieResponse(
    val results: List<Movie>
)

data class Movie(
    val id: Int,
    val title: String,
    val overview: String,
    val posterPath: String
)
