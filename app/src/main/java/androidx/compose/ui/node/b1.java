package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {
    public final /* synthetic */ int a;

    public static final int a(int i, long j) {
        int i2 = x1.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static long c(int i, int i2, int i3, int i4) {
        return (((long) (i2 & 32767)) << 15) | ((long) (i & 32767)) | (((long) (i3 & 32767)) << 30) | (((long) (i4 & 32767)) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
