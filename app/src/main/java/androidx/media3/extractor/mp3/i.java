package androidx.media3.extractor.mp3;

import androidx.media3.common.util.j0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public i(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // androidx.media3.extractor.mp3.h
    public final long a(long j) {
        return this.a[j0.f(this.b, j, true)];
    }

    @Override // androidx.media3.extractor.mp3.h
    public final long b() {
        return this.d;
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        long[] jArr = this.a;
        int iF = j0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        b0 b0Var = new b0(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new z(b0Var, b0Var);
        }
        int i = iF + 1;
        return new z(b0Var, new b0(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.mp3.h
    public final int f() {
        return this.e;
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.c;
    }
}
