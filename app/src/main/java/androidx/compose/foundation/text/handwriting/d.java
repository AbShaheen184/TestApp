package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.m;
import androidx.compose.ui.focus.a0;
import androidx.compose.ui.focus.c0;
import androidx.compose.ui.focus.g;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.input.pointer.n;
import androidx.compose.ui.node.b1;
import androidx.compose.ui.node.j;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.r1;
import androidx.compose.ui.node.x1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends j implements r1, g, a0 {
    public kotlin.jvm.functions.a N;
    public boolean O;
    public final l0 P;

    public d(kotlin.jvm.functions.a aVar) {
        this.N = aVar;
        m mVar = new m(this, 4);
        androidx.compose.ui.input.pointer.m mVar2 = h0.a;
        l0 l0Var = new l0(null, null, mVar);
        L0(l0Var);
        this.P = l0Var;
    }

    @Override // androidx.compose.ui.node.r1
    public final void D(androidx.compose.ui.input.pointer.m mVar, n nVar, long j) {
        this.P.D(mVar, nVar, j);
    }

    @Override // androidx.compose.ui.node.r1
    public final void E() {
        this.P.E();
    }

    @Override // androidx.compose.ui.focus.g
    public final void X(c0 c0Var) {
        this.O = c0Var.a();
    }

    @Override // androidx.compose.ui.node.r1
    public final long k() {
        l lVar = b.a;
        androidx.compose.ui.unit.c cVar = k.t(this).W;
        lVar.getClass();
        int i = x1.b;
        return b1.c(cVar.g0(lVar.a), cVar.g0(lVar.b), cVar.g0(lVar.c), cVar.g0(lVar.d));
    }
}
