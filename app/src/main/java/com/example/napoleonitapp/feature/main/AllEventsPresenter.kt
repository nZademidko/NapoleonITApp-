package com.example.napoleonitapp.feature.main

import com.example.napoleonitapp.data.Event
import moxy.MvpPresenter


class AllEventsPresenter() : MvpPresenter<AllEventsView>() {

    private var events: List<Event> = listOf(
        Event("No Code", "12.12.2020", "60", "https://sun9-74.userapi.com/impg/DYFJZe4ptxE7GUz0fnEf3fRV1Su9hy5FRewnfQ/0ZUIUhCAaG8.jpg?size=1000x714&quality=96&proxy=1&sign=6c2f8217df5501b9615e671008cc3b59&type=album", "Мероприятие посвящено платформе, на базе технологии No code, с помощью которой можно делать веб интрефейсы без кода."),
        Event("Product&Project Management", "16.12.2020", "50", "https://sun9-15.userapi.com/impg/qPtHppO2LquBgeG4Ci8IU9cSDOb6H7OMuzkhEw/nCwVUU1wJ1o.jpg?size=1266x853&quality=96&proxy=1&sign=032e5f4bbe7ab578c3b69d1b101263c2&type=album", "На данном мероприятии спикеры 'X-page' расскажу вам о тонкостя работы в Product и Project management'e."),
        Event("Соревнования KAGGLE", "21.11.2020", "60", "https://sun9-19.userapi.com/impg/iOPhgcUthvAAlydIMTAb17oWxd5eercRjDW5cg/OVRMK-hIWT8.jpg?size=1000x714&quality=96&proxy=1&sign=f6d8e3e0890213052a4f4173c2024ae3&type=album", "На данном мероприятии спикеры 'X-page' расскажу вам о тонкостя работы в Product и Project management'e."),
        Event("Junior Backend Dev.", "27.11.2020", "100", "https://sun9-13.userapi.com/impg/k42Zku4G8ZdgziRQLGAuEz0lChUYTFRmMvK9IQ/ibhOAo61WZc.jpg?size=1200x857&quality=96&proxy=1&sign=6b31ff553392d68b1ef95e99d24d86e3&type=album", "На данном мероприятии спикеры 'X-page' расскажу вам о тонкостя работы в Product и Project management'e."),
        Event("iOS Dev. course", "10.11.2020", "100", "https://sun9-33.userapi.com/impg/uosKMcaKIDayp432oiRjc4E4PiWTlkkHVxO6TQ/uG0SZRQ2Da0.jpg?size=1200x630&quality=96&proxy=1&sign=a7089b7420cc09df274dfbeab9472d68&type=album", "Курс разработан специалистами Napoleon IT, чтобы студенты смогли пощупать работу iOS-разработчика"),
        Event("Pre Junior Frontend Dev.", "10.09.2020", "100", "https://sun9-39.userapi.com/impg/WL2gohoyETo7vuH57okqOnWyGAdhliYEZ8-rKA/aGBqbLHoUFE.jpg?size=700x500&quality=96&proxy=1&sign=899a364dfc28bf31c49bd297dc27f6af&type=album", "Подъем, самурай, настал твой час стать Backend-разработчиком."),
        Event("Quality Assurance Course", "15.04.2020", "70", "https://sun9-32.userapi.com/impg/c857220/v857220041/151577/AoRt1FyBbfs.jpg?size=1000x700&quality=96&proxy=1&sign=9463b0be4be02ce61f2ce52aaa04df87&type=album", "Подъем, самурай, настал твой час стать Backend-разработчиком."),
        Event("Android Dev. course", "09.03.2020", "100", "https://sun9-18.userapi.com/impf/c855232/v855232216/126bc6/7JJdpfxHZp8.jpg?size=1000x700&quality=96&proxy=1&sign=f64a96bbab0ca1d9ca0724ab90392178&type=album", "Подъем, самурай, настал твой час стать Backend-разработчиком."),
        Event("Product Management", "10.09.2020", "100", "https://sun9-39.userapi.com/impg/WL2gohoyETo7vuH57okqOnWyGAdhliYEZ8-rKA/aGBqbLHoUFE.jpg?size=700x500&quality=96&proxy=1&sign=899a364dfc28bf31c49bd297dc27f6af&type=album", "Подъем, самурай, настал твой час стать Backend-разработчиком."),
        Event("Pre Junior Frontend Dev.", "10.09.2020", "100", "https://sun9-39.userapi.com/impg/WL2gohoyETo7vuH57okqOnWyGAdhliYEZ8-rKA/aGBqbLHoUFE.jpg?size=700x500&quality=96&proxy=1&sign=899a364dfc28bf31c49bd297dc27f6af&type=album", "Подъем, самурай, настал твой час стать Backend-разработчиком."),
        Event("Pre Junior Frontend Dev.", "10.09.2020", "100", "https://sun9-39.userapi.com/impg/WL2gohoyETo7vuH57okqOnWyGAdhliYEZ8-rKA/aGBqbLHoUFE.jpg?size=700x500&quality=96&proxy=1&sign=899a364dfc28bf31c49bd297dc27f6af&type=album", "Подъем, самурай, настал твой час стать Backend-разработчиком."))

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setEvents(events)
    }

    fun onEventClick(event: Event){
        viewState.openEventDetails(event)
    }

}