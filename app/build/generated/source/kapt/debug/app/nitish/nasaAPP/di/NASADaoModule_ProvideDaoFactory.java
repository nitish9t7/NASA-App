package app.nitish.nasaAPP.di;

import app.nitish.nasaAPP.NASA.db.NASADao;
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
public final class NASADaoModule_ProvideDaoFactory implements Factory<NASADao> {
  private final Provider<NASADatabase> databaseProvider;

  public NASADaoModule_ProvideDaoFactory(Provider<NASADatabase> databaseProvider) {
    this.databaseProvider = databaseProvider;
  }

  @Override
  public NASADao get() {
    return provideDao(databaseProvider.get());
  }

  public static NASADaoModule_ProvideDaoFactory create(Provider<NASADatabase> databaseProvider) {
    return new NASADaoModule_ProvideDaoFactory(databaseProvider);
  }

  public static NASADao provideDao(NASADatabase database) {
    return Preconditions.checkNotNull(NASADaoModule.INSTANCE.provideDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
