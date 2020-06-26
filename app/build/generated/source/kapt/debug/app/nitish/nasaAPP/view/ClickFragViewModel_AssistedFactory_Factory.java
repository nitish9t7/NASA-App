package app.nitish.nasaAPP.view;

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
public final class ClickFragViewModel_AssistedFactory_Factory implements Factory<ClickFragViewModel_AssistedFactory> {
  private final Provider<NASARepository> nASARepositoryProvider;

  public ClickFragViewModel_AssistedFactory_Factory(
      Provider<NASARepository> nASARepositoryProvider) {
    this.nASARepositoryProvider = nASARepositoryProvider;
  }

  @Override
  public ClickFragViewModel_AssistedFactory get() {
    return newInstance(nASARepositoryProvider);
  }

  public static ClickFragViewModel_AssistedFactory_Factory create(
      Provider<NASARepository> nASARepositoryProvider) {
    return new ClickFragViewModel_AssistedFactory_Factory(nASARepositoryProvider);
  }

  public static ClickFragViewModel_AssistedFactory newInstance(
      Provider<NASARepository> NASARepository) {
    return new ClickFragViewModel_AssistedFactory(NASARepository);
  }
}
