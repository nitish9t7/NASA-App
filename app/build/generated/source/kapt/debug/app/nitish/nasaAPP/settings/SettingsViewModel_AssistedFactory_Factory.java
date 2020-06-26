package app.nitish.nasaAPP.settings;

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
public final class SettingsViewModel_AssistedFactory_Factory implements Factory<SettingsViewModel_AssistedFactory> {
  private final Provider<NASARepository> nASARepositoryProvider;

  public SettingsViewModel_AssistedFactory_Factory(
      Provider<NASARepository> nASARepositoryProvider) {
    this.nASARepositoryProvider = nASARepositoryProvider;
  }

  @Override
  public SettingsViewModel_AssistedFactory get() {
    return newInstance(nASARepositoryProvider);
  }

  public static SettingsViewModel_AssistedFactory_Factory create(
      Provider<NASARepository> nASARepositoryProvider) {
    return new SettingsViewModel_AssistedFactory_Factory(nASARepositoryProvider);
  }

  public static SettingsViewModel_AssistedFactory newInstance(
      Provider<NASARepository> NASARepository) {
    return new SettingsViewModel_AssistedFactory(NASARepository);
  }
}
