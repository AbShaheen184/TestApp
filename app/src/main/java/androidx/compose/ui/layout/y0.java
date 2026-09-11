package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends androidx.compose.ui.q implements androidx.compose.ui.node.u {
    public kotlin.jvm.functions.l L;
    public long M;

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return true;
    }

    @Override // androidx.compose.ui.node.u
    public final void l(long j) {
        if (androidx.compose.ui.unit.l.a(this.M, j)) {
            return;
        }
        this.L.invoke(new androidx.compose.ui.unit.l(j));
        this.M = j;
    }
}
