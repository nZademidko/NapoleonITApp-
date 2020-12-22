package com.example.napoleonitapp.feature.allEvents

import com.example.napoleonitapp.data.dataClass.Event
import moxy.MvpView
import moxy.viewstate.strategy.alias.OneExecution
import moxy.viewstate.strategy.alias.SingleState

interface AllEventsView: MvpView {

    @SingleState
    fun setEvents(events: List<Event>)

    @OneExecution
    fun openDetailEvent(event: Event)

}