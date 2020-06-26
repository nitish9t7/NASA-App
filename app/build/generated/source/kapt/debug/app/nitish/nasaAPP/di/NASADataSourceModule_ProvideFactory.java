package app.nitish.nasaAPP.di;

import android.content.Context;
import app.nitish.nasaAPP.NASA.api.NASADataSource;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class NASADataSourceModule_ProvideFactory implements Factory<NASADataSource> {
  private final Provider<Context> contextProvider;

  public NASADataSourceModule_ProvideFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public NASADataSource get() {
    return provide(contextProvider.get());
  }

  public static NASADataSourceModule_ProvideFactory create(Provider<Context> contextProvider) {
    return new NASADataSourceModule_ProvideFactory(contextProvider);
  }

  public static NASADataSource provide(Context context) {
    return Preconditions.checkNotNull(NASADataSourceModule.INSTANCE.provide(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
