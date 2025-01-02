package com.example.moviapp.model

data class MovieDetailsResponse(
    val id: Int,
    val title: String,
    val overview: String,
    val posterPath: String,
    val releaseDate: String,
    val voteAverage: Double
)