package app.nitish.nasaAPP

import com.google.gson.FieldNamingPolicy
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Retrofit instance for Nasa API.
 * Created by Nitish on 25/06/2020
 */
object NasaRetrofitClient: RetrofitServiceDelegate {
    private val gson = GsonBuilder()
        .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
        .create()

    val retrofit: Retrofit =  Retrofit.Builder()
        .baseUrl("https://api.nasa.gov/")
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()

    override fun <T> create(service: Class<T>): T {
        return retrofit.create(service)
    }
}