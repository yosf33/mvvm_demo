package com.example.test.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.test.domain.User
import com.example.test.domain.Wisdom

class MainViewModel : ViewModel() {
    val name="barq"
    private val repository=MainRepository()
    val currentUser=MutableLiveData<User>()
    val wisdom=MutableLiveData<Wisdom>()

    init {
        getUserInfo()
    }

    fun getUserInfo(){
        currentUser.postValue(repository.getCurrentUser())
    }

    fun getAWisdom(){
        wisdom.postValue(repository.getRandomWisdom())
    }


}
