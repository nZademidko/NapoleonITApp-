package com.example.napoleonitapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable

@Parcelize
data class EventDataClass(val name: String, val date: String, val participantCount: String,
                          val eventImageView: String, val description: String) : Parcelable