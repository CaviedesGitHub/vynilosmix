package com.example.wordsapp.model

data class Album(val id: Int,
                 val name: String,
                 val cover: String,
                 val releaseDate: String,
                 val description: String,
                 val genre: String,
                 val recordLabel: String) {
}