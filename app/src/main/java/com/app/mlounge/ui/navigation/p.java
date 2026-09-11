package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends w {
    public static final p g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = okhttp3.internal.platform.android.g.E;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(15.5f, 14.0f);
            gVar.l(-0.79f);
            gVar.n(-0.28f, -0.27f);
            gVar.g(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
            gVar.g(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
            gVar.p(3.0f, 5.91f, 3.0f, 9.5f);
            gVar.p(5.91f, 16.0f, 9.5f, 16.0f);
            gVar.h(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
            gVar.n(0.27f, 0.28f);
            gVar.s(0.79f);
            gVar.n(5.0f, 4.99f);
            gVar.m(20.49f, 19.0f);
            gVar.n(-4.99f, -5.0f);
            gVar.f();
            gVar.o(9.5f, 14.0f);
            gVar.g(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
            gVar.p(7.01f, 5.0f, 9.5f, 5.0f);
            gVar.p(14.0f, 7.01f, 14.0f, 9.5f);
            gVar.p(11.99f, 14.0f, 9.5f, 14.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            okhttp3.internal.platform.android.g.E = fVarB;
        }
        g = new p("search", "Search", fVarB, com.google.android.gms.dynamite.g.r(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof p);
    }

    public final int hashCode() {
        return -1762592023;
    }

    public final String toString() {
        return "Search";
    }
}
