package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends w {
    public static final v g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = coil3.network.g.h;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.FavoriteBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(16.5f, 3.0f);
            gVarH.h(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
            gVarH.g(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
            gVarH.g(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
            gVarH.h(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
            gVarH.m(12.0f, 21.35f);
            gVarH.n(1.45f, -1.32f);
            gVarH.g(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
            gVarH.g(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
            gVarH.f();
            gVarH.o(12.1f, 18.55f);
            gVarH.n(-0.1f, 0.1f);
            gVarH.n(-0.1f, -0.1f);
            gVarH.g(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
            gVarH.g(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
            gVarH.h(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
            gVarH.l(1.87f);
            gVarH.g(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
            gVarH.h(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
            gVarH.h(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
            gVarH.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
            fVarB = eVar.b();
            coil3.network.g.h = fVarB;
        }
        g = new v("watchlist", "Favourites", fVarB, com.google.android.gms.dynamite.g.p(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof v);
    }

    public final int hashCode() {
        return -1166848756;
    }

    public final String toString() {
        return "Watchlist";
    }
}
