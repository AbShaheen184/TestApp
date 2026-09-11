package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements j0 {
    public j0[] a;

    @Override // androidx.datastore.preferences.protobuf.j0
    public final t0 a(Class cls) {
        for (j0 j0Var : this.a) {
            if (j0Var.b(cls)) {
                return j0Var.a(cls);
            }
        }
        com.google.gson.b.r("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.j0
    public final boolean b(Class cls) {
        for (j0 j0Var : this.a) {
            if (j0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
