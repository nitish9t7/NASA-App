package app.nitish.nasaAPP.today;

import app.nitish.nasaAPP.NASA.NASARepository;
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
public final class TodayViewModel_AssistedFactory_Factory implements Factory<TodayViewModel_AssistedFactory> {
  private final Provider<NASARepository> nASARepositoryProvider;

  public TodayViewModel_AssistedFactory_Factory(Provider<NASARepository> nASARepositoryProvider) {
    this.nASARepositoryProvider = nASARepositoryProvider;
  }

  @Override
  public TodayViewModel_AssistedFactory get() {
    return newInstance(nASARepositoryProvider);
  }

  public static TodayViewModel_AssistedFactory_Factory create(
      Provider<NASARepository> nASARepositoryProvider) {
    return new TodayViewModel_AssistedFactory_Factory(nASARepositoryProvider);
  }

  public static TodayViewModel_AssistedFactory newInstance(
      Provider<NASARepository> NASARepository) {
    return new TodayViewModel_AssistedFactory(NASARepository);
  }
}
