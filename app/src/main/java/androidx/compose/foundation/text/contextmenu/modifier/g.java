package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.m;
import androidx.compose.foundation.text.selection.u0;
import androidx.compose.runtime.h1;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.input.pointer.l0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends androidx.compose.ui.node.j implements androidx.compose.ui.node.h, n {
    public u0 N;
    public final h1 O = new h1(null, androidx.compose.runtime.f.A);

    public g(u0 u0Var) {
        this.N = u0Var;
        m mVar = new m(this, 3);
        androidx.compose.ui.input.pointer.m mVar2 = h0.a;
        L0(new l0(null, null, mVar));
    }

    @Override // androidx.compose.ui.node.n
    public final void u0(d1 d1Var) {
        this.O.setValue(d1Var);
    }
}
