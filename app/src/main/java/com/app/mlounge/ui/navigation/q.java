package com.app.mlounge.ui.navigation;

import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends w {
    public static final q g;

    static {
        androidx.compose.ui.graphics.vector.f fVarB = android.support.v4.media.session.b.k;
        if (fVarB == null) {
            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Outlined.Cloud", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
            int i = h0.a;
            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
            androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
            gVar.o(12.0f, 6.0f);
            gVar.h(2.62f, 0.0f, 4.88f, 1.86f, 5.39f, 4.43f);
            gVar.n(0.3f, 1.5f);
            gVar.n(1.53f, 0.11f);
            gVar.h(1.56f, 0.1f, 2.78f, 1.41f, 2.78f, 2.96f);
            gVar.h(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
            gVar.k(6.0f);
            gVar.h(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
            gVar.h(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f);
            gVar.n(1.07f, -0.11f);
            gVar.n(0.5f, -0.95f);
            gVar.g(8.08f, 7.14f, 9.94f, 6.0f, 12.0f, 6.0f);
            androidx.compose.ui.graphics.vector.w wVar = new androidx.compose.ui.graphics.vector.w(0.0f, -2.0f);
            ArrayList arrayList = gVar.a;
            arrayList.add(wVar);
            gVar.g(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
            gVar.g(2.34f, 8.36f, 0.0f, 10.91f, 0.0f, 14.0f);
            gVar.h(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
            gVar.l(13.0f);
            gVar.h(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
            gVar.h(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
            gVar.g(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
            gVar.f();
            androidx.compose.ui.graphics.vector.e.a(eVar, arrayList, 0, p0Var);
            fVarB = eVar.b();
            android.support.v4.media.session.b.k = fVarB;
        }
        g = new q("services", "Services", fVarB, coil3.network.g.o(), 48);
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q);
    }

    public final int hashCode() {
        return -1143252641;
    }

    public final String toString() {
        return "Services";
    }
}
