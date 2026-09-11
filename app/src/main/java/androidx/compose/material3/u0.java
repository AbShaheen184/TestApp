package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements androidx.compose.ui.graphics.u {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ u0(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // androidx.compose.ui.graphics.u
    public final long a() {
        switch (this.e) {
            case 0:
                v0 v0Var = (v0) this.y;
                long jA = v0Var.Q.a();
                if (jA != 16) {
                    return jA;
                }
                s2 s2Var = (s2) androidx.compose.ui.node.k.h(v0Var, u2.a);
                if (s2Var != null) {
                    long j = s2Var.a;
                    if (j != 16) {
                        return j;
                    }
                }
                return ((androidx.compose.ui.graphics.t) androidx.compose.ui.node.k.h(v0Var, q0.a)).a;
            default:
                return ((v2) this.y).c;
        }
    }
}
