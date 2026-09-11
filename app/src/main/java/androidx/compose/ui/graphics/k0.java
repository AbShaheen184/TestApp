package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements androidx.compose.ui.unit.c {
    public float B;
    public long C;
    public long D;
    public float E;
    public long F;
    public n0 G;
    public boolean H;
    public long I;
    public androidx.compose.ui.unit.c J;
    public androidx.compose.ui.unit.m K;
    public int L;
    public a0 M;
    public int e;
    public float y = 1.0f;
    public float z = 1.0f;
    public float A = 1.0f;

    public k0() {
        long j = b0.a;
        this.C = j;
        this.D = j;
        this.E = 8.0f;
        this.F = q0.b;
        this.G = a0.b;
        this.I = 9205357640488583168L;
        this.J = _COROUTINE.a.b();
        this.K = androidx.compose.ui.unit.m.e;
        this.L = 3;
    }

    @Override // androidx.compose.ui.unit.c
    public final float T() {
        return this.J.T();
    }

    @Override // androidx.compose.ui.unit.c
    public final float a() {
        return this.J.a();
    }

    public final void b() {
        i(1.0f);
        k(1.0f);
        c(1.0f);
        l(0.0f);
        long j = b0.a;
        f(j);
        p(j);
        if (this.E != 8.0f) {
            this.e |= 2048;
            this.E = 8.0f;
        }
        s(q0.b);
        m(a0.b);
        g(false);
        if (this.L != 3) {
            this.e |= 524288;
            this.L = 3;
        }
        this.I = 9205357640488583168L;
        this.M = null;
        this.e = 0;
    }

    public final void c(float f) {
        if (this.A == f) {
            return;
        }
        this.e |= 4;
        this.A = f;
    }

    public final void f(long j) {
        if (t.c(this.C, j)) {
            return;
        }
        this.e |= 64;
        this.C = j;
    }

    public final void g(boolean z) {
        if (this.H != z) {
            this.e |= 16384;
            this.H = z;
        }
    }

    public final void i(float f) {
        if (this.y == f) {
            return;
        }
        this.e |= 1;
        this.y = f;
    }

    public final void k(float f) {
        if (this.z == f) {
            return;
        }
        this.e |= 2;
        this.z = f;
    }

    public final void l(float f) {
        if (this.B == f) {
            return;
        }
        this.e |= 32;
        this.B = f;
    }

    public final void m(n0 n0Var) {
        if (kotlin.jvm.internal.l.a(this.G, n0Var)) {
            return;
        }
        this.e |= 8192;
        this.G = n0Var;
    }

    public final void p(long j) {
        if (t.c(this.D, j)) {
            return;
        }
        this.e |= 128;
        this.D = j;
    }

    public final void s(long j) {
        if (q0.a(this.F, j)) {
            return;
        }
        this.e |= 4096;
        this.F = j;
    }
}
