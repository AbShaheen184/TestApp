package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q1 {
    public static final p1 a;
    public static final p1 b;

    static {
        Class cls = d.a;
        p1 p1Var = null;
        try {
            p1Var = (p1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = p1Var;
        b = new p1();
    }
}
