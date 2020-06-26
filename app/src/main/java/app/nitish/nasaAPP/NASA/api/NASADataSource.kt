package app.nitish.nasaAPP.NASA.api

import retrofit2.Response
import java.time.LocalDate

/**
 * The data source for [Nasa's Astronomy Picture of the Day API](https://api.nasa.gov/).
 * Created by Nitish on 25/06/2020
 */
interface NASADataSource {
    suspend fun getNASA(date: LocalDate): Response<NASAResponse>
}