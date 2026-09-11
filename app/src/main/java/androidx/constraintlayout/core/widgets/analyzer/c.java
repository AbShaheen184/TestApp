package androidx.constraintlayout.core.widgets.analyzer;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o {
    public final ArrayList k;
    public int l;

    public c(androidx.constraintlayout.core.widgets.d dVar, int i) {
        androidx.constraintlayout.core.widgets.d dVar2;
        super(dVar);
        ArrayList<o> arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        androidx.constraintlayout.core.widgets.d dVar3 = this.b;
        androidx.constraintlayout.core.widgets.d dVarM = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f);
            }
        }
        this.b = dVar2;
        int i2 = this.f;
        arrayList.add(i2 == 0 ? dVar2.d : i2 == 1 ? dVar2.e : null);
        androidx.constraintlayout.core.widgets.d dVarL = dVar2.l(this.f);
        while (dVarL != null) {
            int i3 = this.f;
            arrayList.add(i3 == 0 ? dVarL.d : i3 == 1 ? dVarL.e : null);
            dVarL = dVarL.l(this.f);
        }
        for (o oVar : arrayList) {
            int i4 = this.f;
            if (i4 == 0) {
                oVar.b.b = this;
            } else if (i4 == 1) {
                oVar.b.c = this;
            }
        }
        if (this.f == 0 && ((androidx.constraintlayout.core.widgets.e) this.b.S).u0 && arrayList.size() > 1) {
            this.b = ((o) androidx.privacysandbox.ads.adservices.java.internal.a.j(1, arrayList)).b;
        }
        int i5 = this.f;
        androidx.constraintlayout.core.widgets.d dVar4 = this.b;
        this.l = i5 == 0 ? dVar4.h0 : dVar4.i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // androidx.constraintlayout.core.widgets.analyzer.d
    public final void a(d dVar) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        f fVar = this.h;
        if (fVar.j) {
            f fVar2 = this.i;
            if (fVar2.j) {
                androidx.constraintlayout.core.widgets.d dVar2 = this.b.S;
                boolean z2 = dVar2 instanceof androidx.constraintlayout.core.widgets.e ? ((androidx.constraintlayout.core.widgets.e) dVar2).u0 : false;
                int i13 = fVar2.g - fVar.g;
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((o) arrayList.get(i14)).b.f0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((o) arrayList.get(i16)).b.f0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        o oVar = (o) arrayList.get(i18);
                        androidx.constraintlayout.core.widgets.d dVar3 = oVar.b;
                        boolean z3 = z2;
                        if (dVar3.f0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += oVar.h.f;
                            }
                            g gVar = oVar.e;
                            int i21 = gVar.g;
                            i11 = i17;
                            boolean z4 = oVar.d != 3;
                            if (z4) {
                                int i22 = this.f;
                                if (i22 == 0 && !dVar3.d.e.j) {
                                    return;
                                }
                                if (i22 == 1 && !dVar3.e.e.j) {
                                    return;
                                }
                            } else {
                                if (oVar.a == 1 && i11 == 0) {
                                    i12 = gVar.m;
                                    i19++;
                                } else {
                                    if (gVar.j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = dVar3.j0[this.f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -oVar.i.f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = dVar3.j0[this.f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = dVar3.j0[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = fVar.g;
                if (z) {
                    i24 = fVar2.g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        o oVar2 = (o) arrayList.get(i26);
                        int i28 = i24;
                        androidx.constraintlayout.core.widgets.d dVar4 = oVar2.b;
                        int i29 = i3;
                        g gVar2 = oVar2.e;
                        float f7 = f5;
                        int i30 = i25;
                        if (dVar4.f0 != 8 && oVar2.d == 3 && !gVar2.j) {
                            int i31 = f > 0.0f ? (int) (((dVar4.j0[this.f] * f7) / f) + f6) : i30;
                            if (this.f == 0) {
                                i9 = dVar4.u;
                                i10 = dVar4.t;
                            } else {
                                i9 = dVar4.x;
                                i10 = dVar4.w;
                            }
                            int iMax = Math.max(i10, oVar2.a == 1 ? Math.min(i31, gVar2.m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            gVar2.d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            o oVar3 = (o) arrayList.get(i33);
                            if (oVar3.b.f0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += oVar3.h.f;
                                }
                                i5 += oVar3.e.g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -oVar3.i.f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.l == 2 && i27 == 0) {
                        i7 = 0;
                        this.l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.l = i8;
                }
                int i34 = this.l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        o oVar4 = (o) arrayList.get(z ? size - (i37 + 1) : i37);
                        androidx.constraintlayout.core.widgets.d dVar5 = oVar4.b;
                        f fVar3 = oVar4.i;
                        f fVar4 = oVar4.h;
                        if (dVar5.f0 == 8) {
                            fVar4.d(i36);
                            fVar3.d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - fVar4.f : i36 + fVar4.f;
                            }
                            if (z) {
                                fVar3.d(i36);
                            } else {
                                fVar4.d(i36);
                            }
                            g gVar3 = oVar4.e;
                            int i38 = gVar3.g;
                            if (oVar4.d == 3 && oVar4.a == 1) {
                                i38 = gVar3.m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                fVar4.d(i36);
                            } else {
                                fVar3.d(i36);
                            }
                            oVar4.g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-fVar3.f) : i36 + (-fVar3.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        o oVar5 = (o) arrayList.get(z ? size - (i41 + 1) : i41);
                        androidx.constraintlayout.core.widgets.d dVar6 = oVar5.b;
                        f fVar5 = oVar5.i;
                        f fVar6 = oVar5.h;
                        if (dVar6.f0 == 8) {
                            fVar6.d(i40);
                            fVar5.d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - fVar6.f : i42 + fVar6.f;
                            }
                            if (z) {
                                fVar5.d(i42);
                            } else {
                                fVar6.d(i42);
                            }
                            g gVar4 = oVar5.e;
                            int iMin = gVar4.g;
                            if (oVar5.d == 3 && oVar5.a == 1) {
                                iMin = Math.min(iMin, gVar4.m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                fVar6.d(i40);
                            } else {
                                fVar5.d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-fVar5.f) : i40 + (-fVar5.f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f;
                    androidx.constraintlayout.core.widgets.d dVar7 = this.b;
                    float f8 = i43 == 0 ? dVar7.c0 : dVar7.d0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        o oVar6 = (o) arrayList.get(z ? size - (i46 + 1) : i46);
                        androidx.constraintlayout.core.widgets.d dVar8 = oVar6.b;
                        f fVar7 = oVar6.i;
                        f fVar8 = oVar6.h;
                        if (dVar8.f0 == 8) {
                            fVar8.d(i45);
                            fVar7.d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - fVar8.f : i45 + fVar8.f;
                            }
                            if (z) {
                                fVar7.d(i45);
                            } else {
                                fVar8.d(i45);
                            }
                            g gVar5 = oVar6.e;
                            int i47 = gVar5.g;
                            if (oVar6.d == 3 && oVar6.a == 1) {
                                i47 = gVar5.m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                fVar8.d(i45);
                            } else {
                                fVar7.d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-fVar7.f) : i45 + (-fVar7.f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((o) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        androidx.constraintlayout.core.widgets.d dVar = ((o) arrayList.get(0)).b;
        androidx.constraintlayout.core.widgets.d dVar2 = ((o) arrayList.get(size - 1)).b;
        int i = this.f;
        f fVar = this.i;
        f fVar2 = this.h;
        if (i == 0) {
            androidx.constraintlayout.core.widgets.c cVar = dVar.H;
            androidx.constraintlayout.core.widgets.c cVar2 = dVar2.J;
            f fVarI = o.i(cVar, 0);
            int iE = cVar.e();
            androidx.constraintlayout.core.widgets.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.H.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(cVar2, 0);
            int iE2 = cVar2.e();
            androidx.constraintlayout.core.widgets.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.J.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            androidx.constraintlayout.core.widgets.c cVar3 = dVar.I;
            androidx.constraintlayout.core.widgets.c cVar4 = dVar2.K;
            f fVarI3 = o.i(cVar3, 1);
            int iE3 = cVar3.e();
            androidx.constraintlayout.core.widgets.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.I.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(cVar4, 1);
            int iE4 = cVar4.e();
            androidx.constraintlayout.core.widgets.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.K.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.a = this;
        fVar.a = this;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((o) it.next()).f();
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            j = ((long) oVar.i.f) + oVar.j() + j + ((long) oVar.h.f);
        }
        return j;
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.o
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final androidx.constraintlayout.core.widgets.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i >= arrayList.size()) {
                return null;
            }
            androidx.constraintlayout.core.widgets.d dVar = ((o) arrayList.get(i)).b;
            if (dVar.f0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final androidx.constraintlayout.core.widgets.d n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            androidx.constraintlayout.core.widgets.d dVar = ((o) arrayList.get(size)).b;
            if (dVar.f0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        for (o oVar : this.k) {
            sb.append("<");
            sb.append(oVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
