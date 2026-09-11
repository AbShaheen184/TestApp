package androidx.compose.foundation.contextmenu;

import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.s;
import androidx.compose.foundation.text.selection.j1;
import androidx.compose.foundation.text.selection.k1;
import androidx.compose.material3.f1;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.layout.b1;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.o;
import kotlin.collections.v;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements q {
    public final /* synthetic */ int e;

    public /* synthetic */ b(int i) {
        this.e = i;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        v vVar = v.e;
        o oVar = o.b;
        y yVar = y.a;
        final int i2 = 1;
        boolean z = false;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                r rVar = (r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= rVar.f(dVar) ? 4 : 2;
                }
                if (rVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    p.a(s.f(w0.f(w0.d(androidx.compose.foundation.layout.b.q(oVar, 0.0f, h.l, 1), 1.0f), h.k), dVar.c, a0.b), rVar, 0);
                } else {
                    rVar.W();
                }
                return yVar;
            case 1:
                androidx.compose.ui.r rVar2 = (androidx.compose.ui.r) obj;
                r rVar3 = (r) obj2;
                ((Integer) obj3).getClass();
                rVar3.b0(-2126899193);
                long j = ((j1) rVar3.j(k1.a)).a;
                boolean zE = rVar3.e(j);
                Object objQ = rVar3.Q();
                if (zE || objQ == m.a) {
                    objQ = new androidx.compose.foundation.text.c(j, z ? 1 : 0);
                    rVar3.l0(objQ);
                }
                androidx.compose.ui.r rVarD = rVar2.d(androidx.compose.ui.draw.h.d(oVar, (kotlin.jvm.functions.l) objQ));
                rVar3.p(false);
                return rVarD;
            case 2:
                s0 s0Var = (s0) obj;
                final int iG0 = s0Var.g0(androidx.compose.material3.internal.b.a);
                int i3 = iG0 * 2;
                final c1 c1VarF = ((p0) obj2).F(androidx.compose.ui.unit.b.i(i3, 0, ((androidx.compose.ui.unit.a) obj3).a));
                return s0Var.q(c1VarF.e - i3, c1VarF.y, vVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.internal.a
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj4) {
                        b1 b1Var = (b1) obj4;
                        switch (i2) {
                            case 0:
                                b1.i(b1Var, c1VarF, 0, -iG0);
                                break;
                            default:
                                b1.i(b1Var, c1VarF, -iG0, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                });
            case 3:
                s0 s0Var2 = (s0) obj;
                final int iG1 = s0Var2.g0(androidx.compose.material3.internal.b.b);
                int i4 = iG1 * 2;
                final c1 c1VarF2 = ((p0) obj2).F(androidx.compose.ui.unit.b.i(0, i4, ((androidx.compose.ui.unit.a) obj3).a));
                int i5 = c1VarF2.y - i4;
                int i6 = c1VarF2.e;
                final int i7 = z ? 1 : 0;
                return s0Var2.q(i6, i5, vVar, new kotlin.jvm.functions.l() { // from class: androidx.compose.material3.internal.a
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj4) {
                        b1 b1Var = (b1) obj4;
                        switch (i7) {
                            case 0:
                                b1.i(b1Var, c1VarF2, 0, -iG1);
                                break;
                            default:
                                b1.i(b1Var, c1VarF2, -iG1, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                });
            case 4:
                r rVar4 = (r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    p3.b("Cancel", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar4, 6, 0, 262138);
                } else {
                    rVar4.W();
                }
                return yVar;
            case 5:
                r rVar5 = (r) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    p3.b("Confirm", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar5, 390, 0, 262138);
                } else {
                    rVar5.W();
                }
                return yVar;
            case 6:
                r rVar6 = (r) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar6.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p3.b("Cancel", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar6, 390, 0, 262138);
                } else {
                    rVar6.W();
                }
                return yVar;
            case 7:
                r rVar7 = (r) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar7.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p3.b("Retry", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar7, 6, 0, 262142);
                } else {
                    rVar7.W();
                }
                return yVar;
            case 8:
                r rVar8 = (r) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar8.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 16);
                    q0 q0VarD = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL = rVar8.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar8, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar2);
                    } else {
                        rVar8.o0();
                    }
                    androidx.compose.runtime.s.x(rVar8, q0VarD, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar8, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar8, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar8, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar8, rVarC, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar8, 54, 60);
                    rVar8.p(true);
                } else {
                    rVar8.W();
                }
                return yVar;
            case 9:
                r rVar9 = (r) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar9.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    androidx.compose.foundation.layout.b.d(rVar9, w0.f(oVar, 32));
                } else {
                    rVar9.W();
                }
                return yVar;
            case 10:
                r rVar10 = (r) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar10.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 16);
                    q0 q0VarD2 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode2 = Long.hashCode(rVar10.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar10.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar10, rVarO2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar10.e0();
                    if (rVar10.S) {
                        rVar10.k(yVar3);
                    } else {
                        rVar10.o0();
                    }
                    androidx.compose.runtime.s.x(rVar10, q0VarD2, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar10, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar10, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar10, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar10, rVarC2, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar10, 54, 60);
                    rVar10.p(true);
                } else {
                    rVar10.W();
                }
                return yVar;
            case 11:
                r rVar11 = (r) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar11.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    p3.b("Delete", null, a0.d(4294198070L), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar11, 390, 0, 262138);
                } else {
                    rVar11.W();
                }
                return yVar;
            case 12:
                r rVar12 = (r) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar12.T(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                    p3.b("Cancel", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar12, 390, 0, 262138);
                } else {
                    rVar12.W();
                }
                return yVar;
            case 13:
                r rVar13 = (r) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar13.T(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    androidx.compose.ui.r rVarO3 = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 16);
                    q0 q0VarD3 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode3 = Long.hashCode(rVar13.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar13.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar13, rVarO3);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                    rVar13.e0();
                    if (rVar13.S) {
                        rVar13.k(yVar4);
                    } else {
                        rVar13.o0();
                    }
                    androidx.compose.runtime.s.x(rVar13, q0VarD3, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar13, jVarL3, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar13, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar13, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar13, rVarC3, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), ((n0) rVar13.j(o0.a)).a, 0.0f, 0L, 0, 0.0f, rVar13, 6, 60);
                    rVar13.p(true);
                } else {
                    rVar13.W();
                }
                return yVar;
            case 14:
                r rVar14 = (r) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar14.T(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    p3.b("Clear All", null, com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar14, 390, 0, 262138);
                } else {
                    rVar14.W();
                }
                return yVar;
            case 15:
                r rVar15 = (r) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar15.T(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    androidx.compose.ui.r rVarO4 = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 16);
                    q0 q0VarD4 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode4 = Long.hashCode(rVar15.T);
                    androidx.compose.runtime.internal.j jVarL4 = rVar15.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar15, rVarO4);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar5 = androidx.compose.ui.node.f.b;
                    rVar15.e0();
                    if (rVar15.S) {
                        rVar15.k(yVar5);
                    } else {
                        rVar15.o0();
                    }
                    androidx.compose.runtime.s.x(rVar15, q0VarD4, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar15, jVarL4, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar15, Integer.valueOf(iHashCode4), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar15, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar15, rVarC4, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), ((n0) rVar15.j(o0.a)).a, 0.0f, 0L, 0, 0.0f, rVar15, 6, 60);
                    rVar15.p(true);
                } else {
                    rVar15.W();
                }
                return yVar;
            case 16:
                r rVar16 = (r) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar16.T(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                    p3.b("Discography", androidx.compose.foundation.layout.b.o(oVar, 16), t.d, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar16.j(u3.a)).h, rVar16, 438, 0, 131064);
                } else {
                    rVar16.W();
                }
                return yVar;
            case 17:
                r rVar17 = (r) obj2;
                int iIntValue15 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar17.T(iIntValue15 & 1, (iIntValue15 & 17) != 16)) {
                    androidx.compose.ui.r rVarO5 = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 16);
                    q0 q0VarD5 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode5 = Long.hashCode(rVar17.T);
                    androidx.compose.runtime.internal.j jVarL5 = rVar17.l();
                    androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar17, rVarO5);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar6 = androidx.compose.ui.node.f.b;
                    rVar17.e0();
                    if (rVar17.S) {
                        rVar17.k(yVar6);
                    } else {
                        rVar17.o0();
                    }
                    androidx.compose.runtime.s.x(rVar17, q0VarD5, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar17, jVarL5, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar17, Integer.valueOf(iHashCode5), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar17, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar17, rVarC5, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar17, 54, 60);
                    rVar17.p(true);
                } else {
                    rVar17.W();
                }
                return yVar;
            case 18:
                r rVar18 = (r) obj2;
                int iIntValue16 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar18.T(iIntValue16 & 1, (iIntValue16 & 17) != 16)) {
                    p3.b("Reset", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar18, 390, 0, 262138);
                } else {
                    rVar18.W();
                }
                return yVar;
            case 19:
                r rVar19 = (r) obj2;
                int iIntValue17 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar19.T(iIntValue17 & 1, (iIntValue17 & 17) != 16)) {
                    androidx.compose.ui.r rVarO6 = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 16);
                    q0 q0VarD6 = p.d(androidx.compose.ui.c.B, false);
                    int iHashCode6 = Long.hashCode(rVar19.T);
                    androidx.compose.runtime.internal.j jVarL6 = rVar19.l();
                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar19, rVarO6);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar7 = androidx.compose.ui.node.f.b;
                    rVar19.e0();
                    if (rVar19.S) {
                        rVar19.k(yVar7);
                    } else {
                        rVar19.o0();
                    }
                    androidx.compose.runtime.s.x(rVar19, q0VarD6, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar19, jVarL6, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar19, Integer.valueOf(iHashCode6), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar19, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar19, rVarC6, androidx.compose.ui.node.f.c);
                    o2.a(w0.l(oVar, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar19, 54, 60);
                    rVar19.p(true);
                } else {
                    rVar19.W();
                }
                return yVar;
            case 20:
                r rVar20 = (r) obj2;
                int iIntValue18 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar20.T(iIntValue18 & 1, (iIntValue18 & 17) != 16)) {
                    p3.b("Open API Keys page", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar20.j(u3.a)).l, rVar20, 390, 0, 131066);
                } else {
                    rVar20.W();
                }
                return yVar;
            case 21:
                r rVar21 = (r) obj2;
                int iIntValue19 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar21.T(iIntValue19 & 1, (iIntValue19 & 17) != 16)) {
                    p3.b("OPEN AUTHORIZATION PAGE", null, com.app.mlounge.ui.theme.b.f, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, null, rVar21, 1573254, 0, 262074);
                } else {
                    rVar21.W();
                }
                return yVar;
            case 22:
                r rVar22 = (r) obj2;
                int iIntValue20 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar22.T(iIntValue20 & 1, (iIntValue20 & 17) != 16)) {
                    p3.b("CANCEL", null, com.app.mlounge.ui.theme.b.m, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, null, rVar22, 1573254, 0, 262074);
                } else {
                    rVar22.W();
                }
                return yVar;
            case 23:
                r rVar23 = (r) obj2;
                int iIntValue21 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar23.T(iIntValue21 & 1, (iIntValue21 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.a.a;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("AutoMirrored.Filled.Logout", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i8 = h0.a;
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(17.0f, 7.0f);
                        gVar.n(-1.41f, 1.41f);
                        gVar.m(18.17f, 11.0f);
                        gVar.k(8.0f);
                        gVar.s(2.0f);
                        gVar.l(10.17f);
                        gVar.n(-2.58f, 2.58f);
                        gVar.m(17.0f, 17.0f);
                        gVar.n(5.0f, -5.0f);
                        gVar.f();
                        gVar.o(4.0f, 5.0f);
                        gVar.l(8.0f);
                        gVar.r(3.0f);
                        gVar.k(4.0f);
                        gVar.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVar.s(14.0f);
                        gVar.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar.l(8.0f);
                        gVar.s(-2.0f);
                        gVar.k(4.0f);
                        gVar.r(5.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar.a, 0, p0Var);
                        fVarB = eVar.b();
                        _COROUTINE.a.a = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar = fVarB;
                    long j2 = com.app.mlounge.ui.theme.b.o;
                    f1.b(fVar, null, w0.l(oVar, 18), j2, rVar23, 3504, 0);
                    androidx.compose.foundation.layout.b.d(rVar23, w0.p(oVar, 4));
                    p3.b("Logout", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar23, 390, 0, 262138);
                } else {
                    rVar23.W();
                }
                return yVar;
            case 24:
                r rVar24 = (r) obj2;
                int iIntValue22 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar24.T(iIntValue22 & 1, (iIntValue22 & 17) != 16)) {
                    p3.b("Don't have an account? Sign up", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar24.j(u3.a)).l, rVar24, 390, 0, 131066);
                } else {
                    rVar24.W();
                }
                return yVar;
            case 25:
                r rVar25 = (r) obj2;
                int iIntValue23 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar25.T(iIntValue23 & 1, (iIntValue23 & 17) != 16)) {
                    rVar25.b0(-1605114917);
                    rVar25.p(false);
                    p3.b("Sign In", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar25, 0, 0, 262142);
                } else {
                    rVar25.W();
                }
                return yVar;
            case 26:
                r rVar26 = (r) obj2;
                int iIntValue24 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar26.T(iIntValue24 & 1, (iIntValue24 & 17) != 16)) {
                    p3.b("Grant Permission", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar26, 6, 0, 262138);
                } else {
                    rVar26.W();
                }
                return yVar;
            case 27:
                r rVar27 = (r) obj2;
                int iIntValue25 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar27.T(iIntValue25 & 1, (iIntValue25 & 17) != 16)) {
                    p3.b("Continue", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar27, 6, 0, 262138);
                } else {
                    rVar27.W();
                }
                return yVar;
            case 28:
                r rVar28 = (r) obj2;
                int iIntValue26 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar28.T(iIntValue26 & 1, (iIntValue26 & 17) != 16)) {
                    p3.b("Cancel", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar28, 6, 0, 262138);
                } else {
                    rVar28.W();
                }
                return yVar;
            default:
                r rVar29 = (r) obj2;
                int iIntValue27 = ((Integer) obj3).intValue();
                ((u0) obj).getClass();
                if (rVar29.T(iIntValue27 & 1, (iIntValue27 & 17) != 16)) {
                    p3.b("Cancel", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar29, 6, 0, 262138);
                } else {
                    rVar29.W();
                }
                return yVar;
        }
    }
}
