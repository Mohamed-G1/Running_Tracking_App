package com.example.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningapp.repository.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepo: MainRepository
) : ViewModel() {
}