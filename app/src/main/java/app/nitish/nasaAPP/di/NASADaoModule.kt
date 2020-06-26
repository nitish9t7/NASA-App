package app.nitish.nasaAPP.di

import android.content.Context
import androidx.room.Room
import app.nitish.nasaAPP.NASA.db.NASADao
import app.nitish.nasaAPP.NASA.db.NASADatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Singleton

/**
 * DI Module for database.
 * Created by Nitish on 25/06/2020
 */

@Module
@InstallIn(ApplicationComponent::class)
object NASADaoModule {
    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext applicationContext: Context): NASADatabase {
        return  Room.databaseBuilder(applicationContext,
            NASADatabase::class.java,
            "NASA").build()
    }

    @Provides
    fun provideDao(database: NASADatabase): NASADao {
        return database.NASADao()
    }
}