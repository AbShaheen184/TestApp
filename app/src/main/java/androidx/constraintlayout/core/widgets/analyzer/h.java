package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final b a = new b();

    public static boolean a(androidx.constraintlayout.core.widgets.d dVar) {
        int[] iArr = dVar.o0;
        int i = iArr[0];
        int i2 = iArr[1];
        androidx.constraintlayout.core.widgets.d dVar2 = dVar.S;
        androidx.constraintlayout.core.widgets.e eVar = dVar2 != null ? (androidx.constraintlayout.core.widgets.e) dVar2 : null;
        if (eVar != null) {
            int i3 = eVar.o0[0];
        }
        if (eVar != null) {
            int i4 = eVar.o0[1];
        }
        boolean z = i == 1 || dVar.x() || i == 2 || (i == 3 && dVar.q == 0 && dVar.V == 0.0f && dVar.q(0)) || (i == 3 && dVar.q == 1 && dVar.r(0, dVar.n()));
        boolean z2 = i2 == 1 || dVar.y() || i2 == 2 || (i2 == 3 && dVar.r == 0 && dVar.V == 0.0f && dVar.q(1)) || (i == 3 && dVar.r == 1 && dVar.r(1, dVar.k()));
        return (dVar.V > 0.0f && (z || z2)) || (z && z2);
    }

    public static n b(androidx.constraintlayout.core.widgets.d dVar, int i, ArrayList arrayList, n nVar) {
        int i2;
        int i3 = i == 0 ? dVar.m0 : dVar.n0;
        if (i3 != -1 && (nVar == null || i3 != nVar.b)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                n nVar2 = (n) arrayList.get(i4);
                if (nVar2.b == i3) {
                    if (nVar != null) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                    break;
                }
            }
        } else if (i3 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof androidx.constraintlayout.core.widgets.i) {
                androidx.constraintlayout.core.widgets.i iVar = (androidx.constraintlayout.core.widgets.i) dVar;
                int i5 = 0;
                while (true) {
                    if (i5 >= iVar.q0) {
                        i2 = -1;
                        break;
                    }
                    androidx.constraintlayout.core.widgets.d dVar2 = iVar.p0[i5];
                    if ((i == 0 && (i2 = dVar2.m0) != -1) || (i == 1 && (i2 = dVar2.n0) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        n nVar3 = (n) arrayList.get(i6);
                        if (nVar3.b == i2) {
                            nVar = nVar3;
                            break;
                        }
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.a = new ArrayList();
                nVar.d = null;
                nVar.e = -1;
                int i7 = n.f;
                n.f = i7 + 1;
                nVar.b = i7;
                nVar.c = i;
            }
            arrayList.add(nVar);
        }
        ArrayList arrayList2 = nVar.a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof androidx.constraintlayout.core.widgets.h) {
            androidx.constraintlayout.core.widgets.h hVar = (androidx.constraintlayout.core.widgets.h) dVar;
            hVar.s0.c(hVar.t0 == 0 ? 1 : 0, nVar, arrayList);
        }
        int i8 = nVar.b;
        if (i == 0) {
            dVar.m0 = i8;
            dVar.H.c(i, nVar, arrayList);
            dVar.J.c(i, nVar, arrayList);
        } else {
            dVar.n0 = i8;
            dVar.I.c(i, nVar, arrayList);
            dVar.L.c(i, nVar, arrayList);
            dVar.K.c(i, nVar, arrayList);
        }
        dVar.O.c(i, nVar, arrayList);
        return nVar;
    }

    public static void c(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar, boolean z) {
        androidx.constraintlayout.core.widgets.c cVar;
        androidx.constraintlayout.core.widgets.c cVar2;
        char c;
        androidx.constraintlayout.core.widgets.c cVar3;
        androidx.constraintlayout.core.widgets.c cVar4;
        androidx.constraintlayout.core.widgets.c cVar5;
        if (dVar.l) {
            return;
        }
        if (!(dVar instanceof androidx.constraintlayout.core.widgets.e) && dVar.w() && a(dVar)) {
            androidx.constraintlayout.core.widgets.e.Q(dVar, fVar, new b());
        }
        androidx.constraintlayout.core.widgets.c cVarI = dVar.i(2);
        androidx.constraintlayout.core.widgets.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<androidx.constraintlayout.core.widgets.c> hashSet = cVarI.a;
        if (hashSet != null && cVarI.c) {
            for (androidx.constraintlayout.core.widgets.c cVar6 : hashSet) {
                androidx.constraintlayout.core.widgets.d dVar2 = cVar6.d;
                int i2 = i + 1;
                boolean zA = a(dVar2);
                androidx.constraintlayout.core.widgets.c cVar7 = dVar2.H;
                androidx.constraintlayout.core.widgets.c cVar8 = dVar2.J;
                if (dVar2.w() && zA) {
                    c = 0;
                    androidx.constraintlayout.core.widgets.e.Q(dVar2, fVar, new b());
                } else {
                    c = 0;
                }
                int i3 = dVar2.o0[c];
                if (i3 != 3 || zA) {
                    if (!dVar2.w()) {
                        if (cVar6 == cVar7 && cVar8.f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.E(iE, dVar2.n() + iE);
                            c(i2, dVar2, fVar, z);
                        } else if (cVar6 == cVar8 && cVar7.f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.E(iE2 - dVar2.n(), iE2);
                            c(i2, dVar2, fVar, z);
                        } else if (cVar6 == cVar7 && (cVar3 = cVar8.f) != null && cVar3.c && !dVar2.u()) {
                            d(i2, dVar2, fVar, z);
                        }
                    }
                } else if (i3 == 3 && dVar2.u >= 0 && dVar2.t >= 0 && (dVar2.f0 == 8 || (dVar2.q == 0 && dVar2.V == 0.0f))) {
                    if (!dVar2.u() && !dVar2.E && ((cVar6 == cVar7 && (cVar5 = cVar8.f) != null && cVar5.c) || (cVar6 == cVar8 && (cVar4 = cVar7.f) != null && cVar4.c))) {
                        if (!dVar2.u()) {
                            e(i2, dVar, fVar, dVar2, z);
                        }
                    }
                }
            }
        }
        if (dVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        HashSet<androidx.constraintlayout.core.widgets.c> hashSet2 = cVarI2.a;
        if (hashSet2 != null && cVarI2.c) {
            for (androidx.constraintlayout.core.widgets.c cVar9 : hashSet2) {
                androidx.constraintlayout.core.widgets.d dVar3 = cVar9.d;
                int i4 = i + 1;
                boolean zA2 = a(dVar3);
                androidx.constraintlayout.core.widgets.c cVar10 = dVar3.H;
                androidx.constraintlayout.core.widgets.c cVar11 = dVar3.J;
                if (dVar3.w() && zA2) {
                    androidx.constraintlayout.core.widgets.e.Q(dVar3, fVar, new b());
                }
                boolean z2 = (cVar9 == cVar10 && (cVar2 = cVar11.f) != null && cVar2.c) || (cVar9 == cVar11 && (cVar = cVar10.f) != null && cVar.c);
                int i5 = dVar3.o0[0];
                if (i5 != 3 || zA2) {
                    if (!dVar3.w()) {
                        if (cVar9 == cVar10 && cVar11.f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.E(iE3, dVar3.n() + iE3);
                            c(i4, dVar3, fVar, z);
                        } else if (cVar9 == cVar11 && cVar10.f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.E(iE4 - dVar3.n(), iE4);
                            c(i4, dVar3, fVar, z);
                        } else if (z2 && !dVar3.u()) {
                            d(i4, dVar3, fVar, z);
                        }
                    }
                } else if (i5 == 3 && dVar3.u >= 0 && dVar3.t >= 0 && (dVar3.f0 == 8 || (dVar3.q == 0 && dVar3.V == 0.0f))) {
                    if (!dVar3.u() && !dVar3.E && z2 && !dVar3.u()) {
                        e(i4, dVar, fVar, dVar3, z);
                    }
                }
            }
        }
        dVar.l = true;
    }

    public static void d(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar, boolean z) {
        float f = dVar.c0;
        androidx.constraintlayout.core.widgets.c cVar = dVar.H;
        int iD = cVar.f.d();
        androidx.constraintlayout.core.widgets.c cVar2 = dVar.J;
        int iD2 = cVar2.f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iN = dVar.n();
        int i2 = (iD2 - iD) - iN;
        if (iD > iD2) {
            i2 = (iD - iD2) - iN;
        }
        int i3 = ((int) (i2 > 0 ? (f * i2) + 0.5f : f * i2)) + iD;
        int i4 = i3 + iN;
        if (iD > iD2) {
            i4 = i3 - iN;
        }
        dVar.E(i3, i4);
        c(i + 1, dVar, fVar, z);
    }

    public static void e(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar, androidx.constraintlayout.core.widgets.d dVar2, boolean z) {
        float f = dVar2.c0;
        androidx.constraintlayout.core.widgets.c cVar = dVar2.H;
        int iE = cVar.e() + cVar.f.d();
        androidx.constraintlayout.core.widgets.c cVar2 = dVar2.J;
        int iD = cVar2.f.d() - cVar2.e();
        if (iD >= iE) {
            int iN = dVar2.n();
            if (dVar2.f0 != 8) {
                int i2 = dVar2.q;
                if (i2 == 2) {
                    iN = (int) (dVar2.c0 * 0.5f * (dVar instanceof androidx.constraintlayout.core.widgets.e ? dVar.n() : dVar.S.n()));
                } else if (i2 == 0) {
                    iN = iD - iE;
                }
                iN = Math.max(dVar2.t, iN);
                int i3 = dVar2.u;
                if (i3 > 0) {
                    iN = Math.min(i3, iN);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iN)) + 0.5f));
            dVar2.E(i4, iN + i4);
            c(i + 1, dVar2, fVar, z);
        }
    }

    public static void f(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar) {
        float f = dVar.d0;
        androidx.constraintlayout.core.widgets.c cVar = dVar.I;
        int iD = cVar.f.d();
        androidx.constraintlayout.core.widgets.c cVar2 = dVar.K;
        int iD2 = cVar2.f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i2 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i2 = (iD - iD2) - iK;
        }
        int i3 = (int) (i2 > 0 ? (f * i2) + 0.5f : f * i2);
        int i4 = iD + i3;
        int i5 = i4 + iK;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iK;
        }
        dVar.F(i4, i5);
        i(i + 1, dVar, fVar);
    }

    public static void g(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar, androidx.constraintlayout.core.widgets.d dVar2) {
        float f = dVar2.d0;
        androidx.constraintlayout.core.widgets.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f.d();
        androidx.constraintlayout.core.widgets.c cVar2 = dVar2.K;
        int iD = cVar2.f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f0 != 8) {
                int i2 = dVar2.r;
                if (i2 == 2) {
                    iK = (int) (f * 0.5f * (dVar instanceof androidx.constraintlayout.core.widgets.e ? dVar.k() : dVar.S.k()));
                } else if (i2 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.w, iK);
                int i3 = dVar2.x;
                if (i3 > 0) {
                    iK = Math.min(i3, iK);
                }
            }
            int i4 = iE + ((int) ((f * ((iD - iE) - iK)) + 0.5f));
            dVar2.F(i4, iK + i4);
            i(i + 1, dVar2, fVar);
        }
    }

    public static boolean h(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static void i(int i, androidx.constraintlayout.core.widgets.d dVar, androidx.constraintlayout.widget.f fVar) {
        androidx.constraintlayout.core.widgets.c cVar;
        androidx.constraintlayout.core.widgets.c cVar2;
        float f;
        androidx.constraintlayout.core.widgets.c cVar3;
        androidx.constraintlayout.core.widgets.c cVar4;
        androidx.constraintlayout.core.widgets.c cVar5;
        if (dVar.m) {
            return;
        }
        if (!(dVar instanceof androidx.constraintlayout.core.widgets.e) && dVar.w() && a(dVar)) {
            androidx.constraintlayout.core.widgets.e.Q(dVar, fVar, new b());
        }
        androidx.constraintlayout.core.widgets.c cVarI = dVar.i(3);
        androidx.constraintlayout.core.widgets.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<androidx.constraintlayout.core.widgets.c> hashSet = cVarI.a;
        if (hashSet != null && cVarI.c) {
            for (androidx.constraintlayout.core.widgets.c cVar6 : hashSet) {
                androidx.constraintlayout.core.widgets.d dVar2 = cVar6.d;
                int i2 = i + 1;
                boolean zA = a(dVar2);
                androidx.constraintlayout.core.widgets.c cVar7 = dVar2.I;
                androidx.constraintlayout.core.widgets.c cVar8 = dVar2.K;
                if (dVar2.w() && zA) {
                    f = 0.0f;
                    androidx.constraintlayout.core.widgets.e.Q(dVar2, fVar, new b());
                } else {
                    f = 0.0f;
                }
                int i3 = dVar2.o0[1];
                if (i3 != 3 || zA) {
                    if (!dVar2.w()) {
                        if (cVar6 == cVar7 && cVar8.f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.F(iE, dVar2.k() + iE);
                            i(i2, dVar2, fVar);
                        } else if (cVar6 == cVar8 && cVar8.f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.F(iE2 - dVar2.k(), iE2);
                            i(i2, dVar2, fVar);
                        } else if (cVar6 == cVar7 && (cVar3 = cVar8.f) != null && cVar3.c) {
                            f(i2, dVar2, fVar);
                        }
                    }
                } else if (i3 == 3 && dVar2.x >= 0 && dVar2.w >= 0 && (dVar2.f0 == 8 || (dVar2.r == 0 && dVar2.V == f))) {
                    if (!dVar2.v() && !dVar2.E && ((cVar6 == cVar7 && (cVar5 = cVar8.f) != null && cVar5.c) || (cVar6 == cVar8 && (cVar4 = cVar7.f) != null && cVar4.c))) {
                        if (!dVar2.v()) {
                            g(i2, dVar, fVar, dVar2);
                        }
                    }
                }
            }
        }
        if (dVar instanceof androidx.constraintlayout.core.widgets.h) {
            return;
        }
        HashSet<androidx.constraintlayout.core.widgets.c> hashSet2 = cVarI2.a;
        if (hashSet2 != null && cVarI2.c) {
            for (androidx.constraintlayout.core.widgets.c cVar9 : hashSet2) {
                androidx.constraintlayout.core.widgets.d dVar3 = cVar9.d;
                int i4 = i + 1;
                boolean zA2 = a(dVar3);
                androidx.constraintlayout.core.widgets.c cVar10 = dVar3.I;
                androidx.constraintlayout.core.widgets.c cVar11 = dVar3.K;
                if (dVar3.w() && zA2) {
                    androidx.constraintlayout.core.widgets.e.Q(dVar3, fVar, new b());
                }
                boolean z = (cVar9 == cVar10 && (cVar2 = cVar11.f) != null && cVar2.c) || (cVar9 == cVar11 && (cVar = cVar10.f) != null && cVar.c);
                int i5 = dVar3.o0[1];
                if (i5 != 3 || zA2) {
                    if (!dVar3.w()) {
                        if (cVar9 == cVar10 && cVar11.f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.F(iE3, dVar3.k() + iE3);
                            i(i4, dVar3, fVar);
                        } else if (cVar9 == cVar11 && cVar10.f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.F(iE4 - dVar3.k(), iE4);
                            i(i4, dVar3, fVar);
                        } else if (z && !dVar3.v()) {
                            f(i4, dVar3, fVar);
                        }
                    }
                } else if (i5 == 3 && dVar3.x >= 0 && dVar3.w >= 0 && (dVar3.f0 == 8 || (dVar3.r == 0 && dVar3.V == 0.0f))) {
                    if (!dVar3.v() && !dVar3.E && z && !dVar3.v()) {
                        g(i4, dVar, fVar, dVar3);
                    }
                }
            }
        }
        androidx.constraintlayout.core.widgets.c cVarI3 = dVar.i(6);
        if (cVarI3.a != null && cVarI3.c) {
            int iD3 = cVarI3.d();
            for (androidx.constraintlayout.core.widgets.c cVar12 : cVarI3.a) {
                androidx.constraintlayout.core.widgets.d dVar4 = cVar12.d;
                int i6 = i + 1;
                boolean zA3 = a(dVar4);
                androidx.constraintlayout.core.widgets.c cVar13 = dVar4.L;
                if (dVar4.w() && zA3) {
                    androidx.constraintlayout.core.widgets.e.Q(dVar4, fVar, new b());
                }
                if (dVar4.o0[1] != 3 || zA3) {
                    if (!dVar4.w() && cVar12 == cVar13) {
                        int iE5 = cVar12.e() + iD3;
                        if (dVar4.D) {
                            int i7 = iE5 - dVar4.Z;
                            int i8 = dVar4.U + i7;
                            dVar4.Y = i7;
                            dVar4.I.l(i7);
                            dVar4.K.l(i8);
                            cVar13.l(iE5);
                            dVar4.k = true;
                        }
                        i(i6, dVar4, fVar);
                    }
                }
            }
        }
        dVar.m = true;
    }
}
