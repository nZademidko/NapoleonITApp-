package com.example.napoleonitapp.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Result(
    @SerialName("body_text")
    val bodyText: String?,
    @SerialName("dates")
    val dates: List<Date>?,
    @SerialName("favorites_count")
    val favoritesCount: Int?,
    @SerialName("images")
    val images: List<Image>?,
    @SerialName("title")
    val title: String?
)