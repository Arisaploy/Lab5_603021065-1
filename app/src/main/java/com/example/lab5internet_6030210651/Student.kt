package com.example.lab5internet_6030210651

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

    @Parcelize
     data class Student (val id:String ,val name: String ,val age: Int) : Parcelable{
}