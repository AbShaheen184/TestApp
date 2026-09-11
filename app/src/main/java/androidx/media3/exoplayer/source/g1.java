package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements u, t {
    public final u e;
    public final long y;
    public t z;

    public g1(u uVar, long j) {
        this.e = uVar;
        this.y = j;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean d(androidx.media3.exoplayer.n0 n0Var) {
        androidx.media3.exoplayer.m0 m0Var = new androidx.media3.exoplayer.m0();
        long j = n0Var.a;
        m0Var.b = n0Var.b;
        m0Var.c = n0Var.c;
        m0Var.a = j - this.y;
        return this.e.d(new androidx.media3.exoplayer.n0(m0Var));
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long f() {
        long jF = this.e.f();
        if (jF == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jF + this.y;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void h() {
        this.e.h();
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long i(long j, k1 k1Var) {
        long j2 = this.y;
        return this.e.i(j - j2, k1Var) + j2;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long j(long j) {
        long j2 = this.y;
        return this.e.j(j - j2) + j2;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void k(long j) {
        this.e.k(j - this.y);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long l(androidx.media3.exoplayer.trackselection.q[] qVarArr, boolean[] zArr, w0[] w0VarArr, boolean[] zArr2, long j) {
        w0[] w0VarArr2 = new w0[w0VarArr.length];
        int i = 0;
        while (true) {
            w0 w0Var = null;
            if (i >= w0VarArr.length) {
                break;
            }
            f1 f1Var = (f1) w0VarArr[i];
            if (f1Var != null) {
                w0Var = f1Var.e;
            }
            w0VarArr2[i] = w0Var;
            i++;
        }
        u uVar = this.e;
        long j2 = this.y;
        long jL = uVar.l(qVarArr, zArr, w0VarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < w0VarArr.length; i2++) {
            w0 w0Var2 = w0VarArr2[i2];
            if (w0Var2 == null) {
                w0VarArr[i2] = null;
            } else {
                w0 w0Var3 = w0VarArr[i2];
                if (w0Var3 == null || ((f1) w0Var3).e != w0Var2) {
                    w0VarArr[i2] = new f1(w0Var2, j2);
                }
            }
        }
        return jL + j2;
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void m(u uVar) {
        t tVar = this.z;
        tVar.getClass();
        tVar.m(this);
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final boolean n() {
        return this.e.n();
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void o(y0 y0Var) {
        t tVar = this.z;
        tVar.getClass();
        tVar.o(this);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final long p() {
        long jP = this.e.p();
        if (jP == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jP + this.y;
    }

    @Override // androidx.media3.exoplayer.source.u
    public final void q(t tVar, long j) {
        this.z = tVar;
        this.e.q(this, j - this.y);
    }

    @Override // androidx.media3.exoplayer.source.u
    public final i1 r() {
        return this.e.r();
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final long t() {
        long jT = this.e.t();
        if (jT == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jT + this.y;
    }

    @Override // androidx.media3.exoplayer.source.y0
    public final void v(long j) {
        this.e.v(j - this.y);
    }
}
