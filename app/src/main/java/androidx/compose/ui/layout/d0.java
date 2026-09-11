package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public kotlin.jvm.functions.q L;

    @Override // androidx.compose.ui.node.v
    public final r0 c(s0 s0Var, p0 p0Var, long j) {
        return (r0) this.L.invoke(s0Var, p0Var, new androidx.compose.ui.unit.a(j));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.L + ')';
    }
}
