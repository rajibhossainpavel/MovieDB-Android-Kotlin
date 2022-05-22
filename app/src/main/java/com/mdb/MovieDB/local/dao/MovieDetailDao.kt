package com.mdb.movieDB.local.dao

interface MovieDetailDao {
     @Query("SELECT * FROM movie_image")
    fun getAll(): List<MovieDetail>

    @Query("SELECT * FROM user WHERE id IN (:Ids)")
    fun loadAllByIds(userIds: IntArray): List<MovieDetail>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
           "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): MovieDetail

    @Insert
    fun insertAll(vararg movie_images: MovieDetail)

    @Delete
    fun delete(movie_image: MovieDetail)
}