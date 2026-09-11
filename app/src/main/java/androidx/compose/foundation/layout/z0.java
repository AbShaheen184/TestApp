package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public float L;
    public float M;

    @Override // androidx.compose.ui.node.v
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iV = p0Var.v(i);
        int iG0 = !Float.isNaN(this.L) ? n0Var.g0(this.L) : 0;
        return iV < iG0 ? iG0 : iV;
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iZ = p0Var.Z(i);
        int iG0 = !Float.isNaN(this.M) ? n0Var.g0(this.M) : 0;
        return iZ < iG0 ? iG0 : iZ;
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iJ;
        int i;
        if (Float.isNaN(this.L) || androidx.compose.ui.unit.a.j(j) != 0) {
            iJ = androidx.compose.ui.unit.a.j(j);
        } else {
            int iG0 = s0Var.g0(this.L);
            iJ = androidx.compose.ui.unit.a.h(j);
            if (iG0 < 0) {
                iG0 = 0;
            }
            if (iG0 <= iJ) {
                iJ = iG0;
            }
        }
        int iH = androidx.compose.ui.unit.a.h(j);
        if (Float.isNaN(this.M) || androidx.compose.ui.unit.a.i(j) != 0) {
            i = androidx.compose.ui.unit.a.i(j);
        } else {
            int iG1 = s0Var.g0(this.M);
            i = androidx.compose.ui.unit.a.g(j);
            int i2 = iG1 >= 0 ? iG1 : 0;
            if (i2 <= i) {
                i = i2;
            }
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.b.a(iJ, iH, i, androidx.compose.ui.unit.a.g(j)));
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new j(c1VarF, 4));
    }

    @Override // androidx.compose.ui.node.v
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iB = p0Var.B(i);
        int iG0 = !Float.isNaN(this.L) ? n0Var.g0(this.L) : 0;
        return iB < iG0 ? iG0 : iB;
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        int iB = p0Var.b(i);
        int iG0 = !Float.isNaN(this.M) ? n0Var.g0(this.M) : 0;
        return iB < iG0 ? iG0 : iB;
    }
}
