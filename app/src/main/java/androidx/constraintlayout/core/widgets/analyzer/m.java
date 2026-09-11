package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {
    public f k;
    public a l;

    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        float f;
        float f2;
        float f3;
        int i;
        if (androidx.constraintlayout.core.g.e(this.j) == 3) {
            androidx.constraintlayout.core.widgets.d dVar2 = this.b;
            l(dVar2.I, dVar2.K, 1);
            return;
        }
        g gVar = this.e;
        if (gVar.c && !gVar.j && this.d == 3) {
            androidx.constraintlayout.core.widgets.d dVar3 = this.b;
            int i2 = dVar3.r;
            if (i2 == 2) {
                androidx.constraintlayout.core.widgets.d dVar4 = dVar3.S;
                if (dVar4 != null) {
                    g gVar2 = dVar4.e.e;
                    if (gVar2.j) {
                        gVar.d((int) ((gVar2.g * dVar3.y) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                g gVar3 = dVar3.d.e;
                if (gVar3.j) {
                    int i3 = dVar3.W;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = gVar3.g * dVar3.V;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = gVar3.g;
                            f2 = dVar3.V;
                        }
                        gVar.d(i);
                    } else {
                        f = gVar3.g;
                        f2 = dVar3.V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        boolean z = fVar.c;
        ArrayList arrayList = fVar.l;
        if (z) {
            f fVar2 = this.i;
            boolean z2 = fVar2.c;
            ArrayList arrayList2 = fVar2.l;
            if (z2) {
                if (fVar.j && fVar2.j && gVar.j) {
                    return;
                }
                if (!gVar.j && this.d == 3) {
                    androidx.constraintlayout.core.widgets.d dVar5 = this.b;
                    if (dVar5.q == 0 && !dVar5.v()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i4 = fVar3.g + fVar.f;
                        int i5 = fVar4.g + fVar2.f;
                        fVar.d(i4);
                        fVar2.d(i5);
                        gVar.d(i5 - i4);
                        return;
                    }
                }
                if (!gVar.j && this.d == 3 && this.a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i6 = (((f) arrayList2.get(0)).g + fVar2.f) - (fVar5.g + fVar.f);
                    int i7 = gVar.m;
                    if (i6 < i7) {
                        gVar.d(i6);
                    } else {
                        gVar.d(i7);
                    }
                }
                if (gVar.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i8 = fVar6.g;
                    int i9 = fVar.f + i8;
                    int i10 = fVar7.g;
                    int i11 = fVar2.f + i10;
                    float f4 = this.b.d0;
                    if (fVar6 == fVar7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    fVar.d((int) ((((i10 - i8) - gVar.g) * f4) + i8 + 0.5f));
                    fVar2.d(fVar.g + gVar.g);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void d() {
        androidx.constraintlayout.core.widgets.d dVar;
        androidx.constraintlayout.core.widgets.d dVar2;
        androidx.constraintlayout.core.widgets.d dVar3;
        androidx.constraintlayout.core.widgets.d dVar4;
        f fVar = this.k;
        androidx.constraintlayout.core.widgets.d dVar5 = this.b;
        boolean z = dVar5.a;
        g gVar = this.e;
        if (z) {
            gVar.d(dVar5.k());
        }
        boolean z2 = gVar.j;
        ArrayList arrayList = gVar.k;
        ArrayList arrayList2 = gVar.l;
        f fVar2 = this.i;
        f fVar3 = this.h;
        if (!z2) {
            androidx.constraintlayout.core.widgets.d dVar6 = this.b;
            this.d = dVar6.o0[1];
            if (dVar6.D) {
                this.l = new a(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.b.S) != null && dVar4.o0[1] == 1) {
                    int iK = (dVar4.k() - this.b.I.e()) - this.b.K.e();
                    o.b(fVar3, dVar4.e.h, this.b.I.e());
                    o.b(fVar2, dVar4.e.i, -this.b.K.e());
                    gVar.d(iK);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (dVar2 = (dVar = this.b).S) != null && dVar2.o0[1] == 1) {
            o.b(fVar3, dVar2.e.h, dVar.I.e());
            o.b(fVar2, dVar2.e.i, -this.b.K.e());
            return;
        }
        boolean z3 = gVar.j;
        if (z3) {
            androidx.constraintlayout.core.widgets.d dVar7 = this.b;
            if (dVar7.a) {
                androidx.constraintlayout.core.widgets.c[] cVarArr = dVar7.P;
                androidx.constraintlayout.core.widgets.c cVar = cVarArr[2];
                androidx.constraintlayout.core.widgets.c cVar2 = cVar.f;
                if (cVar2 != null && cVarArr[3].f != null) {
                    boolean zV = dVar7.v();
                    androidx.constraintlayout.core.widgets.d dVar8 = this.b;
                    if (zV) {
                        fVar3.f = dVar8.P[2].e();
                        fVar2.f = -this.b.P[3].e();
                    } else {
                        f fVarH = o.h(dVar8.P[2]);
                        if (fVarH != null) {
                            o.b(fVar3, fVarH, this.b.P[2].e());
                        }
                        f fVarH2 = o.h(this.b.P[3]);
                        if (fVarH2 != null) {
                            o.b(fVar2, fVarH2, -this.b.P[3].e());
                        }
                        fVar3.b = true;
                        fVar2.b = true;
                    }
                    androidx.constraintlayout.core.widgets.d dVar9 = this.b;
                    if (dVar9.D) {
                        o.b(fVar, fVar3, dVar9.Z);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar3, fVarH3, this.b.P[2].e());
                        o.b(fVar2, fVar3, gVar.g);
                        androidx.constraintlayout.core.widgets.d dVar10 = this.b;
                        if (dVar10.D) {
                            o.b(fVar, fVar3, dVar10.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.c cVar3 = cVarArr[3];
                if (cVar3.f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar2, fVarH4, -this.b.P[3].e());
                        o.b(fVar3, fVar2, -gVar.g);
                    }
                    androidx.constraintlayout.core.widgets.d dVar11 = this.b;
                    if (dVar11.D) {
                        o.b(fVar, fVar3, dVar11.Z);
                        return;
                    }
                    return;
                }
                androidx.constraintlayout.core.widgets.c cVar4 = cVarArr[4];
                if (cVar4.f != null) {
                    f fVarH5 = o.h(cVar4);
                    if (fVarH5 != null) {
                        o.b(fVar, fVarH5, 0);
                        o.b(fVar3, fVar, -this.b.Z);
                        o.b(fVar2, fVar3, gVar.g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof androidx.constraintlayout.core.widgets.i) || dVar7.S == null || dVar7.i(7).f != null) {
                    return;
                }
                androidx.constraintlayout.core.widgets.d dVar12 = this.b;
                o.b(fVar3, dVar12.S.e.h, dVar12.p());
                o.b(fVar2, fVar3, gVar.g);
                androidx.constraintlayout.core.widgets.d dVar13 = this.b;
                if (dVar13.D) {
                    o.b(fVar, fVar3, dVar13.Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            gVar.b(this);
        } else {
            androidx.constraintlayout.core.widgets.d dVar14 = this.b;
            int i2 = dVar14.r;
            if (i2 == 2) {
                androidx.constraintlayout.core.widgets.d dVar15 = dVar14.S;
                if (dVar15 != null) {
                    g gVar2 = dVar15.e.e;
                    arrayList2.add(gVar2);
                    gVar2.k.add(gVar);
                    gVar.b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i2 == 3 && !dVar14.v()) {
                androidx.constraintlayout.core.widgets.d dVar16 = this.b;
                if (dVar16.q != 3) {
                    g gVar3 = dVar16.d.e;
                    arrayList2.add(gVar3);
                    gVar3.k.add(gVar);
                    gVar.b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        androidx.constraintlayout.core.widgets.d dVar17 = this.b;
        androidx.constraintlayout.core.widgets.c[] cVarArr2 = dVar17.P;
        androidx.constraintlayout.core.widgets.c cVar5 = cVarArr2[2];
        androidx.constraintlayout.core.widgets.c cVar6 = cVar5.f;
        if (cVar6 != null && cVarArr2[3].f != null) {
            boolean zV2 = dVar17.v();
            androidx.constraintlayout.core.widgets.d dVar18 = this.b;
            if (zV2) {
                fVar3.f = dVar18.P[2].e();
                fVar2.f = -this.b.P[3].e();
            } else {
                f fVarH6 = o.h(dVar18.P[2]);
                f fVarH7 = o.h(this.b.P[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.b.D) {
                c(fVar, fVar3, 1, this.l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = o.h(cVar5);
            if (fVarH8 != null) {
                o.b(fVar3, fVarH8, this.b.P[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.b.D) {
                    c(fVar, fVar3, 1, this.l);
                }
                if (this.d == 3) {
                    androidx.constraintlayout.core.widgets.d dVar19 = this.b;
                    if (dVar19.V > 0.0f) {
                        k kVar = dVar19.d;
                        if (kVar.d == 3) {
                            kVar.e.k.add(gVar);
                            arrayList2.add(this.b.d.e);
                            gVar.a = this;
                        }
                    }
                }
            }
        } else {
            androidx.constraintlayout.core.widgets.c cVar7 = cVarArr2[3];
            if (cVar7.f != null) {
                f fVarH9 = o.h(cVar7);
                if (fVarH9 != null) {
                    o.b(fVar2, fVarH9, -this.b.P[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.b.D) {
                        c(fVar, fVar3, 1, this.l);
                    }
                }
            } else {
                androidx.constraintlayout.core.widgets.c cVar8 = cVarArr2[4];
                if (cVar8.f != null) {
                    f fVarH10 = o.h(cVar8);
                    if (fVarH10 != null) {
                        o.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar17 instanceof androidx.constraintlayout.core.widgets.i) && (dVar3 = dVar17.S) != null) {
                    o.b(fVar3, dVar3.e.h, dVar17.p());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.b.D) {
                        c(fVar, fVar3, 1, this.l);
                    }
                    if (this.d == 3) {
                        androidx.constraintlayout.core.widgets.d dVar20 = this.b;
                        if (dVar20.V > 0.0f) {
                            k kVar2 = dVar20.d;
                            if (kVar2.d == 3) {
                                kVar2.e.k.add(gVar);
                                arrayList2.add(this.b.d.e);
                                gVar.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.c = true;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.b.Y = fVar.g;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void m() {
        this.g = false;
        f fVar = this.h;
        fVar.c();
        fVar.j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.j = false;
        f fVar3 = this.k;
        fVar3.c();
        fVar3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.g0;
    }
}
