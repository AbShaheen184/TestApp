package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {
    public int r0;
    public boolean s0;
    public int t0;
    public boolean u0;

    public final boolean O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.q0;
            if (i4 >= i) {
                break;
            }
            d dVar = this.p0[i4];
            if ((this.s0 || dVar.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && !dVar.x()) || (((i3 = this.r0) == 2 || i3 == 3) && !dVar.y()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.q0; i5++) {
            d dVar2 = this.p0[i5];
            if (this.s0 || dVar2.c()) {
                if (!z2) {
                    int i6 = this.r0;
                    if (i6 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i6 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i6 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i6 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i7 = this.r0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i8 = iMax + this.t0;
        int i9 = this.r0;
        if (i9 == 0 || i9 == 1) {
            E(i8, i8);
        } else {
            F(i8, i8);
        }
        this.u0 = true;
        return true;
    }

    public final int P() {
        int i = this.r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void b(androidx.constraintlayout.core.c cVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        c[] cVarArr = this.P;
        c cVar2 = this.H;
        cVarArr[0] = cVar2;
        int i3 = 2;
        c cVar3 = this.I;
        cVarArr[2] = cVar3;
        c cVar4 = this.J;
        cVarArr[1] = cVar4;
        c cVar5 = this.K;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.i = cVar.k(cVar6);
        }
        int i4 = this.r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i4];
        if (!this.u0) {
            O();
        }
        if (this.u0) {
            this.u0 = false;
            int i5 = this.r0;
            if (i5 == 0 || i5 == 1) {
                cVar.d(cVar2.i, this.X);
                cVar.d(cVar4.i, this.X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    cVar.d(cVar3.i, this.Y);
                    cVar.d(cVar5.i, this.Y);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.q0) {
                z2 = false;
                break;
            }
            d dVar = this.p0[i6];
            if ((this.s0 || dVar.c()) && ((((i2 = this.r0) == 0 || i2 == 1) && dVar.o0[0] == 3 && dVar.H.f != null && dVar.J.f != null) || ((i2 == 2 || i2 == 3) && dVar.o0[1] == 3 && dVar.I.f != null && dVar.K.f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = cVar2.g() || cVar4.g();
        boolean z4 = cVar3.g() || cVar5.g();
        int i7 = !(!z2 && (((i = this.r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.q0) {
            d dVar2 = this.p0[i8];
            if (this.s0 || dVar2.c()) {
                androidx.constraintlayout.core.h hVarK = cVar.k(dVar2.P[this.r0]);
                c[] cVarArr2 = dVar2.P;
                int i9 = this.r0;
                c cVar8 = cVarArr2[i9];
                cVar8.i = hVarK;
                c cVar9 = cVar8.f;
                int i10 = (cVar9 == null || cVar9.d != this) ? 0 : cVar8.g;
                if (i9 == 0 || i9 == i3) {
                    androidx.constraintlayout.core.h hVar = cVar7.i;
                    int i11 = this.t0 - i10;
                    androidx.constraintlayout.core.b bVarL = cVar.l();
                    androidx.constraintlayout.core.h hVarM = cVar.m();
                    hVarM.A = 0;
                    bVarL.c(hVar, hVarK, hVarM, i11);
                    cVar.c(bVarL);
                } else {
                    androidx.constraintlayout.core.h hVar2 = cVar7.i;
                    int i12 = this.t0 + i10;
                    androidx.constraintlayout.core.b bVarL2 = cVar.l();
                    androidx.constraintlayout.core.h hVarM2 = cVar.m();
                    hVarM2.A = 0;
                    bVarL2.b(hVar2, hVarK, hVarM2, i12);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.i, hVarK, this.t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.r0;
        if (i13 == 0) {
            cVar.e(cVar4.i, cVar2.i, 0, 8);
            cVar.e(cVar2.i, this.S.J.i, 0, 4);
            cVar.e(cVar2.i, this.S.H.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            cVar.e(cVar2.i, cVar4.i, 0, 8);
            cVar.e(cVar2.i, this.S.H.i, 0, 4);
            cVar.e(cVar2.i, this.S.J.i, 0, 0);
        } else if (i13 == 2) {
            cVar.e(cVar5.i, cVar3.i, 0, 8);
            cVar.e(cVar3.i, this.S.K.i, 0, 4);
            cVar.e(cVar3.i, this.S.I.i, 0, 0);
        } else if (i13 == 3) {
            cVar.e(cVar3.i, cVar5.i, 0, 8);
            cVar.e(cVar3.i, this.S.I.i, 0, 4);
            cVar.e(cVar3.i, this.S.K.i, 0, 0);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final String toString() {
        String strU = androidx.privacysandbox.ads.adservices.java.internal.a.u(new StringBuilder("[Barrier] "), this.g0, " {");
        for (int i = 0; i < this.q0; i++) {
            d dVar = this.p0[i];
            if (i > 0) {
                strU = strU.concat(", ");
            }
            StringBuilder sbN = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.n(strU);
            sbN.append(dVar.g0);
            strU = sbN.toString();
        }
        return strU.concat("}");
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final boolean x() {
        return this.u0;
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final boolean y() {
        return this.u0;
    }
}
