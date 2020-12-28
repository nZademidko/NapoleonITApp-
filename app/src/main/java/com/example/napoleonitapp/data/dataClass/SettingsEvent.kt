package com.example.napoleonitapp.data.dataClass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingsEvent(val countFromText: String, val countToText: String, val rbTYPE: RbTYPE): Parcelable
