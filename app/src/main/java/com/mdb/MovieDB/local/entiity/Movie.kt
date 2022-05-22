package com.mdb.MovieDB.local.entiity
//GET /movie/top_rated
//Authentication: API Key
//QURERY:
//api_key
//language
//page----Specify which page to query. minimum: 1 maximum: 1000 default: 1
//region----Specify a ISO 3166-1 code to filter release dates. Must be uppercase. pattern: ^[A-Z]{2}$
data class Movie(
    val poster_path: String?,
    val adult: Boolean,
    val overview: String,
    val release_date: String,
    val genre_ids:  ArrayList<Int>,
    val id: Int,
    val original_title: String,
    val original_language: String,
    val title: String,
    val backdrop_path: String?,
    val popularity : Double,
    val vote_count: Int,
    val video : Boolean,
    val vote_average :Double
)

//https://stackoverflow.com/questions/57134347/ways-to-caching-online-data-fetched-through-retrofit-into-room-for-offline-acces