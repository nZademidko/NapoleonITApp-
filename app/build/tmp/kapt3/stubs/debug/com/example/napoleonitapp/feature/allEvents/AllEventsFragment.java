package com.example.napoleonitapp.feature.allEvents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001a\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0016\u0010\u0017\u001a\u00020\r2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u0019H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/example/napoleonitapp/feature/allEvents/AllEventsFragment;", "Lmoxy/MvpAppCompatFragment;", "Lcom/example/napoleonitapp/feature/allEvents/AllEventsView;", "()V", "eventsAdapter", "Lcom/example/napoleonitapp/feature/allEvents/AllEventsAdapter;", "presenter", "Lcom/example/napoleonitapp/feature/allEvents/AllEventsPresenter;", "getPresenter", "()Lcom/example/napoleonitapp/feature/allEvents/AllEventsPresenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "initListeners", "", "onDestroy", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "openDetailEvent", "event", "Lcom/example/napoleonitapp/data/dataClass/Event;", "setEvents", "events", "", "app_debug"})
public final class AllEventsFragment extends moxy.MvpAppCompatFragment implements com.example.napoleonitapp.feature.allEvents.AllEventsView {
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    private com.example.napoleonitapp.feature.allEvents.AllEventsAdapter eventsAdapter;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.napoleonitapp.feature.allEvents.AllEventsPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void initListeners() {
    }
    
    @java.lang.Override()
    public void openDetailEvent(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
    }
    
    @java.lang.Override()
    public void setEvents(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.napoleonitapp.data.dataClass.Event> events) {
    }
    
    public AllEventsFragment() {
        super();
    }
}