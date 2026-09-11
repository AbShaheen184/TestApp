package com.app.mlounge.ui.screens.movies;

import com.app.mlounge.data.remote.model.TmdbMovie;
import kotlin.jvm.functions.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ l y;
    public final /* synthetic */ TmdbMovie z;

    public /* synthetic */ j(l lVar, TmdbMovie tmdbMovie, int i) {
        this.e = i;
        this.y = lVar;
        this.z = tmdbMovie;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                this.y.invoke(Integer.valueOf(this.z.a()));
                break;
            default:
                this.y.invoke(Integer.valueOf(this.z.a()));
                break;
        }
        return y.a;
    }
}
