package com.example.mvvm_test.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var _text = MutableLiveData<String>().apply {
        value = ""
    }
    var text : LiveData<String> = _text

    fun  updateText(updatedText: String){
        _text.value = updatedText
    }
}