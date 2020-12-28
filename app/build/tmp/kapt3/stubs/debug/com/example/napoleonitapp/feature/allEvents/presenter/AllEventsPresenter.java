package com.example.napoleonitapp.feature.allEvents.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u00020\u0010H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/napoleonitapp/feature/allEvents/presenter/AllEventsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/example/napoleonitapp/feature/allEvents/presenter/AllEventsView;", "getEventsUseCase", "Lcom/example/napoleonitapp/domain/GetEventsUseCase;", "electedDao", "Lcom/example/napoleonitapp/data/ElectedDao;", "(Lcom/example/napoleonitapp/domain/GetEventsUseCase;Lcom/example/napoleonitapp/data/ElectedDao;)V", "events", "", "Lcom/example/napoleonitapp/data/dataClass/Event;", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "applyEvents", "", "settingsEvent", "Lcom/example/napoleonitapp/data/dataClass/SettingsEvent;", "onDetailEventClicked", "event", "onElectedEventsSwitched", "isChecked", "", "onFirstViewAttach", "app_debug"})
public final class AllEventsPresenter extends moxy.MvpPresenter<com.example.napoleonitapp.feature.allEvents.presenter.AllEventsView> {
    public java.util.List<com.example.napoleonitapp.data.dataClass.Event> events;
    private final com.example.napoleonitapp.domain.GetEventsUseCase getEventsUseCase = null;
    private final com.example.napoleonitapp.data.ElectedDao electedDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.napoleonitapp.data.dataClass.Event> getEvents() {
        return null;
    }
    
    public final void setEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.napoleonitapp.data.dataClass.Event> p0) {
    }
    
    @java.lang.Override()
    protected void onFirstViewAttach() {
    }
    
    public final void applyEvents(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.SettingsEvent settingsEvent) {
    }
    
    public final void onElectedEventsSwitched(boolean isChecked) {
    }
    
    public final void onDetailEventClicked(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
    }
    
    public AllEventsPresenter(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.domain.GetEventsUseCase getEventsUseCase, @org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.ElectedDao electedDao) {
        super();
    }
}