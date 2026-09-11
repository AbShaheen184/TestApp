package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static g0 a(Object obj, Object obj2) {
        g0 g0VarB = (g0) obj;
        g0 g0Var = (g0) obj2;
        if (!g0Var.isEmpty()) {
            if (!g0VarB.e) {
                g0VarB = g0VarB.b();
            }
            g0VarB.a();
            if (!g0Var.isEmpty()) {
                g0VarB.putAll(g0Var);
            }
        }
        return g0VarB;
    }
}
