package app.nitish.nasaAPP.view;

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
    topLevelClass = ClickFragViewModel.class
)
public interface ClickFragViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("app.nitish.nasaAPP.view.ClickFragViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(ClickFragViewModel_AssistedFactory factory);
}
