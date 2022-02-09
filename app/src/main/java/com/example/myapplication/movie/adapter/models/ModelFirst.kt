package com.example.myapplication.movie.adapter.models

import com.example.myapplication.movie.Tags

data class ModelFirst(
    val movieId: String,
    val name: String,
    val description: String,
    val age: String,
    val images: List<String>,
    val poster: String,
    val tags: Tags

)
