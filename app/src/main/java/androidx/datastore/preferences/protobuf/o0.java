package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static final n0 a;
    public static final n0 b;

    static {
        r0 r0Var = r0.c;
        n0 n0Var = null;
        try {
            n0Var = (n0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = n0Var;
        b = new n0();
    }
}
