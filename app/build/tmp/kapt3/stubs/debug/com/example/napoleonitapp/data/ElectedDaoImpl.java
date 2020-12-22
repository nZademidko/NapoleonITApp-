package com.example.napoleonitapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007H\u0016R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/napoleonitapp/data/ElectedDaoImpl;", "Lcom/example/napoleonitapp/data/ElectedDao;", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "value", "", "Lcom/example/napoleonitapp/data/dataClass/Event;", "events", "getEvents", "()Ljava/util/List;", "setEvents", "(Ljava/util/List;)V", "add", "", "event", "delete", "getAll", "isInElected", "", "Companion", "app_debug"})
public final class ElectedDaoImpl implements com.example.napoleonitapp.data.ElectedDao {
    private final android.content.SharedPreferences sharedPreferences = null;
    private static final java.lang.String ELECTED_DAO_KEYS = "ELECTED_DAO_KEYS";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.napoleonitapp.data.ElectedDaoImpl.Companion Companion = null;
    
    private final java.util.List<com.example.napoleonitapp.data.dataClass.Event> getEvents() {
        return null;
    }
    
    private final void setEvents(java.util.List<com.example.napoleonitapp.data.dataClass.Event> value) {
    }
    
    @java.lang.Override()
    public void add(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
    }
    
    @java.lang.Override()
    public void delete(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.napoleonitapp.data.dataClass.Event> getAll() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isInElected(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.data.dataClass.Event event) {
        return false;
    }
    
    public ElectedDaoImpl(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/napoleonitapp/data/ElectedDaoImpl$Companion;", "", "()V", "ELECTED_DAO_KEYS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}