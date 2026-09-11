package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import com.google.firebase.crashlytics.internal.model.t1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {
    public static final u g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.b.i;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(21.0f, 3.0f);
            gVar.m(3.0f, 3.0f);
            gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            gVar.s(12.0f);
            gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.l(5.0f);
            gVar.s(2.0f);
            gVar.l(8.0f);
            gVar.s(-2.0f);
            gVar.l(5.0f);
            gVar.h(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
            gVar.m(23.0f, 5.0f);
            gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            gVar.f();
            gVar.o(21.0f, 17.0f);
            gVar.m(3.0f, 17.0f);
            gVar.m(3.0f, 5.0f);
            gVar.l(18.0f);
            gVar.s(12.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            _COROUTINE.b.i = fVarB;
        }
        g = new u("tvshows", "TV Shows", fVarB, t1.t(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof u);
    }

    public final int hashCode() {
        return -1739761005;
    }

    public final String toString() {
        return "TvShows";
    }
}
