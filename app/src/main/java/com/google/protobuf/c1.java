package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {
    public static final b1 a;
    public static final b1 b;

    static {
        Class cls = d.a;
        b1 b1Var = null;
        try {
            b1Var = (b1) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = b1Var;
        b = new b1();
    }
}
