package retrofit2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends z0 {
    public final boolean c;

    public h0(boolean z) {
        this.c = z;
    }

    @Override // retrofit2.z0
    public final void a(o0 o0Var, Object obj) {
        if (obj == null) {
            return;
        }
        o0Var.d(obj.toString(), null, this.c);
    }
}
