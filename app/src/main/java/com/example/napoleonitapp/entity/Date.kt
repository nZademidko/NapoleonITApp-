package com.example.napoleonitapp.entity


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Date(
    @SerialName("end")
    val end: Int?,
    @SerialName("start")
    val start: Int?,
    @SerialName("start_date")
    val date: String?
)