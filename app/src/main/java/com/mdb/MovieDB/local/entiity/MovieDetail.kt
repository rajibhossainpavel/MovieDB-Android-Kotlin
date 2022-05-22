package com.mdb.MovieDB.local.entiity

import androidx.room.Entity

//GET /movie/{movie_id}
//Authentication: API Key
//PATH: movie_id
//QURERY:
//api_key
//language
//append_to_response
@Entity(primaryKeys = [("id")])
data class MovieDetail(
    val parent_id: Int,
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

@Entity(primaryKeys = [("id")])
data class Genre(
    val parent_id: Int,
    val id: Int,
    val name: String
)

@Entity(primaryKeys = [("id")])
data class ProductionCompany(
    val parent_id: Int,
    val name: String,
    val id: Int,
    val logo_path: String?,
    val origin_country: String
)

@Entity(primaryKeys = [("id")])
data class ProductionCountry(
    val parent_id: Int,
    val iso_3166_1: String,
    val name: String
)

@Entity(primaryKeys = [("id")])
data class SpokenLanguage(
    val parent_id: Int,
    val iso_639_1: String,
    val name: String
)

/**
{
  "adult": false,
  "backdrop_path": "/fCayJrkfRaCRCTh8GqN30f8oyQF.jpg",
  "belongs_to_collection": null,
  "budget": 63000000,
  "genres": [
    {
      "id": 18,
      "name": "Drama"
    }
  ],
  "homepage": "",
  "id": 550,
  "imdb_id": "tt0137523",
  "original_language": "en",
  "original_title": "Fight Club",
  "overview": "A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new form of therapy. Their concept catches on, with underground \"fight clubs\" forming in every town, until an eccentric gets in the way and ignites an out-of-control spiral toward oblivion.",
  "popularity": 0.5,
  "poster_path": null,
  "production_companies": [
    {
      "id": 508,
      "logo_path": "/7PzJdsLGlR7oW4J0J5Xcd0pHGRg.png",
      "name": "Regency Enterprises",
      "origin_country": "US"
    },
    {
      "id": 711,
      "logo_path": null,
      "name": "Fox 2000 Pictures",
      "origin_country": ""
    },
    {
      "id": 20555,
      "logo_path": null,
      "name": "Taurus Film",
      "origin_country": ""
    },
    {
      "id": 54050,
      "logo_path": null,
      "name": "Linson Films",
      "origin_country": ""
    },
    {
      "id": 54051,
      "logo_path": null,
      "name": "Atman Entertainment",
      "origin_country": ""
    },
    {
      "id": 54052,
      "logo_path": null,
      "name": "Knickerbocker Films",
      "origin_country": ""
    },
    {
      "id": 25,
      "logo_path": "/qZCc1lty5FzX30aOCVRBLzaVmcp.png",
      "name": "20th Century Fox",
      "origin_country": "US"
    }
  ],
  "production_countries": [
    {
      "iso_3166_1": "US",
      "name": "United States of America"
    }
  ],
  "release_date": "1999-10-12",
  "revenue": 100853753,
  "runtime": 139,
  "spoken_languages": [
    {
      "iso_639_1": "en",
      "name": "English"
    }
  ],
  "status": "Released",
  "tagline": "How much can you know about yourself if you've never been in a fight?",
  "title": "Fight Club",
  "video": false,
  "vote_average": 7.8,
  "vote_count": 3439
}
 */