package app.nitish.nasaAPP.today

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import app.nitish.nasaAPP.NasaRetrofitClient
import app.nitish.nasaAPP.R
import app.nitish.nasaAPP.NASA.NASA
import app.nitish.nasaAPP.NASA.NASARepository
import app.nitish.nasaAPP.NASA.api.NASARemoteDataSource
import app.nitish.nasaAPP.NASA.db.NASADatabaseProvider
import app.nitish.nasaAPP.NASA.hasImage
import app.nitish.nasaAPP.shared.GlideImageCache
import app.nitish.nasaAPP.shared.ImageCache
import app.nitish.nasaAPP.shared.Resource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.time.LocalDate

/**
 * Syncs Today's Astronomy Picture of the Day in the background.
 * Created by Nitish on 25/06/2020
 */
class TodaySyncWorker(context: Context, params: WorkerParameters): CoroutineWorker(context, params) {
    private val maxRetryAttempts = 2

    override suspend fun doWork(): Result {
        return withContext(Dispatchers.IO) {
            val imageCache =
                GlideImageCache(Dispatchers.IO)
            imageCache.attachApplicationContext(applicationContext)
           val resource = getNASA(imageCache)
            when {
                resource.successful() -> {
                    val NASA = (resource as Resource.Success).data
                    if(NASA.hasImage()) {
                        val cacheSuccessful = imageCache.cache(NASA.hdurl ?: NASA.url)
                        if(cacheSuccessful) Result.success() else Result.failure()
                    } else {
                        Result.success()
                    }
                }
                runAttemptCount < maxRetryAttempts -> {
                    Result.retry()
                }
                else -> {
                    Result.failure()
                }
            }.also {
                imageCache.detachApplicationContext()
            }
        }
    }

    private suspend fun getNASA(imageCache: ImageCache): Resource<NASA, String> = withContext(Dispatchers.IO) {
        val dataSource = NASARemoteDataSource(
            NasaRetrofitClient,
            applicationContext.getString(R.string.key)
        )
        val NASADao = NASADatabaseProvider.getDatabase(applicationContext).NASADao()
        val NASARepository = NASARepository(
            dataSource,
            NASADao,
            imageCache
        )
        val resource = NASARepository.getNASA(LocalDate.now())
        resource
    }
}
