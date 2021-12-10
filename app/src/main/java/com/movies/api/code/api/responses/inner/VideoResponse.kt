package com.movies.api.popularmovies.api.responses.inner

import com.movies.api.popularmovies.api.model.Video
import com.google.gson.annotations.SerializedName

class VideoResponse {
    @SerializedName("results")
    val videos:List<Video>?=null
}