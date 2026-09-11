package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.i0;
import androidx.media3.common.r;
import androidx.media3.common.util.w;
import androidx.media3.datasource.y;
import androidx.media3.exoplayer.source.v0;
import androidx.media3.extractor.h0;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends a {
    public final int L;
    public final long M;
    public final e N;
    public long O;
    public volatile boolean P;
    public boolean Q;

    public i(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, r rVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, e eVar) {
        super(hVar, lVar, rVar, i, obj, j, j2, j3, j4, j5);
        this.L = i2;
        this.M = j6;
        this.N = eVar;
    }

    @Override // androidx.media3.exoplayer.source.chunk.k
    public final long a() {
        return this.G + ((long) this.L);
    }

    @Override // androidx.media3.exoplayer.source.chunk.k
    public final boolean b() {
        return this.Q;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void c() {
        androidx.media3.common.util.b bVar = this.J;
        bVar.getClass();
        if (this.O == 0) {
            long j = this.M;
            for (v0 v0Var : (v0[]) bVar.z) {
                if (v0Var.H != j) {
                    v0Var.H = j;
                    v0Var.B = true;
                }
            }
            e eVar = this.N;
            long j2 = this.H;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.M;
            long j4 = this.I;
            eVar.b(bVar, j3, j4 != -9223372036854775807L ? j4 - this.M : -9223372036854775807L);
        }
        try {
            androidx.media3.datasource.l lVarC = this.y.c(this.O);
            y yVar = this.F;
            androidx.media3.extractor.k kVar = new androidx.media3.extractor.k(yVar, lVarC.f, yVar.t(lVarC));
            while (!this.P) {
                try {
                    int iC = this.N.e.c(kVar, e.H);
                    com.google.android.material.motion.a.q(iC != 1);
                    if (!(iC == 0)) {
                        break;
                    }
                } catch (Throwable th) {
                    this.O = kVar.A - this.y.f;
                    throw th;
                }
            }
            r rVar = this.A;
            String str = rVar.n;
            int i = rVar.N;
            int i2 = rVar.O;
            if (i0.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                h0 h0VarI = bVar.I(4);
                int i3 = i * i2;
                long j5 = (this.E - this.D) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    h0VarI.f(0, new w());
                    h0VarI.g(((long) i4) * j5, 0, 0, 0, null);
                }
            }
            this.O = kVar.A - this.y.f;
            n.f(this.F);
            this.Q = !this.P;
        } catch (Throwable th2) {
            n.f(this.F);
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void e() {
        this.P = true;
    }
}
