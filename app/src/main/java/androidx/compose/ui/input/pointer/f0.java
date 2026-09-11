package androidx.compose.ui.input.pointer;

import androidx.compose.ui.platform.l1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends f {
    @Override // androidx.compose.ui.input.pointer.f
    public final void M0(s sVar) {
        t tVar = (t) androidx.compose.ui.node.k.h(this, l1.u);
        if (tVar != null) {
            ((androidx.compose.ui.platform.q) tVar).a = sVar;
        }
    }

    @Override // androidx.compose.ui.input.pointer.f
    public final boolean O0(int i) {
        return i == 3 || i == 4;
    }

    @Override // androidx.compose.ui.node.z1
    public final /* bridge */ /* synthetic */ Object i() {
        return "androidx.compose.ui.input.pointer.StylusHoverIcon";
    }
}
