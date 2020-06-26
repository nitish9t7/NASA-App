package app.nitish.nasaAPP.today;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import app.nitish.nasaAPP.NasaRetrofitClient;
import app.nitish.nasaAPP.R;
import app.nitish.nasaAPP.NASA.NASA;
import app.nitish.nasaAPP.NASA.NASARepository;
import app.nitish.nasaAPP.NASA.api.NASARemoteDataSource;
import app.nitish.nasaAPP.NASA.db.NASADatabaseProvider;
import app.nitish.nasaAPP.shared.GlideImageCache;
import app.nitish.nasaAPP.shared.ImageCache;
import app.nitish.nasaAPP.shared.Resource;
import kotlinx.coroutines.Dispatchers;
import java.time.LocalDate;

/**
 * Syncs Today's Astronomy Picture of the Day in the background.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ%\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lapp/nitish/nasaAPP/today/TodaySyncWorker;", "Landroidx/work/CoroutineWorker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "maxRetryAttempts", "", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNASA", "Lapp/nitish/nasaAPP/shared/Resource;", "Lapp/nitish/nasaAPP/NASA/NASA;", "", "imageCache", "Lapp/nitish/nasaAPP/shared/ImageCache;", "(Lapp/nitish/nasaAPP/shared/ImageCache;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TodaySyncWorker extends androidx.work.CoroutineWorker {
    private final int maxRetryAttempts = 2;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object doWork(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super androidx.work.ListenableWorker.Result> p0) {
        return null;
    }
    
    public TodaySyncWorker(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.work.WorkerParameters params) {
        super(null, null);
    }
}