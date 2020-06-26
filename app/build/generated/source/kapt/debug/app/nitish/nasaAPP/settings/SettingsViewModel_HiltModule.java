package app.nitish.nasaAPP.settings;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = SettingsViewModel.class
)
public interface SettingsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("app.nitish.nasaAPP.settings.SettingsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(SettingsViewModel_AssistedFactory factory);
}
