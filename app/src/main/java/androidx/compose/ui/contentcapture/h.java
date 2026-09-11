package androidx.compose.ui.contentcapture;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final h e;
    public static final h y;
    public static final /* synthetic */ h[] z;

    static {
        h hVar = new h("VIEW_APPEAR", 0);
        e = hVar;
        h hVar2 = new h("VIEW_DISAPPEAR", 1);
        y = hVar2;
        z = new h[]{hVar, hVar2};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) z.clone();
    }
}
