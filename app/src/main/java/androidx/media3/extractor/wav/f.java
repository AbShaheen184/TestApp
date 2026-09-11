package androidx.media3.extractor.wav;

import androidx.media3.common.util.j0;
import androidx.media3.container.v;
import androidx.media3.extractor.a0;
import androidx.media3.extractor.b0;
import androidx.media3.extractor.z;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements a0 {
    public final v a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public f(v vVar, int i, long j, long j2) {
        this.a = vVar;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / ((long) vVar.c);
        this.d = j3;
        this.e = h(j3);
    }

    @Override // androidx.media3.extractor.a0
    public final boolean c() {
        return true;
    }

    @Override // androidx.media3.extractor.a0
    public final z e(long j) {
        v vVar = this.a;
        long j2 = (((long) vVar.b) * j) / (((long) this.b) * 1000000);
        long j3 = this.d - 1;
        long jK = j0.k(j2, 0L, j3);
        int i = vVar.c;
        long j4 = this.c;
        long jH = h(jK);
        b0 b0Var = new b0(jH, (((long) i) * jK) + j4);
        if (jH >= j || jK == j3) {
            return new z(b0Var, b0Var);
        }
        long j5 = jK + 1;
        return new z(b0Var, new b0(h(j5), (((long) i) * j5) + j4));
    }

    @Override // androidx.media3.extractor.a0
    public final long g() {
        return this.e;
    }

    public final long h(long j) {
        long j2 = j * ((long) this.b);
        long j3 = this.a.b;
        String str = j0.a;
        return j0.Y(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
