package app.nitish.nasaAPP.date

import android.os.Parcel
import android.os.Parcelable
import com.google.android.material.datepicker.CalendarConstraints
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset

/**
 * Validates if date falls within a valid NASA submission.
 * Created by Nitish on 25/06/2020
 */
class NASADateValidator() : CalendarConstraints.DateValidator {
    // The first NASA was 1995-06-16.
    private val earliestDate: LocalDate = LocalDate.of(1995, 6, 16)

    constructor(parcel: Parcel) : this()

    override fun isValid(date: Long): Boolean {
        val today = LocalDate.now()
        val localDate = Instant.ofEpochMilli(date).atOffset(ZoneOffset.UTC).toLocalDate()
        return (earliestDate.isBefore(localDate) or earliestDate.isEqual(localDate)) and
                (localDate.isBefore(today) or localDate.isEqual(today))
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<NASADateValidator> {
        override fun createFromParcel(parcel: Parcel): NASADateValidator {
            return NASADateValidator(parcel)
        }

        override fun newArray(size: Int): Array<NASADateValidator?> {
            return arrayOfNulls(size)
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {}
}