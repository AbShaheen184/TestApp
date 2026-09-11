package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 extends Exception {
    public final int e;
    public final long y;

    static {
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(0, 1, 2, 3, 4);
        androidx.media3.common.util.j0.K(5);
    }

    public k0(String str, Throwable th, int i, long j) {
        super(str, th);
        this.e = i;
        this.y = j;
    }
}
