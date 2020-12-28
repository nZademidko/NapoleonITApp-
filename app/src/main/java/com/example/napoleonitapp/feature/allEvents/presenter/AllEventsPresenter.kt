package com.example.napoleonitapp.feature.allEvents.presenter

import android.util.Log
import com.example.napoleonitapp.data.ElectedDao
import com.example.napoleonitapp.data.dataClass.Event
import com.example.napoleonitapp.data.dataClass.SettingsEvent
import com.example.napoleonitapp.domain.GetEventsUseCase
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.launch
import moxy.MvpPresenter
import moxy.presenterScope


class AllEventsPresenter(
    private val getEventsUseCase: GetEventsUseCase,
    private val electedDao: ElectedDao
) : MvpPresenter<AllEventsView>() {

    lateinit var events: List<Event>

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showLoading(isShow = true)

        presenterScope.launch(CoroutineExceptionHandler { context, throwable ->
            viewState.showLoading(isShow = false)
            Log.e("tag", throwable.message, throwable)
        }) {
            events = getEventsUseCase()
            viewState.setEvents(events)
            viewState.showLoading(isShow = false)
        }
    }

    fun applyEvents(settingsEvent: SettingsEvent) {
        var elEvents: List<Event> = mutableListOf()

        events.forEach { event ->
            if (settingsEvent.countFromText.toInt() <= event.participantCount.toInt() && event.participantCount.toInt() <= settingsEvent.countToText.toInt()) {
                elEvents = elEvents+event
            }
        }
        viewState.setEvents(elEvents)

    }


    fun onElectedEventsSwitched(isChecked: Boolean) {
        if (isChecked) viewState.setEvents(electedDao.getAll())
        else viewState.setEvents(events)
    }

    fun onDetailEventClicked(event: Event) {
        viewState.openDetailEvent(event)
    }

}