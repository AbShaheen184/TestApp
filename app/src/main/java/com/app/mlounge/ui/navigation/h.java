package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends w {
    public static final h g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = h1.i;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(13.0f, 3.0f);
            gVarH.h(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
            gVarH.m(1.0f, 12.0f);
            gVarH.n(3.89f, 3.89f);
            gVarH.n(0.07f, 0.14f);
            gVarH.m(9.0f, 12.0f);
            gVarH.m(6.0f, 12.0f);
            gVarH.h(0.0f, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
            gVarH.q(7.0f, 3.13f, 7.0f, 7.0f);
            gVarH.q(-3.13f, 7.0f, -7.0f, 7.0f);
            gVarH.h(-1.93f, 0.0f, -3.68f, -0.79f, -4.94f, -2.06f);
            gVarH.n(-1.42f, 1.42f);
            gVarH.g(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
            gVarH.h(4.97f, 0.0f, 9.0f, -4.03f, 9.0f, -9.0f);
            gVarH.q(-4.03f, -9.0f, -9.0f, -9.0f);
            gVarH.f();
            gVarH.o(12.0f, 8.0f);
            gVarH.s(5.0f);
            gVarH.n(4.25f, 2.52f);
            gVarH.n(0.77f, -1.28f);
            gVarH.n(-3.52f, -2.09f);
            gVarH.m(13.5f, 8.0f);
            gVarH.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
            fVarB = eVar.b();
            h1.i = fVarB;
        }
        g = new h("history", "History", fVarB, android.support.v4.media.session.b.v(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof h);
    }

    public final int hashCode() {
        return 152827763;
    }

    public final String toString() {
        return "History";
    }
}
