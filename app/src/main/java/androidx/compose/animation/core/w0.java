package androidx.compose.animation.core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {
    public static final w0 e;
    public static final /* synthetic */ w0[] y;

    static {
        w0 w0Var = new w0("Restart", 0);
        e = w0Var;
        y = new w0[]{w0Var, new w0("Reverse", 1)};
    }

    public static w0 valueOf(String str) {
        return (w0) Enum.valueOf(w0.class, str);
    }

    public static w0[] values() {
        return (w0[]) y.clone();
    }
}
