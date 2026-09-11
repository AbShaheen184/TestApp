package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends w {
    public static final a g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = com.google.firebase.b.h;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(18.0f, 8.0f);
            gVar.l(-1.0f);
            gVar.m(17.0f, 6.0f);
            gVar.h(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
            gVar.p(7.0f, 3.24f, 7.0f, 6.0f);
            gVar.s(2.0f);
            gVar.m(6.0f, 8.0f);
            gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
            gVar.s(10.0f);
            gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            gVar.l(12.0f);
            gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.m(20.0f, 10.0f);
            gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            gVar.f();
            gVar.o(9.0f, 6.0f);
            gVar.h(0.0f, -1.66f, 1.34f, -3.0f, 3.0f, -3.0f);
            gVar.q(3.0f, 1.34f, 3.0f, 3.0f);
            gVar.s(2.0f);
            gVar.m(9.0f, 8.0f);
            gVar.m(9.0f, 6.0f);
            gVar.f();
            gVar.o(18.0f, 20.0f);
            gVar.m(6.0f, 20.0f);
            gVar.m(6.0f, 10.0f);
            gVar.l(12.0f);
            gVar.s(10.0f);
            gVar.f();
            gVar.o(12.0f, 17.0f);
            gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            gVar.q(-0.9f, -2.0f, -2.0f, -2.0f);
            gVar.q(-2.0f, 0.9f, -2.0f, 2.0f);
            gVar.q(0.9f, 2.0f, 2.0f, 2.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            com.google.firebase.b.h = fVarB;
        }
        g = new a("adult", "Adult", fVarB, org.jsoup.helper.n.w(), 16);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof a);
    }

    public final int hashCode() {
        return 1589076057;
    }

    public final String toString() {
        return "Adult";
    }
}
