package androidx.compose.runtime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {
    public static final q0 A;
    public static final /* synthetic */ q0[] B;
    public static final q0 e;
    public static final q0 y;
    public static final q0 z;

    static {
        q0 q0Var = new q0("IGNORED", 0);
        e = q0Var;
        q0 q0Var2 = new q0("SCHEDULED", 1);
        y = q0Var2;
        q0 q0Var3 = new q0("DEFERRED", 2);
        z = q0Var3;
        q0 q0Var4 = new q0("IMMINENT", 3);
        A = q0Var4;
        B = new q0[]{q0Var, q0Var2, q0Var3, q0Var4};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) B.clone();
    }
}
