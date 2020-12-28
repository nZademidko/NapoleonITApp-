package com.example.napoleonitapp.feature.detailEvents.presenter

import com.example.napoleonitapp.data.dataClass.Event
import moxy.MvpView
import moxy.viewstate.strategy.alias.AddToEndSingle
import moxy.viewstate.strategy.alias.OneExecution

interface EventDetailsView: MvpView {


    @AddToEndSingle
    fun setEvent(event: Event)

    @AddToEndSingle
    fun setIsInElected(isInElected: Boolean)

    @OneExecution
    fun goToLink(url: String)
}