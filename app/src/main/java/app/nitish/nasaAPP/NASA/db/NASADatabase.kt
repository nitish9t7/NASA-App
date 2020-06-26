package app.nitish.nasaAPP.NASA.db

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * [NASAEntity] database.
 * Created by Nitish on 25/06/2020
 */
@Database(entities = [NASAEntity::class], version = 1)
abstract class NASADatabase : RoomDatabase() {
    abstract fun NASADao(): NASADao
}
