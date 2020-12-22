package com.example.napoleonitapp.feature.detailEvents

import com.example.napoleonitapp.data.ElectedDao
import com.example.napoleonitapp.data.dataClass.Event
import moxy.MvpPresenter

class EventDetailsPresenter(
    private val event:Event,
    private val electedDao: ElectedDao
) : MvpPresenter<EventDetailsView>() {

   private var isInElected = false


    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        viewState.setEvent(event)
        isInElected = electedDao.isInElected(event)
        viewState.setIsInElected(isInElected)
    }

    fun onElectedClicked(){

        if(isInElected){
            electedDao.delete(event)
        }else{
            electedDao.add(event)
        }
        isInElected = !isInElected
        viewState.setIsInElected(isInElected)
    }
}