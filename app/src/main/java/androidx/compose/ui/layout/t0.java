package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public static final t0 e;
    public static final t0 y;
    public static final /* synthetic */ t0[] z;

    static {
        t0 t0Var = new t0("Min", 0);
        e = t0Var;
        t0 t0Var2 = new t0("Max", 1);
        y = t0Var2;
        z = new t0[]{t0Var, t0Var2};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) z.clone();
    }
}
