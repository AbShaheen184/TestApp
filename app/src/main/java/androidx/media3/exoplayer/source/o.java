package androidx.media3.exoplayer.source;

import androidx.appcompat.widget.c2;
import androidx.media3.exoplayer.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements u, t {
    public a A;
    public u B;
    public t C;
    public long D = -9223372036854775807L;
    public final v e;
    public final long y;
    public final c2 z;

    public o(v vVar, c2 c2Var, long j) {
        this.e = vVar;
        this.z = c2Var;
        this.y = j;
    }

    public final void a(v vVar) {
        long j = this.D;
        if (j == -9223372036854775807L) {
            j = this.y;
        }
        a aVar = this.A;
        aVar.getClass();
        u uVarB = aVar.b(vVar, this.z, j);
        this.B = uVarB;
        if (this.C != null) {
            uVarB.q(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        u uVar = this.B;
        return uVar != null && uVar.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.f();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() {
        u uVar = this.B;
        if (uVar != null) {
            uVar.h();
            return;
        }
        a aVar = this.A;
        if (aVar != null) {
            aVar.j();
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.i(j, k1Var);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.j(j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        uVar.k(j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) {
        long j2 = this.D;
        long j3 = (j2 == -9223372036854775807L || j != this.y) ? j : j2;
        this.D = -9223372036854775807L;
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.l(qVarArr, zArr, w0VarArr, zArr2, j3);
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void m(u uVar) {
        t tVar = this.C;
        String str = androidx.media3.common.util.j0.a;
        tVar.m(this);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        u uVar = this.B;
        return uVar != null && uVar.n();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void o(y0 y0Var) {
        t tVar = this.C;
        String str = androidx.media3.common.util.j0.a;
        tVar.o(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.p();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.C = tVar;
        u uVar = this.B;
        if (uVar != null) {
            long j2 = this.D;
            if (j2 == -9223372036854775807L) {
                j2 = this.y;
            }
            uVar.q(this, j2);
        }
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.r();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        return uVar.t();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        u uVar = this.B;
        String str = androidx.media3.common.util.j0.a;
        uVar.v(j);
    }
}
