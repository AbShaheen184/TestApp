package com.appsalt.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {
    public static final n1 e;
    public static final n1 y;
    public static final /* synthetic */ n1[] z;

    static {
        n1 n1Var = new n1("FAILED", 0);
        e = n1Var;
        n1 n1Var2 = new n1("SUCCEEDED", 1);
        y = n1Var2;
        z = new n1[]{n1Var, n1Var2};
    }

    public static n1 valueOf(String str) {
        return (n1) Enum.valueOf(n1.class, str);
    }

    public static n1[] values() {
        return (n1[]) z.clone();
    }
}
