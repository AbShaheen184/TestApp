package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public z L;
    public float M;

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iJ;
        int iH;
        int iG;
        int iG2;
        if (!androidx.compose.ui.unit.a.d(j) || this.L == z.e) {
            iJ = androidx.compose.ui.unit.a.j(j);
            iH = androidx.compose.ui.unit.a.h(j);
        } else {
            int iRound = Math.round(androidx.compose.ui.unit.a.h(j) * this.M);
            int iJ2 = androidx.compose.ui.unit.a.j(j);
            iJ = androidx.compose.ui.unit.a.h(j);
            if (iRound < iJ2) {
                iRound = iJ2;
            }
            if (iRound <= iJ) {
                iJ = iRound;
            }
            iH = iJ;
        }
        if (!androidx.compose.ui.unit.a.c(j) || this.L == z.y) {
            int i = androidx.compose.ui.unit.a.i(j);
            iG = androidx.compose.ui.unit.a.g(j);
            iG2 = i;
        } else {
            int iRound2 = Math.round(androidx.compose.ui.unit.a.g(j) * this.M);
            int i2 = androidx.compose.ui.unit.a.i(j);
            iG2 = androidx.compose.ui.unit.a.g(j);
            if (iRound2 < i2) {
                iRound2 = i2;
            }
            if (iRound2 <= iG2) {
                iG2 = iRound2;
            }
            iG = iG2;
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.b.a(iJ, iH, iG2, iG));
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new j(c1VarF, 1));
    }
}
