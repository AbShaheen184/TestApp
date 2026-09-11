package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends w {
    public static final l g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = kotlin.math.a.h;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.MusicNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(12.0f, 3.0f);
            gVar.n(0.01f, 10.55f);
            gVar.h(-0.59f, -0.34f, -1.27f, -0.55f, -2.0f, -0.55f);
            gVar.g(7.79f, 13.0f, 6.0f, 14.79f, 6.0f, 17.0f);
            gVar.q(1.79f, 4.0f, 4.01f, 4.0f);
            gVar.p(14.0f, 19.21f, 14.0f, 17.0f);
            gVar.m(14.0f, 7.0f);
            gVar.l(4.0f);
            gVar.m(18.0f, 3.0f);
            gVar.l(-6.0f);
            gVar.f();
            gVar.o(10.01f, 19.0f);
            gVar.h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
            gVar.q(0.9f, -2.0f, 2.0f, -2.0f);
            gVar.q(2.0f, 0.9f, 2.0f, 2.0f);
            gVar.q(-0.9f, 2.0f, -2.0f, 2.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            kotlin.math.a.h = fVarB;
        }
        g = new l("music", "Music", fVarB, _COROUTINE.b.s(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof l);
    }

    public final int hashCode() {
        return 1600662724;
    }

    public final String toString() {
        return "Music";
    }
}
