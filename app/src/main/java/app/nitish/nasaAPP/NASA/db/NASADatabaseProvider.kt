package app.nitish.nasaAPP.NASA.db

import android.content.Context
import androidx.room.Room

/**
 * Provides [NASADatabase] instance.
 * Created by Nitish on 25/06/2020
 */
object NASADatabaseProvider {
    private lateinit var NASADatabase: NASADatabase

    fun getDatabase(applicationContext: Context): NASADatabase {
        if(!NASADatabaseProvider::NASADatabase.isInitialized) {
            NASADatabase = Room.databaseBuilder(
                applicationContext,
                NASADatabase::class.java, "NASA"
            ).build()
        }
        return NASADatabase
    }
}