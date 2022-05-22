package com.mdb.MovieDB.local.entiity
//GET /movie/{movie_id}

//QURERY
//api_key
//language
//append_to_response
data class MovieDetail(
    val adult: Boolean?,
    val backdrop_path: String?,
    val belongs_to_collection: Any?,
    val budget: Int?,
    val genres:  ArrayList<Genre>,
    val homepage: String?,
    val id: Int,
    val imdb_id:  String?, //minLength: 9 maxLength: 9 pattern: ^tt[0-9]{7}
    val original_language: String,
    val original_title: String,
    val overview: String?,
    val popularity : Double,
    val poster_path: String?,
    val production_companies: ArrayList<ProductionCompany>,
    val production_countries: ArrayList<ProductionCountry>,
    val release_date: String, //format: date
    val revenue: Int,
    val runtime: Int?,
    val spoken_languages: ArrayList<SpokenLanguage>,
    val status: String,
    val tagline: String?,
    val title: String,
    val video: Boolean,
    val vote_average :Double,
    val vote_count: Int
)

data class Genre(
    val id: Int,
    val name: String
)

data class ProductionCompany(
    val name: String,
    val id: Int,
    val logo_path: String?,
    val origin_country: String
)

data class ProductionCountry(
    val iso_3166_1: String,
    val name: String
)

data class SpokenLanguage(
    val iso_639_1: String,
    val name: String
)