package com.example.wordsapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.wordsapp.model.Album
import com.example.wordsapp.network.MiAlbum
import com.example.wordsapp.network.VynilosApi
import kotlinx.coroutines.launch

class VynilosViewModel:ViewModel() {

    private val _status = MutableLiveData<String>()
    val status: LiveData<String> = _status

    private val _albums = MutableLiveData<MiAlbum>()
    val albums: LiveData<MiAlbum> = _albums

    private val _lstAlbums = MutableLiveData<List<MiAlbum>>()
    val lstAlbums: LiveData<List<MiAlbum>> = _lstAlbums

    lateinit var miListaAlbum:List<MiAlbum>

    init {
        getAlbums()
    }

    private fun getAlbums() {
        viewModelScope.launch {
            _albums.value= VynilosApi.retrofitService.getAlbums()[0]
            _status.value = "   First Mars image URL : ${_albums.value!!.cover}"
           //val listResult = VynilosApi.retrofitService.getAlbums()
            //miListaAlbum=listResult
            //_status.value = "Success: ${listResult.size} Albums retrieved"
        }
    }
}