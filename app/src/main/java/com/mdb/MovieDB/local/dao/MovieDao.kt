package com.mdb.movieDB.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mdb.movieDB.local.entiity.Movie

@Dao
interface MovieDao {
    @Query("SELECT * FROM movies")
    fun getAll(): List<Movie>

    @Query("SELECT * FROM movies WHERE id IN (:Ids)")
    fun loadAllByIds(Ids: IntArray): List<Movie>

    @Insert
    fun insertAll(movies: Array<Movie>)

    @Delete
    fun delete(movie: Movie)
}