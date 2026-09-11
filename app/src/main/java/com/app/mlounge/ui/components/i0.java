package com.app.mlounge.ui.components;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends androidx.compose.ui.graphics.painter.b {
    public final /* synthetic */ androidx.compose.ui.graphics.vector.j0 C;
    public final /* synthetic */ long D;

    public i0(androidx.compose.ui.graphics.vector.j0 j0Var, long j) {
        this.C = j0Var;
        this.D = j;
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final long h() {
        return this.C.h();
    }

    @Override // androidx.compose.ui.graphics.painter.b
    public final void i(androidx.compose.ui.node.h0 h0Var) {
        this.C.g(h0Var, h0Var.e.d(), 1.0f, new androidx.compose.ui.graphics.m(this.D, 5));
    }
}
