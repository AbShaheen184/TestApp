package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends i {
    public androidx.constraintlayout.core.widgets.analyzer.b A0;
    public androidx.constraintlayout.widget.f B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public int O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public ArrayList V0;
    public d[] W0;
    public d[] X0;
    public int[] Y0;
    public d[] Z0;
    public int a1;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public boolean x0;
    public int y0;
    public int z0;

    @Override // androidx.constraintlayout.core.widgets.i
    public final void N() {
        for (int i = 0; i < this.q0; i++) {
            d dVar = this.p0[i];
            if (dVar != null) {
                dVar.E = true;
            }
        }
    }

    public final int O(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.o0;
            if (iArr[1] == 3) {
                int i2 = dVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (dVar.y * i);
                        if (i3 != dVar.k()) {
                            dVar.g = true;
                            Q(iArr[0], dVar.n(), 1, i3, dVar);
                        }
                        return i3;
                    }
                    dVar2 = dVar;
                    if (i2 == 1) {
                        return dVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((dVar2.n() * dVar2.V) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.k();
        }
        return 0;
    }

    public final int P(d dVar, int i) {
        d dVar2;
        if (dVar != null) {
            int[] iArr = dVar.o0;
            if (iArr[0] == 3) {
                int i2 = dVar.q;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (dVar.v * i);
                        if (i3 != dVar.n()) {
                            dVar.g = true;
                            Q(1, i3, iArr[1], dVar.k(), dVar);
                        }
                        return i3;
                    }
                    dVar2 = dVar;
                    if (i2 == 1) {
                        return dVar2.n();
                    }
                    if (i2 == 3) {
                        return (int) ((dVar2.k() * dVar2.V) + 0.5f);
                    }
                }
            } else {
                dVar2 = dVar;
            }
            return dVar2.n();
        }
        return 0;
    }

    public final void Q(int i, int i2, int i3, int i4, d dVar) {
        androidx.constraintlayout.widget.f fVar;
        d dVar2;
        androidx.constraintlayout.core.widgets.analyzer.b bVar = this.A0;
        while (true) {
            fVar = this.B0;
            if (fVar != null || (dVar2 = this.S) == null) {
                break;
            } else {
                this.B0 = ((e) dVar2).t0;
            }
        }
        bVar.a = i;
        bVar.b = i3;
        bVar.c = i2;
        bVar.d = i4;
        fVar.b(dVar, bVar);
        dVar.J(bVar.e);
        dVar.G(bVar.f);
        dVar.D = bVar.h;
        dVar.D(bVar.g);
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void b(androidx.constraintlayout.core.c cVar, boolean z) {
        d dVar;
        float f;
        int i;
        ArrayList arrayList = this.V0;
        super.b(cVar, z);
        d dVar2 = this.S;
        boolean z2 = dVar2 != null && ((e) dVar2).u0;
        int i2 = this.S0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((f) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 == 2 && this.Y0 != null && this.X0 != null && this.W0 != null) {
                for (int i4 = 0; i4 < this.a1; i4++) {
                    this.Z0[i4].A();
                }
                int[] iArr = this.Y0;
                int i5 = iArr[0];
                int i6 = iArr[1];
                float f2 = this.I0;
                d dVar3 = null;
                int i7 = 0;
                while (i7 < i5) {
                    if (z2) {
                        i = (i5 - i7) - 1;
                        f = 1.0f - this.I0;
                    } else {
                        f = f2;
                        i = i7;
                    }
                    d dVar4 = this.X0[i];
                    if (dVar4 != null) {
                        c cVar2 = dVar4.H;
                        if (dVar4.f0 != 8) {
                            if (i7 == 0) {
                                dVar4.f(cVar2, this.H, this.v0);
                                dVar4.h0 = this.C0;
                                dVar4.c0 = f;
                            }
                            if (i7 == i5 - 1) {
                                dVar4.f(dVar4.J, this.J, this.w0);
                            }
                            if (i7 > 0 && dVar3 != null) {
                                c cVar3 = dVar3.J;
                                dVar4.f(cVar2, cVar3, this.O0);
                                dVar3.f(cVar3, cVar2, 0);
                            }
                            dVar3 = dVar4;
                        }
                    }
                    i7++;
                    f2 = f;
                }
                for (int i8 = 0; i8 < i6; i8++) {
                    d dVar5 = this.W0[i8];
                    if (dVar5 != null) {
                        c cVar4 = dVar5.I;
                        if (dVar5.f0 != 8) {
                            if (i8 == 0) {
                                dVar5.f(cVar4, this.I, this.r0);
                                dVar5.i0 = this.D0;
                                dVar5.d0 = this.J0;
                            }
                            if (i8 == i6 - 1) {
                                dVar5.f(dVar5.K, this.K, this.s0);
                            }
                            if (i8 > 0 && dVar3 != null) {
                                c cVar5 = dVar3.K;
                                dVar5.f(cVar4, cVar5, this.P0);
                                dVar3.f(cVar5, cVar4, 0);
                            }
                            dVar3 = dVar5;
                        }
                    }
                }
                for (int i9 = 0; i9 < i5; i9++) {
                    for (int i10 = 0; i10 < i6; i10++) {
                        int i11 = (i10 * i5) + i9;
                        if (this.U0 == 1) {
                            i11 = (i9 * i6) + i10;
                        }
                        d[] dVarArr = this.Z0;
                        if (i11 < dVarArr.length && (dVar = dVarArr[i11]) != null && dVar.f0 != 8) {
                            d dVar6 = this.X0[i9];
                            d dVar7 = this.W0[i10];
                            if (dVar != dVar6) {
                                dVar.f(dVar.H, dVar6.H, 0);
                                dVar.f(dVar.J, dVar6.J, 0);
                            }
                            if (dVar != dVar7) {
                                dVar.f(dVar.I, dVar7.I, 0);
                                dVar.f(dVar.K, dVar7.K, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z2, true);
        }
        this.x0 = false;
    }
}
