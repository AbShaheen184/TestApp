package androidx.compose.foundation.gestures;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public static final k1 e;
    public static final k1 y;
    public static final /* synthetic */ k1[] z;

    static {
        k1 k1Var = new k1("Vertical", 0);
        e = k1Var;
        k1 k1Var2 = new k1("Horizontal", 1);
        y = k1Var2;
        z = new k1[]{k1Var, k1Var2};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) z.clone();
    }
}
