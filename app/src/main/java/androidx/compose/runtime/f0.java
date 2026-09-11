package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements z1 {
    public final kotlin.jvm.functions.l e;
    public g0 y;

    public f0(kotlin.jvm.functions.l lVar) {
        this.e = lVar;
    }

    @Override // androidx.compose.runtime.z1
    public final void b() {
        g0 g0Var = this.y;
        if (g0Var != null) {
            g0Var.dispose();
        }
        this.y = null;
    }

    @Override // androidx.compose.runtime.z1
    public final void c() {
        this.y = (g0) this.e.invoke(j0.a);
    }

    @Override // androidx.compose.runtime.z1
    public final void a() {
    }
}
