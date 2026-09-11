package androidx.compose.animation;

import androidx.compose.animation.core.w1;
import androidx.compose.animation.core.x1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends d1 {
    public x1 L;
    public androidx.compose.runtime.y0 M;
    public v N;
    public long O;

    @Override // androidx.compose.ui.q
    public final void F0() {
        this.O = m.a;
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        long j2;
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
        if (s0Var.U()) {
            j2 = (((long) c1VarF.e) << 32) | (((long) c1VarF.y) & 4294967295L);
        } else {
            x1 x1Var = this.L;
            int i = c1VarF.e;
            if (x1Var == null) {
                j2 = (((long) i) << 32) | (((long) c1VarF.y) & 4294967295L);
                this.O = j2;
            } else {
                long j3 = (((long) c1VarF.y) & 4294967295L) | (((long) i) << 32);
                w1 w1VarA = x1Var.a(new t(this, j3, 0), new t(this, j3, 1));
                this.N.getClass();
                j2 = ((androidx.compose.ui.unit.l) w1VarA.getValue()).a;
                this.O = ((androidx.compose.ui.unit.l) w1VarA.getValue()).a;
            }
        }
        return s0Var.q((int) (j2 >> 32), (int) (4294967295L & j2), kotlin.collections.v.e, new s(this, c1VarF, j2));
    }
}
