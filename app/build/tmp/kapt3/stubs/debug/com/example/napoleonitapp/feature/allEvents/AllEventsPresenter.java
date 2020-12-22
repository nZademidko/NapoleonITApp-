package com.example.napoleonitapp.feature.allEvents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\nH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/napoleonitapp/feature/allEvents/AllEventsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/example/napoleonitapp/feature/allEvents/AllEventsView;", "electedDao", "Lcom/example/napoleonitapp/data/ElectedDao;", "(Lcom/example/napoleonitapp/data/ElectedDao;)V", "events", "", "Lcom/example/napoleonitapp/data/dataClass/Event;", "onDetailEventClicked", "", "event", "onElectedEventsSwitched", "isChecked", "", "onFirstViewAttach", "app_debug"})
public final class AllEventsPresenter extends moxy.MvpPresenter<com.example.napoleonitapp.feature.allEvents.AllEventsView> {
    private java.util.List<com.example.napoleonitapp.data.dataClass.Event> events;
    private final com.example.napoleonitapp.data.ElectedDao electedDao = null;
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    public final void onElectedEventsSwitched(boolean isChecked) {
    }
    
    public final void onDetailEventClicked(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
    }
    
    public AllEventsPresenter(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.ElectedDao electedDao) {
        super();
    }
}