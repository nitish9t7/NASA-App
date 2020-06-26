package app.nitish.nasaAPP;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import app.nitish.nasaAPP.NASA.NASARepository;
import app.nitish.nasaAPP.NASA.api.NASADataSource;
import app.nitish.nasaAPP.NASA.db.NASADao;
import app.nitish.nasaAPP.NASA.db.NASADatabase;
import app.nitish.nasaAPP.di.IMGCacheModule;
import app.nitish.nasaAPP.di.IMGCacheModule_ProvideFactory;
import app.nitish.nasaAPP.di.NASADaoModule;
import app.nitish.nasaAPP.di.NASADaoModule_ProvideDaoFactory;
import app.nitish.nasaAPP.di.NASADaoModule_ProvideDatabaseFactory;
import app.nitish.nasaAPP.di.NASADataSourceModule;
import app.nitish.nasaAPP.di.NASADataSourceModule_ProvideFactory;
import app.nitish.nasaAPP.settings.SettingsViewModel_AssistedFactory;
import app.nitish.nasaAPP.settings.SettingsViewModel_AssistedFactory_Factory;
import app.nitish.nasaAPP.shared.ImageCache;
import app.nitish.nasaAPP.today.TodayFragment;
import app.nitish.nasaAPP.today.TodayFragment_MembersInjector;
import app.nitish.nasaAPP.today.TodayViewModel_AssistedFactory;
import app.nitish.nasaAPP.today.TodayViewModel_AssistedFactory_Factory;
import app.nitish.nasaAPP.view.ClickFragViewModel_AssistedFactory;
import app.nitish.nasaAPP.view.ClickFragViewModel_AssistedFactory_Factory;
import app.nitish.nasaAPP.view.ClickFragment;
import app.nitish.nasaAPP.view.ClickFragment_MembersInjector;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggernasaAPPApplication_HiltComponents_ApplicationC extends nasaAPPApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object nASADatabase = new MemoizedSentinel();

  private volatile Object imageCache = new MemoizedSentinel();

  private DaggernasaAPPApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private NASADataSource getNASADataSource() {
    return NASADataSourceModule_ProvideFactory.provide(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  private NASADatabase getNASADatabase() {
    Object local = nASADatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = nASADatabase;
        if (local instanceof MemoizedSentinel) {
          local = NASADaoModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          nASADatabase = DoubleCheck.reentrantCheck(nASADatabase, local);
        }
      }
    }
    return (NASADatabase) local;
  }

  private NASADao getNASADao() {
    return NASADaoModule_ProvideDaoFactory.provideDao(getNASADatabase());
  }

  private ImageCache getImageCache() {
    Object local = imageCache;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = imageCache;
        if (local instanceof MemoizedSentinel) {
          local = IMGCacheModule_ProvideFactory.provide();
          imageCache = DoubleCheck.reentrantCheck(imageCache, local);
        }
      }
    }
    return (ImageCache) local;
  }

  @Override
  public void injectnasaAPPApplication(nasaAPPApplication nasaAPPApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder iMGCacheModule(IMGCacheModule iMGCacheModule) {
      Preconditions.checkNotNull(iMGCacheModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder nASADaoModule(NASADaoModule nASADaoModule) {
      Preconditions.checkNotNull(nASADaoModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder nASADataSourceModule(NASADataSourceModule nASADataSourceModule) {
      Preconditions.checkNotNull(nASADataSourceModule);
      return this;
    }

    public nasaAPPApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggernasaAPPApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements nasaAPPApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public nasaAPPApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends nasaAPPApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements nasaAPPApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public nasaAPPApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends nasaAPPApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<NASARepository> nASARepositoryProvider;

      private volatile Provider<ClickFragViewModel_AssistedFactory> clickFragViewModel_AssistedFactoryProvider;

      private volatile Provider<SettingsViewModel_AssistedFactory> settingsViewModel_AssistedFactoryProvider;

      private volatile Provider<TodayViewModel_AssistedFactory> todayViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private NASARepository getNASARepository() {
        return new NASARepository(DaggernasaAPPApplication_HiltComponents_ApplicationC.this.getNASADataSource(), DaggernasaAPPApplication_HiltComponents_ApplicationC.this.getNASADao(), DaggernasaAPPApplication_HiltComponents_ApplicationC.this.getImageCache());
      }

      private Provider<NASARepository> getNASARepositoryProvider() {
        Object local = nASARepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          nASARepositoryProvider = (Provider<NASARepository>) local;
        }
        return (Provider<NASARepository>) local;
      }

      private ClickFragViewModel_AssistedFactory getClickFragViewModel_AssistedFactory() {
        return ClickFragViewModel_AssistedFactory_Factory.newInstance(getNASARepositoryProvider());
      }

      private Provider<ClickFragViewModel_AssistedFactory> getClickFragViewModel_AssistedFactoryProvider(
          ) {
        Object local = clickFragViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          clickFragViewModel_AssistedFactoryProvider = (Provider<ClickFragViewModel_AssistedFactory>) local;
        }
        return (Provider<ClickFragViewModel_AssistedFactory>) local;
      }

      private SettingsViewModel_AssistedFactory getSettingsViewModel_AssistedFactory() {
        return SettingsViewModel_AssistedFactory_Factory.newInstance(getNASARepositoryProvider());
      }

      private Provider<SettingsViewModel_AssistedFactory> getSettingsViewModel_AssistedFactoryProvider(
          ) {
        Object local = settingsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          settingsViewModel_AssistedFactoryProvider = (Provider<SettingsViewModel_AssistedFactory>) local;
        }
        return (Provider<SettingsViewModel_AssistedFactory>) local;
      }

      private TodayViewModel_AssistedFactory getTodayViewModel_AssistedFactory() {
        return TodayViewModel_AssistedFactory_Factory.newInstance(getNASARepositoryProvider());
      }

      private Provider<TodayViewModel_AssistedFactory> getTodayViewModel_AssistedFactoryProvider() {
        Object local = todayViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          todayViewModel_AssistedFactoryProvider = (Provider<TodayViewModel_AssistedFactory>) local;
        }
        return (Provider<TodayViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("app.nitish.nasaAPP.view.ClickFragViewModel", (Provider) getClickFragViewModel_AssistedFactoryProvider()).put("app.nitish.nasaAPP.settings.SettingsViewModel", (Provider) getSettingsViewModel_AssistedFactoryProvider()).put("app.nitish.nasaAPP.today.TodayViewModel", (Provider) getTodayViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggernasaAPPApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements nasaAPPApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public nasaAPPApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends nasaAPPApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggernasaAPPApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectTodayFragment(TodayFragment todayFragment) {
          injectTodayFragment2(todayFragment);
        }

        @Override
        public void injectClickFragment(ClickFragment clickFragment) {
          injectClickFragment2(clickFragment);
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private TodayFragment injectTodayFragment2(TodayFragment instance) {
          TodayFragment_MembersInjector.injectImageCache(instance, DaggernasaAPPApplication_HiltComponents_ApplicationC.this.getImageCache());
          return instance;
        }

        private ClickFragment injectClickFragment2(ClickFragment instance) {
          ClickFragment_MembersInjector.injectImageCache(instance, DaggernasaAPPApplication_HiltComponents_ApplicationC.this.getImageCache());
          return instance;
        }

        private final class ViewWithFragmentCBuilder implements nasaAPPApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public nasaAPPApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends nasaAPPApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements nasaAPPApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public nasaAPPApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends nasaAPPApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // app.nitish.nasaAPP.view.ClickFragViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getClickFragViewModel_AssistedFactory();

            case 1: // app.nitish.nasaAPP.NASA.NASARepository 
            return (T) ActivityCImpl.this.getNASARepository();

            case 2: // app.nitish.nasaAPP.settings.SettingsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSettingsViewModel_AssistedFactory();

            case 3: // app.nitish.nasaAPP.today.TodayViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getTodayViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements nasaAPPApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public nasaAPPApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends nasaAPPApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }
}
