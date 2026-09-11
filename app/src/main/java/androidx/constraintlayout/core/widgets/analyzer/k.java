package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        float f;
        int iG;
        int i;
        int iG2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (androidx.constraintlayout.core.g.e(this.j) == 3) {
            androidx.constraintlayout.core.widgets.d dVar2 = this.b;
            l(dVar2.H, dVar2.J, 0);
            return;
        }
        g gVar = this.e;
        boolean z = gVar.j;
        f fVar = this.h;
        f fVar2 = this.i;
        if (z || this.d != 3) {
            f = 0.5f;
        } else {
            androidx.constraintlayout.core.widgets.d dVar3 = this.b;
            int i3 = dVar3.q;
            if (i3 == 2) {
                f = 0.5f;
                androidx.constraintlayout.core.widgets.d dVar4 = dVar3.S;
                if (dVar4 != null) {
                    g gVar2 = dVar4.d.e;
                    if (gVar2.j) {
                        gVar.d((int) ((gVar2.g * dVar3.v) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = dVar3.r;
                if (i4 == 0 || i4 == 3) {
                    m mVar = dVar3.e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.i;
                    boolean z2 = dVar3.H.f != null;
                    boolean z3 = dVar3.I.f != null;
                    boolean z4 = dVar3.J.f != null;
                    boolean z5 = dVar3.K.f != null;
                    f = 0.5f;
                    int i5 = dVar3.W;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = dVar3.V;
                        boolean z6 = fVar3.j;
                        ArrayList arrayList = fVar3.l;
                        int[] iArr = k;
                        if (z6 && fVar4.j) {
                            if (fVar.c && fVar2.c) {
                                m(iArr, ((f) fVar.l.get(0)).g + fVar.f, ((f) fVar2.l.get(0)).g - fVar2.f, fVar3.g + fVar3.f, fVar4.g - fVar4.f, f5, i5);
                                gVar.d(iArr[0]);
                                this.b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.j && fVar2.j) {
                            if (!fVar3.c || !fVar4.c) {
                                return;
                            }
                            m(iArr, fVar.g + fVar.f, fVar2.g - fVar2.f, ((f) arrayList.get(0)).g + fVar3.f, ((f) fVar4.l.get(0)).g - fVar4.f, f5, i5);
                            gVar.d(iArr[0]);
                            this.b.e.e.d(iArr[1]);
                        }
                        if (!fVar.c || !fVar2.c || !fVar3.c || !fVar4.c) {
                            return;
                        }
                        m(iArr, ((f) fVar.l.get(0)).g + fVar.f, ((f) fVar2.l.get(0)).g - fVar2.f, ((f) arrayList.get(0)).g + fVar3.f, ((f) fVar4.l.get(0)).g - fVar4.f, f5, i5);
                        gVar.d(iArr[0]);
                        this.b.e.e.d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!fVar.c || !fVar2.c) {
                            return;
                        }
                        float f6 = dVar3.V;
                        int i6 = ((f) fVar.l.get(0)).g + fVar.f;
                        int i7 = ((f) fVar2.l.get(0)).g - fVar2.f;
                        if (i5 == -1 || i5 == 0) {
                            int iG3 = g(i7 - i6, 0);
                            int i8 = (int) ((iG3 * f6) + 0.5f);
                            int iG4 = g(i8, 1);
                            if (i8 != iG4) {
                                iG3 = (int) ((iG4 / f6) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.b.e.e.d(iG4);
                        } else if (i5 == 1) {
                            int iG5 = g(i7 - i6, 0);
                            int i9 = (int) ((iG5 / f6) + 0.5f);
                            int iG6 = g(i9, 1);
                            if (i9 != iG6) {
                                iG5 = (int) ((iG6 * f6) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.b.e.e.d(iG6);
                        }
                    } else if (z3 && z5) {
                        if (!fVar3.c || !fVar4.c) {
                            return;
                        }
                        float f7 = dVar3.V;
                        int i10 = ((f) fVar3.l.get(0)).g + fVar3.f;
                        int i11 = ((f) fVar4.l.get(0)).g - fVar4.f;
                        if (i5 == -1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.b.e.e.d(iG);
                        } else if (i5 == 0) {
                            int iG7 = g(i11 - i10, 1);
                            int i12 = (int) ((iG7 * f7) + 0.5f);
                            int iG8 = g(i12, 0);
                            if (i12 != iG8) {
                                iG7 = (int) ((iG8 / f7) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.b.e.e.d(iG7);
                        } else if (i5 == 1) {
                            iG = g(i11 - i10, 1);
                            i = (int) ((iG / f7) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f7) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.b.e.e.d(iG);
                        }
                    }
                } else {
                    int i13 = dVar3.W;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = dVar3.e.e.g / dVar3.V;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = dVar3.e.e.g;
                            f3 = dVar3.V;
                        }
                        gVar.d(i2);
                        f = 0.5f;
                    } else {
                        f2 = dVar3.e.e.g;
                        f3 = dVar3.V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    gVar.d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = fVar.c;
        ArrayList arrayList2 = fVar.l;
        if (z7) {
            boolean z8 = fVar2.c;
            ArrayList arrayList3 = fVar2.l;
            if (z8) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.d == 3) {
                    androidx.constraintlayout.core.widgets.d dVar5 = this.b;
                    if (dVar5.q == 0 && !dVar5.u()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i14 = fVar5.g + fVar.f;
                        int i15 = fVar6.g + fVar2.f;
                        fVar.d(i14);
                        fVar2.d(i15);
                        gVar.d(i15 - i14);
                        return;
                    }
                }
                if (!gVar.j && this.d == 3 && this.a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((f) arrayList3.get(0)).g + fVar2.f) - (((f) arrayList2.get(0)).g + fVar.f), gVar.m);
                    androidx.constraintlayout.core.widgets.d dVar6 = this.b;
                    int i16 = dVar6.u;
                    int iMax = Math.max(dVar6.t, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    gVar.d(iMax);
                }
                if (gVar.j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i17 = fVar7.g;
                    int i18 = fVar.f + i17;
                    int i19 = fVar8.g;
                    int i20 = fVar2.f + i19;
                    float f8 = this.b.c0;
                    if (fVar7 == fVar8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fVar.d((int) ((((i19 - i17) - gVar.g) * f8) + i17 + f));
                    fVar2.d(fVar.g + gVar.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void d() {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        int i;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        int i2;
        androidx.constraintlayout.core.widgets.d dVar5 = this.b;
        boolean z = dVar5.a;
        g gVar = this.e;
        if (z) {
            gVar.d(dVar5.n());
        }
        boolean z2 = gVar.j;
        ArrayList arrayList = gVar.k;
        ArrayList arrayList2 = gVar.l;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z2) {
            androidx.constraintlayout.core.widgets.d dVar6 = this.b;
            int i3 = dVar6.o0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (dVar4 = dVar6.S) != null && ((i2 = dVar4.o0[0]) == 1 || i2 == 4)) {
                    int iN = (dVar4.n() - this.b.H.e()) - this.b.J.e();
                    o.b(fVar2, dVar4.d.h, this.b.H.e());
                    o.b(fVar, dVar4.d.i, -this.b.J.e());
                    gVar.d(iN);
                    return;
                }
                if (i3 == 1) {
                    gVar.d(dVar6.n());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.b).S) != null && ((i = dVar2.o0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.d.h, dVar.H.e());
            o.b(fVar, dVar2.d.i, -this.b.J.e());
            return;
        }
        if (gVar.j) {
            androidx.constraintlayout.core.widgets.d dVar7 = this.b;
            if (dVar7.a) {
                androidx.constraintlayout.core.widgets.c[] cVarArr = dVar7.P;
                androidx.constraintlayout.core.widgets.c cVar = cVarArr[0];
                androidx.constraintlayout.core.widgets.c cVar2 = cVar.f;
                if (cVar2 != null && cVarArr[1].f != null) {
                    boolean zU = dVar7.u();
                    androidx.constraintlayout.core.widgets.d dVar8 = this.b;
                    if (zU) {
                        fVar2.f = dVar8.P[0].e();
                        fVar.f = -this.b.P[1].e();
                        return;
                    }
                    f fVarH = o.h(dVar8.P[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.b.P[0].e());
                    }
                    f fVarH2 = o.h(this.b.P[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.b.P[1].e());
                    }
                    fVar2.b = true;
                    fVar.b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.b.P[0].e());
                        o.b(fVar, fVar2, gVar.g);
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.c cVar3 = cVarArr[1];
                if (cVar3.f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.b.P[1].e());
                        o.b(fVar2, fVar, -gVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof androidx.constraintlayout.core.widgets.i) || dVar7.S == null || dVar7.i(7).f != null) {
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar9 = this.b;
                o.b(fVar2, dVar9.S.d.h, dVar9.o());
                o.b(fVar, fVar2, gVar.g);
                return;
            }
        }
        if (this.d == 3) {
            androidx.constraintlayout.core.widgets.d dVar10 = this.b;
            int i4 = dVar10.q;
            if (i4 == 2) {
                androidx.constraintlayout.core.widgets.d dVar11 = dVar10.S;
                if (dVar11 != null) {
                    g gVar2 = dVar11.e.e;
                    arrayList2.add(gVar2);
                    gVar2.k.add(gVar);
                    gVar.b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i4 == 3) {
                if (dVar10.r == 3) {
                    fVar2.a = this;
                    fVar.a = this;
                    m mVar = dVar10.e;
                    mVar.h.a = this;
                    mVar.i.a = this;
                    gVar.a = this;
                    if (dVar10.v()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(gVar);
                        m mVar2 = this.b.e;
                        mVar2.e.a = this;
                        arrayList2.add(mVar2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(gVar);
                        this.b.e.i.k.add(gVar);
                    } else {
                        boolean zU2 = this.b.u();
                        androidx.constraintlayout.core.widgets.d dVar12 = this.b;
                        if (zU2) {
                            dVar12.e.e.l.add(gVar);
                            arrayList.add(this.b.e.e);
                        } else {
                            dVar12.e.e.l.add(gVar);
                        }
                    }
                } else {
                    g gVar3 = dVar10.e.e;
                    arrayList2.add(gVar3);
                    gVar3.k.add(gVar);
                    this.b.e.h.k.add(gVar);
                    this.b.e.i.k.add(gVar);
                    gVar.b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.l.add(gVar);
                    fVar.l.add(gVar);
                }
            }
        }
        androidx.constraintlayout.core.widgets.d dVar13 = this.b;
        androidx.constraintlayout.core.widgets.c[] cVarArr2 = dVar13.P;
        androidx.constraintlayout.core.widgets.c cVar4 = cVarArr2[0];
        androidx.constraintlayout.core.widgets.c cVar5 = cVar4.f;
        if (cVar5 != null && cVarArr2[1].f != null) {
            boolean zU3 = dVar13.u();
            androidx.constraintlayout.core.widgets.d dVar14 = this.b;
            if (zU3) {
                fVar2.f = dVar14.P[0].e();
                fVar.f = -this.b.P[1].e();
                return;
            }
            f fVarH5 = o.h(dVar14.P[0]);
            f fVarH6 = o.h(this.b.P[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = o.h(cVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.b.P[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        androidx.constraintlayout.core.widgets.c cVar6 = cVarArr2[1];
        if (cVar6.f != null) {
            f fVarH8 = o.h(cVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.b.P[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar13 instanceof androidx.constraintlayout.core.widgets.i) || (dVar3 = dVar13.S) == null) {
            return;
        }
        o.b(fVar2, dVar3.d.h, dVar13.o());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.b.X = fVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final boolean k() {
        return this.d != 3 || this.b.q == 0;
    }

    public final void n() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.g0;
    }
}
