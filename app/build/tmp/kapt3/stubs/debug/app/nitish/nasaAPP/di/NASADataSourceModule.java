package app.nitish.nasaAPP.di;

import android.content.Context;
import app.nitish.nasaAPP.NasaRetrofitClient;
import app.nitish.nasaAPP.R;
import app.nitish.nasaAPP.NASA.api.NASADataSource;
import app.nitish.nasaAPP.NASA.api.NASARemoteDataSource;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;

/**
 * DI Module for data source.
 * Created by Nitish on 25/06/2020
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lapp/nitish/nasaAPP/di/NASADataSourceModule;", "", "()V", "provide", "Lapp/nitish/nasaAPP/NASA/api/NASADataSource;", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class NASADataSourceModule {
    public static final app.nitish.nasaAPP.di.NASADataSourceModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final app.nitish.nasaAPP.NASA.api.NASADataSource provide(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    private NASADataSourceModule() {
        super();
    }
}