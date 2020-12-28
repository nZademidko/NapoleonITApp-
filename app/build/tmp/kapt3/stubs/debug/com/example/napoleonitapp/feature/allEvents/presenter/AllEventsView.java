package com.example.napoleonitapp.feature.allEvents.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/napoleonitapp/feature/allEvents/presenter/AllEventsView;", "Lmoxy/MvpView;", "openDetailEvent", "", "event", "Lcom/example/napoleonitapp/data/dataClass/Event;", "setEvents", "events", "", "showLoading", "isShow", "", "app_debug"})
public abstract interface AllEventsView extends moxy.MvpView {
    
    @moxy.viewstate.strategy.alias.AddToEndSingle()
    public abstract void setEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.napoleonitapp.data.dataClass.Event> events);
    
    @moxy.viewstate.strategy.alias.OneExecution()
    public abstract void openDetailEvent(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event);
    
    @moxy.viewstate.strategy.alias.AddToEndSingle()
    public abstract void showLoading(boolean isShow);
}