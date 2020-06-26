package app.nitish.nasaAPP.today;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.WorkManager;
import java.util.*;

/**
 * Manage when the [TodaySyncWorker] gets called.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lapp/nitish/nasaAPP/today/TodaySyncManager;", "", "()V", "requestCode", "", "cancelRecurringSyncAlarm", "", "context", "Landroid/content/Context;", "setRecurringSyncAlarm", "app_debug"})
public final class TodaySyncManager {
    private static final int requestCode = 9;
    public static final app.nitish.nasaAPP.today.TodaySyncManager INSTANCE = null;
    
    public final void setRecurringSyncAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void cancelRecurringSyncAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private TodaySyncManager() {
        super();
    }
}