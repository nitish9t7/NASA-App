package app.nitish.nasaAPP.view;

import app.nitish.nasaAPP.shared.ImageCache;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class ClickFragment_MembersInjector implements MembersInjector<ClickFragment> {
  private final Provider<ImageCache> imageCacheProvider;

  public ClickFragment_MembersInjector(Provider<ImageCache> imageCacheProvider) {
    this.imageCacheProvider = imageCacheProvider;
  }

  public static MembersInjector<ClickFragment> create(Provider<ImageCache> imageCacheProvider) {
    return new ClickFragment_MembersInjector(imageCacheProvider);
  }

  @Override
  public void injectMembers(ClickFragment instance) {
    injectImageCache(instance, imageCacheProvider.get());
  }

  @InjectedFieldSignature("app.nitish.nasaAPP.view.ClickFragment.imageCache")
  public static void injectImageCache(ClickFragment instance, ImageCache imageCache) {
    instance.imageCache = imageCache;
  }
}
