package com.example.napoleonitapp

import com.example.napoleonitapp.data.Event
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun start() {

        val eventDataClass1 = Event("Успешный ЮУрГУ", "20.12", 150)
        val eventDataClass2 = Event("Студент года", "01.02", 500)
        val eventDataClass3 = Event("Студенческая свадьба", "14.02", 230)
        val eventDataClass4 = Event("Вышка", "06.12", 100)
        val eventDataClass5 = Event("Проектный лекториум", "10.04", 600)
        var eventCollection = mutableListOf<Event>(
            eventDataClass1,
            eventDataClass2,
            eventDataClass3,
            eventDataClass4,
            eventDataClass5
        )
        eventCollection.sort(1)
        println("Сортировка по названию: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].name + "; Дата: " + eventCollection[i].date + "; Количество: "+ eventCollection[i].participantCount)
        }

        println()
        eventCollection = eventCollection.sort(2).toMutableList()
        println("Сортировка по дате: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].name + "; Дата: " + eventCollection[i].date + "; Количество: "+ eventCollection[i].participantCount)
        }

        println()
        eventCollection = eventCollection.sort(3).toMutableList()
        println("Сортировка по количеству: ")
        println()

        for (i in 0..4){
            println("Название: " + eventCollection[i].name + "; Дата: " + eventCollection[i].date + "; Количество: "+ eventCollection[i].participantCount)
        }

    }

    fun MutableList<Event>.sort(type: Int): MutableList<Event> {


        when (type) {
            1 -> this.sortBy { it.name }
            2 ->  this.sortBy { it.date }
            3 ->  this.sortBy { it.participantCount }
        }
        return this;
    }
}