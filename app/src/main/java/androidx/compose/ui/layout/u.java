package androidx.compose.ui.layout;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final u e;
    public static final u y;
    public static final /* synthetic */ u[] z;

    static {
        u uVar = new u("Width", 0);
        e = uVar;
        u uVar2 = new u("Height", 1);
        y = uVar2;
        z = new u[]{uVar, uVar2};
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) z.clone();
    }
}
