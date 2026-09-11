package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public float L;

    @Override // androidx.compose.ui.node.v
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.L) : p0Var.v(i);
    }

    public final long L0(long j, boolean z) {
        int iRound;
        int iG = androidx.compose.ui.unit.a.g(j);
        if (iG == Integer.MAX_VALUE || (iRound = Math.round(iG * this.L)) <= 0) {
            return 0L;
        }
        if (!z || b.l(iRound, iG, j)) {
            return (((long) iRound) << 32) | (((long) iG) & 4294967295L);
        }
        return 0L;
    }

    public final long M0(long j, boolean z) {
        int iRound;
        int iH = androidx.compose.ui.unit.a.h(j);
        if (iH == Integer.MAX_VALUE || (iRound = Math.round(iH / this.L)) <= 0) {
            return 0L;
        }
        if (!z || b.l(iH, iRound, j)) {
            return (((long) iH) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    public final long N0(long j, boolean z) {
        int i = androidx.compose.ui.unit.a.i(j);
        int iRound = Math.round(i * this.L);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || b.l(iRound, i, j)) {
            return (((long) iRound) << 32) | (((long) i) & 4294967295L);
        }
        return 0L;
    }

    public final long O0(long j, boolean z) {
        int iJ = androidx.compose.ui.unit.a.j(j);
        int iRound = Math.round(iJ / this.L);
        if (iRound <= 0) {
            return 0L;
        }
        if (!z || b.l(iJ, iRound, j)) {
            return (((long) iJ) << 32) | (((long) iRound) & 4294967295L);
        }
        return 0L;
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.L) : p0Var.Z(i);
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        long jM0 = M0(j, true);
        if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
            jM0 = L0(j, true);
            if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                jM0 = O0(j, true);
                if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                    jM0 = N0(j, true);
                    if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                        jM0 = M0(j, false);
                        if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                            jM0 = L0(j, false);
                            if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                                jM0 = O0(j, false);
                                if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                                    jM0 = N0(j, false);
                                    if (androidx.compose.ui.unit.l.a(jM0, 0L)) {
                                        jM0 = 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!androidx.compose.ui.unit.l.a(jM0, 0L)) {
            int i = (int) (jM0 >> 32);
            int i2 = (int) (jM0 & 4294967295L);
            if (!((i2 >= 0) & (i >= 0))) {
                androidx.compose.ui.unit.i.a("width and height must be >= 0");
            }
            j = androidx.compose.ui.unit.b.h(i, i, i2, i2);
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new j(c1VarF, 0));
    }

    @Override // androidx.compose.ui.node.v
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i * this.L) : p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return i != Integer.MAX_VALUE ? Math.round(i / this.L) : p0Var.b(i);
    }
}
