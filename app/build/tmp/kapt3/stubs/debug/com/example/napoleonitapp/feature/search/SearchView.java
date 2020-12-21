package com.example.napoleonitapp.feature.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\b\u0010\u0007\u001a\u00020\u0003H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/napoleonitapp/feature/search/SearchView;", "Lmoxy/MvpView;", "backToMainFragment", "", "rbTYPE", "Lcom/example/napoleonitapp/feature/search/RbTYPE;", "showCountFromError", "showCountToError", "app_debug"})
public abstract interface SearchView extends moxy.MvpView {
    
    @moxy.viewstate.strategy.alias.Skip()
    public abstract void showCountFromError();
    
    @moxy.viewstate.strategy.alias.Skip()
    public abstract void showCountToError();
    
    @moxy.viewstate.strategy.alias.Skip()
    public abstract void backToMainFragment(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.feature.search.RbTYPE rbTYPE);
}