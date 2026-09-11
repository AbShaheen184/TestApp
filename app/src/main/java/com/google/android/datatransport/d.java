package com.google.android.datatransport;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final /* synthetic */ d[] A;
    public static final d e;
    public static final d y;
    public static final d z;

    static {
        d dVar = new d("DEFAULT", 0);
        e = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        y = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        z = dVar3;
        A = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) A.clone();
    }
}
