package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.api.TmdbApi;
import com.app.mlounge.data.remote.model.TmdbGenreResponse;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public final TmdbApi a;

    public j0(TmdbApi tmdbApi) {
        tmdbApi.getClass();
        this.a = tmdbApi;
    }

    public static String a(j0 j0Var, String str) {
        j0Var.getClass();
        if (str != null) {
            return androidx.privacysandbox.ads.adservices.java.internal.a.q("https://image.tmdb.org/t/p/", "w1280", str);
        }
        return null;
    }

    public static String b(String str, String str2) {
        if (str != null) {
            return androidx.privacysandbox.ads.adservices.java.internal.a.q("https://image.tmdb.org/t/p/", str2, str);
        }
        return null;
    }

    public static /* synthetic */ String c(j0 j0Var, String str) {
        j0Var.getClass();
        return b(str, "w500");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(kotlin.coroutines.jvm.internal.c cVar) {
        h0 h0Var;
        if (cVar instanceof h0) {
            h0Var = (h0) cVar;
            int i = h0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0Var.z = i - Integer.MIN_VALUE;
            } else {
                h0Var = new h0(this, cVar);
            }
        } else {
            h0Var = new h0(this, cVar);
        }
        Object movieGenres = h0Var.e;
        int i2 = h0Var.z;
        if (i2 == 0) {
            kotlin.a.e(movieGenres);
            h0Var.z = 1;
            movieGenres = this.a.getMovieGenres(h0Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (movieGenres == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(movieGenres);
        }
        return ((TmdbGenreResponse) movieGenres).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(kotlin.coroutines.jvm.internal.c cVar) {
        i0 i0Var;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i = i0Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0Var.z = i - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, cVar);
            }
        } else {
            i0Var = new i0(this, cVar);
        }
        Object tvGenres = i0Var.e;
        int i2 = i0Var.z;
        if (i2 == 0) {
            kotlin.a.e(tvGenres);
            i0Var.z = 1;
            tvGenres = this.a.getTvGenres(i0Var);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (tvGenres == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(tvGenres);
        }
        return ((TmdbGenreResponse) tvGenres).a();
    }
}
