package androidx.media3.extractor.wav;

import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.common.q;
import androidx.media3.common.r;
import androidx.media3.container.v;
import androidx.media3.extractor.h0;
import androidx.media3.extractor.o;
import androidx.media3.extractor.p;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {
    public final p a;
    public final h0 b;
    public final v c;
    public final r d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public c(p pVar, h0 h0Var, v vVar, String str, int i) throws j0 {
        this.a = pVar;
        this.b = h0Var;
        this.c = vVar;
        int i2 = vVar.a;
        int i3 = vVar.b;
        int i4 = (vVar.d * i2) / 8;
        int i5 = vVar.c;
        if (i5 != i4) {
            throw j0.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        q qVar = new q();
        qVar.m = i0.p("audio/wav");
        qVar.n = i0.p(str);
        qVar.h = i7;
        qVar.i = i7;
        qVar.o = iMax;
        qVar.F = i2;
        qVar.G = i3;
        qVar.H = i;
        this.d = new r(qVar);
    }

    @Override // androidx.media3.extractor.wav.b
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // androidx.media3.extractor.wav.b
    public final boolean b(o oVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iA = this.b.a(oVar, (int) Math.min(i2 - i, j2), true);
            if (iA == -1) {
                j2 = 0;
            } else {
                this.g += iA;
                j2 -= (long) iA;
            }
        }
        v vVar = this.c;
        int i3 = vVar.c;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = vVar.b;
            String str = androidx.media3.common.util.j0.a;
            long jY = j3 + androidx.media3.common.util.j0.Y(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.g(jY, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // androidx.media3.extractor.wav.b
    public final void c(int i, long j) {
        f fVar = new f(this.c, 1, i, j);
        this.a.g(fVar);
        r rVar = this.d;
        h0 h0Var = this.b;
        h0Var.e(rVar);
        h0Var.d(fVar.e);
    }
}
