package androidx.compose.foundation.gestures;

import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.remote.model.TmdbCreator;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ y(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    /* JADX WARN: Code duplicated, block: B:163:0x0739  */
    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object obj4;
        int i = this.e;
        kotlin.coroutines.d dVar = null;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        int i2 = 2;
        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
        kotlin.y yVar = kotlin.y.a;
        boolean z2 = true;
        Object obj5 = this.y;
        switch (i) {
            case 0:
                ((androidx.compose.foundation.text.s0) obj5).y.a(((androidx.compose.ui.input.pointer.v) obj2).c, androidx.compose.foundation.text.selection.a0.d);
                return yVar;
            case 1:
                androidx.compose.ui.text.m0 m0Var = (androidx.compose.ui.text.m0) obj5;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
                ((Integer) obj3).getClass();
                rVar.b0(1582736677);
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) rVar.j(androidx.compose.ui.platform.l1.h);
                androidx.compose.ui.text.font.d dVar2 = (androidx.compose.ui.text.font.d) rVar.j(androidx.compose.ui.platform.l1.k);
                androidx.compose.ui.unit.m mVar = (androidx.compose.ui.unit.m) rVar.j(androidx.compose.ui.platform.l1.n);
                boolean zF = rVar.f(m0Var) | rVar.d(mVar.ordinal());
                Object objQ = rVar.Q();
                Object obj6 = objQ;
                if (zF || objQ == fVar) {
                    androidx.compose.ui.text.m0 m0VarH = androidx.compose.ui.text.d0.h(m0Var, mVar);
                    rVar.l0(m0VarH);
                    obj6 = m0VarH;
                }
                androidx.compose.ui.text.m0 m0Var2 = (androidx.compose.ui.text.m0) obj6;
                boolean zF2 = rVar.f(dVar2) | rVar.f(m0Var2);
                Object objQ2 = rVar.Q();
                Object obj7 = objQ2;
                if (zF2 || objQ2 == fVar) {
                    androidx.compose.ui.text.e0 e0Var = m0Var2.a;
                    androidx.compose.ui.text.font.s sVar = e0Var.f;
                    androidx.compose.ui.text.font.l lVar = e0Var.c;
                    if (lVar == null) {
                        lVar = androidx.compose.ui.text.font.l.z;
                    }
                    androidx.compose.ui.text.font.j jVar = e0Var.d;
                    int i3 = jVar != null ? jVar.a : 0;
                    androidx.compose.ui.text.font.k kVar = e0Var.e;
                    androidx.compose.ui.text.font.u uVarB = ((androidx.compose.ui.text.font.f) dVar2).b(sVar, lVar, i3, kVar != null ? kVar.a : 65535);
                    rVar.l0(uVarB);
                    obj7 = uVarB;
                }
                androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) obj7;
                Object objQ3 = rVar.Q();
                Object obj8 = objQ3;
                if (objQ3 == fVar) {
                    Object value = t2Var.getValue();
                    androidx.compose.foundation.text.j1 j1Var = new androidx.compose.foundation.text.j1();
                    j1Var.a = mVar;
                    j1Var.b = cVar;
                    j1Var.c = dVar2;
                    j1Var.d = m0Var;
                    j1Var.e = value;
                    j1Var.f = androidx.compose.foundation.text.a1.a(m0Var, cVar, dVar2, androidx.compose.foundation.text.a1.a, 1);
                    rVar.l0(j1Var);
                    obj8 = j1Var;
                }
                androidx.compose.foundation.text.j1 j1Var2 = (androidx.compose.foundation.text.j1) obj8;
                Object value2 = t2Var.getValue();
                if (mVar != j1Var2.a || !kotlin.jvm.internal.l.a(cVar, j1Var2.b) || !kotlin.jvm.internal.l.a(dVar2, j1Var2.c) || !kotlin.jvm.internal.l.a(m0Var2, j1Var2.d) || !kotlin.jvm.internal.l.a(value2, j1Var2.e)) {
                    j1Var2.a = mVar;
                    j1Var2.b = cVar;
                    j1Var2.c = dVar2;
                    j1Var2.d = m0Var2;
                    j1Var2.e = value2;
                    j1Var2.f = androidx.compose.foundation.text.a1.a(m0Var2, cVar, dVar2, androidx.compose.foundation.text.a1.a, 1);
                }
                boolean zH = rVar.h(j1Var2);
                Object objQ4 = rVar.Q();
                Object obj9 = objQ4;
                if (zH || objQ4 == fVar) {
                    y yVar2 = new y(j1Var2, i2);
                    rVar.l0(yVar2);
                    obj9 = yVar2;
                }
                androidx.compose.ui.r rVarJ = androidx.compose.ui.layout.a0.j(oVar, (kotlin.jvm.functions.q) obj9);
                rVar.p(false);
                return rVarJ;
            case 2:
                androidx.compose.ui.unit.a aVar = (androidx.compose.ui.unit.a) obj3;
                long j = ((androidx.compose.foundation.text.j1) obj5).f;
                long j2 = aVar.a;
                int iJ = androidx.compose.ui.unit.a.j(j2);
                long j3 = aVar.a;
                androidx.compose.ui.layout.c1 c1VarF = ((androidx.compose.ui.layout.p0) obj2).F(androidx.compose.ui.unit.a.a(j2, com.google.android.material.resources.c.c((int) (j >> 32), iJ, androidx.compose.ui.unit.a.h(j3)), 0, com.google.android.material.resources.c.c((int) (j & 4294967295L), androidx.compose.ui.unit.a.i(j3), androidx.compose.ui.unit.a.g(j3)), 0, 10));
                return ((androidx.compose.ui.layout.s0) obj).q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new androidx.compose.foundation.layout.j(c1VarF, 6));
            case 3:
                androidx.compose.foundation.text.input.internal.i iVar = (androidx.compose.foundation.text.input.internal.i) obj5;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                if (!zBooleanValue) {
                    iIntValue = iVar.T.j(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = iVar.T.j(iIntValue2);
                }
                if (iVar.R) {
                    long j4 = iVar.O.b;
                    int i4 = androidx.compose.ui.text.l0.c;
                    if (iIntValue == ((int) (j4 >> 32)) && iIntValue2 == ((int) (j4 & 4294967295L))) {
                        z2 = false;
                    } else {
                        int iMin = Math.min(iIntValue, iIntValue2);
                        androidx.compose.foundation.text.g0 g0Var = androidx.compose.foundation.text.g0.e;
                        if (iMin < 0 || Math.max(iIntValue, iIntValue2) > iVar.O.a.y.length()) {
                            androidx.compose.foundation.text.selection.c1 c1Var = iVar.U;
                            c1Var.t(false);
                            c1Var.q(g0Var);
                            z2 = false;
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                androidx.compose.foundation.text.selection.c1 c1Var2 = iVar.U;
                                c1Var2.t(false);
                                c1Var2.q(g0Var);
                            } else {
                                iVar.U.h(true);
                            }
                            iVar.P.v.invoke(new androidx.compose.ui.text.input.x(iVar.O.a, androidx.compose.ui.text.d0.b(iIntValue, iIntValue2), (androidx.compose.ui.text.l0) null));
                        }
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 4:
                androidx.compose.foundation.text.selection.c1 c1Var3 = (androidx.compose.foundation.text.selection.c1) obj5;
                androidx.compose.ui.r rVar2 = (androidx.compose.ui.r) obj;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                ((Integer) obj3).getClass();
                rVar3.b0(1980580247);
                androidx.compose.ui.unit.c cVar2 = (androidx.compose.ui.unit.c) rVar3.j(androidx.compose.ui.platform.l1.h);
                Object objQ5 = rVar3.Q();
                Object obj10 = objQ5;
                if (objQ5 == fVar) {
                    androidx.compose.runtime.h1 h1VarR = androidx.compose.runtime.s.r(new androidx.compose.ui.unit.l(0L));
                    rVar3.l0(h1VarR);
                    obj10 = h1VarR;
                }
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) obj10;
                boolean zH2 = rVar3.h(c1Var3);
                Object objQ6 = rVar3.Q();
                Object obj11 = objQ6;
                if (zH2 || objQ6 == fVar) {
                    androidx.activity.compose.f fVar2 = new androidx.activity.compose.f(13, c1Var3, y0Var);
                    rVar3.l0(fVar2);
                    obj11 = fVar2;
                }
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj11;
                boolean zF3 = rVar3.f(cVar2);
                Object objQ7 = rVar3.Q();
                if (zF3 || objQ7 == fVar) {
                    z = false;
                    androidx.compose.foundation.text.selection.f1 f1Var = new androidx.compose.foundation.text.selection.f1(cVar2, y0Var, false ? 1 : 0);
                    rVar3.l0(f1Var);
                    obj4 = f1Var;
                } else {
                    z = false;
                    obj4 = objQ7;
                }
                androidx.compose.animation.core.p pVar = androidx.compose.foundation.text.selection.m0.a;
                androidx.compose.ui.r rVarA = androidx.compose.ui.a.a(rVar2, new androidx.compose.foundation.contextmenu.i(aVar2, (kotlin.jvm.functions.l) obj4, i2));
                rVar3.p(z);
                return rVarA;
            case 5:
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj5;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar4.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    String strA = hiAnimeInfo.a();
                    if (strA == null) {
                        rVar4.b0(-972565345);
                        rVar4.p(false);
                    } else {
                        rVar4.b0(-972565344);
                        float f = 16;
                        androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f, 0.0f, 2);
                        androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar4, 0);
                        int iHashCode = Long.hashCode(rVar4.T);
                        androidx.compose.runtime.internal.j jVarL = rVar4.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, rVarQ);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                        rVar4.e0();
                        if (rVar4.S) {
                            rVar4.k(yVar3);
                        } else {
                            rVar4.o0();
                        }
                        androidx.compose.runtime.s.x(rVar4, vVarA, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar4, jVarL, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar4, rVarC, androidx.compose.ui.node.f.c);
                        androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f));
                        androidx.compose.runtime.u2 u2Var = u3.a;
                        p3.b("Synopsis", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).h, rVar4, 390, 0, 131066);
                        p3.b(strA, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).k, rVar4, 384, 0, 131066);
                        rVar4.p(true);
                        rVar4.p(false);
                    }
                } else {
                    rVar4.W();
                }
                return yVar;
            case 6:
                HiAnimeMoreInfo hiAnimeMoreInfo = (HiAnimeMoreInfo) obj5;
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!rVar5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    rVar5.W();
                } else if (hiAnimeMoreInfo == null) {
                    rVar5.b0(373194039);
                    rVar5.p(false);
                } else {
                    rVar5.b0(373194040);
                    androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(oVar, 16, 0.0f, 2);
                    androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar5, 0);
                    int iHashCode2 = Long.hashCode(rVar5.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar5.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar5, rVarQ2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                    rVar5.e0();
                    if (rVar5.S) {
                        rVar5.k(yVar4);
                    } else {
                        rVar5.o0();
                    }
                    androidx.compose.runtime.s.x(rVar5, vVarA2, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar5, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar5, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar5, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar5, rVarC2, androidx.compose.ui.node.f.c);
                    androidx.compose.foundation.layout.b.d(rVar5, androidx.compose.foundation.layout.w0.f(oVar, 12));
                    String strE = hiAnimeMoreInfo.e();
                    if (strE == null) {
                        rVar5.b0(-70471374);
                    } else {
                        rVar5.b0(-70471373);
                        p3.b("Studio: ".concat(strE), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).k, rVar5, 384, 0, 131066);
                    }
                    boolean z3 = false;
                    rVar5.p(false);
                    String strD = hiAnimeMoreInfo.d();
                    if (strD == null) {
                        rVar5.b0(-70334509);
                    } else {
                        rVar5.b0(-70334508);
                        p3.b("Status: ".concat(strD), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).l, rVar5, 384, 0, 131066);
                        z3 = false;
                    }
                    rVar5.p(z3);
                    String strA2 = hiAnimeMoreInfo.a();
                    if (strA2 == null) {
                        rVar5.b0(-70199628);
                    } else {
                        rVar5.b0(-70199627);
                        p3.b("Aired: ".concat(strA2), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).l, rVar5, 384, 0, 131066);
                        z3 = false;
                    }
                    rVar5.p(z3);
                    rVar5.p(true);
                    rVar5.p(z3);
                }
                return yVar;
            case 7:
                GameDetailResponse gameDetailResponse = (GameDetailResponse) obj5;
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar6.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    coil3.compose.k.a(gameDetailResponse.f(), gameDetailResponse.d(), androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.p(oVar, 150), Context.VERSION_ES6), null, androidx.compose.ui.layout.i.a, rVar6, 1573248, 1976);
                } else {
                    rVar6.W();
                }
                return yVar;
            case 8:
                String str = (String) obj5;
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar7.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 16);
                    androidx.compose.foundation.layout.v vVarA3 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar7, 0);
                    int iHashCode3 = Long.hashCode(rVar7.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar7.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar7, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar5 = androidx.compose.ui.node.f.b;
                    rVar7.e0();
                    if (rVar7.S) {
                        rVar7.k(yVar5);
                    } else {
                        rVar7.o0();
                    }
                    androidx.compose.runtime.s.x(rVar7, vVarA3, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar7, jVarL3, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar7, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar7, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar7, rVarC3, androidx.compose.ui.node.f.c);
                    androidx.compose.runtime.u2 u2Var2 = u3.a;
                    p3.b("Biography", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var2)).h, rVar7, 390, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar7, androidx.compose.foundation.layout.w0.f(oVar, 8));
                    p3.b(str, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var2)).k, rVar7, 384, 0, 131066);
                    rVar7.p(true);
                } else {
                    rVar7.W();
                }
                return yVar;
            case 9:
                android.content.Context context = (android.content.Context) obj5;
                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar8.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    Object objQ8 = rVar8.Q();
                    if (objQ8 == fVar) {
                        objQ8 = androidx.compose.runtime.s.r("");
                        rVar8.l0(objQ8);
                    }
                    androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) objQ8;
                    boolean zH3 = rVar8.h(context);
                    Object objQ9 = rVar8.Q();
                    if (zH3 || objQ9 == fVar) {
                        objQ9 = new androidx.compose.foundation.text.input.internal.k(context, y0Var2, dVar, 13);
                        rVar8.l0(objQ9);
                    }
                    androidx.compose.runtime.j0.c(rVar8, yVar, (kotlin.jvm.functions.p) objQ9);
                    String strH = ((String) y0Var2.getValue()).length() > 0 ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Cache size: ", (String) y0Var2.getValue()) : "Clear temporary files";
                    androidx.compose.ui.graphics.vector.f fVarB = com.google.firebase.b.b;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.DeleteSweep", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(15.0f, 16.0f);
                        gVar.l(4.0f);
                        gVar.s(2.0f);
                        gVar.l(-4.0f);
                        gVar.f();
                        gVar.o(15.0f, 8.0f);
                        gVar.l(7.0f);
                        gVar.s(2.0f);
                        gVar.l(-7.0f);
                        gVar.f();
                        gVar.o(15.0f, 12.0f);
                        gVar.l(6.0f);
                        gVar.s(2.0f);
                        gVar.l(-6.0f);
                        gVar.f();
                        gVar.o(3.0f, 18.0f);
                        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar.l(6.0f);
                        gVar.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar.m(13.0f, 8.0f);
                        gVar.m(3.0f, 8.0f);
                        gVar.s(10.0f);
                        gVar.f();
                        gVar.o(14.0f, 5.0f);
                        gVar.l(-3.0f);
                        gVar.n(-1.0f, -1.0f);
                        gVar.m(6.0f, 4.0f);
                        gVar.m(5.0f, 5.0f);
                        gVar.m(2.0f, 5.0f);
                        gVar.s(2.0f);
                        gVar.l(12.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
                        fVarB = eVar.b();
                        com.google.firebase.b.b = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar3 = fVarB;
                    boolean zH4 = rVar8.h(context);
                    Object objQ10 = rVar8.Q();
                    if (zH4 || objQ10 == fVar) {
                        objQ10 = new com.app.mlounge.ui.screens.settings.x(context, y0Var2, 0);
                        rVar8.l0(objQ10);
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Clear Cache", strH, fVar3, null, (kotlin.jvm.functions.a) objQ10, rVar8, 6, 8);
                } else {
                    rVar8.W();
                }
                return yVar;
            case 10:
                TmdbTvDetailResponse tmdbTvDetailResponse = (TmdbTvDetailResponse) obj5;
                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar9.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String strL = tmdbTvDetailResponse.l();
                    if (strL == null) {
                        rVar9.b0(909396742);
                        rVar9.p(false);
                    } else {
                        rVar9.b0(909396743);
                        androidx.compose.ui.r rVarQ3 = androidx.compose.foundation.layout.b.q(oVar, 16, 0.0f, 2);
                        androidx.compose.foundation.layout.v vVarA4 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar9, 0);
                        int iHashCode4 = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL4 = rVar9.l();
                        androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar9, rVarQ3);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar6 = androidx.compose.ui.node.f.b;
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(yVar6);
                        } else {
                            rVar9.o0();
                        }
                        androidx.compose.runtime.s.x(rVar9, vVarA4, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar9, jVarL4, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar9, Integer.valueOf(iHashCode4), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar9, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar9, rVarC4, androidx.compose.ui.node.f.c);
                        androidx.compose.foundation.layout.b.d(rVar9, androidx.compose.foundation.layout.w0.f(oVar, 12));
                        androidx.compose.runtime.u2 u2Var3 = u3.a;
                        p3.b("Synopsis", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar9.j(u2Var3)).h, rVar9, 390, 0, 131066);
                        p3.b(strL, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar9.j(u2Var3)).k, rVar9, 384, 0, 131066);
                        rVar9.p(true);
                        rVar9.p(false);
                    }
                } else {
                    rVar9.W();
                }
                return yVar;
            case 11:
                TmdbCreator tmdbCreator = (TmdbCreator) obj5;
                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!rVar10.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    rVar10.W();
                } else if (tmdbCreator == null) {
                    rVar10.b0(1953148348);
                    rVar10.p(false);
                } else {
                    rVar10.b0(1953148349);
                    p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("Creator: ", tmdbCreator.a()), androidx.compose.foundation.layout.b.p(oVar, 16, 8), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar10.j(u3.a)).k, rVar10, 432, 0, 131064);
                    rVar10.p(false);
                }
                return yVar;
            case 12:
                return CancellableContinuationImpl.resume$lambda$13$lambda$12((kotlin.jvm.functions.l) obj5, (Throwable) obj, obj2, (kotlin.coroutines.i) obj3);
            case 13:
                return MutexImpl.onSelectCancellationUnlockConstructor$lambda$1((MutexImpl) obj5, (SelectInstance) obj, obj2, obj3);
            default:
                return SemaphoreAndMutexImpl.onCancellationRelease$lambda$2((SemaphoreAndMutexImpl) obj5, (Throwable) obj, (kotlin.y) obj2, (kotlin.coroutines.i) obj3);
        }
    }
}
