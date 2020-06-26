package app.nitish.nasaAPP.NASA.api;

import app.nitish.nasaAPP.RetrofitServiceDelegate;
import retrofit2.Response;
import java.time.LocalDate;

/**
 * Fetch an [NASA] from [Nasa's Astronomy Picture of the Day API](https://api.nasa.gov/).
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lapp/nitish/nasaAPP/NASA/api/NASARemoteDataSource;", "Lapp/nitish/nasaAPP/NASA/api/NASADataSource;", "retrofitServiceDelegate", "Lapp/nitish/nasaAPP/RetrofitServiceDelegate;", "key", "", "(Lapp/nitish/nasaAPP/RetrofitServiceDelegate;Ljava/lang/String;)V", "getNASA", "Lretrofit2/Response;", "Lapp/nitish/nasaAPP/NASA/api/NASAResponse;", "date", "Ljava/time/LocalDate;", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class NASARemoteDataSource implements app.nitish.nasaAPP.NASA.api.NASADataSource {
    private final app.nitish.nasaAPP.RetrofitServiceDelegate retrofitServiceDelegate = null;
    private final java.lang.String key = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getNASA(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<app.nitish.nasaAPP.NASA.api.NASAResponse>> p1) {
        return null;
    }
    
    public NASARemoteDataSource(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.RetrofitServiceDelegate retrofitServiceDelegate, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        super();
    }
}