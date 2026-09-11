package androidx.media3.extractor.mp3;

import androidx.media3.common.util.j0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {
    public final long a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public j(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.mp3.h
    public final long a(long j) {
        long j2 = j - this.a;
        if (!c() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.e;
        int iF = j0.f(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (((long) iF) * j3) / 100;
        long j5 = jArr[iF];
        int i = iF + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iF == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // androidx.media3.extractor.mp3.h
    public final long b() {
        return this.f;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return this.g != null;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        double d;
        double d2;
        boolean zC = c();
        int i = this.b;
        long j2 = this.a;
        if (!zC) {
            b0 b0Var = new b0(0L, j2 + ((long) i));
            return new z(b0Var, b0Var);
        }
        long jK = j0.k(j, 0L, this.c);
        double d3 = (jK * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.e;
        b0 b0Var2 = new b0(jK, j2 + j0.k(Math.round((d4 / d) * j3), i, j3 - 1));
        return new z(b0Var2, b0Var2);
    }

    @Override // androidx.media3.extractor.mp3.h
    public final int f() {
        return this.d;
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.c;
    }
}
