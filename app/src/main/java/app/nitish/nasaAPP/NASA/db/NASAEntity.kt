package app.nitish.nasaAPP.NASA.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * NASA model for the database.
 * Created by Nitish on 25/06/2020
 */
@Entity
data class NASAEntity(
    @PrimaryKey val id: Long,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "explanation") val explanation: String,
    @ColumnInfo(name= "mediaType") val mediaType: String,
    @ColumnInfo(name = "url") val url: String,
    @ColumnInfo(name = "hdurl") val hdurl: String?,
    @ColumnInfo(name = "copyright") val copyright: String?
)