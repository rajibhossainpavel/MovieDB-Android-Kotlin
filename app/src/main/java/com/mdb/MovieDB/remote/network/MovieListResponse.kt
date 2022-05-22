package com.mdb.MovieDB.remote.network

import com.mdb.MovieDB.local.entiity.Movie;

data class MovieListResponse(
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val results: List<Movie>
)