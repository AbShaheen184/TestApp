package com.google.firebase.sessions.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d e;
    public static final d y;
    public static final /* synthetic */ d[] z;

    static {
        d dVar = new d("CRASHLYTICS", 0);
        e = dVar;
        d dVar2 = new d("PERFORMANCE", 1);
        y = dVar2;
        z = new d[]{dVar, dVar2, new d("MATT_SAYS_HI", 2)};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) z.clone();
    }
}
