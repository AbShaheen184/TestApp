package okhttp3.internal.http2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public int a;
    public final int[] b = new int[10];

    public final int a() {
        if ((this.a & 16) != 0) {
            return this.b[4];
        }
        return 65535;
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i >= iArr.length) {
                return;
            }
            this.a = (1 << i) | this.a;
            iArr[i] = i2;
        }
    }
}
