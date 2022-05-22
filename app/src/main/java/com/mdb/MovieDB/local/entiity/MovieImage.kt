package com.mdb.movieDB.local.entiity

import androidx.room.Entity

//GET /movie/{movie_id}/images
//Authentication: API Key
//PATH: movie_id
//QURERY:
//api_key
//language
//include_image_language
@EntitytableName = "movie_images", (primaryKeys = [("id")])
data class MovieImage(
    val id: Int,
    val parent_id: Int,
    val backdrops: ArrayList<BackDrop>,
    val posters: ArrayList<Poster>
)

@Entity(primaryKeys = [("id")])
data class BackDrop(
    val id: Int,
    val parent_id: Int,
    val aspect_ratio: Double,
    val file_path: String,
    val height: Int,
    val iso_639_1: String?,
    val vote_average: Int,
    val vote_count: Int,
    val width: Int
)
@Entity(primaryKeys = [("id")])
data class Poster(
    val id: Int,
    val parent_id: Int,
    val aspect_ratio: Double,
    val file_path: String,
    val height: Int,
    val iso_639_1: String?,
    val vote_average: Int,
    val vote_count: Int,
    val width: Int
)

/**
{
  "id": 550,
  "backdrops": [
    {
      "aspect_ratio": 1.77777777777778,
      "file_path": "/fCayJrkfRaCRCTh8GqN30f8oyQF.jpg",
      "height": 720,
      "iso_639_1": null,
      "vote_average": 0,
      "vote_count": 0,
      "width": 1280
    }
  ],
  "posters": [
    {
      "aspect_ratio": 0.666666666666667,
      "file_path": "/fpemzjF623QVTe98pCVlwwtFC5N.jpg",
      "height": 1800,
      "iso_639_1": "en",
      "vote_average": 0,
      "vote_count": 0,
      "width": 1200
    }
  ]
}
 */