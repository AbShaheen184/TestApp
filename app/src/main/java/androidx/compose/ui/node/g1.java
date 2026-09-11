package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public static final g1 e;
    public static final g1 y;
    public static final /* synthetic */ g1[] z;

    static {
        g1 g1Var = new g1("Width", 0);
        e = g1Var;
        g1 g1Var2 = new g1("Height", 1);
        y = g1Var2;
        z = new g1[]{g1Var, g1Var2};
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) z.clone();
    }
}
