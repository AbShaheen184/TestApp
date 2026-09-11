package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;
import androidx.media3.datasource.y;
import androidx.media3.exoplayer.source.v0;
import androidx.media3.extractor.h0;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends a {
    public final int L;
    public final r M;
    public long N;
    public boolean O;

    public m(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, long j, long j2, long j3, int i2, r rVar2) {
        super(hVar, lVar, rVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.L = i2;
        this.M = rVar2;
    }

    @Override // androidx.media3.exoplayer.source.chunk.k
    public final boolean b() {
        return this.O;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void c() {
        y yVar = this.F;
        androidx.media3.common.util.b bVar = this.J;
        bVar.getClass();
        int iA = 0;
        for (v0 v0Var : (v0[]) bVar.z) {
            if (v0Var.H != 0) {
                v0Var.H = 0L;
                v0Var.B = true;
            }
        }
        h0 h0VarI = bVar.I(this.L);
        h0VarI.e(this.M);
        try {
            long jT = yVar.t(this.y.c(this.N));
            if (jT != -1) {
                jT += this.N;
            }
            androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(this.F, this.N, jT);
            while (true) {
                long j = this.N;
                if (iA == -1) {
                    h0VarI.g(this.D, 1, (int) j, 0, null);
                    n.f(yVar);
                    this.O = true;
                    return;
                }
                this.N = j + ((long) iA);
                iA = h0VarI.a(kVar, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            n.f(yVar);
            throw th;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void e() {
    }
}
