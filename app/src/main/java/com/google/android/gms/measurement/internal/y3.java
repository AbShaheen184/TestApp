package com.google.android.gms.measurement.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y3 {
    public static final y3 e;
    public static final y3 y;
    public static final /* synthetic */ y3[] z;

    static {
        y3 y3Var = new y3("CONSENT", 0);
        e = y3Var;
        y3 y3Var2 = new y3("LEGITIMATE_INTEREST", 1);
        y3 y3Var3 = new y3("FLEXIBLE_CONSENT", 2);
        y3 y3Var4 = new y3("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        y = y3Var4;
        z = new y3[]{y3Var, y3Var2, y3Var3, y3Var4};
    }

    public static y3[] values() {
        return (y3[]) z.clone();
    }
}
