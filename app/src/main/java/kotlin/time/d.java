package kotlin.time;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final d e = new d(4611686018427387903L, true);
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;

    static {
        new d(Long.MAX_VALUE, false);
    }

    public d(long j, boolean z) {
        this.a = j;
        this.b = z;
        long j2 = 10;
        this.c = j / j2;
        this.d = j % j2;
    }
}
