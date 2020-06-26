package app.nitish.nasaAPP.NASA

import app.nitish.nasaAPP.NASA.api.NASADataSource
import app.nitish.nasaAPP.NASA.db.NASADao
import app.nitish.nasaAPP.shared.ImageCache
import app.nitish.nasaAPP.shared.Resource
import java.io.IOException
import java.time.LocalDate
import javax.inject.Inject

/**
 * Single point of access to fetch an [NASA] from the ui.
 * Created by Nitish on 25/06/2020
 */
class NASARepository @Inject constructor(private val NASADataSource: NASADataSource, private val NASADao: NASADao,
                                         private val imageCache: ImageCache
) {
    // The first NASA was 1995-06-16.
    private val earliestDate: LocalDate = LocalDate.of(1995, 6, 16)

    /***
     * Fetch [NASA] by date. This will attempt to get it from the database first and if not found,
     * will fetch from the api.
     */
    suspend fun getNASA(date: LocalDate): Resource<NASA, String> {
        if (date.isBefore(earliestDate)) {
            return Resource.Error("Date can't be before 1995-06-16.")
        }
        val cachedNASA = NASADao.loadByDate(date.toString())?.toNASA()
        return if (cachedNASA == null) {
            getNASAByDataSource(date)
        } else {
            Resource.Success(cachedNASA)
        }
    }

    /***
     * Fetch a fresh [NASA] by date. This will always attempt to fetch the NASA from the api.
     */
    suspend fun getFreshNASA(date: LocalDate): Resource<NASA, String> {
        if (date.isBefore(earliestDate)) {
            return Resource.Error("Date can't be before 1995-06-16.")
        }
        return getNASAByDataSource(date)
    }

    /***
     * This will fetch an [NASA] from the database by its id.
     */
    suspend fun getCachedNASA(id: Long): Resource<NASA, String> {
        val cachedNASA = NASADao.loadById(id)?.toNASA()
        return if (cachedNASA == null) {
            Resource.Error("NASA not found in database.")
        } else {
            Resource.Success(cachedNASA)
        }
    }

    private suspend fun getNASAByDataSource(date: LocalDate): Resource<NASA, String> {
        try {
            val response = NASADataSource.getNASA(date)
            return if (response.isSuccessful) {
                val networkNASA = response.body()?.toNASA()
                if (networkNASA == null) {
                    Resource.Error("Empty network body.")
                } else {
                    return cacheNASA(networkNASA)
                }
            } else {
                Resource.Error("Error getting NASA with status ${response.code()}.")
            }
        } catch (e: IOException) {
            return Resource.Error("Your network is unavailable. Check your data or wifi connection.")
        }
    }

    private suspend fun cacheNASA(NASA: NASA): Resource<NASA, String> {
        NASADao.delete(NASA.toEntity())
        val id = NASADao.insertNASA(NASA.toEntity())
        val cachedNASA = NASADao.loadById(id)?.toNASA()
        return if (cachedNASA == null) {
            Resource.Error("Error loading NASA from database.")
        } else {
            Resource.Success(cachedNASA)
        }
    }

    /***
     * Clear out resources.
     */
    suspend fun clearResources() {
        NASADao.deleteAll()
        imageCache.clear()
    }
}