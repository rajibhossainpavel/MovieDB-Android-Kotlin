package com.mdb.movieDB.local.dao

package com.mdb.movieDB.local.dao

interface MovieDao {
     @Query("SELECT * FROM movie_image")
    fun getAll(): List<Movie>

    @Query("SELECT * FROM user WHERE id IN (:Ids)")
    fun loadAllByIds(userIds: IntArray): List<Movie>

    @Query("SELECT * FROM user WHERE first_name LIKE :first AND " +
           "last_name LIKE :last LIMIT 1")
    fun findByName(first: String, last: String): Movie

    @Insert
    fun insertAll(vararg movie: Movie)

    @Delete
    fun delete(movie: Movie)
}