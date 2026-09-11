package androidx.media3.extractor.ts;

import androidx.media3.common.util.h0;
import androidx.media3.common.util.j0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w {
    public final /* synthetic */ int a;
    public final h0 b;
    public final androidx.media3.common.util.w c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public w(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new h0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new androidx.media3.common.util.w();
                break;
            default:
                this.b = new h0(0L);
                this.g = -9223372036854775807L;
                this.h = -9223372036854775807L;
                this.i = -9223372036854775807L;
                this.c = new androidx.media3.common.util.w();
                break;
        }
    }

    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long c(androidx.media3.common.util.w wVar) {
        int i = wVar.b;
        if (wVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wVar.k(bArr, 0, 9);
        wVar.M(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public final void a(androidx.media3.extractor.o oVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = j0.b;
                androidx.media3.common.util.w wVar = this.c;
                wVar.getClass();
                wVar.K(bArr, bArr.length);
                this.d = true;
                oVar.n();
                break;
            default:
                byte[] bArr2 = j0.b;
                androidx.media3.common.util.w wVar2 = this.c;
                wVar2.getClass();
                wVar2.K(bArr2, bArr2.length);
                this.d = true;
                oVar.n();
                break;
        }
    }
}
