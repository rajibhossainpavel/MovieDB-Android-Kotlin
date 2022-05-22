package com.mdb.movieDB.local.entiity

import androidx.room.Entity

//GET /movie/top_rated
//Authentication: API Key
//QURERY:
//api_key
//language
//page----Specify which page to query. minimum: 1 maximum: 1000 default: 1
//region----Specify a ISO 3166-1 code to filter release dates. Must be uppercase. pattern: ^[A-Z]{2}$
@Entity(primaryKeys = [("id")])
data class NetworkRequest(
    val id: Int,
    val method: String,
    val url: String?,
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val calledTime: String,
    val cacheControl: String,
    val retryAfter:  String,
    val nextCallingTime: String,
)