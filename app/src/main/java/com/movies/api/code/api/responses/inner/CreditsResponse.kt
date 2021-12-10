package com.movies.api.popularmovies.api.responses.inner

import com.movies.api.popularmovies.api.model.Cast
import com.google.gson.annotations.SerializedName

class CreditsResponse {
    @SerializedName("cast")
    val casts:List<Cast>?=null
}