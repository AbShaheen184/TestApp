package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;

    public /* synthetic */ s(String str, int i) {
        this.e = i;
        this.y = str;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.b(this.y, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 0, 0, 262142);
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 1:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b(kotlin.text.k.A0(this.y).toString(), androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 6, 2), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).o, rVar2, 432, 0, 131064);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            case 2:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.b(this.y, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 8, 2), com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u3.a)).o, rVar3, 432, 0, 131064);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
            case 3:
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.b(this.y, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 6, 2), com.app.mlounge.ui.theme.b.h, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u3.a)).o, rVar4, 432, 0, 131064);
                } else {
                    rVar4.W();
                }
                return kotlin.y.a;
            case 4:
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.b(this.y, androidx.compose.foundation.layout.b.o(androidx.compose.ui.o.b, 12), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).k, rVar5, 48, 0, 131064);
                } else {
                    rVar5.W();
                }
                return kotlin.y.a;
            case 5:
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (rVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.H, rVar6, 54);
                    int iHashCode = Long.hashCode(rVar6.T);
                    androidx.compose.runtime.internal.j jVarL = rVar6.l();
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar6, oVar);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar6.e0();
                    if (rVar6.S) {
                        rVar6.k(yVar);
                    } else {
                        rVar6.o0();
                    }
                    androidx.compose.runtime.s.x(rVar6, t0VarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar6, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar6, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar6, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar6, rVarC, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), 0L, 0.0f, 0L, 0, 0.0f, rVar6, 6, 62);
                    p3.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Loading ", this.y, "..."), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar6, 0, 0, 262142);
                    rVar6.p(true);
                } else {
                    rVar6.W();
                }
                return kotlin.y.a;
            case 6:
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (rVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.b(this.y, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 8, 2), com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u3.a)).o, rVar7, 432, 0, 131064);
                } else {
                    rVar7.W();
                }
                return kotlin.y.a;
            case 7:
                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (rVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.b(this.y, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 6), androidx.compose.ui.graphics.t.g, h1.r(12), null, 0L, null, 0L, 0, false, 0, 0, null, rVar8, 25008, 0, 262120);
                } else {
                    rVar8.W();
                }
                return kotlin.y.a;
            case 8:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.i0.h(this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 9:
                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (rVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.b(this.y, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar9, 384, 0, 262138);
                } else {
                    rVar9.W();
                }
                return kotlin.y.a;
            case 10:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.d(this.y, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(7));
                break;
            case 11:
                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (rVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.b(this.y, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar10, 0, 0, 262138);
                } else {
                    rVar10.W();
                }
                return kotlin.y.a;
            case 12:
                androidx.compose.runtime.r rVar11 = (androidx.compose.runtime.r) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (rVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.b(this.y, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar11, 0, 0, 262138);
                } else {
                    rVar11.W();
                }
                return kotlin.y.a;
            case 13:
                androidx.compose.runtime.r rVar12 = (androidx.compose.runtime.r) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (rVar12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.b(this.y, null, 0L, h1.r(12), null, 0L, null, 0L, 0, false, 0, 0, null, rVar12, 24576, 0, 262126);
                } else {
                    rVar12.W();
                }
                return kotlin.y.a;
            case 14:
                androidx.compose.runtime.r rVar13 = (androidx.compose.runtime.r) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (rVar13.T(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    p3.b(this.y, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar13, 384, 0, 262138);
                } else {
                    rVar13.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.r rVar14 = (androidx.compose.runtime.r) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (rVar14.T(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    p3.b(this.y, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 8, 2), com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar14.j(u3.a)).o, rVar14, 432, 0, 131064);
                } else {
                    rVar14.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ s(String str, int i, int i2) {
        this.e = i2;
        this.y = str;
    }
}
