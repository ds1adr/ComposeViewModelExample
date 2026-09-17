package com.ds2adr.composeviewmodelexample

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.await

class TracksViewModel: ViewModel() {
    val tracks = mutableStateListOf<Track>()

    suspend fun loadTracks() {
        val tracksDataModel = NetworkService.getTracksCall.await()
        tracks.addAll(tracksDataModel.tracks)
    }
}