package app.nitish.nasaAPP

/**
 * Delegates service creation to retrofit instance.
 * Created by Nitish on 25/06/2020
 */
interface RetrofitServiceDelegate {
    fun <T> create(service: Class<T>): T
}