package app.nitish.nasaAPP.view;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import app.nitish.nasaAPP.NASA.NASARepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ClickFragViewModel_AssistedFactory implements ViewModelAssistedFactory<ClickFragViewModel> {
  private final Provider<NASARepository> NASARepository;

  @Inject
  ClickFragViewModel_AssistedFactory(Provider<NASARepository> NASARepository) {
    this.NASARepository = NASARepository;
  }

  @Override
  @NonNull
  public ClickFragViewModel create(@NonNull SavedStateHandle arg0) {
    return new ClickFragViewModel(NASARepository.get());
  }
}
