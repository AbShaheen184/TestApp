package androidx.compose.ui.graphics;

import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.u1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends androidx.compose.ui.q implements androidx.compose.ui.node.v, u1 {
    public kotlin.jvm.functions.l L;

    public o(kotlin.jvm.functions.l lVar) {
        this.L = lVar;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.node.v
    public final r0 c(s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        c1 c1VarF = p0Var.F(j);
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new androidx.compose.animation.c(1, c1VarF, this));
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        boolean z;
        n0 n0Var;
        d1 d1VarR = androidx.compose.ui.node.k.r(this, 2);
        if (d1VarR.c0) {
            n0 n0Var2 = d1VarR.a0;
            z = d1VarR.b0;
            n0Var = n0Var2;
        } else {
            k0 k0Var = a0.a;
            if (k0Var == null) {
                a0.a = new k0();
            } else {
                k0Var.b();
            }
            k0 k0Var2 = a0.a;
            k0Var2.getClass();
            k0Var2.J = d1VarR.L.W;
            k0Var2.I = coil3.network.g.x(d1VarR.z);
            androidx.compose.runtime.snapshots.f fVarE = androidx.compose.runtime.snapshots.r.e();
            kotlin.jvm.functions.l lVarE = fVarE != null ? fVarE.e() : null;
            androidx.compose.runtime.snapshots.f fVarH = androidx.compose.runtime.snapshots.r.h(fVarE);
            try {
                this.L.invoke(k0Var2);
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                n0Var = k0Var2.G;
                z = k0Var2.H;
            } catch (Throwable th) {
                androidx.compose.runtime.snapshots.r.k(fVarE, fVarH, lVarE);
                throw th;
            }
        }
        if (z) {
            androidx.compose.ui.semantics.v.d(xVar, n0Var);
        }
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.L + ')';
    }
}
