package androidx.media3.extractor;

import androidx.media3.common.util.j0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements a0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public j(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length <= 0) {
            this.f = 0L;
        } else {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
        }
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        long[] jArr = this.e;
        int iF = j0.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        b0 b0Var = new b0(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new z(b0Var, b0Var);
        }
        int i = iF + 1;
        return new z(b0Var, new b0(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
