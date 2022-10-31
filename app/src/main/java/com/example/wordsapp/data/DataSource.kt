package com.example.wordsapp.data

import com.example.wordsapp.R
import com.example.wordsapp.model.Album
import com.example.wordsapp.network.MiAlbum

class DataSource {

    fun loadAlbums(): List<MiAlbum> {
        return listOf<MiAlbum>(
            MiAlbum(1, "Titulo1", "Imagen1", "Hoy1", "Desc1", "Gen1", "RC1"),
            MiAlbum(2, "Titulo2", "Imagen2", "Hoy2", "Desc2", "Gen2", "RC2"),
            MiAlbum(3, "Titulo3", "Imagen3", "Hoy3", "Desc3", "Gen3", "RC3")
        )
    }
}