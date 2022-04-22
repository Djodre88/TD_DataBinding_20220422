package com.example.td_databinding_20220422

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PersonViewModel : ViewModel() {

    private val _matricule = MutableLiveData(10)
    private val _name = MutableLiveData("DOES")
    private val _firstname = MutableLiveData("Jane")
    private val _age = MutableLiveData(20)

    val matricule : MutableLiveData<Int> = _matricule
    val name : MutableLiveData<String> = _name
    val firstname : MutableLiveData<String> = _firstname
    val age : MutableLiveData<Int> = _age

    fun increaseAge (){
    _age.value = _age.value?.plus(1)
    }

    fun decreaseAge (){
        _age.value = _age.value?.minus(1)
    }
}
