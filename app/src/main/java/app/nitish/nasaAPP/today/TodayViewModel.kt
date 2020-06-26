package app.nitish.nasaAPP.today

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.*
import app.nitish.nasaAPP.NASA.NASA
import app.nitish.nasaAPP.NASA.NASARepository
import app.nitish.nasaAPP.shared.OneShotEvent
import app.nitish.nasaAPP.shared.Resource
import app.nitish.nasaAPP.shared.data
import kotlinx.coroutines.launch
import java.time.LocalDate

/**
 * [ViewModel] show today's Astronomy Picture of the Day.
 * Created by Nitish on 25/06/2020
 */
class TodayViewModel @ViewModelInject constructor(private val NASARepository: NASARepository): ViewModel() {
    private val _NASA: MutableLiveData<Resource<NASA, String>> = MutableLiveData()
    val NASA: LiveData<Resource<NASA, String>> = _NASA

    private val _navigateVideoLink: MutableLiveData<OneShotEvent<String?>> = MutableLiveData()
    val navigateVideoLink: LiveData<OneShotEvent<String?>> = _navigateVideoLink

    private val _navigateFullPicture: MutableLiveData<OneShotEvent<Long>> = MutableLiveData()
    val navigateFullPicture: LiveData<OneShotEvent<Long>> = _navigateFullPicture

    private val today = LocalDate.now()

    private val _date: MutableLiveData<LocalDate> = MutableLiveData()

    init {
        updateDate(_date.value ?: today)
    }

    fun currentDate(): LocalDate? {
        return _date.value
    }

    fun videoLinkClicked() {
        val currentNASA = _NASA.value?.data
        if(currentNASA?.mediaType == "video") {
            _navigateVideoLink.value =
                OneShotEvent(currentNASA.url)
        }
    }

    fun onPhotoClicked() {
        val NASA = _NASA.value?.data
        if(NASA != null) {
            _navigateFullPicture.value =
                OneShotEvent(NASA.id)
        }
    }

    fun updateDate(date: LocalDate) {
        _date.value = date
        viewModelScope.launch {
            _NASA.value = Resource.Loading
            _NASA.value = NASARepository.getNASA(date)
        }
    }

    fun refresh() {
        viewModelScope.launch {
            _NASA.value = Resource.Loading
            _NASA.value = NASARepository.getFreshNASA(_date.value ?: today)
        }
    }
}