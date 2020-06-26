package app.nitish.nasaAPP.view

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import app.nitish.nasaAPP.NASA.NASA
import app.nitish.nasaAPP.NASA.NASARepository
import app.nitish.nasaAPP.shared.Resource
import kotlinx.coroutines.launch

/**
 * [ViewModel] for fullscreen picture.
 * Created by Nitish on 25/06/2020
 */

class ClickFragViewModel @ViewModelInject constructor(private val NASARepository: NASARepository): ViewModel() {
    private val _picture = MutableLiveData<Resource<NASA, String>>()
    val picture: LiveData<Resource<NASA, String>> = _picture

    fun load(id: Long) {
        viewModelScope.launch {
            _picture.value = Resource.Loading
            _picture.value = NASARepository.getCachedNASA(id)
        }
    }
}