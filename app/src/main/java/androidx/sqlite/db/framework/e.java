package androidx.sqlite.db.framework;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public static final e A;
    public static final e B;
    public static final /* synthetic */ e[] C;
    public static final e e;
    public static final e y;
    public static final e z;

    static {
        e eVar = new e("ON_CONFIGURE", 0);
        e = eVar;
        e eVar2 = new e("ON_CREATE", 1);
        y = eVar2;
        e eVar3 = new e("ON_UPGRADE", 2);
        z = eVar3;
        e eVar4 = new e("ON_DOWNGRADE", 3);
        A = eVar4;
        e eVar5 = new e("ON_OPEN", 4);
        B = eVar5;
        C = new e[]{eVar, eVar2, eVar3, eVar4, eVar5};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) C.clone();
    }
}
