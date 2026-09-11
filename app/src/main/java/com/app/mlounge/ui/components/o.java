package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.y0;
import com.app.mlounge.ui.screens.player.b1;
import com.app.mlounge.ui.viewmodel.z1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ o(kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.l lVar5, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.l lVar6, boolean z, kotlin.jvm.functions.a aVar, z1 z1Var, int i) {
        this.B = lVar;
        this.C = lVar2;
        this.D = lVar3;
        this.E = lVar4;
        this.F = lVar5;
        this.z = qVar;
        this.A = lVar6;
        this.y = z;
        this.G = aVar;
        this.H = z1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                final kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.B;
                androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) this.C;
                final y0 y0Var = (y0) this.z;
                final y0 y0Var2 = (y0) this.A;
                final y0 y0Var3 = (y0) this.G;
                final y0 y0Var4 = (y0) this.H;
                androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.D;
                androidx.compose.ui.focus.y yVar3 = (androidx.compose.ui.focus.y) this.E;
                androidx.compose.ui.focus.y yVar4 = (androidx.compose.ui.focus.y) this.F;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final boolean z = this.y;
                    boolean zG = rVar.g(z) | rVar.f(pVar);
                    Object objQ = rVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zG || objQ == fVar) {
                        kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.components.v
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                y0 y0Var5 = y0Var;
                                int length = ((String) y0Var5.getValue()).length();
                                y0 y0Var6 = y0Var2;
                                if (length != 4) {
                                    y0Var6.setValue("PIN must be 4 digits");
                                } else if (z || kotlin.jvm.internal.l.a((String) y0Var5.getValue(), (String) y0Var3.getValue())) {
                                    String str = (String) y0Var5.getValue();
                                    Boolean bool = (Boolean) y0Var4.getValue();
                                    bool.booleanValue();
                                    pVar.invoke(str, bool);
                                } else {
                                    y0Var6.setValue("PINs do not match");
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar.l0(aVar);
                        objQ = aVar;
                    }
                    kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ;
                    androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(androidx.compose.ui.o.b, yVar);
                    boolean zG2 = rVar.g(z);
                    Object objQ2 = rVar.Q();
                    if (zG2 || objQ2 == fVar) {
                        y yVar5 = new y(z, yVar2, yVar3, yVar4, 0);
                        rVar.l0(yVar5);
                        objQ2 = yVar5;
                    }
                    t2.h(aVar2, androidx.compose.ui.input.key.c.e(rVarK, (kotlin.jvm.functions.l) objQ2), false, null, null, null, null, b0.a, rVar, 805306368, 508);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                final b1 b1Var = (b1) this.B;
                final kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) this.C;
                final List list = (List) this.D;
                final kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.E;
                final kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) this.F;
                final kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) this.G;
                final y0 y0Var5 = (y0) this.z;
                final List list2 = (List) this.H;
                final y0 y0Var6 = (y0) this.A;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.r rVarC = w0.c(w0.d(androidx.compose.ui.o.b, 0.85f), 0.7f);
                    androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(16);
                    androidx.compose.material3.a0 a0VarI = t2.i(com.app.mlounge.ui.theme.b.b, rVar2, 6);
                    final boolean z2 = this.y;
                    t2.c(rVarC, dVarA, a0VarI, null, androidx.compose.runtime.internal.k.c(-1843188989, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.player.c0
                        @Override // kotlin.jvm.functions.q
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            androidx.compose.ui.node.y yVar6;
                            androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            ((androidx.compose.foundation.layout.w) obj3).getClass();
                            if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
                                androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar3, 0);
                                int iHashCode = Long.hashCode(rVar3.T);
                                androidx.compose.runtime.internal.j jVarL = rVar3.l();
                                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, a0Var);
                                androidx.compose.ui.node.g.b.getClass();
                                androidx.compose.ui.node.y yVar7 = androidx.compose.ui.node.f.b;
                                rVar3.e0();
                                if (rVar3.S) {
                                    rVar3.k(yVar7);
                                } else {
                                    rVar3.o0();
                                }
                                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                                androidx.compose.runtime.s.x(rVar3, vVarA, eVar);
                                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                                androidx.compose.runtime.s.x(rVar3, jVarL, eVar2);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                                androidx.compose.runtime.s.p(rVar3, numValueOf, eVar3);
                                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                                androidx.compose.runtime.s.t(rVar3, dVar);
                                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                                androidx.compose.runtime.s.x(rVar3, rVarC2, eVar4);
                                androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                                androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), 16);
                                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.h.e;
                                androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                                androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(dVar2, iVar, rVar3, 54);
                                int iHashCode2 = Long.hashCode(rVar3.T);
                                androidx.compose.runtime.internal.j jVarL2 = rVar3.l();
                                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar3, rVarO);
                                rVar3.e0();
                                if (rVar3.S) {
                                    rVar3.k(yVar7);
                                } else {
                                    rVar3.o0();
                                }
                                androidx.compose.runtime.s.x(rVar3, t0VarA, eVar);
                                androidx.compose.runtime.s.x(rVar3, jVarL2, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar3, eVar3, rVar3, dVar);
                                androidx.compose.runtime.s.x(rVar3, rVarC3, eVar4);
                                androidx.compose.ui.text.m0 m0Var = ((t3) rVar3.j(u3.a)).g;
                                long j = androidx.compose.ui.graphics.t.d;
                                p3.b("Subtitles", null, j, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar3, 1573254, 0, 131002);
                                androidx.compose.foundation.layout.t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, iVar, rVar3, 48);
                                int iHashCode3 = Long.hashCode(rVar3.T);
                                androidx.compose.runtime.internal.j jVarL3 = rVar3.l();
                                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar3, oVar);
                                rVar3.e0();
                                if (rVar3.S) {
                                    yVar6 = yVar7;
                                    rVar3.k(yVar6);
                                } else {
                                    yVar6 = yVar7;
                                    rVar3.o0();
                                }
                                androidx.compose.runtime.s.x(rVar3, t0VarA2, eVar);
                                androidx.compose.runtime.s.x(rVar3, jVarL3, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar3, eVar3, rVar3, dVar);
                                androidx.compose.runtime.s.x(rVar3, rVarC4, eVar4);
                                androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                                int iHashCode4 = Long.hashCode(rVar3.T);
                                androidx.compose.runtime.internal.j jVarL4 = rVar3.l();
                                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar3, oVar);
                                rVar3.e0();
                                if (rVar3.S) {
                                    rVar3.k(yVar6);
                                } else {
                                    rVar3.o0();
                                }
                                androidx.compose.runtime.s.x(rVar3, q0VarD, eVar);
                                androidx.compose.runtime.s.x(rVar3, jVarL4, eVar2);
                                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar3, eVar3, rVar3, dVar);
                                androidx.compose.runtime.s.x(rVar3, rVarC5, eVar4);
                                androidx.compose.ui.graphics.vector.f fVarO = t1.o();
                                Object objQ3 = rVar3.Q();
                                androidx.compose.runtime.y0 y0Var7 = y0Var5;
                                androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                if (objQ3 == fVar2) {
                                    objQ3 = new androidx.compose.foundation.lazy.n(y0Var7, 18);
                                    rVar3.l0(objQ3);
                                }
                                i0.f(fVarO, (kotlin.jvm.functions.a) objQ3, rVar3, 48);
                                boolean zBooleanValue = ((Boolean) y0Var7.getValue()).booleanValue();
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0)) << 32) | (((long) Float.floatToRawIntBits(4)) & 4294967295L);
                                androidx.compose.ui.r rVarF = androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.c, androidx.compose.ui.graphics.a0.b);
                                Object objQ4 = rVar3.Q();
                                if (objQ4 == fVar2) {
                                    objQ4 = new androidx.compose.foundation.lazy.n(y0Var7, 19);
                                    rVar3.l0(objQ4);
                                }
                                androidx.compose.ui.node.y yVar8 = yVar6;
                                androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, rVarF, jFloatToRawIntBits, null, null, null, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1172944058, new com.app.mlounge.ui.components.d0(3, list2, y0Var6, y0Var7), rVar3), rVar3, 3504, 2032);
                                rVar3.p(true);
                                i0.f(com.google.firebase.b.p(), aVar4, rVar3, 0);
                                i0.f(androidx.room.r.l(), aVar5, rVar3, 0);
                                rVar3.p(true);
                                rVar3.p(true);
                                t2.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.1f, j), rVar3, 384, 3);
                                if (z2) {
                                    rVar3.b0(-1922553587);
                                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                                    int iHashCode5 = Long.hashCode(rVar3.T);
                                    androidx.compose.runtime.internal.j jVarL5 = rVar3.l();
                                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar3, a0Var);
                                    rVar3.e0();
                                    if (rVar3.S) {
                                        rVar3.k(yVar8);
                                    } else {
                                        rVar3.o0();
                                    }
                                    androidx.compose.runtime.s.x(rVar3, q0VarD2, eVar);
                                    androidx.compose.runtime.s.x(rVar3, jVarL5, eVar2);
                                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar3, eVar3, rVar3, dVar);
                                    androidx.compose.runtime.s.x(rVar3, rVarC6, eVar4);
                                    o2.a(null, com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar3, 48, 61);
                                    rVar3.p(true);
                                    rVar3.p(false);
                                } else {
                                    rVar3.b0(-1922379770);
                                    float f = 8;
                                    androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f, f, f, f);
                                    b1 b1Var2 = b1Var;
                                    boolean zF = rVar3.f(b1Var2);
                                    kotlin.jvm.functions.a aVar6 = aVar3;
                                    boolean zF2 = zF | rVar3.f(aVar6);
                                    List list3 = list;
                                    boolean zH = zF2 | rVar3.h(list3);
                                    kotlin.jvm.functions.l lVar2 = lVar;
                                    boolean zF3 = zH | rVar3.f(lVar2);
                                    Object objQ5 = rVar3.Q();
                                    if (zF3 || objQ5 == fVar2) {
                                        androidx.compose.animation.core.i0 i0Var = new androidx.compose.animation.core.i0(list3, b1Var2, aVar6, lVar2, 10);
                                        rVar3.l0(i0Var);
                                        objQ5 = i0Var;
                                    }
                                    coil3.network.g.a(a0Var, null, m0Var2, null, null, null, false, null, (kotlin.jvm.functions.l) objQ5, rVar3, 390, 506);
                                    rVar3.p(false);
                                }
                                rVar3.p(true);
                            } else {
                                rVar3.W();
                            }
                            return kotlin.y.a;
                        }
                    }, rVar2), rVar2, 196614, 24);
                } else {
                    rVar2.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                _COROUTINE.a.d((kotlin.jvm.functions.l) this.B, (kotlin.jvm.functions.l) this.C, (kotlin.jvm.functions.l) this.D, (kotlin.jvm.functions.l) this.E, (kotlin.jvm.functions.l) this.F, (kotlin.jvm.functions.q) this.z, (kotlin.jvm.functions.l) this.A, this.y, (kotlin.jvm.functions.a) this.G, (z1) this.H, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(100663297));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ o(boolean z, b1 b1Var, kotlin.jvm.functions.a aVar, List list, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, y0 y0Var, List list2, y0 y0Var2) {
        this.y = z;
        this.B = b1Var;
        this.C = aVar;
        this.D = list;
        this.E = lVar;
        this.F = aVar2;
        this.G = aVar3;
        this.z = y0Var;
        this.H = list2;
        this.A = y0Var2;
    }

    public /* synthetic */ o(boolean z, kotlin.jvm.functions.p pVar, androidx.compose.ui.focus.y yVar, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, androidx.compose.ui.focus.y yVar2, androidx.compose.ui.focus.y yVar3, androidx.compose.ui.focus.y yVar4) {
        this.y = z;
        this.B = pVar;
        this.C = yVar;
        this.z = y0Var;
        this.A = y0Var2;
        this.G = y0Var3;
        this.H = y0Var4;
        this.D = yVar2;
        this.E = yVar3;
        this.F = yVar4;
    }
}
