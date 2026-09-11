package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d0 implements m {
    public static final d0 BEFORE_ROC;
    public static final d0 ROC;
    public static final /* synthetic */ d0[] a;

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) a.clone();
    }

    static {
        d0 d0Var = new d0("BEFORE_ROC", 0);
        BEFORE_ROC = d0Var;
        d0 d0Var2 = new d0("ROC", 1);
        ROC = d0Var2;
        a = new d0[]{d0Var, d0Var2};
    }

    @Override // j$.time.chrono.m
    public final int getValue() {
        return ordinal();
    }
}
