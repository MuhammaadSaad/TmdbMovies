package com.movies.api.code.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.movies.api.code.persistence.dao.MovieAndDetailDao
import com.movies.api.popularmovies.api.model.Movie

@Database(
    entities = [Movie::class],
    version = 1,
    exportSchema = true
)
@TypeConverters(Converter::class)
abstract class MovieDB : RoomDatabase() {
    abstract val movieDao: MovieAndDetailDao


}