package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.j0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {
    public final long[] a;
    public final long[] b;
    public final long c;

    public c(long j, long[] jArr, long[] jArr2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? j0.Q(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair h(long j, long[] jArr, long[] jArr2) {
        int iF = j0.f(jArr, j, true);
        long j2 = jArr[iF];
        long j3 = jArr2[iF];
        int i = iF + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // androidx.media3.extractor.mp3.h
    public final long a(long j) {
        return j0.Q(((Long) h(j, this.a, this.b).second).longValue());
    }

    @Override // androidx.media3.extractor.mp3.h
    public final long b() {
        return -1L;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        Pair pairH = h(j0.d0(j0.k(j, 0L, this.c)), this.b, this.a);
        b0 b0Var = new b0(j0.Q(((Long) pairH.first).longValue()), ((Long) pairH.second).longValue());
        return new z(b0Var, b0Var);
    }

    @Override // androidx.media3.extractor.mp3.h
    public final int f() {
        return -2147483647;
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.c;
    }
}
