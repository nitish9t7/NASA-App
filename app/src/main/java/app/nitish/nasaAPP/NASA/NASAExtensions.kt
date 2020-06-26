package app.nitish.nasaAPP.NASA

import app.nitish.nasaAPP.NASA.api.NASAResponse
import app.nitish.nasaAPP.NASA.db.NASAEntity
import java.time.LocalDate
import java.time.format.DateTimeFormatter

/**
 * Extensions for [NASAResponse].
 * Created by Nitish on 25/06/2020
 */

// Convert NASAResponse to an NASA.
fun NASAResponse.toNASA(): NASA {
    return NASA(
        0, this.date, this.title, this.explanation, this.mediaType, this.url,
        this.hdurl, this.copyright
    )
}

// Convert an NASAEntity to an NASA.
fun NASAEntity.toNASA(): NASA {
    return NASA(
        this.id, this.date, this.title, this.explanation, this.mediaType, this.url,
        this.hdurl, this.copyright
    )
}

// Convert an NASA to an NASAEntity.
fun NASA.toEntity(): NASAEntity {
    return NASAEntity(
        this.id, this.date, this.title, this.explanation, this.mediaType, this.url,
        this.hdurl, this.copyright
    )
}

fun NASA.hasImage(): Boolean {
    return this.mediaType == "image"
}

fun NASA.hasVideo(): Boolean {
    return this.mediaType == "video"
}

/***
 * Attempts to format the date based on the provided pattern. On failure, it will return the
 * unformatted date.
 */
fun NASA.formattedDate(pattern: String): String {
    return try {
        val formatter = DateTimeFormatter.ofPattern(pattern)
        LocalDate.parse(date).format(formatter)
    } catch (e: Exception) {
        date
    }
}