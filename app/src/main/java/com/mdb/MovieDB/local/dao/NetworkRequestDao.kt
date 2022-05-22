package com.mdb.movieDB.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.mdb.movieDB.local.entiity.NetworkRequest

@Dao
interface NetworkRequestDao {
    @Query("SELECT * FROM network_resquests")
    fun getAll(): List<NetworkRequest>

    @Query("SELECT * FROM movies WHERE id IN (:Ids)")
    fun loadAllByIds(Ids: IntArray): List<NetworkRequest>

    @Insert
    fun insertAll(networkRequests: Array<NetworkRequest>)

    @Delete
    fun delete(networkRequest: NetworkRequest)
}