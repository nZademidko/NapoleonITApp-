package com.example.napoleonitapp.data

import com.example.napoleonitapp.data.dataClass.Event

interface ElectedDao {

    /**
     * Добавить [event] в избранное.
     */
    fun add(event: Event)

    /**
     * Удалить [event] из избранного.
     */

    fun delete(event: Event)

    /**
     * @return массив избранных мероприятий.
     * Список может быть путсым.
     */

    fun getAll():List<Event>

    /**
     *@return true - если мероприятие в избранном, иначе - false
     */

    fun isInElected(event: Event): Boolean


}