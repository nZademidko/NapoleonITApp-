package com.example.napoleonitapp.feature.allEvents.presenter

import android.util.Log
import com.example.napoleonitapp.data.ElectedDao
import com.example.napoleonitapp.data.dataClass.Event
import com.example.napoleonitapp.data.dataClass.RbTYPE
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
    var settingsEvent: SettingsEvent = SettingsEvent("0", "1000000", RbTYPE.ALL)


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.showLoading(isShow = true)

        presenterScope.launch(CoroutineExceptionHandler { context, throwable ->
            viewState.showLoading(isShow = false)
            Log.e("tag", throwable.message, throwable)
        }) {
            events = getEventsUseCase()
            sortList(events)
            viewState.showLoading(isShow = false)
        }
    }

    private fun sortList(e: List<Event>,) {
        val elEvents: MutableList<Event> = mutableListOf()

        e.forEach { event ->
            if (settingsEvent.countFromText.toInt() <= event.participantCount.toInt() && event.participantCount.toInt() <= settingsEvent.countToText.toInt()) {
                elEvents.add(event)
            }
        }
        when (settingsEvent.rbTYPE) {
            RbTYPE.NEWER -> elEvents.sortBy { it.date }
            RbTYPE.OLDER -> elEvents.sortByDescending { it.date }
        }
        viewState.setEvents(elEvents)
    }

    fun applyEvents(curSettingsEvent: SettingsEvent) {

        settingsEvent = curSettingsEvent
        sortList(events)
    }


    fun onElectedEventsSwitched(isChecked: Boolean) {
        if (isChecked) sortList(electedDao.getAll())
        else sortList(events)
    }

    fun onDetailEventClicked(event: Event) {
        viewState.openDetailEvent(event)
    }

    fun onExtentFindClicked() {
        viewState.setFindDialog(settingsEvent)
    }


}