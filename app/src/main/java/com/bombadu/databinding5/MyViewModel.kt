package com.bombadu.databinding5

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    //Internal variable that holds the data
   private val _nameData = MutableLiveData<MyName>()

    //External variable with getter
    val nameData: LiveData<MyName>
    get() = _nameData

    //Initializes -nameData
    init {
        _nameData.value = MyName("test")
    }

    /**
     * Takes in string from activity_main.xml - save_button which it's data
     * from the EditText in activity_main
     */
    fun addName(name: String) {
        val newName = MyName(name)
        _nameData.value = newName
        Log.i("TAG", "VM: $newName")
    }





}