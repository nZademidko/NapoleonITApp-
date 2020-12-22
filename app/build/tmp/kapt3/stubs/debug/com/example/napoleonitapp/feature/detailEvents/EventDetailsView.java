package com.example.napoleonitapp.feature.detailEvents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/example/napoleonitapp/feature/detailEvents/EventDetailsView;", "Lmoxy/MvpView;", "setEvent", "", "event", "Lcom/example/napoleonitapp/data/dataClass/Event;", "setIsInElected", "isInElected", "", "app_debug"})
public abstract interface EventDetailsView extends moxy.MvpView {
    
    @moxy.viewstate.strategy.alias.AddToEndSingle()
    public abstract void setEvent(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event);
    
    @moxy.viewstate.strategy.alias.AddToEndSingle()
    public abstract void setIsInElected(boolean isInElected);
}