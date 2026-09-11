package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.k1;
import androidx.compose.ui.node.u1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends androidx.compose.ui.q implements u1 {
    public kotlin.jvm.functions.a L;
    public q0 M;
    public k1 N;
    public boolean O;
    public androidx.compose.ui.semantics.i P;
    public final s0 Q = new s0(this, 0);
    public s0 R;

    public v0(kotlin.jvm.functions.a aVar, q0 q0Var, k1 k1Var, boolean z) {
        this.L = aVar;
        this.M = q0Var;
        this.N = k1Var;
        this.O = z;
        L0();
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    public final void L0() {
        this.P = new androidx.compose.ui.semantics.i(new t0(this, 0), new t0(this, 1));
        this.R = this.O ? new s0(this, 1) : null;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        kotlin.reflect.j[] jVarArr = androidx.compose.ui.semantics.v.a;
        androidx.compose.ui.semantics.w wVar = androidx.compose.ui.semantics.t.m;
        kotlin.reflect.j[] jVarArr2 = androidx.compose.ui.semantics.v.a;
        kotlin.reflect.j jVar = jVarArr2[6];
        xVar.b(wVar, Boolean.TRUE);
        xVar.b(androidx.compose.ui.semantics.t.M, this.Q);
        k1 k1Var = this.N;
        androidx.compose.ui.semantics.i iVar = this.P;
        if (k1Var == k1.e) {
            if (iVar == null) {
                kotlin.jvm.internal.l.f("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.w wVar2 = androidx.compose.ui.semantics.t.v;
            kotlin.reflect.j jVar2 = jVarArr2[13];
            xVar.b(wVar2, iVar);
        } else {
            if (iVar == null) {
                kotlin.jvm.internal.l.f("scrollAxisRange");
                throw null;
            }
            androidx.compose.ui.semantics.w wVar3 = androidx.compose.ui.semantics.t.u;
            kotlin.reflect.j jVar3 = jVarArr2[12];
            xVar.b(wVar3, iVar);
        }
        s0 s0Var = this.R;
        if (s0Var != null) {
            xVar.b(androidx.compose.ui.semantics.k.f, new androidx.compose.ui.semantics.a(null, s0Var));
        }
        xVar.b(androidx.compose.ui.semantics.k.C, new androidx.compose.ui.semantics.a(null, new androidx.compose.animation.e(new t0(this, 2), 23)));
        androidx.compose.ui.semantics.c cVarF = this.M.f();
        androidx.compose.ui.semantics.w wVar4 = androidx.compose.ui.semantics.t.f;
        kotlin.reflect.j jVar4 = jVarArr2[23];
        xVar.b(wVar4, cVarF);
    }
}
