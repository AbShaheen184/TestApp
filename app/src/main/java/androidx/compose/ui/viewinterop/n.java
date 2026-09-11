package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.pointer.b0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends androidx.compose.ui.q {
    public b0 L;
    public final androidx.compose.animation.e M = new androidx.compose.animation.e(this, 25);

    public n(b0 b0Var) {
        this.L = b0Var;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        this.L.invoke(this.M);
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        this.L.invoke(null);
    }
}
