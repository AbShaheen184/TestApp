package androidx.compose.ui.spatial;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a = (((long) 1023) << 50) ^ (-1);
    public static final long b = (-1) ^ (((long) 33554431) << 25);
    public static final long c;

    static {
        long j = 33554431;
        c = j | (((long) Math.min(0, 1023)) << 50) | (j << 25);
    }
}
