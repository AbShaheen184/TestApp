package com.i4studio.subslib.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final b e;
    public static final b y;
    public static final /* synthetic */ b[] z;

    static {
        b bVar = new b("MOVIE", 0);
        e = bVar;
        b bVar2 = new b("TV", 1);
        y = bVar2;
        z = new b[]{bVar, bVar2};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) z.clone();
    }
}
