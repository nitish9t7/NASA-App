package app.nitish.nasaAPP.today

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.preference.PreferenceManager
import androidx.work.*
import app.nitish.nasaAPP.R

/**
 * Setup a one time work request to sync today's Astronomy Picture of the Day.
 * Created by Nitish on 25/06/2020
 */
class TodaySyncBroadcastReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let {
            val unmetered = PreferenceManager.getDefaultSharedPreferences(context).getBoolean(context.getString(R.string.settings_key_unmetered), false)
            val syncWorkManager = WorkManager.getInstance(context)
            val workConstraints = Constraints.Builder()
                .setRequiredNetworkType(if(unmetered) NetworkType.UNMETERED else NetworkType.CONNECTED)
                .build()
            val workRequest = OneTimeWorkRequestBuilder<TodaySyncWorker>()
                .setConstraints(workConstraints)
                .build()
            syncWorkManager.enqueueUniqueWork(TodaySyncWorker::class.java.simpleName, ExistingWorkPolicy.REPLACE, workRequest)
        }
    }
}