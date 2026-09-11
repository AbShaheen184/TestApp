package androidx.sqlite.driver;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final c A;
    public static final c B;
    public static final /* synthetic */ c[] C;
    public static final c e;
    public static final c y;
    public static final c z;

    static {
        c cVar = new c("END", 0);
        e = cVar;
        c cVar2 = new c("ROLLBACK", 1);
        y = cVar2;
        c cVar3 = new c("BEGIN_EXCLUSIVE", 2);
        z = cVar3;
        c cVar4 = new c("BEGIN_IMMEDIATE", 3);
        A = cVar4;
        c cVar5 = new c("BEGIN_DEFERRED", 4);
        B = cVar5;
        C = new c[]{cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) C.clone();
    }
}
