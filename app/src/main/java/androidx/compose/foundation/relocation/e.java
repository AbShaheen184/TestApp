package androidx.compose.foundation.relocation;

import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends q {
    public c L;

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.a.j(this);
        }
        if (cVar != null) {
            cVar.a.b(this);
        }
        this.L = cVar;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        c cVar = this.L;
        if (cVar != null) {
            cVar.a.j(this);
        }
    }
}
