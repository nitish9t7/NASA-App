package app.nitish.nasaAPP.shared;

import androidx.lifecycle.Observer;

/**
 * Observes for non-handled events.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lapp/nitish/nasaAPP/shared/OneShotEventObserver;", "T", "Landroidx/lifecycle/Observer;", "Lapp/nitish/nasaAPP/shared/OneShotEvent;", "onEventUnhandledContent", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "onChanged", "event", "app_debug"})
public final class OneShotEventObserver<T extends java.lang.Object> implements androidx.lifecycle.Observer<app.nitish.nasaAPP.shared.OneShotEvent<? extends T>> {
    private final kotlin.jvm.functions.Function1<T, kotlin.Unit> onEventUnhandledContent = null;
    
    @java.lang.Override()
    public void onChanged(@org.jetbrains.annotations.Nullable()
    app.nitish.nasaAPP.shared.OneShotEvent<? extends T> event) {
    }
    
    public OneShotEventObserver(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> onEventUnhandledContent) {
        super();
    }
}