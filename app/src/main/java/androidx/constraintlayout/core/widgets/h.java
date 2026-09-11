package androidx.constraintlayout.core.widgets;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {
    public float p0 = -1.0f;
    public int q0 = -1;
    public int r0 = -1;
    public c s0 = this.I;
    public int t0 = 0;
    public boolean u0;

    public h() {
        this.Q.clear();
        this.Q.add(this.s0);
        int length = this.P.length;
        for (int i = 0; i < length; i++) {
            this.P[i] = this.s0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void L(androidx.constraintlayout.core.c cVar, boolean z) {
        if (this.S == null) {
            return;
        }
        c cVar2 = this.s0;
        cVar.getClass();
        int iN = androidx.constraintlayout.core.c.n(cVar2);
        if (this.t0 == 1) {
            this.X = iN;
            this.Y = 0;
            G(this.S.k());
            J(0);
            return;
        }
        this.X = 0;
        this.Y = iN;
        J(this.S.n());
        G(0);
    }

    public final void M(int i) {
        this.s0.l(i);
        this.u0 = true;
    }

    public final void N(int i) {
        if (this.t0 == i) {
            return;
        }
        this.t0 = i;
        ArrayList arrayList = this.Q;
        arrayList.clear();
        if (this.t0 == 1) {
            this.s0 = this.H;
        } else {
            this.s0 = this.I;
        }
        arrayList.add(this.s0);
        c[] cVarArr = this.P;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            cVarArr[i2] = this.s0;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final void b(androidx.constraintlayout.core.c cVar, boolean z) {
        e eVar = (e) this.S;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.S;
        boolean z2 = dVar != null && dVar.o0[0] == 2;
        if (this.t0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.S;
            z2 = dVar2 != null && dVar2.o0[1] == 2;
        }
        if (this.u0) {
            c cVar2 = this.s0;
            if (cVar2.c) {
                androidx.constraintlayout.core.h hVarK = cVar.k(cVar2);
                cVar.d(hVarK, this.s0.d());
                if (this.q0 != -1) {
                    if (z2) {
                        cVar.f(cVar.k(objI2), hVarK, 0, 5);
                    }
                } else if (this.r0 != -1 && z2) {
                    androidx.constraintlayout.core.h hVarK2 = cVar.k(objI2);
                    cVar.f(hVarK, cVar.k(objI), 0, 5);
                    cVar.f(hVarK2, hVarK, 0, 5);
                }
                this.u0 = false;
                return;
            }
        }
        if (this.q0 != -1) {
            androidx.constraintlayout.core.h hVarK3 = cVar.k(this.s0);
            cVar.e(hVarK3, cVar.k(objI), this.q0, 8);
            if (z2) {
                cVar.f(cVar.k(objI2), hVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.r0 != -1) {
            androidx.constraintlayout.core.h hVarK4 = cVar.k(this.s0);
            androidx.constraintlayout.core.h hVarK5 = cVar.k(objI2);
            cVar.e(hVarK4, hVarK5, -this.r0, 8);
            if (z2) {
                cVar.f(hVarK4, cVar.k(objI), 0, 5);
                cVar.f(hVarK5, hVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.p0 != -1.0f) {
            androidx.constraintlayout.core.h hVarK6 = cVar.k(this.s0);
            androidx.constraintlayout.core.h hVarK7 = cVar.k(objI2);
            float f = this.p0;
            androidx.constraintlayout.core.b bVarL = cVar.l();
            bVarL.d.g(hVarK6, -1.0f);
            bVarL.d.g(hVarK7, f);
            cVar.c(bVarL);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final boolean c() {
        return true;
    }

    @Override // androidx.constraintlayout.core.widgets.d
    public final c i(int i) {
        int iE = androidx.constraintlayout.core.g.e(i);
        if (iE != 1) {
            if (iE != 2) {
                if (iE != 3) {
                    if (iE != 4) {
                        return null;
                    }
                }
            }
            if (this.t0 == 0) {
                return this.s0;
            }
            return null;
        }
        if (this.t0 == 1) {
            return this.s0;
        }
        return null;
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
