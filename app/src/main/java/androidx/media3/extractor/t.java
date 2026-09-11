package androidx.media3.extractor;

import androidx.media3.common.util.j0;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final androidx.media3.common.util.b k;
    public final androidx.media3.common.h0 l;

    public t(byte[] bArr, int i) {
        androidx.media3.common.util.v vVar = new androidx.media3.common.util.v(bArr, bArr.length);
        vVar.m(i * 8);
        this.a = vVar.g(16);
        this.b = vVar.g(16);
        this.c = vVar.g(24);
        this.d = vVar.g(24);
        int iG = vVar.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = vVar.g(3) + 1;
        int iG2 = vVar.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = vVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final androidx.media3.common.r c(byte[] bArr, androidx.media3.common.h0 h0Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        androidx.media3.common.h0 h0Var2 = this.l;
        if (h0Var2 != null) {
            h0Var = h0Var2.b(h0Var);
        }
        androidx.media3.common.q qVar = new androidx.media3.common.q();
        qVar.n = androidx.media3.common.i0.p("audio/flac");
        qVar.o = i;
        qVar.F = this.g;
        qVar.G = this.e;
        String str = j0.a;
        qVar.H = j0.D(this.h, ByteOrder.LITTLE_ENDIAN);
        qVar.q = Collections.singletonList(bArr);
        qVar.k = h0Var;
        return new androidx.media3.common.r(qVar);
    }

    public t(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, androidx.media3.common.util.b bVar, androidx.media3.common.h0 h0Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = bVar;
        this.l = h0Var;
    }
}
