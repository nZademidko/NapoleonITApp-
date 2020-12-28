package com.example.napoleonitapp.di

import com.example.napoleonitapp.entity.EventResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface EventApi {

    @GET("public-api/v1.4/events/?expand=dates&fields=images,dates,body_text,title,favorites_count")
    suspend fun getEvents() : EventResponse
}