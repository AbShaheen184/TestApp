package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends w {
    public static final i g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = com.google.android.gms.dynamite.g.j;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(9.0f, 10.0f);
            gVar.s(8.0f);
            gVar.n(7.0f, -4.0f);
            gVar.f();
            gVar.o(21.0f, 6.0f);
            gVar.l(-7.58f);
            gVar.n(3.29f, -3.29f);
            gVar.m(16.0f, 2.0f);
            gVar.n(-4.0f, 4.0f);
            gVar.l(-0.03f);
            gVar.n(-4.0f, -4.0f);
            gVar.n(-0.69f, 0.71f);
            gVar.m(10.56f, 6.0f);
            gVar.m(3.0f, 6.0f);
            gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            gVar.s(12.0f);
            gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.l(18.0f);
            gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.m(23.0f, 8.0f);
            gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            gVar.f();
            gVar.o(21.0f, 20.0f);
            gVar.m(3.0f, 20.0f);
            gVar.m(3.0f, 8.0f);
            gVar.l(18.0f);
            gVar.s(12.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            com.google.android.gms.dynamite.g.j = fVarB;
        }
        g = new i("livetv", "Live TV", fVarB, okhttp3.internal.platform.android.g.p(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof i);
    }

    public final int hashCode() {
        return -1958689329;
    }

    public final String toString() {
        return "LiveTv";
    }
}
