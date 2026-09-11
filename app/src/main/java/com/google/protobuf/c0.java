package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final b0 a = new b0();
    public static final b0 b;

    static {
        Class cls = d.a;
        b0 b0Var = null;
        try {
            b0Var = (b0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = b0Var;
    }
}
