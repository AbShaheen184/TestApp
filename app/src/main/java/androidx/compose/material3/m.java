package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.y0 y;

    public /* synthetic */ m(androidx.compose.runtime.y0 y0Var, int i) {
        this.e = i;
        this.y = y0Var;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0728  */
    /* JADX WARN: Code duplicated, block: B:155:0x074b  */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        androidx.compose.ui.graphics.vector.f fVarB;
        int i = this.e;
        float fMin2 = 1.0f;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.y0 y0Var = this.y;
        switch (i) {
            case 0:
                androidx.compose.ui.unit.k kVar = (androidx.compose.ui.unit.k) obj;
                androidx.compose.ui.unit.k kVar2 = (androidx.compose.ui.unit.k) obj2;
                float f = q1.a;
                int i2 = kVar2.a;
                int i3 = kVar2.d;
                int i4 = kVar2.c;
                int i5 = kVar2.b;
                int i6 = kVar.c;
                int i7 = kVar.b;
                int i8 = kVar.d;
                int i9 = kVar.a;
                if (i2 >= i6) {
                    fMin = 0.0f;
                } else if (i4 <= i9) {
                    fMin = 1.0f;
                } else if (kVar2.c() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(kVar.c, i4) + Math.max(i9, i2)) / 2) - i2) / kVar2.c();
                }
                if (i5 >= i8) {
                    fMin2 = 0.0f;
                } else if (i3 > i7) {
                    if (kVar2.b() == 0) {
                        fMin2 = 0.0f;
                    } else {
                        fMin2 = (((Math.min(i8, i3) + Math.max(i7, i5)) / 2) - i5) / kVar2.b();
                    }
                }
                y0Var.setValue(new androidx.compose.ui.graphics.q0(androidx.compose.ui.graphics.a0.h(fMin, fMin2)));
                break;
            case 1:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rVar.W();
                } else {
                    androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.H, rVar, 54);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, oVar);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar2);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, t0VarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    o2.a(androidx.compose.foundation.layout.w0.l(oVar, 24), 0L, 0.0f, 0L, 0, 0.0f, rVar, 6, 62);
                    p3.b(androidx.privacysandbox.ads.adservices.java.internal.a.q("Loading ", (String) y0Var.getValue(), "..."), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 0, 0, 262142);
                    rVar.p(true);
                }
                break;
            case 2:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rVar2.W();
                } else {
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(androidx.compose.foundation.layout.b.o(oVar, 12), androidx.compose.foundation.s.o(rVar2), true);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar3);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
                    String str = (String) y0Var.getValue();
                    if (str == null) {
                        str = "Unable to load changelog.";
                    }
                    p3.b(str, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).l, rVar2, 0, 0, 131066);
                    rVar2.p(true);
                }
                break;
            case 3:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rVar3.W();
                } else {
                    Object objQ = rVar3.Q();
                    if (objQ == fVar) {
                        objQ = new androidx.compose.foundation.lazy.n(y0Var, 7);
                        rVar3.l0(objQ);
                    }
                    t2.e((kotlin.jvm.functions.a) objQ, null, false, null, null, null, androidx.compose.runtime.internal.k.c(403555793, new m(y0Var, 4), rVar3), rVar3, 1572870, 62);
                }
                break;
            case 4:
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!rVar4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rVar4.W();
                } else {
                    if (((Boolean) y0Var.getValue()).booleanValue()) {
                        fVarB = _COROUTINE.a.h;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.VisibilityOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i10 = androidx.compose.ui.graphics.vector.h0.a;
                            androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                            androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 7.0f);
                            gVarH.h(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f);
                            gVarH.h(0.0f, 0.65f, -0.13f, 1.26f, -0.36f, 1.83f);
                            gVarH.n(2.92f, 2.92f);
                            gVarH.h(1.51f, -1.26f, 2.7f, -2.89f, 3.43f, -4.75f);
                            gVarH.h(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
                            gVarH.h(-1.4f, 0.0f, -2.74f, 0.25f, -3.98f, 0.7f);
                            gVarH.n(2.16f, 2.16f);
                            gVarH.g(10.74f, 7.13f, 11.35f, 7.0f, 12.0f, 7.0f);
                            gVarH.f();
                            gVarH.o(2.0f, 4.27f);
                            gVarH.n(2.28f, 2.28f);
                            gVarH.n(0.46f, 0.46f);
                            gVarH.g(3.08f, 8.3f, 1.78f, 10.02f, 1.0f, 12.0f);
                            gVarH.h(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
                            gVarH.h(1.55f, 0.0f, 3.03f, -0.3f, 4.38f, -0.84f);
                            gVarH.n(0.42f, 0.42f);
                            gVarH.m(19.73f, 22.0f);
                            gVarH.m(21.0f, 20.73f);
                            gVarH.m(3.27f, 3.0f);
                            gVarH.m(2.0f, 4.27f);
                            gVarH.f();
                            gVarH.o(7.53f, 9.8f);
                            gVarH.n(1.55f, 1.55f);
                            gVarH.h(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
                            gVarH.h(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
                            gVarH.h(0.22f, 0.0f, 0.44f, -0.03f, 0.65f, -0.08f);
                            gVarH.n(1.55f, 1.55f);
                            gVarH.h(-0.67f, 0.33f, -1.41f, 0.53f, -2.2f, 0.53f);
                            gVarH.h(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            gVarH.h(0.0f, -0.79f, 0.2f, -1.53f, 0.53f, -2.2f);
                            gVarH.f();
                            gVarH.o(11.84f, 9.02f);
                            gVarH.n(3.15f, 3.15f);
                            gVarH.n(0.02f, -0.16f);
                            gVarH.h(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
                            gVarH.n(-0.17f, 0.01f);
                            gVarH.f();
                            androidx.compose.ui.graphics.vector.e.a(eVar, gVarH.a, 0, p0Var);
                            fVarB = eVar.b();
                            _COROUTINE.a.h = fVarB;
                        }
                    } else {
                        fVarB = org.jsoup.helper.n.h;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar2 = new androidx.compose.ui.graphics.vector.e("Filled.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i11 = androidx.compose.ui.graphics.vector.h0.a;
                            androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                            androidx.compose.ui.graphics.vector.g gVarH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 4.5f);
                            gVarH2.g(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
                            gVarH2.h(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
                            gVarH2.q(9.27f, -3.11f, 11.0f, -7.5f);
                            gVarH2.h(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
                            gVarH2.f();
                            gVarH2.o(12.0f, 17.0f);
                            gVarH2.h(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
                            gVarH2.q(2.24f, -5.0f, 5.0f, -5.0f);
                            gVarH2.q(5.0f, 2.24f, 5.0f, 5.0f);
                            gVarH2.q(-2.24f, 5.0f, -5.0f, 5.0f);
                            gVarH2.f();
                            gVarH2.o(12.0f, 9.0f);
                            gVarH2.h(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
                            gVarH2.q(1.34f, 3.0f, 3.0f, 3.0f);
                            gVarH2.q(3.0f, -1.34f, 3.0f, -3.0f);
                            gVarH2.q(-1.34f, -3.0f, -3.0f, -3.0f);
                            gVarH2.f();
                            androidx.compose.ui.graphics.vector.e.a(eVar2, gVarH2.a, 0, p0Var2);
                            fVarB = eVar2.b();
                            org.jsoup.helper.n.h = fVarB;
                        }
                    }
                    f1.b(fVarB, ((Boolean) y0Var.getValue()).booleanValue() ? "Hide" : "Show", null, 0L, rVar4, 0, 12);
                }
                break;
            case 5:
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!rVar5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    rVar5.W();
                } else {
                    Object objQ2 = rVar5.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new androidx.compose.foundation.lazy.n(y0Var, 10);
                        rVar5.l0(objQ2);
                    }
                    t2.h((kotlin.jvm.functions.a) objQ2, null, false, null, null, null, null, com.app.mlounge.ui.screens.downloads.a.b, rVar5, 805306374, 510);
                }
                break;
            case 6:
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!rVar6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    rVar6.W();
                } else {
                    p3.b("All", null, androidx.compose.ui.graphics.t.d, 0L, ((String) y0Var.getValue()) == null ? androidx.compose.ui.text.font.l.C : androidx.compose.ui.text.font.l.z, 0L, null, 0L, 0, false, 0, 0, null, rVar6, 390, 0, 262074);
                }
                break;
            case 7:
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!rVar7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rVar7.W();
                } else {
                    Object objQ3 = rVar7.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new com.app.mlounge.ui.screens.settings.q(y0Var, 8);
                        rVar7.l0(objQ3);
                    }
                    t2.h((kotlin.jvm.functions.a) objQ3, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.b, rVar7, 805306374, 510);
                }
                break;
            case 8:
                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!rVar8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    rVar8.W();
                } else {
                    Object objQ4 = rVar8.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new androidx.compose.foundation.lazy.n(y0Var, 23);
                        rVar8.l0(objQ4);
                    }
                    t2.h((kotlin.jvm.functions.a) objQ4, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.x, rVar8, 805306374, 510);
                }
                break;
            case 9:
                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!rVar9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    rVar9.W();
                } else {
                    String str2 = (String) y0Var.getValue();
                    w1 w1Var = w1.a;
                    long j = androidx.compose.ui.graphics.t.d;
                    long j2 = com.app.mlounge.ui.theme.b.f;
                    k3 k3VarC = w1.c(j, j, j2, j2, androidx.compose.ui.graphics.t.b(0.3f, j), j2, androidx.compose.ui.graphics.t.b(0.5f, j), rVar9, 2122311420);
                    androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
                    Object objQ5 = rVar9.Q();
                    if (objQ5 == fVar) {
                        objQ5 = new androidx.compose.foundation.gestures.h2(y0Var, 18);
                        rVar9.l0(objQ5);
                    }
                    c2.a(str2, (kotlin.jvm.functions.l) objQ5, rVarD, false, false, null, com.app.mlounge.ui.screens.settings.b.z, null, null, null, null, null, null, true, 0, 0, null, null, k3VarC, rVar9, 1573296, 12582912, 0, 4063160);
                }
                break;
            case 10:
                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!rVar10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    rVar10.W();
                } else {
                    Object objQ6 = rVar10.Q();
                    if (objQ6 == fVar) {
                        objQ6 = new androidx.compose.foundation.lazy.n(y0Var, 24);
                        rVar10.l0(objQ6);
                    }
                    t2.h((kotlin.jvm.functions.a) objQ6, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.u, rVar10, 805306374, 510);
                }
                break;
            default:
                androidx.compose.runtime.r rVar11 = (androidx.compose.runtime.r) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!rVar11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    rVar11.W();
                } else {
                    String str3 = ((com.app.mlounge.ui.viewmodel.m) y0Var.getValue()).c;
                    if (str3 == null) {
                        str3 = "Debrid Error";
                    }
                    p3.b(str3, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar11, 384, 0, 262138);
                }
                break;
        }
        return yVar;
    }
}
