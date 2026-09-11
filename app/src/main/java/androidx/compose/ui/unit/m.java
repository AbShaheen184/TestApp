package androidx.compose.ui.unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m e;
    public static final m y;
    public static final /* synthetic */ m[] z;

    static {
        m mVar = new m("Ltr", 0);
        e = mVar;
        m mVar2 = new m("Rtl", 1);
        y = mVar2;
        z = new m[]{mVar, mVar2};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) z.clone();
    }
}
