package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static final j0 e;
    public static final /* synthetic */ j0[] y;

    static {
        j0 j0Var = new j0("DEFAULT", 0);
        e = j0Var;
        j0 j0Var2 = new j0("UNMETERED_ONLY", 1);
        j0 j0Var3 = new j0("UNMETERED_OR_DAILY", 2);
        j0 j0Var4 = new j0("FAST_IF_RADIO_AWAKE", 3);
        j0 j0Var5 = new j0("NEVER", 4);
        j0 j0Var6 = new j0("UNRECOGNIZED", 5);
        y = new j0[]{j0Var, j0Var2, j0Var3, j0Var4, j0Var5, j0Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, j0Var);
        sparseArray.put(1, j0Var2);
        sparseArray.put(2, j0Var3);
        sparseArray.put(3, j0Var4);
        sparseArray.put(4, j0Var5);
        sparseArray.put(-1, j0Var6);
    }

    public static j0 valueOf(String str) {
        return (j0) Enum.valueOf(j0.class, str);
    }

    public static j0[] values() {
        return (j0[]) y.clone();
    }
}
