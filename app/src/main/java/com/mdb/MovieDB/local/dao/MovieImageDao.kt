package com.mdb.movieDB.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mdb.movieDB.local.entiity.MovieImage

@Dao
interface MovieImageDao {
    @Query("SELECT * FROM movie_images")
    fun getAll(): List<MovieImage>

    @Query("SELECT * FROM movie_images WHERE id IN (:Ids)")
    fun loadAllByIds(Ids: IntArray): List<MovieImage>

    @Query("SELECT * FROM movie_images WHERE id IN (:Ids)")
    fun loadAllByParentIds(Ids: IntArray): List<MovieImage>

    @Insert
    fun insertAll(movie_images: Array<MovieImage>)

    @Delete
    fun delete(movie_image: MovieImage)
}