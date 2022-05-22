package com.mdb.movieDB.local

import androidx.room.Room

class Usage(
    val db: MovieDatabase = Room.databaseBuilder(
        applicationContext,
        MovieDatabase::class.java, "movie-db"
    ).build()
)