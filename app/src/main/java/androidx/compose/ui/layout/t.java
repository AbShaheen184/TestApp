package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static final t e;
    public static final t y;
    public static final /* synthetic */ t[] z;

    static {
        t tVar = new t("Min", 0);
        e = tVar;
        t tVar2 = new t("Max", 1);
        y = tVar2;
        z = new t[]{tVar, tVar2};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) z.clone();
    }
}
