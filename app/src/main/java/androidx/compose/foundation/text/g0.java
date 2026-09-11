package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {
    public static final /* synthetic */ g0[] A;
    public static final g0 e;
    public static final g0 y;
    public static final g0 z;

    static {
        g0 g0Var = new g0("None", 0);
        e = g0Var;
        g0 g0Var2 = new g0("Selection", 1);
        y = g0Var2;
        g0 g0Var3 = new g0("Cursor", 2);
        z = g0Var3;
        A = new g0[]{g0Var, g0Var2, g0Var3};
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) A.clone();
    }
}
