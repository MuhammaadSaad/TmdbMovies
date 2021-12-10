package com.movies.api.popularmovies.api.responses.inner

import com.movies.api.popularmovies.api.model.Review
import com.google.gson.annotations.SerializedName

class ReviewsResponse {
    @SerializedName("results")
    val reviews:List<Review>?=null
}