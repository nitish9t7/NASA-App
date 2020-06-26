package app.nitish.nasaAPP.shared;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GlideImageCache_Factory implements Factory<GlideImageCache> {
  private final Provider<CoroutineDispatcher> dispatcherProvider;

  public GlideImageCache_Factory(Provider<CoroutineDispatcher> dispatcherProvider) {
    this.dispatcherProvider = dispatcherProvider;
  }

  @Override
  public GlideImageCache get() {
    return newInstance(dispatcherProvider.get());
  }

  public static GlideImageCache_Factory create(Provider<CoroutineDispatcher> dispatcherProvider) {
    return new GlideImageCache_Factory(dispatcherProvider);
  }

  public static GlideImageCache newInstance(CoroutineDispatcher dispatcher) {
    return new GlideImageCache(dispatcher);
  }
}
