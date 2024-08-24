package com.example.counterapp_mvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel


class CounterViewModel (private val repository: CounterRepository) : ViewModel() {
    private var _count =  mutableStateOf(repository.getCounter().count)

    var count : MutableState<Int> = _count

    fun increment (){
        repository.incrementCounter()
        _count.value = repository.getCounter().count
    }

    fun decrement (){
        repository.decrementCounter()
        _count.value = repository.getCounter().count
    }

}