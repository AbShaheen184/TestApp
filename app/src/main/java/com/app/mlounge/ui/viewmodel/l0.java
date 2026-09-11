package com.app.mlounge.ui.viewmodel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {
    public static final /* synthetic */ l0[] A;
    public static final l0 e;
    public static final l0 y;
    public static final l0 z;

    static {
        l0 l0Var = new l0("SEARCHING", 0);
        e = l0Var;
        l0 l0Var2 = new l0("DONE", 1);
        y = l0Var2;
        l0 l0Var3 = new l0("FAILED", 2);
        z = l0Var3;
        A = new l0[]{l0Var, l0Var2, l0Var3};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) A.clone();
    }
}
