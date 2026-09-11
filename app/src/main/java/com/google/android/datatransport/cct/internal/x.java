package com.google.android.datatransport.cct.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x e;
    public static final /* synthetic */ x[] y;

    /* JADX INFO: Fake field, exist only in values array */
    x EF0;

    static {
        x xVar = new x("UNKNOWN", 0);
        x xVar2 = new x("ANDROID_FIREBASE", 1);
        e = xVar2;
        y = new x[]{xVar, xVar2};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) y.clone();
    }
}
