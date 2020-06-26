package app.nitish.nasaAPP.di

import android.content.Context
import app.nitish.nasaAPP.NasaRetrofitClient
import app.nitish.nasaAPP.R
import app.nitish.nasaAPP.NASA.api.NASADataSource
import app.nitish.nasaAPP.NASA.api.NASARemoteDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

/**
 * DI Module for data source.
 * Created by Nitish on 25/06/2020
 */
@Module
@InstallIn(ApplicationComponent::class)
object NASADataSourceModule {
    @Provides
    fun provide(@ApplicationContext context: Context): NASADataSource {
        return NASARemoteDataSource(
            NasaRetrofitClient,
            context.getString(R.string.key)
        )
    }
}
