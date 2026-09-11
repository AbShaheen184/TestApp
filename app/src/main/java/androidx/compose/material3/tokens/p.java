package androidx.compose.material3.tokens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final p A;
    public static final /* synthetic */ p[] B;
    public static final p e;
    public static final p y;
    public static final p z;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    static {
        p pVar = new p("DefaultSpatial", 0);
        p pVar2 = new p("FastSpatial", 1);
        e = pVar2;
        p pVar3 = new p("SlowSpatial", 2);
        p pVar4 = new p("DefaultEffects", 3);
        y = pVar4;
        p pVar5 = new p("FastEffects", 4);
        z = pVar5;
        p pVar6 = new p("SlowEffects", 5);
        A = pVar6;
        B = new p[]{pVar, pVar2, pVar3, pVar4, pVar5, pVar6};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) B.clone();
    }
}
