package androidx.compose.foundation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {
    public static final i1 e;
    public static final i1 y;
    public static final /* synthetic */ i1[] z;

    static {
        i1 i1Var = new i1("Default", 0);
        e = i1Var;
        i1 i1Var2 = new i1("UserInput", 1);
        y = i1Var2;
        z = new i1[]{i1Var, i1Var2, new i1("PreventUserInput", 2)};
    }

    public static i1 valueOf(String str) {
        return (i1) Enum.valueOf(i1.class, str);
    }

    public static i1[] values() {
        return (i1[]) z.clone();
    }
}
