package com.google.android.gms.internal.measurement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b3 {
    public static final b3 A;
    public static final b3 B;
    public static final b3 C;
    public static final b3 D;
    public static final b3 E;
    public static final b3 F;
    public static final /* synthetic */ b3[] G;
    public static final b3 e;
    public static final b3 y;
    public static final b3 z;

    static {
        b3 b3Var = new b3("INT", 0);
        e = b3Var;
        b3 b3Var2 = new b3("LONG", 1);
        y = b3Var2;
        b3 b3Var3 = new b3("FLOAT", 2);
        z = b3Var3;
        b3 b3Var4 = new b3("DOUBLE", 3);
        A = b3Var4;
        b3 b3Var5 = new b3("BOOLEAN", 4);
        B = b3Var5;
        b3 b3Var6 = new b3("STRING", 5);
        C = b3Var6;
        s0 s0Var = t0.y;
        b3 b3Var7 = new b3("BYTE_STRING", 6);
        D = b3Var7;
        b3 b3Var8 = new b3("ENUM", 7);
        E = b3Var8;
        b3 b3Var9 = new b3("MESSAGE", 8);
        F = b3Var9;
        G = new b3[]{b3Var, b3Var2, b3Var3, b3Var4, b3Var5, b3Var6, b3Var7, b3Var8, b3Var9};
    }

    public static b3[] values() {
        return (b3[]) G.clone();
    }
}
