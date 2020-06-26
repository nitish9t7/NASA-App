package app.nitish.nasaAPP.di;

import android.content.Context;
import androidx.room.Room;
import app.nitish.nasaAPP.NASA.db.NASADao;
import app.nitish.nasaAPP.NASA.db.NASADatabase;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;

/**
 * DI Module for database.
 * Created by Nitish on 25/06/2020
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lapp/nitish/nasaAPP/di/NASADaoModule;", "", "()V", "provideDao", "Lapp/nitish/nasaAPP/NASA/db/NASADao;", "database", "Lapp/nitish/nasaAPP/NASA/db/NASADatabase;", "provideDatabase", "applicationContext", "Landroid/content/Context;", "app_debug"})
@dagger.Module()
public final class NASADaoModule {
    public static final app.nitish.nasaAPP.di.NASADaoModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final app.nitish.nasaAPP.NASA.db.NASADatabase provideDatabase(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context applicationContext) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final app.nitish.nasaAPP.NASA.db.NASADao provideDao(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.NASA.db.NASADatabase database) {
        return null;
    }
    
    private NASADaoModule() {
        super();
    }
}