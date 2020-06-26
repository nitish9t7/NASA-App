package app.nitish.nasaAPP.NASA.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

/**
 * Data access model for NASA database.
 * Created by Nitish on 25/06/2020
 */
@Dao
interface NASADao {
    @Query("SELECT * FROM NASAentity WHERE date LIKE :date LIMIT 1")
    suspend fun loadByDate(date: String): NASAEntity?

    @Query("SELECT * FROM NASAentity WHERE id = :id LIMIT 1")
    suspend fun loadById(id: Long): NASAEntity?

    @Insert
    suspend fun insertNASA(NASAEntity: NASAEntity): Long

    @Delete
    suspend fun delete(NASAEntity: NASAEntity)

    @Query("DELETE FROM NASAentity")
    suspend fun deleteAll()
}