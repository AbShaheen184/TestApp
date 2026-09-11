package com.app.mlounge.ui.components;

import android.content.Context;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.d1;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.p {
    public final /* synthetic */ d1 A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ Context C;
    public final /* synthetic */ kotlin.jvm.functions.a D;
    public final /* synthetic */ y0 E;
    public final /* synthetic */ int e;
    public final /* synthetic */ q0 y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ j(q0 q0Var, y0 y0Var, d1 d1Var, y0 y0Var2, Context context, kotlin.jvm.functions.a aVar, y0 y0Var3, int i) {
        this.e = i;
        this.y = q0Var;
        this.z = y0Var;
        this.A = d1Var;
        this.B = y0Var2;
        this.C = context;
        this.D = aVar;
        this.E = y0Var3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        d1 d1Var;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(605933855, new j(this.y, this.z, this.A, this.B, this.C, this.D, this.E, 1), rVar), rVar, 12582912, Token.DOT);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 24);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
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
                    u2 u2Var = u3.a;
                    p3.b("Update Available", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).h, rVar2, 1572870, 0, 131002);
                    float f = 4;
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, f));
                    q0 q0Var = this.y;
                    int i = q0Var.a;
                    String strF = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("v", i / 100, ".", i % 100);
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.f;
                    p3.b(strF, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 0, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 16));
                    androidx.compose.ui.r rVarF = w0.f(w0.d(oVar, 1.0f), org.mozilla.javascript.Context.VERSION_ES6);
                    long j2 = com.app.mlounge.ui.theme.b.b;
                    float f2 = 12;
                    f3.a(rVarF, androidx.compose.foundation.shape.e.a(f2), j2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-2120945936, new androidx.compose.animation.core.g0(q0Var, 17), rVar2), rVar2, 12582918, 120);
                    androidx.compose.runtime.r rVar3 = rVar2;
                    androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar, 20));
                    y0 y0Var = this.z;
                    boolean zBooleanValue = ((Boolean) y0Var.getValue()).booleanValue();
                    d1 d1Var2 = this.A;
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zBooleanValue) {
                        rVar3.b0(-9733228);
                        androidx.compose.ui.text.m0 m0Var2 = ((t3) rVar3.j(u2Var)).l;
                        long j3 = com.app.mlounge.ui.theme.b.m;
                        p3.b("Downloading update...", null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var2, rVar3, 6, 0, 131066);
                        androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar, 8));
                        Object objQ = rVar3.Q();
                        if (objQ == fVar) {
                            d1Var = d1Var2;
                            objQ = new androidx.room.coroutines.d(d1Var, 13);
                            rVar3.l0(objQ);
                        } else {
                            d1Var = d1Var2;
                        }
                        o2.b((kotlin.jvm.functions.a) objQ, androidx.compose.ui.draw.h.a(w0.f(w0.d(oVar, 1.0f), 6), androidx.compose.foundation.shape.e.a(3)), j, j2, 0, 0.0f, null, rVar3, 6, Token.ASSIGN_MOD);
                        androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar, f));
                        p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d((int) (d1Var.g() * 100), "%"), null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).l, rVar3, 0, 0, 131066);
                        rVar3 = rVar3;
                        rVar3.p(false);
                        z = true;
                    } else {
                        y0 y0Var2 = this.B;
                        String str = (String) y0Var2.getValue();
                        Context context = this.C;
                        kotlin.jvm.functions.a aVar = this.D;
                        y0 y0Var3 = this.E;
                        if (str != null) {
                            rVar3.b0(-8580400);
                            String str2 = (String) y0Var2.getValue();
                            str2.getClass();
                            p3.b(str2, null, androidx.compose.ui.graphics.a0.d(4294929259L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).l, rVar3, 384, 0, 131066);
                            androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar, f2));
                            androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
                            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.d, iVar, rVar3, 6);
                            int iHashCode2 = Long.hashCode(rVar3.T);
                            androidx.compose.runtime.internal.j jVarL2 = rVar3.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarD);
                            rVar3.e0();
                            if (rVar3.S) {
                                rVar3 = rVar3;
                                rVar3.k(yVar);
                            } else {
                                rVar3 = rVar3;
                                rVar3.o0();
                            }
                            androidx.compose.runtime.s.x(rVar3, t0VarA, eVar);
                            androidx.compose.runtime.s.x(rVar3, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar3, eVar3, rVar3, dVar);
                            androidx.compose.runtime.s.x(rVar3, rVarC2, eVar4);
                            boolean zH = rVar3.h(context);
                            Object objQ2 = rVar3.Q();
                            if (zH || objQ2 == fVar) {
                                objQ2 = new b(context, y0Var2, y0Var, d1Var2);
                                rVar3.l0(objQ2);
                            }
                            b0.l("Retry", j, (kotlin.jvm.functions.a) objQ2, rVar3, 6);
                            androidx.compose.foundation.layout.b.d(rVar3, w0.p(oVar, f2));
                            long j4 = com.app.mlounge.ui.theme.b.m;
                            boolean zF = rVar3.f(aVar);
                            Object objQ3 = rVar3.Q();
                            if (zF || objQ3 == fVar) {
                                objQ3 = new a(aVar, y0Var3, 1);
                                rVar3.l0(objQ3);
                            }
                            b0.l("Later", j4, (kotlin.jvm.functions.a) objQ3, rVar3, 6);
                            z = true;
                            rVar3.p(true);
                            rVar3.p(false);
                        } else {
                            rVar3.b0(-6967129);
                            androidx.compose.ui.r rVarD2 = w0.d(oVar, 1.0f);
                            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.d, iVar, rVar3, 6);
                            int iHashCode3 = Long.hashCode(rVar3.T);
                            androidx.compose.runtime.internal.j jVarL3 = rVar3.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar3, rVarD2);
                            rVar3.e0();
                            if (rVar3.S) {
                                rVar3.k(yVar);
                            } else {
                                rVar3.o0();
                            }
                            androidx.compose.runtime.s.x(rVar3, t0VarA2, eVar);
                            androidx.compose.runtime.s.x(rVar3, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar3, eVar3, rVar3, dVar);
                            androidx.compose.runtime.s.x(rVar3, rVarC3, eVar4);
                            long j5 = com.app.mlounge.ui.theme.b.m;
                            boolean zH2 = rVar3.h(context);
                            Object objQ4 = rVar3.Q();
                            if (zH2 || objQ4 == fVar) {
                                objQ4 = new b(context, y0Var, d1Var2, y0Var2);
                                rVar3.l0(objQ4);
                            }
                            b0.l("Update Now", j5, (kotlin.jvm.functions.a) objQ4, rVar3, 6);
                            androidx.compose.foundation.layout.b.d(rVar3, w0.p(oVar, f2));
                            boolean zF2 = rVar3.f(aVar);
                            Object objQ5 = rVar3.Q();
                            if (zF2 || objQ5 == fVar) {
                                objQ5 = new a(aVar, y0Var3, 2);
                                rVar3.l0(objQ5);
                            }
                            b0.l("Later", j5, (kotlin.jvm.functions.a) objQ5, rVar3, 6);
                            z = true;
                            rVar3.p(true);
                            rVar3.p(false);
                        }
                    }
                    rVar3.p(z);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
