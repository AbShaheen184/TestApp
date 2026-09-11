package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements u, t {
    public long A;
    public long B;
    public long C;
    public final o e;
    public t y;
    public c[] z = new c[0];

    public d(o oVar, boolean z, long j) {
        this.e = oVar;
        this.A = z ? 0L : -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = j;
    }

    public final boolean a() {
        return this.A != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        return this.e.d(n0Var);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        long jF = this.e.f();
        if (jF != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || jF < j) {
                return jF;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() {
        this.e.h();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        if (j == 0) {
            return 0L;
        }
        long jK = androidx.media3.common.util.j0.k(k1Var.a, 0L, j);
        long j2 = k1Var.b;
        long j3 = this.C;
        long jK2 = androidx.media3.common.util.j0.k(j2, 0L, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j);
        if (jK != k1Var.a || jK2 != k1Var.b) {
            k1Var = new k1(jK, jK2);
        }
        return this.e.i(j, k1Var);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) {
        this.A = -9223372036854775807L;
        for (c cVar : this.z) {
            if (cVar != null) {
                cVar.y = false;
            }
        }
        long j2 = this.e.j(j);
        long j3 = this.C;
        long jMax = Math.max(j2, 0L);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) {
        this.e.k(j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) {
        long j2;
        this.z = new c[w0VarArr.length];
        w0[] w0VarArr2 = new w0[w0VarArr.length];
        for (int i = 0; i < w0VarArr.length; i++) {
            c[] cVarArr = this.z;
            c cVar = (c) w0VarArr[i];
            cVarArr[i] = cVar;
            w0VarArr2[i] = cVar != null ? cVar.e : null;
        }
        long jL = this.e.l(qVarArr, zArr, w0VarArr2, zArr2, j);
        long j3 = this.C;
        long jMax = Math.max(jL, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (a()) {
            if (jL >= j) {
                if (jL != 0) {
                    int length = qVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i2];
                            if (qVar != null) {
                                androidx.media3.common.r rVarN = qVar.n();
                                if (!androidx.media3.common.i0.a(rVarN.o, rVarN.k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.A = j2;
        for (int i3 = 0; i3 < w0VarArr.length; i3++) {
            w0 w0Var = w0VarArr2[i3];
            c[] cVarArr2 = this.z;
            if (w0Var == null) {
                cVarArr2[i3] = null;
            } else {
                c cVar2 = cVarArr2[i3];
                if (cVar2 == null || cVar2.e != w0Var) {
                    cVarArr2[i3] = new c(this, w0Var);
                }
            }
            w0VarArr[i3] = cVarArr2[i3];
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void m(u uVar) {
        t tVar = this.y;
        tVar.getClass();
        tVar.m(this);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.e.n();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void o(y0 y0Var) {
        t tVar = this.y;
        tVar.getClass();
        tVar.o(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        if (a()) {
            long j = this.A;
            this.A = -9223372036854775807L;
            this.B = j;
            long jP = p();
            return jP != -9223372036854775807L ? jP : j;
        }
        long jP2 = this.e.p();
        if (jP2 != -9223372036854775807L) {
            long j2 = this.C;
            long jMax = Math.max(jP2, 0L);
            if (j2 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j2);
            }
            if (jMax != this.B) {
                this.B = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.y = tVar;
        this.e.q(this, j);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        return this.e.r();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        long jT = this.e.t();
        if (jT != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || jT < j) {
                return jT;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        this.e.v(j);
    }
}
