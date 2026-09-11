package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public static final x e;
    public static final x y;
    public static final /* synthetic */ x[] z;

    static {
        x xVar = new x("DEFERRED", 0);
        e = xVar;
        x xVar2 = new x("IMMEDIATE", 1);
        y = xVar2;
        z = new x[]{xVar, xVar2, new x("EXCLUSIVE", 2)};
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) z.clone();
    }
}
