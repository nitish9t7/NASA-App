package app.nitish.nasaAPP.NASA;

import app.nitish.nasaAPP.NASA.api.NASADataSource;
import app.nitish.nasaAPP.NASA.db.NASADao;
import app.nitish.nasaAPP.shared.ImageCache;
import dagger.internal.Factory;
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
public final class NASARepository_Factory implements Factory<NASARepository> {
  private final Provider<NASADataSource> nASADataSourceProvider;

  private final Provider<NASADao> nASADaoProvider;

  private final Provider<ImageCache> imageCacheProvider;

  public NASARepository_Factory(Provider<NASADataSource> nASADataSourceProvider,
      Provider<NASADao> nASADaoProvider, Provider<ImageCache> imageCacheProvider) {
    this.nASADataSourceProvider = nASADataSourceProvider;
    this.nASADaoProvider = nASADaoProvider;
    this.imageCacheProvider = imageCacheProvider;
  }

  @Override
  public NASARepository get() {
    return newInstance(nASADataSourceProvider.get(), nASADaoProvider.get(), imageCacheProvider.get());
  }

  public static NASARepository_Factory create(Provider<NASADataSource> nASADataSourceProvider,
      Provider<NASADao> nASADaoProvider, Provider<ImageCache> imageCacheProvider) {
    return new NASARepository_Factory(nASADataSourceProvider, nASADaoProvider, imageCacheProvider);
  }

  public static NASARepository newInstance(NASADataSource NASADataSource, NASADao NASADao,
      ImageCache imageCache) {
    return new NASARepository(NASADataSource, NASADao, imageCache);
  }
}
