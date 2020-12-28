package com.example.napoleonitapp.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create

val eventApi: EventApi = Retrofit.Builder()
    .baseUrl("https://kudago.com")
    .client(OkHttpClient.Builder().addInterceptor { chain ->
        val request = chain.request().newBuilder().build()
        chain.proceed(request)
    }.build())
    .addConverterFactory(Json(builderAction = {
        ignoreUnknownKeys = true
    }).asConverterFactory("application/json".toMediaType()))
    .build()
    .create()
