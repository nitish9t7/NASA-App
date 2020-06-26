package app.nitish.nasaAPP.di;

import app.nitish.nasaAPP.shared.ImageCache;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IMGCacheModule_ProvideFactory implements Factory<ImageCache> {
  @Override
  public ImageCache get() {
    return provide();
  }

  public static IMGCacheModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ImageCache provide() {
    return Preconditions.checkNotNull(IMGCacheModule.INSTANCE.provide(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final IMGCacheModule_ProvideFactory INSTANCE = new IMGCacheModule_ProvideFactory();
  }
}
