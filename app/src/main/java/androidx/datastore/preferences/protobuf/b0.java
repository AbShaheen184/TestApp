package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b0 {
    public static final a0 a;
    public static final a0 b;

    static {
        r0 r0Var = r0.c;
        a0 a0Var = null;
        try {
            a0Var = (a0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = a0Var;
        b = new a0();
    }
}
