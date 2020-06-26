package app.nitish.nasaAPP.view;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;
import androidx.annotation.NonNull;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.request.target.CustomViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import app.nitish.nasaAPP.R;
import app.nitish.nasaAPP.shared.ImageCache;
import app.nitish.nasaAPP.shared.Resource;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.android.synthetic.main.fragment_picture.*;
import java.io.File;
import javax.inject.Inject;

/**
 * A full screen view of an [NASA] picture.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\u001a\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020%H\u0002J\u0010\u0010(\u001a\u00020 2\u0006\u0010\'\u001a\u00020%H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006)"}, d2 = {"Lapp/nitish/nasaAPP/view/ClickFragment;", "Landroidx/fragment/app/Fragment;", "()V", "args", "Lapp/nitish/nasaAPP/view/ClickFragmentArgs;", "getArgs", "()Lapp/nitish/nasaAPP/view/ClickFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "imageCache", "Lapp/nitish/nasaAPP/shared/ImageCache;", "getImageCache", "()Lapp/nitish/nasaAPP/shared/ImageCache;", "setImageCache", "(Lapp/nitish/nasaAPP/shared/ImageCache;)V", "imageUri", "Landroid/net/Uri;", "viewModel", "Lapp/nitish/nasaAPP/view/ClickFragViewModel;", "getViewModel", "()Lapp/nitish/nasaAPP/view/ClickFragViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onViewCreated", "view", "showError", "error", "", "updateImage", "url", "updateVideo", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class ClickFragment extends androidx.fragment.app.Fragment {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private android.net.Uri imageUri;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public app.nitish.nasaAPP.shared.ImageCache imageCache;
    private java.util.HashMap _$_findViewCache;
    
    private final app.nitish.nasaAPP.view.ClickFragmentArgs getArgs() {
        return null;
    }
    
    private final app.nitish.nasaAPP.view.ClickFragViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.nitish.nasaAPP.shared.ImageCache getImageCache() {
        return null;
    }
    
    public final void setImageCache(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.shared.ImageCache p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void updateVideo(java.lang.String url) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final void updateImage(java.lang.String url) {
    }
    
    private final void showError(java.lang.String error) {
    }
    
    public ClickFragment() {
        super();
    }
}