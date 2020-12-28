package com.example.napoleonitapp.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002;<B\u0091\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0012Bi\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010-\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00101\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0086\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\t2\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0003H\u00d6\u0001J\t\u0010:\u001a\u00020\u0006H\u00d6\u0001R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u0017R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b \u0010\u0015\u001a\u0004\b\b\u0010!R \u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b#\u0010\u0015\u001a\u0004\b\n\u0010!R \u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b$\u0010\u0015\u001a\u0004\b\u000b\u0010!R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\u001b\u0012\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\u001aR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0015\u001a\u0004\b(\u0010\u0017R \u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\u0010\n\u0002\u0010\"\u0012\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010!\u00a8\u0006="}, d2 = {"Lcom/example/napoleonitapp/entity/Date;", "", "seen1", "", "end", "endDate", "", "endTime", "isContinuous", "", "isEndless", "isStartless", "start", "date", "startTime", "usePlaceSchedule", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getDate$annotations", "()V", "getDate", "()Ljava/lang/String;", "getEnd$annotations", "getEnd", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getEndDate$annotations", "getEndDate", "getEndTime$annotations", "getEndTime", "isContinuous$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "isEndless$annotations", "isStartless$annotations", "getStart$annotations", "getStart", "getStartTime$annotations", "getStartTime", "getUsePlaceSchedule$annotations", "getUsePlaceSchedule", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/example/napoleonitapp/entity/Date;", "equals", "other", "hashCode", "toString", "$serializer", "Companion", "app_debug"})
@kotlinx.serialization.Serializable()
public final class Date {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer end = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String endDate = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String endTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isContinuous = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isEndless = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean isStartless = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer start = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String date = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String startTime = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean usePlaceSchedule = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.example.napoleonitapp.entity.Date.Companion Companion = null;
    
    @kotlinx.serialization.SerialName(value = "end")
    @java.lang.Deprecated()
    public static void getEnd$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getEnd() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "end_date")
    @java.lang.Deprecated()
    public static void getEndDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEndDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "end_time")
    @java.lang.Deprecated()
    public static void getEndTime$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEndTime() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "is_continuous")
    @java.lang.Deprecated()
    public static void isContinuous$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isContinuous() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "is_endless")
    @java.lang.Deprecated()
    public static void isEndless$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isEndless() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "is_startless")
    @java.lang.Deprecated()
    public static void isStartless$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean isStartless() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "start")
    @java.lang.Deprecated()
    public static void getStart$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStart() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "start_date")
    @java.lang.Deprecated()
    public static void getDate$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDate() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "start_time")
    @java.lang.Deprecated()
    public static void getStartTime$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStartTime() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "use_place_schedule")
    @java.lang.Deprecated()
    public static void getUsePlaceSchedule$annotations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getUsePlaceSchedule() {
        return null;
    }
    
    public Date(@org.jetbrains.annotations.Nullable()
    java.lang.Integer end, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isContinuous, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isEndless, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isStartless, @org.jetbrains.annotations.Nullable()
    java.lang.Integer start, @org.jetbrains.annotations.Nullable()
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean usePlaceSchedule) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.napoleonitapp.entity.Date copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer end, @org.jetbrains.annotations.Nullable()
    java.lang.String endDate, @org.jetbrains.annotations.Nullable()
    java.lang.String endTime, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isContinuous, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isEndless, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isStartless, @org.jetbrains.annotations.Nullable()
    java.lang.Integer start, @org.jetbrains.annotations.Nullable()
    java.lang.String date, @org.jetbrains.annotations.Nullable()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean usePlaceSchedule) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    com.example.napoleonitapp.entity.Date self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lcom/example/napoleonitapp/entity/Date$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/napoleonitapp/entity/Date;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<com.example.napoleonitapp.entity.Date> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"com/example/napoleonitapp/entity/Date.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/napoleonitapp/entity/Date;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<com.example.napoleonitapp.entity.Date> {
        @org.jetbrains.annotations.NotNull()
        public static final com.example.napoleonitapp.entity.Date.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        com.example.napoleonitapp.entity.Date value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.example.napoleonitapp.entity.Date deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
    }
}