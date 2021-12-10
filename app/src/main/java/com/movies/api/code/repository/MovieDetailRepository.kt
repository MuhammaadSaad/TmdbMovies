package com.movies.api.code.repository

import androidx.lifecycle.LiveData
import com.movies.api.code.api.MoviesApi
import com.movies.api.code.api.responses.ApiEmptyResponse
import com.movies.api.code.api.responses.ApiErrorResponse
import com.movies.api.code.api.responses.ApiResponse
import com.movies.api.code.api.responses.ApiSuccessResponse
import com.movies.api.code.models.MovieDetails
import com.movies.api.code.util.NetworkBoundResourceNoCaching
import com.movies.api.code.util.Resource
import com.movies.api.popularmovies.api.responses.MovieDetailsResponse

class MovieDetailRepository(
    private val movieApi: MoviesApi
) {

    fun getMovieDetail(movieId: Long): LiveData<Resource<MovieDetails>> {
        return object : NetworkBoundResourceNoCaching<MovieDetails, MovieDetailsResponse>() {
            override fun handleApiSuccessResponse(response: ApiSuccessResponse<MovieDetailsResponse>) {
                val detailsResponse= response.body
                val videos = detailsResponse.videoResponse?.videos
                val casts = detailsResponse.creditsResponse?.casts
                val reviews = detailsResponse.reviewResponse?.reviews
                result.value = Resource.Success(MovieDetails(videos,reviews,casts))
            }

            override fun handleApiEmptyResponse(response: ApiEmptyResponse<MovieDetailsResponse>) {
                //MovieDetails,has empty videos,casts,reviews
                result.value = Resource.Success(MovieDetails())
            }

            override fun handleApiErrorResponse(response: ApiErrorResponse<MovieDetailsResponse>) {
                result.value = Resource.Error(response.errorMessage,null)
            }

            override fun createCall(): LiveData<ApiResponse<MovieDetailsResponse>> =
                movieApi.getMovieDetail(movieId)

        }.asLiveData()
    }
}