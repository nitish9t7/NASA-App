package app.nitish.nasaAPP.di;

import app.nitish.nasaAPP.shared.GlideImageCache;
import app.nitish.nasaAPP.shared.ImageCache;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Singleton;

/**
 * DI Module for image cache.
 * Created by Nitish on 25/06/2020
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lapp/nitish/nasaAPP/di/IMGCacheModule;", "", "()V", "provide", "Lapp/nitish/nasaAPP/shared/ImageCache;", "app_debug"})
@dagger.Module()
public final class IMGCacheModule {
    public static final app.nitish.nasaAPP.di.IMGCacheModule INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final app.nitish.nasaAPP.shared.ImageCache provide() {
        return null;
    }
    
    private IMGCacheModule() {
        super();
    }
}