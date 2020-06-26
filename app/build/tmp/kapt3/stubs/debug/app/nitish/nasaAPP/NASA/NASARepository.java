package app.nitish.nasaAPP.NASA;

import app.nitish.nasaAPP.NASA.api.NASADataSource;
import app.nitish.nasaAPP.NASA.db.NASADao;
import app.nitish.nasaAPP.shared.ImageCache;
import app.nitish.nasaAPP.shared.Resource;
import java.io.IOException;
import java.time.LocalDate;
import javax.inject.Inject;

/**
 * Single point of access to fetch an [NASA] from the ui.
 * Created by Nitish on 25/06/2020
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0019\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0019\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ%\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0019\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lapp/nitish/nasaAPP/NASA/NASARepository;", "", "NASADataSource", "Lapp/nitish/nasaAPP/NASA/api/NASADataSource;", "NASADao", "Lapp/nitish/nasaAPP/NASA/db/NASADao;", "imageCache", "Lapp/nitish/nasaAPP/shared/ImageCache;", "(Lapp/nitish/nasaAPP/NASA/api/NASADataSource;Lapp/nitish/nasaAPP/NASA/db/NASADao;Lapp/nitish/nasaAPP/shared/ImageCache;)V", "earliestDate", "Ljava/time/LocalDate;", "cacheNASA", "Lapp/nitish/nasaAPP/shared/Resource;", "Lapp/nitish/nasaAPP/NASA/NASA;", "", "NASA", "(Lapp/nitish/nasaAPP/NASA/NASA;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearResources", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCachedNASA", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFreshNASA", "date", "(Ljava/time/LocalDate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNASA", "getNASAByDataSource", "app_debug"})
public final class NASARepository {
    private final java.time.LocalDate earliestDate = null;
    private final app.nitish.nasaAPP.NASA.api.NASADataSource NASADataSource = null;
    private final app.nitish.nasaAPP.NASA.db.NASADao NASADao = null;
    private final app.nitish.nasaAPP.shared.ImageCache imageCache = null;
    
    /**
     * *
     * Fetch [NASA] by date. This will attempt to get it from the database first and if not found,
     * will fetch from the api.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNASA(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> p1) {
        return null;
    }
    
    /**
     * *
     * Fetch a fresh [NASA] by date. This will always attempt to fetch the NASA from the api.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFreshNASA(@org.jetbrains.annotations.NotNull()
    java.time.LocalDate date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> p1) {
        return null;
    }
    
    /**
     * *
     * This will fetch an [NASA] from the database by its id.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCachedNASA(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super app.nitish.nasaAPP.shared.Resource<app.nitish.nasaAPP.NASA.NASA, java.lang.String>> p1) {
        return null;
    }
    
    /**
     * *
     * Clear out resources.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearResources(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    @javax.inject.Inject()
    public NASARepository(@org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.NASA.api.NASADataSource NASADataSource, @org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.NASA.db.NASADao NASADao, @org.jetbrains.annotations.NotNull()
    app.nitish.nasaAPP.shared.ImageCache imageCache) {
        super();
    }
}