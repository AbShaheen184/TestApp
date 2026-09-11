package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends w {
    public static final k g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = t1.h;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Movie", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(4.0f, 6.47f);
            gVar.m(5.76f, 10.0f);
            gVar.k(20.0f);
            gVar.s(8.0f);
            gVar.k(4.0f);
            gVar.r(6.47f);
            gVar.o(22.0f, 4.0f);
            gVar.l(-4.0f);
            gVar.n(2.0f, 4.0f);
            gVar.l(-3.0f);
            gVar.n(-2.0f, -4.0f);
            gVar.l(-2.0f);
            gVar.n(2.0f, 4.0f);
            gVar.l(-3.0f);
            gVar.n(-2.0f, -4.0f);
            gVar.k(8.0f);
            gVar.n(2.0f, 4.0f);
            gVar.k(7.0f);
            gVar.m(5.0f, 4.0f);
            gVar.k(4.0f);
            gVar.h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            gVar.m(2.0f, 18.0f);
            gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.l(16.0f);
            gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.r(4.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            t1.h = fVarB;
        }
        g = new k("movies", "Movies", fVarB, _COROUTINE.a.z(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof k);
    }

    public final int hashCode() {
        return -1924514684;
    }

    public final String toString() {
        return "Movies";
    }
}
