package com.mdb.movieDB.local

import androidx.room.Database
import com.mdb.movieDB.local.dao.MovieDao
import com.mdb.movieDB.local.dao.MovieDetailDao
import com.mdb.movieDB.local.dao.MovieImageDao
import com.mdb.movieDB.local.dao.NetworkRequestDao
import com.mdb.movieDB.local.entiity.Movie
import com.mdb.movieDB.local.entiity.MovieDetail
import com.mdb.movieDB.local.entiity.MovieImage
import com.mdb.movieDB.local.entiity.NetworkRequest


@Database(entities = [Movie::class, MovieDetail::class,  MovieImage::class, NetworkRequest::class], version = 1)
    abstract class MovieDatabase() : RoomDatabase(){

    abstract fun MovieDao(): MovieDao
    abstract fun MovieDetailDao(): MovieDetailDao
    abstract fun MovieImageDao(): MovieImageDao
    abstract fun NetworkRequestDao(): NetworkRequestDao

}