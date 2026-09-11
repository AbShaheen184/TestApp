package androidx.media3.extractor.mkv;

import androidx.media3.extractor.o;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a = new byte[8];
    public int b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public final long b(o oVar, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.b;
        byte[] bArr = this.a;
        if (i3 == 0) {
            if (!oVar.b(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 >= 8) {
                    i2 = -1;
                    break;
                }
                if ((d[i5] & ((long) i4)) != 0) {
                    i2 = i5 + 1;
                    break;
                }
                i5++;
            }
            this.c = i2;
            if (i2 == -1) {
                net.luminis.tls.engine.impl.c.r("No valid varint length mask found");
                return 0L;
            }
            this.b = 1;
        }
        int i6 = this.c;
        if (i6 > i) {
            this.b = 0;
            return -2L;
        }
        if (i6 != 1) {
            oVar.readFully(bArr, 1, i6 - 1);
        }
        this.b = 0;
        return a(bArr, this.c, z2);
    }
}
