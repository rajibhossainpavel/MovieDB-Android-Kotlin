package com.mdb.MovieDB.Model.Entity

class Movie {
    val page: Int,
    val poster_path: String?,
    val adult: Boolean,
    val overview: String,
    val release_date: String,
    val genre_ids:  ArrayList(),
    val id: Int,
    val original_title: String,
    val original_language: String,
    val title: String,
    val backdrop_path: String?,
    val popularity : Double,
    val vote_count: Int,
    val video : Boolean,
    val vote_average :Double,
    val total_results: Int,
    val total_pages: Int
}
