package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.r;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.w;
import androidx.media3.extractor.g0;
import androidx.media3.extractor.h0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h0 {
    public final int a;
    public final r b;
    public final androidx.media3.extractor.m c = new androidx.media3.extractor.m();
    public final d d;
    public r e;
    public h0 f;
    public long g;

    public c(int i, int i2, r rVar, d dVar) {
        this.a = i2;
        this.b = rVar;
        this.d = dVar;
    }

    @Override // androidx.media3.extractor.h0
    public final void b(w wVar, int i, int i2) {
        h0 h0Var = this.f;
        String str = j0.a;
        h0Var.f(i, wVar);
    }

    @Override // androidx.media3.extractor.h0
    public final int c(androidx.media3.common.i iVar, int i, boolean z) {
        h0 h0Var = this.f;
        String str = j0.a;
        return h0Var.a(iVar, i, z);
    }

    @Override // androidx.media3.extractor.h0
    public final void e(r rVar) {
        this.d.getClass();
        r rVar2 = this.b;
        if (rVar2 != null) {
            rVar = rVar.d(rVar2);
        }
        this.e = rVar;
        h0 h0Var = this.f;
        String str = j0.a;
        h0Var.e(rVar);
    }

    @Override // androidx.media3.extractor.h0
    public final void g(long j, int i, int i2, int i3, g0 g0Var) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f = this.c;
        }
        h0 h0Var = this.f;
        String str = j0.a;
        h0Var.g(j, i, i2, i3, g0Var);
    }
}
