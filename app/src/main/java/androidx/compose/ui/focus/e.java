package androidx.compose.ui.focus;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends androidx.compose.ui.q implements g {
    public kotlin.jvm.functions.l L;
    public c0 M;

    @Override // androidx.compose.ui.focus.g
    public final void X(c0 c0Var) {
        if (kotlin.jvm.internal.l.a(this.M, c0Var)) {
            return;
        }
        this.M = c0Var;
        this.L.invoke(c0Var);
    }
}
