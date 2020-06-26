package app.nitish.nasaAPP.settings

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.nitish.nasaAPP.NASA.NASARepository
import kotlinx.coroutines.launch

/**
 * [ViewModel] of Settings.
 * Created by Nitish on 25/06/2020
 */
class SettingsViewModel @ViewModelInject constructor(private val NASARepository: NASARepository): ViewModel() {
    fun clearData() {
        viewModelScope.launch {
            NASARepository.clearResources()
        }
    }
}