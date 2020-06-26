package app.nitish.nasaAPP.settings;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import app.nitish.nasaAPP.NASA.NASARepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SettingsViewModel_AssistedFactory implements ViewModelAssistedFactory<SettingsViewModel> {
  private final Provider<NASARepository> NASARepository;

  @Inject
  SettingsViewModel_AssistedFactory(Provider<NASARepository> NASARepository) {
    this.NASARepository = NASARepository;
  }

  @Override
  @NonNull
  public SettingsViewModel create(@NonNull SavedStateHandle arg0) {
    return new SettingsViewModel(NASARepository.get());
  }
}
