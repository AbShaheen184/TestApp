package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public static final /* synthetic */ y1[] A;
    public static final y1 e;
    public static final y1 y;
    public static final y1 z;

    static {
        y1 y1Var = new y1("ContinueTraversal", 0);
        e = y1Var;
        y1 y1Var2 = new y1("SkipSubtreeAndContinueTraversal", 1);
        y = y1Var2;
        y1 y1Var3 = new y1("CancelTraversal", 2);
        z = y1Var3;
        A = new y1[]{y1Var, y1Var2, y1Var3};
    }

    public static y1 valueOf(String str) {
        return (y1) Enum.valueOf(y1.class, str);
    }

    public static y1[] values() {
        return (y1[]) A.clone();
    }
}
