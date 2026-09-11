package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {
    public static final s1 A;
    public static final s1 B;
    public static final s1 C;
    public static final /* synthetic */ s1[] D;
    public static final s1 e;
    public static final s1 y;
    public static final s1 z;

    static {
        s1 s1Var = new s1("ShutDown", 0);
        e = s1Var;
        s1 s1Var2 = new s1("ShuttingDown", 1);
        y = s1Var2;
        s1 s1Var3 = new s1("Inactive", 2);
        z = s1Var3;
        s1 s1Var4 = new s1("InactivePendingWork", 3);
        A = s1Var4;
        s1 s1Var5 = new s1("Idle", 4);
        B = s1Var5;
        s1 s1Var6 = new s1("PendingWork", 5);
        C = s1Var6;
        D = new s1[]{s1Var, s1Var2, s1Var3, s1Var4, s1Var5, s1Var6};
    }

    public static s1 valueOf(String str) {
        return (s1) Enum.valueOf(s1.class, str);
    }

    public static s1[] values() {
        return (s1[]) D.clone();
    }
}
