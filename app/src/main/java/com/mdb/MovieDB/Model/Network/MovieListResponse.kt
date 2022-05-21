package com.mdb.MovieDB.Model.Network

import com.mdb.MovieDB.Model.Entity.Movie;

class MovieListResponse {
    val page: Int,
    val total_results: Int,
    val total_pages: Int,
    val results: List<Movie>
}