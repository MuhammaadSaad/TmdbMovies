package com.movies.api.popularmovies.api.responses


import com.movies.api.popularmovies.api.responses.inner.CreditsResponse
import com.movies.api.popularmovies.api.responses.inner.ReviewsResponse
import com.movies.api.popularmovies.api.responses.inner.VideoResponse
import com.google.gson.annotations.SerializedName

//response for specific movie detail request
data class MovieDetailsResponse(
    @SerializedName("videos")
    val videoResponse: VideoResponse? = null,

    @SerializedName("reviews")
    val reviewResponse: ReviewsResponse? = null,

    @SerializedName("credits")
    val creditsResponse: CreditsResponse? = null
)