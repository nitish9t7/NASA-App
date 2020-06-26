package app.nitish.nasaAPP.NASA.api

import app.nitish.nasaAPP.RetrofitServiceDelegate
import retrofit2.Response
import java.time.LocalDate

/**
 * Fetch an [NASA] from [Nasa's Astronomy Picture of the Day API](https://api.nasa.gov/).
 * Created by Nitish on 25/06/2020
 */
class NASARemoteDataSource(private val retrofitServiceDelegate: RetrofitServiceDelegate, private val key: String):
    NASADataSource {
    override suspend fun getNASA(date: LocalDate): Response<NASAResponse> {
        val dateStr = date.toString()
        return retrofitServiceDelegate.create(NASAService::class.java)
            .getNASA(key, dateStr)
    }
}