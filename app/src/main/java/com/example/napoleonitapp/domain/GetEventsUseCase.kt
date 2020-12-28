package com.example.napoleonitapp.domain

import com.example.napoleonitapp.data.dataClass.Event
import com.example.napoleonitapp.di.EventApi
import com.example.napoleonitapp.entity.EventResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetEventsUseCase(private val eventApi: EventApi) {

    suspend operator fun invoke(): List<Event> = withContext(Dispatchers.IO) {
        eventApi.getEvents().run {
            results?.mapNotNull { event ->
                Event(
                    name = event.title ?: return@mapNotNull null,
                    date = event.dates?.get(0)?.date.toString(),
                    participantCount = event.favoritesCount.toString(),
                    eventImageView = event.images?.get(0)?.image ?: return@mapNotNull null,
                    description = event.bodyText ?: return@mapNotNull null
                )
            } ?: emptyList()
        }
    }
}
