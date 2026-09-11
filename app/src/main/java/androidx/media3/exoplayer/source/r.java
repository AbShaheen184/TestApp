package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.appcompat.widget.c2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends h {
    public final a k;
    public final boolean l;
    public final androidx.media3.common.u0 m;
    public final androidx.media3.common.t0 n;
    public p o;
    public o p;
    public boolean q;
    public boolean r;
    public boolean s;

    public r(a aVar, boolean z) {
        this.k = aVar;
        this.l = z && aVar.i();
        this.m = new androidx.media3.common.u0();
        this.n = new androidx.media3.common.t0();
        androidx.media3.common.v0 v0VarG = aVar.g();
        if (v0VarG == null) {
            this.o = new p(new q(aVar.h()), androidx.media3.common.u0.q, p.e);
        } else {
            this.o = new p(v0VarG, null, null);
            this.s = true;
        }
    }

    public final boolean A(long j) {
        o oVar = this.p;
        int iB = this.o.b(oVar.e.a);
        if (iB == -1) {
            return false;
        }
        p pVar = this.o;
        androidx.media3.common.t0 t0Var = this.n;
        pVar.f(iB, t0Var, false);
        long j2 = t0Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        oVar.D = j;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final androidx.media3.common.v0 g() {
        return this.k.g();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final androidx.media3.common.c0 h() {
        return this.k.h();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final boolean i() {
        return this.k.i();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.j = fVar;
        this.i = androidx.media3.common.util.j0.q(null);
        if (this.l) {
            return;
        }
        this.q = true;
        z();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(u uVar) {
        o oVar = (o) uVar;
        if (oVar.B != null) {
            a aVar = oVar.A;
            aVar.getClass();
            aVar.n(oVar.B);
        }
        if (uVar == this.p) {
            this.p = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.h, androidx.media3.exoplayer.source.a
    public final void p() {
        this.r = false;
        this.q = false;
        super.p();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void s(androidx.media3.common.c0 c0Var) {
        if (this.s) {
            p pVar = this.o;
            androidx.media3.common.v0 v0Var = pVar.b;
            this.o = new p(v0Var instanceof h1 ? new h1(((h1) v0Var).b, c0Var) : new h1(v0Var, c0Var), pVar.c, pVar.d);
        } else {
            this.o = new p(new q(c0Var), androidx.media3.common.u0.q, p.e);
        }
        this.k.s(c0Var);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final v t(Object obj, v vVar) {
        Object obj2 = vVar.a;
        Object obj3 = this.o.d;
        if (obj3 != null && obj3.equals(obj2)) {
            obj2 = p.e;
        }
        return vVar.a(obj2);
    }

    @Override // androidx.media3.exoplayer.source.h
    public final long u(long j, Object obj) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.h
    public final int v(int i, Object obj) {
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.h
    public final void w(Object obj, a aVar, androidx.media3.common.v0 v0Var) {
        long j;
        p pVar;
        v vVarA;
        p pVar2;
        if (this.r) {
            p pVar3 = this.o;
            this.o = new p(v0Var, pVar3.c, pVar3.d);
            o oVar = this.p;
            if (oVar != null) {
                A(oVar.D);
            }
        } else {
            if (!v0Var.p()) {
                androidx.media3.common.u0 u0Var = this.m;
                v0Var.n(0, u0Var);
                long j2 = u0Var.l;
                Object obj2 = u0Var.a;
                o oVar2 = this.p;
                if (oVar2 != null) {
                    long j3 = oVar2.y;
                    p pVar4 = this.o;
                    Object obj3 = oVar2.e.a;
                    androidx.media3.common.t0 t0Var = this.n;
                    pVar4.g(obj3, t0Var);
                    long j4 = t0Var.e + j3;
                    this.o.m(0, u0Var, 0L);
                    if (j4 != u0Var.l) {
                        j = j4;
                    } else {
                        j = j2;
                    }
                } else {
                    j = j2;
                }
                Pair pairI = v0Var.i(this.m, this.n, 0, j);
                Object obj4 = pairI.first;
                long jLongValue = ((Long) pairI.second).longValue();
                if (this.s) {
                    p pVar5 = this.o;
                    pVar = new p(v0Var, pVar5.c, pVar5.d);
                } else {
                    pVar = new p(v0Var, obj2, obj4);
                }
                this.o = pVar;
                o oVar3 = this.p;
                if (oVar3 != null && A(jLongValue)) {
                    v vVar = oVar3.e;
                    Object obj5 = vVar.a;
                    if (this.o.d != null && obj5.equals(p.e)) {
                        obj5 = this.o.d;
                    }
                    vVarA = vVar.a(obj5);
                }
                this.s = true;
                this.r = true;
                m(this.o);
                if (vVarA != null) {
                    o oVar4 = this.p;
                    oVar4.getClass();
                    oVar4.a(vVarA);
                }
            }
            if (this.s) {
                p pVar6 = this.o;
                pVar2 = new p(v0Var, pVar6.c, pVar6.d);
            } else {
                pVar2 = new p(v0Var, androidx.media3.common.u0.q, p.e);
            }
            this.o = pVar2;
        }
        vVarA = null;
        this.s = true;
        this.r = true;
        m(this.o);
        if (vVarA != null) {
            o oVar5 = this.p;
            oVar5.getClass();
            oVar5.a(vVarA);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final o b(v vVar, c2 c2Var, long j) {
        o oVar = new o(vVar, c2Var, j);
        com.google.android.material.motion.a.q(oVar.A == null);
        oVar.A = this.k;
        if (!this.r) {
            this.p = oVar;
            if (!this.q) {
                this.q = true;
                z();
            }
            return oVar;
        }
        Object obj = vVar.a;
        if (this.o.d != null && obj.equals(p.e)) {
            obj = this.o.d;
        }
        oVar.a(vVar.a(obj));
        return oVar;
    }

    public final void z() {
        x(null, this.k);
    }
}
