package com.example.napoleonitapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/napoleonitapp/data/ElectedDao;", "", "add", "", "event", "Lcom/example/napoleonitapp/data/dataClass/Event;", "delete", "getAll", "", "isInElected", "", "app_debug"})
public abstract interface ElectedDao {
    
    /**
     * Добавить [event] в избранное.
     */
    public abstract void add(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event);
    
    /**
     * Удалить [event] из избранного.
     */
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event);
    
    /**
     * @return массив избранных мероприятий.
     * Список может быть путсым.
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.napoleonitapp.data.dataClass.Event> getAll();
    
    /**
     * @return true - если мероприятие в избранном, иначе - false
     */
    public abstract boolean isInElected(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event);
}