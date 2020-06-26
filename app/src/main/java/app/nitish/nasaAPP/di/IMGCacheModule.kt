package app.nitish.nasaAPP.di

import app.nitish.nasaAPP.shared.GlideImageCache
import app.nitish.nasaAPP.shared.ImageCache
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kotlinx.coroutines.Dispatchers
import javax.inject.Singleton

/**
 * DI Module for image cache.
 * Created by Nitish on 25/06/2020
 */
@Module
@InstallIn(ApplicationComponent::class)
object IMGCacheModule {
    @Singleton
    @Provides
    fun provide(): ImageCache {
        return GlideImageCache(Dispatchers.Default)
    }
}