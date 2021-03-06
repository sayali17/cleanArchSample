package com.sayali.cleanarchsample.data.model.shows


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
@Entity(tableName = "popular_TvShows")
data class TvShow(

    @PrimaryKey
    @SerializedName("first_air_date")
    val firstAirDate: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("poster_path")
    val posterPath: String

)