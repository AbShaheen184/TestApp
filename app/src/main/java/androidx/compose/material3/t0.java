package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ v0 y;

    public /* synthetic */ t0(v0 v0Var, int i) {
        this.e = i;
        this.y = v0Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        int i = this.e;
        v0 v0Var = this.y;
        switch (i) {
            case 0:
                s2 s2Var = (s2) androidx.compose.ui.node.k.h(v0Var, u2.a);
                androidx.compose.material.ripple.a aVar = v0Var.R;
                if (s2Var == null) {
                    if (aVar != null) {
                        v0Var.M0(aVar);
                    }
                    v0Var.R = null;
                } else if (aVar == null) {
                    u0 u0Var = new u0(v0Var, 0);
                    t0 t0Var = new t0(v0Var, 1);
                    androidx.compose.foundation.interaction.k kVar = v0Var.N;
                    boolean z = v0Var.O;
                    float f = v0Var.P;
                    androidx.compose.animation.core.k2 k2Var = androidx.compose.material.ripple.f.a;
                    androidx.compose.material.ripple.a aVar2 = new androidx.compose.material.ripple.a(kVar, z, f, u0Var, t0Var);
                    v0Var.L0(aVar2);
                    v0Var.R = aVar2;
                }
                return kotlin.y.a;
            default:
                return t2.a;
        }
    }
}
