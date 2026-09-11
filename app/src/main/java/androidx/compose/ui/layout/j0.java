package androidx.compose.ui.layout;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 extends androidx.compose.ui.node.c0 {
    public final /* synthetic */ m0 b;
    public final /* synthetic */ kotlin.jvm.functions.p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(m0 m0Var, kotlin.jvm.functions.p pVar, String str) {
        super(str);
        this.b = m0Var;
        this.c = pVar;
    }

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        m0 m0Var = this.b;
        h0 h0Var = m0Var.E;
        h0Var.e = s0Var.getLayoutDirection();
        h0Var.y = s0Var.a();
        h0Var.z = s0Var.T();
        boolean zU = s0Var.U();
        kotlin.jvm.functions.p pVar = this.c;
        if (zU || m0Var.e.F == null) {
            m0Var.A = 0;
            r0 r0Var = (r0) pVar.invoke(h0Var, new androidx.compose.ui.unit.a(j));
            return new i0(r0Var, m0Var, m0Var.A, r0Var, 1);
        }
        m0Var.B = 0;
        r0 r0Var2 = (r0) pVar.invoke(m0Var.F, new androidx.compose.ui.unit.a(j));
        return new i0(r0Var2, m0Var, m0Var.B, r0Var2, 0);
    }
}
