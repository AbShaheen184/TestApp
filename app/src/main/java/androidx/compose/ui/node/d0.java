package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {
    public static final /* synthetic */ d0[] A;
    public static final d0 e;
    public static final d0 y;
    public static final d0 z;

    static {
        d0 d0Var = new d0("InMeasureBlock", 0);
        e = d0Var;
        d0 d0Var2 = new d0("InLayoutBlock", 1);
        y = d0Var2;
        d0 d0Var3 = new d0("NotUsed", 2);
        z = d0Var3;
        A = new d0[]{d0Var, d0Var2, d0Var3};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) A.clone();
    }
}
