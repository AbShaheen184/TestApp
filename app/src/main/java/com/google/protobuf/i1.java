package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 {
    public static final h1 a;
    public static final h1 b;

    static {
        Class cls = d.a;
        h1 h1Var = null;
        try {
            h1Var = (h1) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = h1Var;
        b = new h1();
    }
}
