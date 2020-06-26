package app.nitish.nasaAPP.NASA.api;

import retrofit2.Response;
import java.time.LocalDate;

/**
 * The data source for [Nasa's Astronomy Picture of the Day API](https://api.nasa.gov/).
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lapp/nitish/nasaAPP/NASA/api/NASADataSource;", "", "getNASA", "Lretrofit2/Response;", "Lapp/nitish/nasaAPP/NASA/api/NASAResponse;", "date", "Ljava/time/LocalDate;", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface NASADataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNASA(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<app.nitish.nasaAPP.NASA.api.NASAResponse>> p1);
}