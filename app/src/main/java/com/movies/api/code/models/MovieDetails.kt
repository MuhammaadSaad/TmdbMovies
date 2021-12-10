package com.movies.api.code.models

import com.movies.api.popularmovies.api.model.Cast
import com.movies.api.popularmovies.api.model.Review
import com.movies.api.popularmovies.api.model.Video

data class MovieDetails(
    val trailers: List<Video>? = null,
    val reviews: List<Review>? = null,
    val casts: List<Cast>? = null
)