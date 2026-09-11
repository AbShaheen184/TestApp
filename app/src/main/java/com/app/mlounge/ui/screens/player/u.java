package com.app.mlounge.ui.screens.player;

import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ u(kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.e = i;
        this.y = aVar;
        this.z = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        char c;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        switch (i) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 1;
                if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.W();
                } else {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(803038851, new u(this.y, this.z, i2), rVar), rVar, 12583296, Token.DOT);
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.W();
                } else {
                    float f = 24;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    androidx.compose.runtime.s.t(rVar2, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
                    androidx.compose.ui.graphics.vector.f fVarB = com.google.android.gms.dynamite.g.i;
                    if (fVarB != null) {
                        c = 0;
                    } else {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.Timer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = androidx.compose.ui.graphics.vector.h0.a;
                        long j = androidx.compose.ui.graphics.t.b;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(j);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new androidx.compose.ui.graphics.vector.o(9.0f, 1.0f));
                        arrayList.add(new androidx.compose.ui.graphics.vector.u(6.0f));
                        arrayList.add(new androidx.compose.ui.graphics.vector.a0(2.0f));
                        arrayList.add(new androidx.compose.ui.graphics.vector.u(-6.0f));
                        arrayList.add(androidx.compose.ui.graphics.vector.k.c);
                        androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                        androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(j);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(19.03f, 7.39f);
                        gVar.n(1.42f, -1.42f);
                        gVar.h(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f);
                        gVar.n(-1.42f, 1.42f);
                        gVar.g(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f);
                        gVar.h(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f);
                        gVar.h(0.0f, 4.97f, 4.02f, 9.0f, 9.0f, 9.0f);
                        gVar.q(9.0f, -4.03f, 9.0f, -9.0f);
                        gVar.g(21.0f, 10.88f, 20.26f, 8.93f, 19.03f, 7.39f);
                        gVar.f();
                        gVar.o(13.0f, 14.0f);
                        gVar.l(-2.0f);
                        gVar.r(8.0f);
                        c = 0;
                        gVar.l(2.0f);
                        gVar.r(14.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var2);
                        fVarB = eVar5.b();
                        com.google.android.gms.dynamite.g.i = fVarB;
                    }
                    f1.b(fVarB, null, androidx.compose.foundation.layout.w0.l(oVar, 48), androidx.compose.ui.graphics.t.g, rVar2, 3504, 0);
                    androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, 16));
                    u2 u2Var = u3.a;
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var)).h;
                    long j2 = androidx.compose.ui.graphics.t.d;
                    p3.b("Seeking Unstable", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 390, 0, 131066);
                    p3.b("The stream is taking too long to resume after seeking. Large remux files often have this issue on some servers.", null, androidx.compose.ui.graphics.t.b(0.7f, j2), 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 390, 0, 130042);
                    androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, f));
                    androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
                    androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar2, 6);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarD);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                    androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                    androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                    i0.d("Reset to 0:00", android.support.v4.media.session.b.x(), androidx.compose.foundation.layout.u0.a(1.0f), this.y, rVar2, 6);
                    androidx.compose.ui.graphics.vector.f fVarB2 = t1.a;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.Block", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var3 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 2.0f);
                        gVarH.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        gVarH.q(4.48f, 10.0f, 10.0f, 10.0f);
                        gVarH.q(10.0f, -4.48f, 10.0f, -10.0f);
                        gVarH.p(17.52f, 2.0f, 12.0f, 2.0f);
                        gVarH.f();
                        gVarH.o(4.0f, 12.0f);
                        gVarH.h(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
                        gVarH.h(1.85f, 0.0f, 3.55f, 0.63f, 4.9f, 1.69f);
                        gVarH.m(5.69f, 16.9f);
                        gVarH.g(4.63f, 15.55f, 4.0f, 13.85f, 4.0f, 12.0f);
                        gVarH.f();
                        gVarH.o(12.0f, 20.0f);
                        gVarH.h(-1.85f, 0.0f, -3.55f, -0.63f, -4.9f, -1.69f);
                        gVarH.m(18.31f, 7.1f);
                        gVarH.g(19.37f, 8.45f, 20.0f, 10.15f, 20.0f, 12.0f);
                        gVarH.h(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
                        gVarH.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar6, gVarH.a, 0, p0Var3);
                        fVarB2 = eVar6.b();
                        t1.a = fVarB2;
                    }
                    i0.d("Disable Seeking", fVarB2, androidx.compose.foundation.layout.u0.a(1.0f), this.z, rVar2, 6);
                    rVar2.p(true);
                    rVar2.p(true);
                }
                break;
        }
        return yVar;
    }
}
