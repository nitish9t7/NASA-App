package app.nitish.nasaAPP.di;

import android.content.Context;
import app.nitish.nasaAPP.NASA.db.NASADatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NASADaoModule_ProvideDatabaseFactory implements Factory<NASADatabase> {
  private final Provider<Context> applicationContextProvider;

  public NASADaoModule_ProvideDatabaseFactory(Provider<Context> applicationContextProvider) {
    this.applicationContextProvider = applicationContextProvider;
  }

  @Override
  public NASADatabase get() {
    return provideDatabase(applicationContextProvider.get());
  }

  public static NASADaoModule_ProvideDatabaseFactory create(
      Provider<Context> applicationContextProvider) {
    return new NASADaoModule_ProvideDatabaseFactory(applicationContextProvider);
  }

  public static NASADatabase provideDatabase(Context applicationContext) {
    return Preconditions.checkNotNull(NASADaoModule.INSTANCE.provideDatabase(applicationContext), "Cannot return null from a non-@Nullable @Provides method");
  }
}
