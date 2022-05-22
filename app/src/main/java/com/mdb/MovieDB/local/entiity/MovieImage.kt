package com.mdb.MovieDB.local.entiity
//GET /movie/{movie_id}/images
//Authentication: API Key
//PATH: movie_id
//QURERY:
//api_key
//language
//include_image_language
data class MovieImage(
    id: Int,
    val backdrops: ArrayList<BackDrop>,
    val posters: ArrayList<Poster>
)

data class BackDrop(
    val aspect_ratio: Double,
    val file_path: String,
    val height: Int,
    val iso_639_1: String?,
    val vote_average: Int,
    val vote_count: Int,
    val width: Int
)

data class Poster(
    val aspect_ratio: Double,
    val file_path: String,
    val height: Int,
    val iso_639_1: String?,
    val vote_average: Int,
    val vote_count: Int,
    val width: Int
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