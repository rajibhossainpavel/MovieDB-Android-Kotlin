package com.mdb.movieDB.local.dao

import androidx.room.Dao


@Dao
interface MovieImageDao {
     @Query("SELECT * FROM movie_image")
    fun getAll(): List<MovieImage>

    @Query("SELECT * FROM user WHERE id IN (:Ids)")
    fun loadAllByIds(userIds: IntArray): List<MovieImage>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
           "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): MovieImage

    @Insert
    fun insertAll(vararg movie_images: MovieImage)

    @Delete
    fun delete(movie_image: MovieImage)
}