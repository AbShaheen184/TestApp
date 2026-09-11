package androidx.media3.exoplayer.source;

import androidx.compose.animation.core.t2;
import androidx.media3.exoplayer.k1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements u, androidx.media3.exoplayer.upstream.i {
    public final t2 A;
    public final androidx.media3.exoplayer.drm.d B;
    public final i1 C;
    public final ArrayList D = new ArrayList();
    public final long E;
    public final androidx.media3.exoplayer.upstream.n F;
    public final androidx.media3.common.r G;
    public final boolean H;
    public boolean I;
    public byte[] J;
    public int K;
    public final androidx.media3.datasource.l e;
    public final androidx.media3.datasource.g y;
    public final androidx.media3.exoplayer.upstream.f z;

    public d1(androidx.media3.datasource.l lVar, androidx.media3.datasource.g gVar, androidx.media3.exoplayer.upstream.f fVar, androidx.media3.common.r rVar, long j, t2 t2Var, androidx.media3.exoplayer.drm.d dVar, boolean z, androidx.media3.exoplayer.util.a aVar) {
        this.e = lVar;
        this.y = gVar;
        this.z = fVar;
        this.G = rVar;
        this.E = j;
        this.A = t2Var;
        this.B = dVar;
        this.H = z;
        this.C = new i1(new androidx.media3.common.w0("", rVar));
        this.F = aVar != null ? new androidx.media3.exoplayer.upstream.n(aVar) : new androidx.media3.exoplayer.upstream.n("SingleSampleMediaPeriod");
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        if (this.I) {
            return false;
        }
        androidx.media3.exoplayer.upstream.n nVar = this.F;
        if (nVar.d() || nVar.c()) {
            return false;
        }
        androidx.media3.datasource.h hVarF = this.y.f();
        androidx.media3.exoplayer.upstream.f fVar = this.z;
        if (fVar != null) {
            hVarF.c(fVar);
        }
        nVar.f(new c1(hVarF, this.e), this, this.A.f(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        IOException iOException2;
        androidx.media3.exoplayer.upstream.h hVar;
        c1 c1Var = (c1) kVar;
        androidx.media3.datasource.y yVar = c1Var.y;
        n nVar = new n(c1Var.e, yVar.z, yVar.A, j, j2, yVar.y);
        String str = androidx.media3.common.util.j0.a;
        t2 t2Var = this.A;
        t2Var.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof androidx.media3.common.j0) || (cause instanceof FileNotFoundException) || (cause instanceof androidx.media3.datasource.q) || (cause instanceof androidx.media3.exoplayer.upstream.m) || ((cause instanceof androidx.media3.datasource.i) && ((androidx.media3.datasource.i) cause).e == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        boolean z = jMin == -9223372036854775807L || i >= t2Var.f(1);
        if (this.H && z) {
            iOException2 = iOException;
            androidx.media3.common.util.c.u("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException2);
            this.I = true;
            hVar = androidx.media3.exoplayer.upstream.n.e;
        } else {
            iOException2 = iOException;
            hVar = jMin != -9223372036854775807L ? new androidx.media3.exoplayer.upstream.h(jMin, 0, false) : androidx.media3.exoplayer.upstream.n.f;
        }
        this.B.e(nVar, 1, -1, this.G, 0, null, 0L, this.E, iOException2, !hVar.a());
        return hVar;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        return (this.I || this.F.d()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.D;
            if (i >= arrayList.size()) {
                return j;
            }
            b1 b1Var = (b1) arrayList.get(i);
            if (b1Var.e == 2) {
                b1Var.e = 1;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < qVarArr.length; i++) {
            w0 w0Var = w0VarArr[i];
            ArrayList arrayList = this.D;
            if (w0Var != null && (qVarArr[i] == null || !zArr[i])) {
                arrayList.remove(w0Var);
                w0VarArr[i] = null;
            }
            if (w0VarArr[i] == null && qVarArr[i] != null) {
                b1 b1Var = new b1(this);
                arrayList.add(b1Var);
                w0VarArr[i] = b1Var;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void m(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        c1 c1Var = (c1) kVar;
        androidx.media3.datasource.y yVar = c1Var.y;
        this.B.g(i == 0 ? new n(c1Var.e, j) : new n(c1Var.e, yVar.z, yVar.A, j, j2, yVar.y), 1, -1, this.G, 0, null, 0L, this.E, i);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.F.d();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        tVar.m(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        return this.C;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        c1 c1Var = (c1) kVar;
        this.K = (int) c1Var.y.y;
        byte[] bArr = c1Var.z;
        bArr.getClass();
        this.J = bArr;
        this.I = true;
        androidx.media3.datasource.y yVar = c1Var.y;
        n nVar = new n(c1Var.e, yVar.z, yVar.A, j, j2, this.K);
        this.A.getClass();
        this.B.d(nVar, 1, -1, this.G, 0, null, 0L, this.E);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        return this.I ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        c1 c1Var = (c1) kVar;
        androidx.media3.datasource.y yVar = c1Var.y;
        n nVar = new n(c1Var.e, yVar.z, yVar.A, j, j2, yVar.y);
        this.A.getClass();
        this.B.c(nVar, 1, -1, null, 0, null, 0L, this.E);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() {
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) {
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        return j;
    }
}
