package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;

    @Override // androidx.compose.ui.node.v
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jL0 = L0(n0Var);
        if (androidx.compose.ui.unit.a.f(jL0)) {
            return androidx.compose.ui.unit.a.h(jL0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.f(i, jL0);
        }
        return androidx.compose.ui.unit.b.g(p0Var.v(i), jL0);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    public final long L0(androidx.compose.ui.layout.s0 s0Var) {
        int iG0;
        int iG1;
        int iG2;
        int i = 0;
        if (Float.isNaN(this.N)) {
            iG0 = Integer.MAX_VALUE;
        } else {
            iG0 = s0Var.g0(this.N);
            if (iG0 < 0) {
                iG0 = 0;
            }
        }
        if (Float.isNaN(this.O)) {
            iG1 = Integer.MAX_VALUE;
        } else {
            iG1 = s0Var.g0(this.O);
            if (iG1 < 0) {
                iG1 = 0;
            }
        }
        if (Float.isNaN(this.L)) {
            iG2 = 0;
        } else {
            iG2 = s0Var.g0(this.L);
            if (iG2 < 0) {
                iG2 = 0;
            }
            if (iG2 > iG0) {
                iG2 = iG0;
            }
            if (iG2 == Integer.MAX_VALUE) {
                iG2 = 0;
            }
        }
        if (!Float.isNaN(this.M)) {
            int iG3 = s0Var.g0(this.M);
            if (iG3 < 0) {
                iG3 = 0;
            }
            if (iG3 > iG1) {
                iG3 = iG1;
            }
            if (iG3 != Integer.MAX_VALUE) {
                i = iG3;
            }
        }
        return androidx.compose.ui.unit.b.a(iG2, iG0, i, iG1);
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jL0 = L0(n0Var);
        if (androidx.compose.ui.unit.a.e(jL0)) {
            return androidx.compose.ui.unit.a.g(jL0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.g(i, jL0);
        }
        return androidx.compose.ui.unit.b.f(p0Var.Z(i), jL0);
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iJ;
        int iH;
        int i;
        int iG;
        long jA;
        long jL0 = L0(s0Var);
        if (this.P) {
            jA = androidx.compose.ui.unit.b.e(j, jL0);
        } else {
            if (Float.isNaN(this.L)) {
                iJ = androidx.compose.ui.unit.a.j(j);
                int iH2 = androidx.compose.ui.unit.a.h(jL0);
                if (iJ > iH2) {
                    iJ = iH2;
                }
            } else {
                iJ = androidx.compose.ui.unit.a.j(jL0);
            }
            if (Float.isNaN(this.N)) {
                iH = androidx.compose.ui.unit.a.h(j);
                int iJ2 = androidx.compose.ui.unit.a.j(jL0);
                if (iH < iJ2) {
                    iH = iJ2;
                }
            } else {
                iH = androidx.compose.ui.unit.a.h(jL0);
            }
            if (Float.isNaN(this.M)) {
                i = androidx.compose.ui.unit.a.i(j);
                int iG2 = androidx.compose.ui.unit.a.g(jL0);
                if (i > iG2) {
                    i = iG2;
                }
            } else {
                i = androidx.compose.ui.unit.a.i(jL0);
            }
            if (Float.isNaN(this.O)) {
                iG = androidx.compose.ui.unit.a.g(j);
                int i2 = androidx.compose.ui.unit.a.i(jL0);
                if (iG < i2) {
                    iG = i2;
                }
            } else {
                iG = androidx.compose.ui.unit.a.g(jL0);
            }
            jA = androidx.compose.ui.unit.b.a(iJ, iH, i, iG);
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(jA);
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new j(c1VarF, 3));
    }

    @Override // androidx.compose.ui.node.v
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jL0 = L0(n0Var);
        if (androidx.compose.ui.unit.a.f(jL0)) {
            return androidx.compose.ui.unit.a.h(jL0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.f(i, jL0);
        }
        return androidx.compose.ui.unit.b.g(p0Var.B(i), jL0);
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        long jL0 = L0(n0Var);
        if (androidx.compose.ui.unit.a.e(jL0)) {
            return androidx.compose.ui.unit.a.g(jL0);
        }
        if (!this.P) {
            i = androidx.compose.ui.unit.b.g(i, jL0);
        }
        return androidx.compose.ui.unit.b.f(p0Var.b(i), jL0);
    }
}
