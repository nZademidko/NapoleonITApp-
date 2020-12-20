package com.example.napoleonitapp.feature.main

import com.example.napoleonitapp.data.Event
import moxy.MvpView
import moxy.viewstate.strategy.alias.OneExecution
import moxy.viewstate.strategy.alias.SingleState

interface AllEventsView: MvpView {

    @SingleState
    fun setEvents(events: List<Event>)

    @OneExecution
    fun openEventDetails(event: Event)


}