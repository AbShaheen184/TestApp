package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends w {
    public static final e g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = androidx.room.r.h;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(19.0f, 9.0f);
            gVar.l(-4.0f);
            gVar.m(15.0f, 3.0f);
            gVar.m(9.0f, 3.0f);
            gVar.s(6.0f);
            gVar.m(5.0f, 9.0f);
            gVar.n(7.0f, 7.0f);
            gVar.n(7.0f, -7.0f);
            gVar.f();
            gVar.o(11.0f, 11.0f);
            gVar.m(11.0f, 5.0f);
            gVar.l(2.0f);
            gVar.s(6.0f);
            gVar.l(1.17f);
            gVar.m(12.0f, 13.17f);
            gVar.m(9.83f, 11.0f);
            gVar.m(11.0f, 11.0f);
            gVar.f();
            gVar.o(5.0f, 18.0f);
            gVar.l(14.0f);
            gVar.s(2.0f);
            gVar.m(5.0f, 20.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
            fVarB = eVar.b();
            androidx.room.r.h = fVarB;
        }
        g = new e("downloads", "Downloads", fVarB, _COROUTINE.a.w(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof e);
    }

    public final int hashCode() {
        return 425795594;
    }

    public final String toString() {
        return "Downloads";
    }
}
