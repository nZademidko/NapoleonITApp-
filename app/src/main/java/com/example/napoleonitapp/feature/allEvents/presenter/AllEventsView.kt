package com.example.napoleonitapp.feature.allEvents.presenter

import com.example.napoleonitapp.data.dataClass.Event
import moxy.MvpView
import moxy.viewstate.strategy.alias.OneExecution
import moxy.viewstate.strategy.alias.AddToEndSingle

interface AllEventsView: MvpView {

    @AddToEndSingle
    fun setEvents(events: List<Event>)

    @OneExecution
    fun openDetailEvent(event: Event)

    @AddToEndSingle
    fun showLoading(isShow: Boolean)


}