package app.nitish.nasaAPP.today;

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
    topLevelClass = TodayViewModel.class
)
public interface TodayViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("app.nitish.nasaAPP.today.TodayViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(TodayViewModel_AssistedFactory factory);
}
