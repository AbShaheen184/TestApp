package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {
    public static final e0 e;
    public static final e0 y;
    public static final /* synthetic */ e0[] z;

    static {
        e0 e0Var = new e0("Inherit", 0);
        e = e0Var;
        e0 e0Var2 = new e0("SecureOn", 1);
        y = e0Var2;
        z = new e0[]{e0Var, e0Var2, new e0("SecureOff", 2)};
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) z.clone();
    }
}
