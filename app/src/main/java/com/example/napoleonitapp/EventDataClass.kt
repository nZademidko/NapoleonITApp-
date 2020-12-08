package com.example.napoleonitapp

import android.os.Parcelable
import java.io.Serializable


data class EventDataClass(val name: String, val date: String, val participantCount: String) : Serializable