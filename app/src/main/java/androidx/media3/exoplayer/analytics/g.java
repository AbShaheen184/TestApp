package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.activity.y;
import androidx.media3.common.c1;
import androidx.media3.common.f0;
import androidx.media3.common.k0;
import androidx.media3.common.l0;
import androidx.media3.common.m0;
import androidx.media3.common.n0;
import androidx.media3.common.o0;
import androidx.media3.common.p0;
import androidx.media3.common.q0;
import androidx.media3.common.t0;
import androidx.media3.common.u0;
import androidx.media3.common.util.e0;
import androidx.media3.common.util.g0;
import androidx.media3.common.util.j0;
import androidx.media3.common.util.m;
import androidx.media3.common.util.p;
import androidx.media3.common.v0;
import androidx.media3.exoplayer.o;
import androidx.media3.exoplayer.r;
import androidx.media3.exoplayer.source.c0;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.source.v;
import com.caverock.androidsvg.y1;
import com.google.common.collect.a1;
import com.google.common.collect.f1;
import com.google.common.collect.h0;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements o0, c0, androidx.media3.exoplayer.drm.e {
    public final y1 A;
    public final SparseArray B;
    public p C;
    public q0 D;
    public g0 E;
    public boolean F;
    public final e0 e;
    public final t0 y;
    public final u0 z;

    public g(e0 e0Var) {
        e0Var.getClass();
        this.e = e0Var;
        String str = j0.a;
        Looper looperMyLooper = Looper.myLooper();
        this.C = new p((looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper).getThread());
        t0 t0Var = new t0();
        this.y = t0Var;
        this.z = new u0();
        y1 y1Var = new y1();
        y1Var.a = t0Var;
        com.google.common.collect.e0 e0Var2 = h0.y;
        y1Var.b = a1.B;
        y1Var.c = f1.D;
        this.A = y1Var;
        this.B = new SparseArray();
    }

    @Override // androidx.media3.common.o0
    public final void A(k0 k0Var) {
        v vVar;
        M((!(k0Var instanceof androidx.media3.exoplayer.j) || (vVar = ((androidx.media3.exoplayer.j) k0Var).E) == null) ? H() : J(vVar), 10, new o(10));
    }

    @Override // androidx.media3.common.o0
    public final void B(k0 k0Var) {
        v vVar;
        a aVarH = (!(k0Var instanceof androidx.media3.exoplayer.j) || (vVar = ((androidx.media3.exoplayer.j) k0Var).E) == null) ? H() : J(vVar);
        M(aVarH, 10, new y(aVarH, k0Var, 13));
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void C(int i, v vVar, n nVar, s sVar, IOException iOException, boolean z) {
        a aVarK = K(i, vVar);
        M(aVarK, 1003, new y(aVarK, nVar, sVar, iOException, z));
    }

    @Override // androidx.media3.common.o0
    public final void D(int i, int i2) {
        M(L(), 24, new o(22));
    }

    @Override // androidx.media3.common.o0
    public final void E(m0 m0Var) {
        M(H(), 13, new d(17));
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void F(int i, v vVar, n nVar, s sVar) {
        M(K(i, vVar), 1002, new o(29));
    }

    @Override // androidx.media3.common.o0
    public final void G(boolean z) {
        M(H(), 7, new o(6));
    }

    public final a H() {
        return J((v) this.A.d);
    }

    public final a I(v0 v0Var, int i, v vVar) {
        v vVar2 = v0Var.p() ? null : vVar;
        this.e.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = v0Var.equals(((androidx.media3.exoplayer.c0) this.D).l()) && i == ((androidx.media3.exoplayer.c0) this.D).h();
        long jD0 = 0;
        if (vVar2 == null || !vVar2.b()) {
            if (z) {
                androidx.media3.exoplayer.c0 c0Var = (androidx.media3.exoplayer.c0) this.D;
                c0Var.V();
                jD0 = c0Var.e(c0Var.n0);
            } else if (!v0Var.p()) {
                jD0 = j0.d0(v0Var.m(i, this.z, 0L).l);
            }
        } else if (z && ((androidx.media3.exoplayer.c0) this.D).f() == vVar2.b && ((androidx.media3.exoplayer.c0) this.D).g() == vVar2.c) {
            jD0 = ((androidx.media3.exoplayer.c0) this.D).j();
        }
        v vVar3 = (v) this.A.d;
        v0 v0VarL = ((androidx.media3.exoplayer.c0) this.D).l();
        int iH = ((androidx.media3.exoplayer.c0) this.D).h();
        long j = ((androidx.media3.exoplayer.c0) this.D).j();
        androidx.media3.exoplayer.c0 c0Var2 = (androidx.media3.exoplayer.c0) this.D;
        c0Var2.V();
        return new a(jElapsedRealtime, v0Var, i, vVar2, jD0, v0VarL, iH, vVar3, j, j0.d0(c0Var2.n0.r));
    }

    public final a J(v vVar) {
        this.D.getClass();
        v0 v0Var = vVar == null ? null : (v0) ((f1) this.A.c).get(vVar);
        if (vVar != null && v0Var != null) {
            return I(v0Var, v0Var.g(vVar.a, this.y).c, vVar);
        }
        int iH = ((androidx.media3.exoplayer.c0) this.D).h();
        v0 v0VarL = ((androidx.media3.exoplayer.c0) this.D).l();
        if (iH >= v0VarL.o()) {
            v0VarL = v0.a;
        }
        return I(v0VarL, iH, null);
    }

    public final a K(int i, v vVar) {
        this.D.getClass();
        if (vVar != null) {
            return ((v0) ((f1) this.A.c).get(vVar)) != null ? J(vVar) : I(v0.a, i, vVar);
        }
        v0 v0VarL = ((androidx.media3.exoplayer.c0) this.D).l();
        if (i >= v0VarL.o()) {
            v0VarL = v0.a;
        }
        return I(v0VarL, i, null);
    }

    public final a L() {
        return J((v) this.A.f);
    }

    public final void M(a aVar, int i, m mVar) {
        this.B.put(i, aVar);
        this.C.e(i, mVar);
    }

    public final void N(androidx.media3.exoplayer.c0 c0Var, Looper looper) {
        com.google.android.material.motion.a.q(this.D == null || ((h0) this.A.b).isEmpty());
        c0Var.getClass();
        this.D = c0Var;
        this.E = this.e.a(looper, null);
        p pVar = this.C;
        c cVar = new c(0, this, c0Var);
        pVar.getClass();
        e0 e0Var = this.e;
        com.google.android.material.motion.a.q(e0Var != null);
        this.C = new p(pVar.d, looper, looper.getThread(), e0Var, cVar, pVar.i);
    }

    @Override // androidx.media3.common.o0
    public final void a(androidx.media3.common.f1 f1Var) {
        a aVarL = L();
        M(aVarL, 25, new androidx.media3.exoplayer.v(aVarL, f1Var));
    }

    @Override // androidx.media3.common.o0
    public final void b(int i) {
        M(H(), 6, new o(8));
    }

    @Override // androidx.media3.common.o0
    public final void c(int i, p0 p0Var, p0 p0Var2) {
        if (i == 1) {
            this.F = false;
        }
        q0 q0Var = this.D;
        q0Var.getClass();
        y1 y1Var = this.A;
        y1Var.d = y1.F(q0Var, (h0) y1Var.b, (v) y1Var.e, (t0) y1Var.a);
        a aVarH = H();
        M(aVarH, 11, new r(aVarH, i, p0Var, p0Var2));
    }

    @Override // androidx.media3.common.o0
    public final void e(boolean z) {
        M(H(), 3, new d(15));
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void f(int i, v vVar, s sVar) {
        M(K(i, vVar), 1005, new d(8));
    }

    @Override // androidx.media3.common.o0
    public final void g(int i, boolean z) {
        M(H(), 5, new o(11));
    }

    @Override // androidx.media3.common.o0
    public final void h(int i) {
        M(L(), 21, new d(4));
    }

    @Override // androidx.media3.common.o0
    public final void i(int i) {
        M(H(), 4, new o(16));
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void j(int i, v vVar, n nVar, s sVar) {
        M(K(i, vVar), 1001, new d(1));
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void k(int i, v vVar, s sVar) {
        a aVarK = K(i, vVar);
        M(aVarK, 1004, new c(1, aVarK, sVar));
    }

    @Override // androidx.media3.common.o0
    public final void l(boolean z) {
        M(H(), 9, new d(10));
    }

    @Override // androidx.media3.common.o0
    public final void m(l0 l0Var) {
        M(H(), 12, new o(2));
    }

    @Override // androidx.media3.common.o0
    public final void n(int i) {
        q0 q0Var = this.D;
        q0Var.getClass();
        y1 y1Var = this.A;
        y1Var.d = y1.F(q0Var, (h0) y1Var.b, (v) y1Var.e, (t0) y1Var.a);
        y1Var.r0(((androidx.media3.exoplayer.c0) q0Var).l());
        M(H(), 0, new d(18));
    }

    @Override // androidx.media3.common.o0
    public final void o(f0 f0Var) {
        M(H(), 14, new o(28));
    }

    @Override // androidx.media3.common.o0
    public final void p(androidx.media3.common.a1 a1Var) {
        M(H(), 19, new d(7));
    }

    @Override // androidx.media3.common.o0
    public final void q(int i) {
        M(H(), 8, new o(18));
    }

    @Override // androidx.media3.common.o0
    public final void r(androidx.media3.common.text.c cVar) {
        M(H(), 27, new o(20));
    }

    @Override // androidx.media3.common.o0
    public final void s(androidx.media3.common.h0 h0Var) {
        M(H(), 28, new o(5));
    }

    @Override // androidx.media3.common.o0
    public final void u(boolean z) {
        M(L(), 23, new d(11));
    }

    @Override // androidx.media3.common.o0
    public final void v(c1 c1Var) {
        M(H(), 2, new o(12));
    }

    @Override // androidx.media3.common.o0
    public final void w(List list) {
        M(H(), 27, new o(14));
    }

    @Override // androidx.media3.common.o0
    public final void x(androidx.media3.common.c0 c0Var, int i) {
        M(H(), 1, new d(19));
    }

    @Override // androidx.media3.common.o0
    public final void y(int i, boolean z) {
        M(H(), -1, new o(4));
    }

    @Override // androidx.media3.exoplayer.source.c0
    public final void z(int i, v vVar, n nVar, s sVar, int i2) {
        M(K(i, vVar), 1000, new o(23));
    }

    @Override // androidx.media3.common.o0
    public final void t() {
    }

    @Override // androidx.media3.common.o0
    public final void d(n0 n0Var) {
    }
}
