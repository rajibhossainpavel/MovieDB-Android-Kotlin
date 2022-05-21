package com.mdb.MovieDB.Model.Entity

class Movie {
    val page: integer,
    val poster_path: string?,
    val adult: boolean,
    val overview: string,
    val release_date: string,
    val genre_ids: array[integer],
    val id: integer,
    val original_title: string,
    val original_language: string,
    val title: string,
    val backdrop_path: string?,
    val popularity :number,
    val vote_count: integer,
    val video : boolean,
    val vote_average :number,
    val total_results: integer,
    val total_pages: integer
}
