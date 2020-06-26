package app.nitish.nasaAPP.view;

import androidx.hilt.lifecycle.ViewModelInject;
import androidx.lifecycle.*;
import app.nitish.nasaAPP.NASA.NASA;
import app.nitish.nasaAPP.NASA.NASARepository;
import app.nitish.nasaAPP.shared.Resource;

/**
 * [ViewModel] for fullscreen picture.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lapp/nitish/nasaAPP/view/ClickFragViewModel;", "Landroidx/lifecycle/ViewModel;", "NASARepository", "Lapp/nitish/nasaAPP/NASA/NASARepository;", "(Lapp/nitish/nasaAPP/NASA/NASARepository;)V", "_picture", "Landroidx/lifecycle/MutableLiveData;", "Lapp/nitish/nasaAPP/shared/Resource;", "Lapp/nitish/nasaAPP/NASA/NASA;", "", "picture", "Landroidx/lifecycle/LiveData;", "getPicture", "()Landroidx/lifecycle/LiveData;", "load", "", "id", "", "app_debug"})
public final class ClickFragViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> _picture = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> picture = null;
    private final app.nitish.nasaAPP.NASA.NASARepository NASARepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> getPicture() {
        return null;
    }
    
    public final void load(long id) {
    }
    
    @androidx.hilt.lifecycle.ViewModelInject()
    public ClickFragViewModel(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.NASA.NASARepository NASARepository) {
        super();
    }
}