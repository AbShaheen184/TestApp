package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 {
    public static final h0 a;
    public static final h0 b;

    static {
        r0 r0Var = r0.c;
        h0 h0Var = null;
        try {
            h0Var = (h0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h0Var;
        b = new h0();
    }
}
