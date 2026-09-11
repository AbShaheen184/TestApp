package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {
    public static final k1 A;
    public static final k1 B;
    public static final k1 C;
    public static final k1 D;
    public static final /* synthetic */ k1[] E;
    public static final k1 e;
    public static final k1 y;
    public static final k1 z;

    static {
        k1 k1Var = new k1("Invalid", 0);
        e = k1Var;
        k1 k1Var2 = new k1("Cancelled", 1);
        y = k1Var2;
        k1 k1Var3 = new k1("InitialPending", 2);
        z = k1Var3;
        k1 k1Var4 = new k1("RecomposePending", 3);
        A = k1Var4;
        k1 k1Var5 = new k1("Recomposing", 4);
        B = k1Var5;
        k1 k1Var6 = new k1("ApplyPending", 5);
        C = k1Var6;
        k1 k1Var7 = new k1("Applied", 6);
        D = k1Var7;
        E = new k1[]{k1Var, k1Var2, k1Var3, k1Var4, k1Var5, k1Var6, k1Var7};
    }

    public static k1 valueOf(String str) {
        return (k1) Enum.valueOf(k1.class, str);
    }

    public static k1[] values() {
        return (k1[]) E.clone();
    }
}
