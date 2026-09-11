package com.app.mlounge.ui.screens.settings;

import androidx.compose.foundation.b2;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.p3;
import androidx.compose.material3.r2;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ float y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ v(float f, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, int i) {
        this.y = f;
        this.z = lVar;
        this.A = aVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        v vVar = this;
        switch (vVar.e) {
            case 0:
                List<kotlin.k> list = (List) vVar.A;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = false;
                boolean z2 = true;
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    b2 b2VarO = androidx.compose.foundation.s.o(rVar);
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(oVar, b2VarO, true);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    rVar.b0(-594663720);
                    for (kotlin.k kVar : list) {
                        float fFloatValue = ((Number) kVar.e).floatValue();
                        String str = (String) kVar.y;
                        androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
                        kotlin.jvm.functions.l lVar = vVar.z;
                        boolean zF = rVar.f(lVar) | rVar.c(fFloatValue);
                        Object objQ = rVar.Q();
                        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                        if (zF || objQ == fVar) {
                            objQ = new com.app.mlounge.ui.screens.player.j(lVar, fFloatValue, 2);
                            rVar.l0(objQ);
                        }
                        androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.j(rVarD, z, null, (kotlin.jvm.functions.a) objQ, 15), 4, 12);
                        t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 48);
                        int iHashCode2 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarP2);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar2);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.runtime.s.x(rVar, t0VarA, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar, jVarL2, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar, rVarC2, androidx.compose.ui.node.f.c);
                        boolean z3 = vVar.y == fFloatValue ? z2 : z;
                        boolean zF2 = rVar.f(lVar) | rVar.c(fFloatValue);
                        Object objQ2 = rVar.Q();
                        if (zF2 || objQ2 == fVar) {
                            objQ2 = new com.app.mlounge.ui.screens.player.j(lVar, fFloatValue, 3);
                            rVar.l0(objQ2);
                        }
                        r2.a(z3, (kotlin.jvm.functions.a) objQ2, null, false, t2.l(com.app.mlounge.ui.theme.b.f, com.app.mlounge.ui.theme.b.m, rVar), rVar, 0);
                        androidx.compose.foundation.layout.b.d(rVar, w0.p(oVar, 8));
                        androidx.compose.runtime.r rVar2 = rVar;
                        boolean z4 = z2;
                        p3.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).k, rVar2, 0, 0, 131066);
                        rVar = rVar2;
                        rVar.p(z4);
                        z2 = z4;
                        oVar = oVar;
                        z = false;
                        vVar = this;
                    }
                    rVar.p(z);
                    rVar.p(z2);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                e0.m(vVar.y, vVar.z, (kotlin.jvm.functions.a) vVar.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(385));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v(List list, kotlin.jvm.functions.l lVar, float f) {
        this.A = list;
        this.z = lVar;
        this.y = f;
    }
}
