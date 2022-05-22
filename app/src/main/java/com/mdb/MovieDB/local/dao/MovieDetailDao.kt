package com.mdb.movieDB.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mdb.movieDB.local.entiity.MovieDetail

@Dao
interface MovieDetailDao {
    @Query("SELECT * FROM movie_details")
    fun getAll(): List<MovieDetail>

    @Query("SELECT * FROM movie_details WHERE id IN (:Ids)")
    fun loadAllByIds(Ids: IntArray): List<MovieDetail>

    @Query("SELECT * FROM movie_details WHERE parent_id id IN (:Ids)")
    fun loadAllByParentIds(Ids: IntArray): List<MovieDetail>

    @Insert
    fun insertAll(movie_details: Array<MovieDetail>)

    @Delete
    fun delete(movie_detail: MovieDetail)
}