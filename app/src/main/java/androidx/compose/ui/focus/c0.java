package androidx.compose.ui.focus;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final /* synthetic */ c0[] A;
    public static final c0 e;
    public static final c0 y;
    public static final c0 z;

    static {
        c0 c0Var = new c0("Active", 0);
        e = c0Var;
        c0 c0Var2 = new c0("ActiveParent", 1);
        y = c0Var2;
        c0 c0Var3 = new c0("Captured", 2);
        c0 c0Var4 = new c0("Inactive", 3);
        z = c0Var4;
        A = new c0[]{c0Var, c0Var2, c0Var3, c0Var4};
    }

    public static c0 valueOf(String str) {
        return (c0) Enum.valueOf(c0.class, str);
    }

    public static c0[] values() {
        return (c0[]) A.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                coil3.g.a();
                return false;
            }
        }
        return true;
    }
}
