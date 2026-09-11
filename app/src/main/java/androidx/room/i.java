package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    public static final /* synthetic */ i[] A;
    public static final i e;
    public static final i y;
    public static final i z;

    static {
        i iVar = new i("NO_OP", 0);
        e = iVar;
        i iVar2 = new i("ADD", 1);
        y = iVar2;
        i iVar3 = new i("REMOVE", 2);
        z = iVar3;
        A = new i[]{iVar, iVar2, iVar3};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) A.clone();
    }
}
