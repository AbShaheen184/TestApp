package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static final b0 A;
    public static final b0 B;
    public static final /* synthetic */ b0[] C;
    public static final b0 e;
    public static final b0 y;
    public static final b0 z;

    static {
        b0 b0Var = new b0("Measuring", 0);
        e = b0Var;
        b0 b0Var2 = new b0("LookaheadMeasuring", 1);
        y = b0Var2;
        b0 b0Var3 = new b0("LayingOut", 2);
        z = b0Var3;
        b0 b0Var4 = new b0("LookaheadLayingOut", 3);
        A = b0Var4;
        b0 b0Var5 = new b0("Idle", 4);
        B = b0Var5;
        C = new b0[]{b0Var, b0Var2, b0Var3, b0Var4, b0Var5};
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) C.clone();
    }
}
