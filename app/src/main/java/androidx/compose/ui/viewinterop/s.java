package androidx.compose.ui.viewinterop;

import androidx.compose.foundation.lazy.layout.h0;
import androidx.compose.foundation.s0;
import androidx.compose.ui.focus.e0;
import androidx.compose.ui.node.h1;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.compose.ui.node.j implements h1, androidx.compose.ui.node.h {
    public final e0 N;
    public h0 O;

    public s() {
        e0 e0Var = new e0(0, new s0(2, this, s.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 1), 9);
        L0(e0Var);
        this.N = e0Var;
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        z zVar = new z();
        androidx.compose.ui.node.k.p(this, new androidx.compose.ui.draw.b(8, zVar, this));
        h0 h0Var = (h0) zVar.e;
        if (this.N.Q0().a()) {
            h0 h0Var2 = this.O;
            if (h0Var2 != null) {
                h0Var2.b();
            }
            if (h0Var != null) {
                h0Var.a();
            } else {
                h0Var = null;
            }
            this.O = h0Var;
        }
    }
}
