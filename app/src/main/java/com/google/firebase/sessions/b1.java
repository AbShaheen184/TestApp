package com.google.firebase.sessions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public static final b1 e;
    public static final b1 y;
    public static final /* synthetic */ b1[] z;

    static {
        b1 b1Var = new b1("GENERAL", 0);
        e = b1Var;
        b1 b1Var2 = new b1("FALLBACK", 1);
        y = b1Var2;
        z = new b1[]{b1Var, b1Var2};
    }

    public static b1 valueOf(String str) {
        return (b1) Enum.valueOf(b1.class, str);
    }

    public static b1[] values() {
        return (b1[]) z.clone();
    }
}
