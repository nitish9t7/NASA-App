package app.nitish.nasaAPP.today;

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
public final class TodayFragment_MembersInjector implements MembersInjector<TodayFragment> {
  private final Provider<ImageCache> imageCacheProvider;

  public TodayFragment_MembersInjector(Provider<ImageCache> imageCacheProvider) {
    this.imageCacheProvider = imageCacheProvider;
  }

  public static MembersInjector<TodayFragment> create(Provider<ImageCache> imageCacheProvider) {
    return new TodayFragment_MembersInjector(imageCacheProvider);
  }

  @Override
  public void injectMembers(TodayFragment instance) {
    injectImageCache(instance, imageCacheProvider.get());
  }

  @InjectedFieldSignature("app.nitish.nasaAPP.today.TodayFragment.imageCache")
  public static void injectImageCache(TodayFragment instance, ImageCache imageCache) {
    instance.imageCache = imageCache;
  }
}
