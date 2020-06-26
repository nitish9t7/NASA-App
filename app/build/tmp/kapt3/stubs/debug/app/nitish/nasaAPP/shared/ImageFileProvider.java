package app.nitish.nasaAPP.shared;

import android.net.Uri;
import androidx.core.content.FileProvider;

/**
 * Workaround for the Glide cache not having file extensions on files. To use, provide this in the
 * Manifest instead of the normal [FileProvider].
 *
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lapp/nitish/nasaAPP/shared/ImageFileProvider;", "Landroidx/core/content/FileProvider;", "()V", "getType", "", "uri", "Landroid/net/Uri;", "app_debug"})
public final class ImageFileProvider extends androidx.core.content.FileProvider {
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.String getType(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    public ImageFileProvider() {
        super();
    }
}