package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    public static final f1 e;
    public static final f1 y;
    public static final /* synthetic */ f1[] z;

    static {
        f1 f1Var = new f1("Min", 0);
        e = f1Var;
        f1 f1Var2 = new f1("Max", 1);
        y = f1Var2;
        z = new f1[]{f1Var, f1Var2};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) z.clone();
    }
}
