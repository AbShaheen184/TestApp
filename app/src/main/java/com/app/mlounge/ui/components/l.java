package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.datastore.preferences.protobuf.h1;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Context y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ l(Context context, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.y = context;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 16;
                    f3.a(androidx.compose.foundation.layout.b.o(w0.d(androidx.compose.ui.o.b, 0.9f), f), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.d, 0L, 8, 0.0f, androidx.compose.runtime.internal.k.c(2140634710, new l(this.y, this.z, 1), rVar), rVar, 12607878, Token.ASSIGN_LOGICAL_AND);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f2 = 24;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(androidx.compose.foundation.layout.b.o(oVar, f2), androidx.compose.foundation.s.o(rVar2), true);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    u2 u2Var = u3.a;
                    p3.b("Help Keep CinemaHQ Free", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).g, rVar2, 1573254, 0, 129978);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 16));
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var)).k;
                    long j = com.app.mlounge.ui.theme.b.m;
                    p3.b("Cinema HQ uses a small portion of your device's spare resources (such as a bit of network bandwidth) to help fund development and keep the app free. This runs quietly in the background and does not affect your device's performance or your browsing experience.", null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), h1.r(20), 0, false, 0, 0, m0Var, rVar2, 384, 48, 127994);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 12));
                    p3.b("No personal data is collected. You can opt out at any time from Settings.", null, j, 0L, androidx.compose.ui.text.font.l.A, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 1573254, 0, 129978);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                    androidx.compose.ui.text.m0 m0VarA = androidx.compose.ui.text.m0.a(((t3) rVar2.j(u2Var)).l, 0L, 0L, null, null, 0L, 0L, null, 16773119);
                    long j2 = com.app.mlounge.ui.theme.b.f;
                    Context context = this.y;
                    boolean zH = rVar2.h(context);
                    Object objQ = rVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zH || objQ == fVar) {
                        objQ = new androidx.navigation.compose.p(context, 3);
                        rVar2.l0(objQ);
                    }
                    p3.b("Privacy Policy", androidx.compose.foundation.s.j(oVar, false, null, (kotlin.jvm.functions.a) objQ, 15), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0VarA, rVar2, 390, 0, 131064);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, f2));
                    boolean zH2 = rVar2.h(context);
                    kotlin.jvm.functions.l lVar = this.z;
                    boolean zF = zH2 | rVar2.f(lVar);
                    Object objQ2 = rVar2.Q();
                    if (zF || objQ2 == fVar) {
                        objQ2 = new androidx.activity.compose.f(21, context, lVar);
                        rVar2.l0(objQ2);
                    }
                    b0.g((kotlin.jvm.functions.a) objQ2, rVar2, 54);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 10));
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
