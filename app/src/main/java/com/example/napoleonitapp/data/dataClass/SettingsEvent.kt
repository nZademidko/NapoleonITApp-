package com.example.napoleonitapp.data.dataClass

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SettingsEvent(var countFromText: String, var countToText: String, var rbTYPE: RbTYPE): Parcelable
