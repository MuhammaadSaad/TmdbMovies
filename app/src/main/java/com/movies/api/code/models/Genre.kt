package com.movies.api.popularmovies.api.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Genre(

    @SerializedName("id")
    val id: Long = 0,

    @SerializedName("name")
    val name:String?=null
):Parcelable