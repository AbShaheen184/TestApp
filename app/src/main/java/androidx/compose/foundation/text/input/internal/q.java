package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.r0;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.runtime.h1;
import androidx.compose.ui.node.d1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends androidx.compose.ui.q implements androidx.compose.ui.node.h, androidx.compose.ui.node.n {
    public t L;
    public r0 M;
    public c1 N;
    public final h1 O = androidx.compose.runtime.s.r(null);

    public q(t tVar, r0 r0Var, c1 c1Var) {
        this.L = tVar;
        this.M = r0Var;
        this.N = c1Var;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        t tVar = this.L;
        if (tVar.a != null) {
            androidx.compose.foundation.internal.b.c("Expected textInputModifierNode to be null");
        }
        tVar.a = this;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.L.i(this);
    }

    @Override // androidx.compose.ui.node.n
    public final void u0(d1 d1Var) {
        this.O.setValue(d1Var);
    }
}
