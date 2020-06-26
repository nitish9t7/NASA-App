package app.nitish.nasaAPP.today;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import app.nitish.nasaAPP.NASA.NASA;
import app.nitish.nasaAPP.NASA.NASARepository;
import app.nitish.nasaAPP.shared.OneShotEvent;
import app.nitish.nasaAPP.shared.Resource;
import java.time.LocalDate;

/**
 * [ViewModel] show today's Astronomy Picture of the Day.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u001a\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000fJ\u0006\u0010 \u001a\u00020\u001cR#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00110\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000bR\u0016\u0010\u0018\u001a\n \u0019*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lapp/nitish/nasaAPP/today/TodayViewModel;", "Landroidx/lifecycle/ViewModel;", "NASARepository", "Lapp/nitish/nasaAPP/NASA/NASARepository;", "(Lapp/nitish/nasaAPP/NASA/NASARepository;)V", "NASA", "Landroidx/lifecycle/LiveData;", "Lapp/nitish/nasaAPP/shared/Resource;", "Lapp/nitish/nasaAPP/NASA/NASA;", "", "getNASA", "()Landroidx/lifecycle/LiveData;", "_NASA", "Landroidx/lifecycle/MutableLiveData;", "_date", "Ljava/time/LocalDate;", "_navigateFullPicture", "Lapp/nitish/nasaAPP/shared/OneShotEvent;", "", "_navigateVideoLink", "navigateFullPicture", "getNavigateFullPicture", "navigateVideoLink", "getNavigateVideoLink", "today", "kotlin.jvm.PlatformType", "currentDate", "onPhotoClicked", "", "refresh", "updateDate", "date", "videoLinkClicked", "app_debug"})
public final class TodayViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> _NASA = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> NASA = null;
    private final androidx.lifecycle.MutableLiveData<app.nitish.nasaAPP.shared.OneShotEvent<java.lang.String>> _navigateVideoLink = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.OneShotEvent<java.lang.String>> navigateVideoLink = null;
    private final androidx.lifecycle.MutableLiveData<app.nitish.nasaAPP.shared.OneShotEvent<java.lang.Long>> _navigateFullPicture = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.OneShotEvent<java.lang.Long>> navigateFullPicture = null;
    private final java.time.LocalDate today = null;
    private final androidx.lifecycle.MutableLiveData<java.time.LocalDate> _date = null;
    private final app.nitish.nasaAPP.NASA.NASARepository NASARepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> getNASA() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.OneShotEvent<java.lang.String>> getNavigateVideoLink() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.OneShotEvent<java.lang.Long>> getNavigateFullPicture() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.time.LocalDate currentDate() {
        return null;
    }
    
    public final void videoLinkClicked() {
    }
    
    public final void onPhotoClicked() {
    }
    
    public final void updateDate(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date) {
    }
    
    public final void refresh() {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public TodayViewModel(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.NASA.NASARepository NASARepository) {
        super();
    }
}