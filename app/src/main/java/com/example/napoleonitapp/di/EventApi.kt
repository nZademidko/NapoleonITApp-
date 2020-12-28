package com.example.napoleonitapp.di

import com.example.napoleonitapp.entity.EventResponse
import retrofit2.http.GET

interface EventApi {

    @GET("public-api/v1.4/events/?expand=dates&fields=images,dates,body_text,title,favorites_count,site_url,description")
    suspend fun getEvents() : EventResponse
}