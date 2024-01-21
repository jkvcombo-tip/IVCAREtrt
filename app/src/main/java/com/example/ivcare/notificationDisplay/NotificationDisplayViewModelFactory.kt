package com.example.ivcare.notificationDisplay

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class NotificationDisplayViewModelFactory: ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NotificationDisplayViewModel::class.java)) {
            return NotificationDisplayViewModel() as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }

}