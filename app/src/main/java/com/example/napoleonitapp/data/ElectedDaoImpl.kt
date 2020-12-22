package com.example.napoleonitapp.data

import android.content.SharedPreferences
import com.example.napoleonitapp.data.dataClass.Event
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

class ElectedDaoImpl(
    private val sharedPreferences: SharedPreferences
) : ElectedDao {

    companion object {
        private const val ELECTED_DAO_KEYS = "ELECTED_DAO_KEYS"
    }

    private var events: List<Event>
        get() = sharedPreferences.getString(ELECTED_DAO_KEYS, null)?.let {
            try {
                Json.decodeFromString<List<Event>>(it)
            } catch (t: Throwable) {
                emptyList()
            }

        } ?: emptyList()
        set(value) {
            sharedPreferences.edit().putString(
                ELECTED_DAO_KEYS,
                Json.encodeToString(value)
            ).apply()
        }

    override fun add(event: Event) {

        events = events + event
    }

    override fun delete(event: Event) {

        events = events.filter { it != event }

    }

    override fun getAll(): List<Event> = events
    override fun isInElected(event: Event): Boolean = events.contains(event)

}