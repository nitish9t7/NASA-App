package app.nitish.nasaAPP.today;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import app.nitish.nasaAPP.NASA.NASARepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class TodayViewModel_AssistedFactory implements ViewModelAssistedFactory<TodayViewModel> {
  private final Provider<NASARepository> NASARepository;

  @Inject
  TodayViewModel_AssistedFactory(Provider<NASARepository> NASARepository) {
    this.NASARepository = NASARepository;
  }

  @Override
  @NonNull
  public TodayViewModel create(@NonNull SavedStateHandle arg0) {
    return new TodayViewModel(NASARepository.get());
  }
}
