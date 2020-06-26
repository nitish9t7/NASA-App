package app.nitish.nasaAPP.NASA.api

import androidx.annotation.Keep

/**
 * Astronomy Picture of the Day from [Nasa's Astronomy Picture of the Day](https://NASA.nasa.gov/NASA/astropix.html).
 * Created by Nitish on 25/06/2020.
 */
@Keep
data class NASAResponse(val id: Long, val date: String, val title: String, val explanation: String, val mediaType: String,
                        val serviceVersion: String, val url: String, val hdurl: String? = null, val copyright: String? = null)