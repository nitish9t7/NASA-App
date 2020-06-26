package app.nitish.nasaAPP.settings;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import app.nitish.nasaAPP.R;

/**
 * Displays a dialog that allows users to clear app data.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u000f2\u00020\u0001:\u0002\u000f\u0010B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lapp/nitish/nasaAPP/settings/ClearDataDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "listener", "Lapp/nitish/nasaAPP/settings/ClearDataDialogFragment$Listener;", "buildDialog", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "onCreateDialog", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "setListener", "Companion", "Listener", "app_debug"})
public final class ClearDataDialogFragment extends androidx.fragment.app.DialogFragment {
    private app.nitish.nasaAPP.settings.ClearDataDialogFragment.Listener listener;
    public static final app.nitish.nasaAPP.settings.ClearDataDialogFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.settings.ClearDataDialogFragment.Listener listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    private final android.app.Dialog buildDialog(android.content.Context context) {
        return null;
    }
    
    public ClearDataDialogFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final app.nitish.nasaAPP.settings.ClearDataDialogFragment create() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lapp/nitish/nasaAPP/settings/ClearDataDialogFragment$Listener;", "", "onClear", "", "app_debug"})
    public static abstract interface Listener {
        
        public abstract void onClear();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007\u00a8\u0006\u0005"}, d2 = {"Lapp/nitish/nasaAPP/settings/ClearDataDialogFragment$Companion;", "", "()V", "create", "Lapp/nitish/nasaAPP/settings/ClearDataDialogFragment;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final app.nitish.nasaAPP.settings.ClearDataDialogFragment create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}