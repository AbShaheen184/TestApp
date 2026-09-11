package com.caverock.androidsvg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d e;
    public static final d y;
    public static final /* synthetic */ d[] z;

    static {
        d dVar = new d("all", 0);
        e = dVar;
        d dVar2 = new d("aural", 1);
        d dVar3 = new d("braille", 2);
        d dVar4 = new d("embossed", 3);
        d dVar5 = new d("handheld", 4);
        d dVar6 = new d("print", 5);
        d dVar7 = new d("projection", 6);
        d dVar8 = new d("screen", 7);
        y = dVar8;
        z = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, new d("speech", 8), new d("tty", 9), new d("tv", 10)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) z.clone();
    }
}
