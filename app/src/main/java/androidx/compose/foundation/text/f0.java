package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final /* synthetic */ f0[] A;
    public static final f0 e;
    public static final f0 y;
    public static final f0 z;

    static {
        f0 f0Var = new f0("Cursor", 0);
        e = f0Var;
        f0 f0Var2 = new f0("SelectionStart", 1);
        y = f0Var2;
        f0 f0Var3 = new f0("SelectionEnd", 2);
        z = f0Var3;
        A = new f0[]{f0Var, f0Var2, f0Var3};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) A.clone();
    }
}
