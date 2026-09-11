package com.app.mlounge.ui.screens.movies;

import com.app.mlounge.data.remote.api.TmdbMovieDetailResponse;
import java.io.IOException;
import kotlin.jvm.functions.q;
import kotlin.y;
import okhttp3.internal.http2.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(Object obj, int i, Object obj2, int i2) {
        this.e = i2;
        this.z = obj;
        this.y = i;
        this.A = obj2;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                q qVar = (q) this.z;
                TmdbMovieDetailResponse tmdbMovieDetailResponse = (TmdbMovieDetailResponse) this.A;
                String strValueOf = String.valueOf(this.y);
                String strK = tmdbMovieDetailResponse.k();
                if (strK == null) {
                    strK = "Movie";
                }
                qVar.invoke("movie", strValueOf, strK);
                break;
            default:
                o oVar = (o) this.z;
                try {
                    oVar.U.N(this.y, (okhttp3.internal.http2.b) this.A);
                } catch (IOException e) {
                    okhttp3.internal.http2.b bVar = okhttp3.internal.http2.b.PROTOCOL_ERROR;
                    oVar.a(bVar, bVar, e);
                }
                break;
        }
        return y.a;
    }
}
