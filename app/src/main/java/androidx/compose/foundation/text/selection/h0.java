package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final /* synthetic */ h0[] A;
    public static final h0 e;
    public static final h0 y;
    public static final h0 z;

    static {
        h0 h0Var = new h0("Left", 0);
        e = h0Var;
        h0 h0Var2 = new h0("Middle", 1);
        y = h0Var2;
        h0 h0Var3 = new h0("Right", 2);
        z = h0Var3;
        A = new h0[]{h0Var, h0Var2, h0Var3};
    }

    public static h0 valueOf(String str) {
        return (h0) Enum.valueOf(h0.class, str);
    }

    public static h0[] values() {
        return (h0[]) A.clone();
    }
}
