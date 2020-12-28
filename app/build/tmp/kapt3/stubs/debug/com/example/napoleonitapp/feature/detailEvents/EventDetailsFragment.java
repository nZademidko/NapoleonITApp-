package com.example.napoleonitapp.feature.detailEvents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/example/napoleonitapp/feature/detailEvents/EventDetailsFragment;", "Lmoxy/MvpAppCompatFragment;", "Lcom/example/napoleonitapp/feature/detailEvents/presenter/EventDetailsView;", "()V", "presenter", "Lcom/example/napoleonitapp/feature/detailEvents/presenter/EventDetailsPresenter;", "getPresenter", "()Lcom/example/napoleonitapp/feature/detailEvents/presenter/EventDetailsPresenter;", "presenter$delegate", "Lmoxy/ktx/MoxyKtxDelegate;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setEvent", "event", "Lcom/example/napoleonitapp/data/dataClass/Event;", "setIsInElected", "isInElected", "", "Companion", "app_debug"})
public final class EventDetailsFragment extends moxy.MvpAppCompatFragment implements com.example.napoleonitapp.feature.detailEvents.presenter.EventDetailsView {
    private final moxy.ktx.MoxyKtxDelegate presenter$delegate = null;
    private static java.lang.String EVENT = "EVENT";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.napoleonitapp.feature.detailEvents.EventDetailsFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.example.napoleonitapp.feature.detailEvents.presenter.EventDetailsPresenter getPresenter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void setEvent(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
    }
    
    @java.lang.Override()
    public void setIsInElected(boolean isInElected) {
    }
    
    public EventDetailsFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.example.napoleonitapp.feature.detailEvents.EventDetailsFragment newInstance(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/napoleonitapp/feature/detailEvents/EventDetailsFragment$Companion;", "", "()V", "EVENT", "", "newInstance", "Lcom/example/napoleonitapp/feature/detailEvents/EventDetailsFragment;", "event", "Lcom/example/napoleonitapp/data/dataClass/Event;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.napoleonitapp.feature.detailEvents.EventDetailsFragment newInstance(@org.jetbrains.annotations.NotNull()
        com.example.napoleonitapp.data.dataClass.Event event) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}