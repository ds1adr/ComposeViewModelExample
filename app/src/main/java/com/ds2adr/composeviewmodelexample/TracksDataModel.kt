package com.ds2adr.composeviewmodelexample

import com.google.gson.annotations.SerializedName

data class HasMore(
    val skip: Int?
)

data class Track(
    @SerializedName("_id")
    var id: String,
    var name: String,
    @SerializedName("img")
    var imageURLString: String
)

data class TracksDataModel(
    var hasMore: HasMore,
    var tracks: List<Track>
)
