package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {
    public static final u0 e;
    public static final u0 y;
    public static final /* synthetic */ u0[] z;

    static {
        u0 u0Var = new u0("Width", 0);
        e = u0Var;
        u0 u0Var2 = new u0("Height", 1);
        y = u0Var2;
        z = new u0[]{u0Var, u0Var2};
    }

    public static u0 valueOf(String str) {
        return (u0) Enum.valueOf(u0.class, str);
    }

    public static u0[] values() {
        return (u0[]) z.clone();
    }
}
