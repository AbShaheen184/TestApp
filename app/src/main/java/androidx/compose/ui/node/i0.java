package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final androidx.compose.ui.unit.d a = _COROUTINE.a.b();

    public static final m1 a(f0 f0Var) {
        m1 m1Var = f0Var.L;
        if (m1Var != null) {
            return m1Var;
        }
        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("LayoutNode should be attached to an owner");
    }
}
