package com.example.counterofsixmonth

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var counter = 0
    val counterLV = MediatorLiveData<Int>()

    fun dec() {
        counter += 1
        counterLV.value = counter
    }

    fun inc() {
        counter -= 1
        counterLV.value = counter
    }
}