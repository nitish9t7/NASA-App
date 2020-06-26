package app.nitish.nasaAPP.date;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

/**
 * Validates if date falls within a valid NASA submission.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lapp/nitish/nasaAPP/date/NASADateValidator;", "Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "earliestDate", "Ljava/time/LocalDate;", "describeContents", "", "isValid", "", "date", "", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public final class NASADateValidator implements com.google.android.material.datepicker.CalendarConstraints.DateValidator {
    private final java.time.LocalDate earliestDate = null;
    public static final app.nitish.nasaAPP.date.NASADateValidator.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public boolean isValid(long date) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    public NASADateValidator() {
        super();
    }
    
    public NASADateValidator(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lapp/nitish/nasaAPP/date/NASADateValidator$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lapp/nitish/nasaAPP/date/NASADateValidator;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lapp/nitish/nasaAPP/date/NASADateValidator;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<app.nitish.nasaAPP.date.NASADateValidator> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public app.nitish.nasaAPP.date.NASADateValidator createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public app.nitish.nasaAPP.date.NASADateValidator[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}