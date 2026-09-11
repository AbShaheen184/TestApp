package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p e;
    public static final p y;
    public static final /* synthetic */ p[] z;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    static {
        p pVar = new p("AUTOMATIC", 0);
        p pVar2 = new p("TRUNCATE", 1);
        e = pVar2;
        p pVar3 = new p("WRITE_AHEAD_LOGGING", 2);
        y = pVar3;
        z = new p[]{pVar, pVar2, pVar3};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) z.clone();
    }
}
