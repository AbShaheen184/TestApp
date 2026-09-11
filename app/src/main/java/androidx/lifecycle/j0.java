package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements t, AutoCloseable {
    public final String e;
    public final i0 y;
    public boolean z;

    public j0(String str, i0 i0Var) {
        this.e = str;
        this.y = i0Var;
    }

    public final void L(p pVar, androidx.savedstate.e eVar) {
        eVar.getClass();
        pVar.getClass();
        if (this.z) {
            net.luminis.tls.engine.impl.c.r("Already attached to lifecycleOwner");
            return;
        }
        this.z = true;
        pVar.a(this);
        eVar.c(this.e, (androidx.activity.g) this.y.b.B);
    }

    @Override // androidx.lifecycle.t
    public final void g(v vVar, n nVar) {
        if (nVar == n.ON_DESTROY) {
            this.z = false;
            vVar.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
