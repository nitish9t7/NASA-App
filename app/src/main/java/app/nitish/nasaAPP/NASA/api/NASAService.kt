package app.nitish.nasaAPP.NASA.api

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit service for [Nasa's Astronomy Picture of the Day API](https://api.nasa.gov/).
 * Created by Nitish on 25/06/2020.
 */
interface NASAService {
    /***
     * Get an [NASAResponse] from the api.
     * @param key Nasa api key.
     * @param date The date of the Astronomy Picture of the Day.
     */
    @GET("planetary/apod")
    suspend fun getNASA(@Query("api_key") key: String, @Query("date") date: String): Response<NASAResponse>
}