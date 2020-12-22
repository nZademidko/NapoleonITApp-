package com.example.napoleonitapp.feature.searchEvents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J\u0016\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/example/napoleonitapp/feature/searchEvents/SearchPresenter;", "Lmoxy/MvpPresenter;", "Lcom/example/napoleonitapp/feature/searchEvents/SearchView;", "()V", "curRbTYPE", "Lcom/example/napoleonitapp/feature/searchEvents/RbTYPE;", "getCurRbTYPE", "()Lcom/example/napoleonitapp/feature/searchEvents/RbTYPE;", "setCurRbTYPE", "(Lcom/example/napoleonitapp/feature/searchEvents/RbTYPE;)V", "countIsCorrect", "", "countText", "", "setRbType", "", "selectedType", "validate", "countFrom", "countTo", "app_debug"})
public final class SearchPresenter extends moxy.MvpPresenter<com.example.napoleonitapp.feature.searchEvents.SearchView> {
    @org.jetbrains.annotations.NotNull()
    private com.example.napoleonitapp.feature.searchEvents.RbTYPE curRbTYPE = com.example.napoleonitapp.feature.searchEvents.RbTYPE.ALL;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.napoleonitapp.feature.searchEvents.RbTYPE getCurRbTYPE() {
        return null;
    }
    
    public final void setCurRbTYPE(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.feature.searchEvents.RbTYPE p0) {
    }
    
    public final void setRbType(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.feature.searchEvents.RbTYPE selectedType) {
    }
    
    public final void validate(@org.jetbrains.annotations.NotNull()
    java.lang.String countFrom, @org.jetbrains.annotations.NotNull()
    java.lang.String countTo) {
    }
    
    private final boolean countIsCorrect(java.lang.String countText) {
        return false;
    }
    
    public SearchPresenter() {
        super();
    }
}