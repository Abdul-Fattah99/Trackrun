package com.example.trackrun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.trackrun.repositories.MainRepository
import javax.inject.Inject


//Job of MainViewModel is to collect data from repository and provide it for those fragments
// that will need mainViewModel

//we need an instance of our main repo inside our main viewModel

class StatisticsViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
): ViewModel() {
}