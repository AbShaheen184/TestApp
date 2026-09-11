package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {
    public static final /* synthetic */ m0[] A;
    public static final m0 e;
    public static final m0 y;
    public static final m0 z;

    static {
        m0 m0Var = new m0("PreEnter", 0);
        e = m0Var;
        m0 m0Var2 = new m0("Visible", 1);
        y = m0Var2;
        m0 m0Var3 = new m0("PostExit", 2);
        z = m0Var3;
        A = new m0[]{m0Var, m0Var2, m0Var3};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) A.clone();
    }
}
