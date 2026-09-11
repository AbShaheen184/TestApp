package androidx.compose.ui.node;

import androidx.appcompat.widget.c2;
import androidx.compose.runtime.u2;
import androidx.compose.ui.platform.p2;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 implements androidx.compose.runtime.i, n1, g {
    public static final a0 p0 = new a0("Undefined intrinsics block and it is required");
    public static final z q0 = new z();
    public static final androidx.compose.foundation.lazy.layout.a r0 = new androidx.compose.foundation.lazy.layout.a(3);
    public long A;
    public long B;
    public long C;
    public boolean D;
    public boolean E;
    public f0 F;
    public int G;
    public final androidx.compose.foundation.text.input.internal.o H;
    public androidx.compose.runtime.collection.b I;
    public boolean J;
    public f0 K;
    public m1 L;
    public androidx.compose.ui.viewinterop.v M;
    public int N;
    public boolean O;
    public boolean P;
    public androidx.compose.ui.semantics.l Q;
    public boolean R;
    public final androidx.compose.runtime.collection.b S;
    public boolean T;
    public androidx.compose.ui.layout.q0 U;
    public androidx.compose.foundation.text.input.internal.o V;
    public androidx.compose.ui.unit.c W;
    public androidx.compose.ui.unit.m X;
    public p2 Y;
    public androidx.compose.runtime.a0 Z;
    public d0 a0;
    public d0 b0;
    public boolean c0;
    public final a1 d0;
    public final boolean e;
    public final j0 e0;
    public androidx.compose.ui.layout.m0 f0;
    public d1 g0;
    public boolean h0;
    public androidx.compose.ui.r i0;
    public androidx.compose.ui.r j0;
    public androidx.compose.ui.viewinterop.c k0;
    public androidx.compose.ui.input.pointer.b0 l0;
    public boolean m0;
    public int n0;
    public boolean o0;
    public int y;
    public boolean z;

    public f0(int i, boolean z) {
        this.e = z;
        this.y = i;
        this.A = 9223372034707292159L;
        this.B = 0L;
        this.C = 9223372034707292159L;
        this.D = true;
        this.H = new androidx.compose.foundation.text.input.internal.o(16, new androidx.compose.runtime.collection.b(new f0[16]), new androidx.compose.animation.z(this, 7));
        this.S = new androidx.compose.runtime.collection.b(new f0[16]);
        this.T = true;
        this.U = p0;
        this.W = i0.a;
        this.X = androidx.compose.ui.unit.m.e;
        this.Y = q0;
        androidx.compose.runtime.a0.a.getClass();
        this.Z = androidx.compose.runtime.z.b;
        d0 d0Var = d0.z;
        this.a0 = d0Var;
        this.b0 = d0Var;
        this.d0 = new a1(this);
        this.e0 = new j0(this);
        this.h0 = true;
        this.i0 = androidx.compose.ui.o.b;
    }

    public static void T(f0 f0Var, boolean z, int i) {
        f0 f0VarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (f0Var.F == null) {
            androidx.compose.ui.internal.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        m1 m1Var = f0Var.L;
        if (m1Var == null || f0Var.O || f0Var.e) {
            return;
        }
        ((androidx.compose.ui.platform.u) m1Var).B(f0Var, true, z, z2);
        if (z3) {
            r0 r0Var = f0Var.e0.q;
            r0Var.getClass();
            j0 j0Var = r0Var.C;
            f0 f0VarV2 = j0Var.a.v();
            d0 d0Var = j0Var.a.a0;
            if (f0VarV2 == null || d0Var == d0.z) {
                return;
            }
            while (f0VarV2.a0 == d0Var && (f0VarV = f0VarV2.v()) != null) {
                f0VarV2 = f0VarV;
            }
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0) {
                if (f0VarV2.F != null) {
                    T(f0VarV2, z, 6);
                    return;
                } else {
                    V(f0VarV2, z, 6);
                    return;
                }
            }
            if (iOrdinal != 1) {
                net.luminis.tls.engine.impl.c.r("Intrinsics isn't used by the parent");
            } else if (f0VarV2.F != null) {
                f0VarV2.S(z);
            } else {
                f0VarV2.U(z);
            }
        }
    }

    public static void V(f0 f0Var, boolean z, int i) {
        m1 m1Var;
        f0 f0VarV;
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        boolean z3 = (i & 4) != 0;
        if (f0Var.O || f0Var.e || (m1Var = f0Var.L) == null) {
            return;
        }
        ((androidx.compose.ui.platform.u) m1Var).B(f0Var, false, z, z2);
        if (z3) {
            j0 j0Var = f0Var.e0.p.C;
            f0 f0VarV2 = j0Var.a.v();
            d0 d0Var = j0Var.a.a0;
            if (f0VarV2 == null || d0Var == d0.z) {
                return;
            }
            while (f0VarV2.a0 == d0Var && (f0VarV = f0VarV2.v()) != null) {
                f0VarV2 = f0VarV;
            }
            int iOrdinal = d0Var.ordinal();
            if (iOrdinal == 0) {
                V(f0VarV2, z, 6);
            } else if (iOrdinal == 1) {
                f0VarV2.U(z);
            } else {
                net.luminis.tls.engine.impl.c.r("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void W(f0 f0Var) {
        int i = e0.a[f0Var.e0.d.ordinal()];
        j0 j0Var = f0Var.e0;
        if (i != 1) {
            com.google.gson.b.s(j0Var.d, "Unexpected state ");
            return;
        }
        if (j0Var.e) {
            T(f0Var, true, 6);
            return;
        }
        if (j0Var.f) {
            f0Var.S(true);
        }
        if (f0Var.r()) {
            V(f0Var, true, 6);
        } else if (f0Var.q()) {
            f0Var.U(true);
        }
    }

    private final String j(f0 f0Var) {
        StringBuilder sb = new StringBuilder("Cannot insert ");
        sb.append(f0Var);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(g(0));
        sb.append(" Other tree: ");
        f0 f0Var2 = f0Var.K;
        sb.append(f0Var2 != null ? f0Var2.g(0) : null);
        return sb.toString();
    }

    public final void A(long j, p pVar, int i, boolean z) {
        a1 a1Var = this.d0;
        d1 d1Var = (d1) a1Var.e;
        androidx.compose.ui.graphics.k0 k0Var = d1.j0;
        ((d1) a1Var.e).Y0(d1.m0, d1Var.Q0(j), pVar, i, z);
    }

    public final void B(int i, f0 f0Var) {
        if (f0Var.K != null && f0Var.L != null) {
            androidx.compose.ui.internal.a.b(j(f0Var));
        }
        f0Var.K = this;
        androidx.compose.foundation.text.input.internal.o oVar = this.H;
        ((androidx.compose.runtime.collection.b) oVar.y).a(i, f0Var);
        ((androidx.compose.animation.z) oVar.z).invoke();
        O();
        if (f0Var.e) {
            this.G++;
        }
        G();
        m1 m1Var = this.L;
        if (m1Var != null) {
            f0Var.d(m1Var);
        }
        if (f0Var.e0.l > 0) {
            j0 j0Var = this.e0;
            j0Var.d(j0Var.l + 1);
        }
        if (f0Var.n0 > 0) {
            a0(this.n0 + 1);
        }
    }

    public final void C() {
        if (this.h0) {
            a1 a1Var = this.d0;
            d1 d1Var = (r) a1Var.d;
            d1 d1Var2 = ((d1) a1Var.e).N;
            this.g0 = null;
            while (!kotlin.jvm.internal.l.a(d1Var, d1Var2)) {
                if ((d1Var != null ? d1Var.i0 : null) != null) {
                    this.g0 = d1Var;
                    break;
                }
                d1Var = d1Var != null ? d1Var.N : null;
            }
        }
        d1 d1Var3 = this.g0;
        if (d1Var3 != null && d1Var3.i0 == null) {
            throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("layer was not set");
        }
        if (d1Var3 != null) {
            d1Var3.a1();
            return;
        }
        f0 f0VarV = v();
        if (f0VarV != null) {
            f0VarV.C();
        }
    }

    public final void D() {
        a1 a1Var = this.d0;
        d1 d1Var = (d1) a1Var.e;
        r rVar = (r) a1Var.d;
        while (d1Var != rVar) {
            d1Var.getClass();
            x xVar = (x) d1Var;
            l1 l1Var = xVar.i0;
            if (l1Var != null) {
                ((androidx.compose.ui.platform.q1) l1Var).c();
            }
            d1Var = xVar.M;
        }
        l1 l1Var2 = ((r) a1Var.d).i0;
        if (l1Var2 != null) {
            ((androidx.compose.ui.platform.q1) l1Var2).c();
        }
    }

    public final void E() {
        if (this.e) {
            f0 f0VarV = v();
            if (f0VarV != null) {
                f0VarV.E();
                return;
            }
            return;
        }
        if (this.F != null) {
            T(this, false, 7);
        } else {
            V(this, false, 7);
        }
    }

    public final void F() {
        if (this.R) {
            return;
        }
        if (((z0) this.d0.c).C != null || this.j0 != null) {
            this.P = true;
            return;
        }
        androidx.compose.ui.semantics.l lVar = this.Q;
        this.R = true;
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        zVar.e = new androidx.compose.ui.semantics.l();
        o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(this)).getSnapshotObserver();
        androidx.compose.ui.draw.b bVar = new androidx.compose.ui.draw.b(3, this, zVar);
        snapshotObserver.a.d(this, snapshotObserver.d, bVar);
        this.R = false;
        this.Q = (androidx.compose.ui.semantics.l) zVar.e;
        this.P = false;
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) i0.a(this);
        uVar.getSemanticsOwner().b(this, lVar);
        uVar.D();
    }

    public final void G() {
        f0 f0Var;
        if (this.G > 0) {
            this.J = true;
        }
        if (!this.e || (f0Var = this.K) == null) {
            return;
        }
        f0Var.G();
    }

    public final boolean H() {
        return this.L != null;
    }

    public final boolean I() {
        return this.e0.p.O;
    }

    public final Boolean J() {
        r0 r0Var = this.e0.q;
        if (r0Var != null) {
            return Boolean.valueOf(r0Var.M != p0.z);
        }
        return null;
    }

    public final void K() {
        f0 f0VarV;
        if (this.a0 == d0.z) {
            f();
        }
        r0 r0Var = this.e0.q;
        r0Var.getClass();
        boolean z = true;
        try {
            r0Var.D = true;
            if (!r0Var.H) {
                androidx.compose.ui.internal.a.b("replace() called on item that was not placed");
            }
            r0Var.X = false;
            if (r0Var.M == p0.z) {
                z = false;
            }
            r0Var.w0(r0Var.K, r0Var.L);
            if (z && !r0Var.X && (f0VarV = r0Var.C.a.v()) != null) {
                f0VarV.S(false);
            }
        } finally {
            r0Var.D = false;
        }
    }

    public final void L(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            androidx.compose.foundation.text.input.internal.o oVar = this.H;
            androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) oVar.y;
            androidx.compose.animation.z zVar = (androidx.compose.animation.z) oVar.z;
            Object objK = bVar.k(i5);
            zVar.invoke();
            ((androidx.compose.runtime.collection.b) oVar.y).a(i6, (f0) objK);
            zVar.invoke();
        }
        O();
        G();
        E();
    }

    public final void M(f0 f0Var) {
        if (f0Var.e0.l > 0) {
            j0 j0Var = this.e0;
            j0Var.d(j0Var.l - 1);
        }
        if (this.L != null) {
            f0Var.h();
        }
        f0Var.K = null;
        if (f0Var.n0 > 0) {
            a0(this.n0 - 1);
        }
        ((d1) f0Var.d0.e).N = null;
        if (f0Var.e) {
            this.G--;
            androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) f0Var.H.y;
            Object[] objArr = bVar.e;
            int i = bVar.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((d1) ((f0) objArr[i2]).d0.e).N = null;
            }
        }
        G();
        O();
    }

    public final void N() {
        androidx.compose.ui.spatial.b rectManager;
        this.D = true;
        m1 m1Var = this.L;
        if (m1Var == null || (rectManager = ((androidx.compose.ui.platform.u) m1Var).getRectManager()) == null) {
            return;
        }
        rectManager.e(this);
    }

    public final void O() {
        if (!this.e) {
            this.T = true;
            return;
        }
        f0 f0VarV = v();
        if (f0VarV != null) {
            f0VarV.O();
        }
    }

    public final void P() {
        androidx.compose.foundation.text.input.internal.o oVar = this.H;
        int i = ((androidx.compose.runtime.collection.b) oVar.y).z;
        while (true) {
            i--;
            androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) oVar.y;
            if (-1 >= i) {
                bVar.g();
                ((androidx.compose.animation.z) oVar.z).invoke();
                return;
            }
            M((f0) bVar.e[i]);
        }
    }

    public final void Q(int i, int i2) {
        if (i2 < 0) {
            androidx.compose.ui.internal.a.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            androidx.compose.foundation.text.input.internal.o oVar = this.H;
            M((f0) ((androidx.compose.runtime.collection.b) oVar.y).e[i3]);
            Object objK = ((androidx.compose.runtime.collection.b) oVar.y).k(i3);
            ((androidx.compose.animation.z) oVar.z).invoke();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void R() {
        f0 f0VarV;
        if (this.a0 == d0.z) {
            f();
        }
        v0 v0Var = this.e0.p;
        j0 j0Var = v0Var.C;
        try {
            v0Var.D = true;
            if (!v0Var.H) {
                androidx.compose.ui.internal.a.b("replace called on unplaced item");
            }
            boolean z = v0Var.O;
            v0Var.w0(v0Var.J, v0Var.L, v0Var.K);
            if (z && !v0Var.b0 && (f0VarV = j0Var.a.v()) != null) {
                f0VarV.U(false);
            }
            v0Var.D = false;
        } catch (Throwable th) {
            try {
                j0Var.a.Y(th);
                throw null;
            } catch (Throwable th2) {
                v0Var.D = false;
                throw th2;
            }
        }
    }

    public final void S(boolean z) {
        m1 m1Var;
        if (this.e || (m1Var = this.L) == null) {
            return;
        }
        ((androidx.compose.ui.platform.u) m1Var).C(this, true, z);
    }

    public final void U(boolean z) {
        m1 m1Var;
        if (this.e || (m1Var = this.L) == null) {
            return;
        }
        ((androidx.compose.ui.platform.u) m1Var).C(this, false, z);
    }

    public final void X() {
        androidx.compose.runtime.collection.b bVarZ = z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            d0 d0Var = f0Var.b0;
            f0Var.a0 = d0Var;
            if (d0Var != d0.z) {
                f0Var.X();
            }
        }
    }

    public final void Y(Throwable th) {
        androidx.compose.runtime.a0 a0Var = this.Z;
        u2 u2Var = androidx.compose.runtime.tooling.e.a;
        androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) a0Var;
        jVar.getClass();
        androidx.compose.runtime.tooling.d dVar = (androidx.compose.runtime.tooling.d) androidx.compose.runtime.s.s(jVar, u2Var);
        if (dVar == null) {
            throw th;
        }
        okhttp3.internal.platform.android.g.L(th, new androidx.activity.compose.f(16, dVar, this));
        throw th;
    }

    public final void Z(androidx.compose.ui.unit.c cVar) {
        if (kotlin.jvm.internal.l.a(this.W, cVar)) {
            return;
        }
        this.W = cVar;
        E();
        f0 f0VarV = v();
        if (f0VarV != null) {
            f0VarV.C();
        }
        D();
        for (androidx.compose.ui.q qVar = (androidx.compose.ui.q) this.d0.g; qVar != null; qVar = qVar.C) {
            qVar.b();
        }
    }

    @Override // androidx.compose.runtime.i
    public final void a() {
        androidx.compose.ui.viewinterop.v vVar = this.M;
        if (vVar != null) {
            vVar.a();
        }
        androidx.compose.ui.layout.m0 m0Var = this.f0;
        if (m0Var != null) {
            m0Var.a();
        }
        a1 a1Var = this.d0;
        d1 d1Var = ((r) a1Var.d).M;
        for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
            d1Var2.f1();
        }
    }

    public final void a0(int i) {
        f0 f0VarV;
        f0 f0VarV2;
        int i2 = this.n0;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (f0VarV2 = v()) != null) {
                f0VarV2.a0(f0VarV2.n0 + 1);
            }
            if (i == 0 && this.n0 > 0 && (f0VarV = v()) != null) {
                f0VarV.a0(f0VarV.n0 - 1);
            }
            this.n0 = i;
        }
    }

    @Override // androidx.compose.runtime.i
    public final void b() {
        androidx.compose.ui.autofill.d dVar;
        androidx.compose.ui.viewinterop.v vVar = this.M;
        if (vVar != null) {
            vVar.b();
        }
        androidx.compose.ui.layout.m0 m0Var = this.f0;
        if (m0Var != null) {
            m0Var.h(true);
        }
        this.o0 = true;
        androidx.compose.ui.q qVar = (w1) this.d0.f;
        for (androidx.compose.ui.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.B) {
            if (qVar2.K) {
                qVar2.G0();
            }
        }
        for (androidx.compose.ui.q qVar3 = qVar; qVar3 != null; qVar3 = qVar3.B) {
            if (qVar3.K) {
                qVar3.I0();
            }
        }
        while (qVar != null) {
            if (qVar.K) {
                qVar.C0();
            }
            qVar = qVar.B;
        }
        if (H()) {
            this.Q = null;
            this.P = false;
        }
        m1 m1Var = this.L;
        if (m1Var != null) {
            androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) m1Var;
            if (androidx.compose.ui.platform.u.f() && (dVar = uVar.l0) != null && dVar.E.e(this.y)) {
                dVar.e.h(dVar.z, this.y, false);
            }
        }
    }

    public final void b0(f0 f0Var) {
        if (kotlin.jvm.internal.l.a(f0Var, this.F)) {
            return;
        }
        this.F = f0Var;
        j0 j0Var = this.e0;
        if (f0Var != null) {
            if (j0Var.q == null) {
                j0Var.q = new r0(j0Var);
            }
            a1 a1Var = this.d0;
            d1 d1Var = ((r) a1Var.d).M;
            for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
                d1Var2.O0();
            }
        } else {
            j0Var.q = null;
            j0Var.f = false;
            j0Var.e = false;
        }
        E();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 5621. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void c(androidx.compose.ui.r r20) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.f0.c(androidx.compose.ui.r):void");
    }

    public final void c0(androidx.compose.ui.layout.q0 q0Var) {
        if (kotlin.jvm.internal.l.a(this.U, q0Var)) {
            return;
        }
        this.U = q0Var;
        androidx.compose.foundation.text.input.internal.o oVar = this.V;
        if (oVar != null) {
            ((androidx.compose.runtime.h1) oVar.z).setValue(q0Var);
        }
        E();
    }

    public final void d(m1 m1Var) {
        f0 f0Var;
        androidx.compose.ui.autofill.d dVar;
        androidx.compose.ui.semantics.l lVarX;
        if (this.L != null) {
            androidx.compose.ui.internal.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + g(0));
        }
        f0 f0Var2 = this.K;
        if (f0Var2 != null && !kotlin.jvm.internal.l.a(f0Var2.L, m1Var)) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(m1Var);
            sb.append(") than the parent's owner(");
            f0 f0VarV = v();
            sb.append(f0VarV != null ? f0VarV.L : null);
            sb.append("). This tree: ");
            sb.append(g(0));
            sb.append(" Parent tree: ");
            f0 f0Var3 = this.K;
            sb.append(f0Var3 != null ? f0Var3.g(0) : null);
            androidx.compose.ui.internal.a.b(sb.toString());
        }
        f0 f0VarV2 = v();
        j0 j0Var = this.e0;
        if (f0VarV2 == null) {
            j0Var.p.O = true;
            ((androidx.compose.ui.platform.u) m1Var).getRectManager().f(this, false);
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                r0Var.M = p0.e;
            }
        }
        a1 a1Var = this.d0;
        ((d1) a1Var.e).N = f0VarV2 != null ? (r) f0VarV2.d0.d : null;
        this.L = m1Var;
        this.N = (f0VarV2 != null ? f0VarV2.N : -1) + 1;
        androidx.compose.ui.r rVar = this.j0;
        if (rVar != null) {
            c(rVar);
        }
        this.j0 = null;
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) m1Var;
        uVar.getLayoutNodes().h(this.y, this);
        f0 f0Var4 = this.K;
        if (f0Var4 == null || (f0Var = f0Var4.F) == null) {
            f0Var = this.F;
        }
        b0(f0Var);
        if (this.F == null && a1Var.f(512)) {
            b0(this);
        }
        if (!this.o0) {
            for (androidx.compose.ui.q qVar = (androidx.compose.ui.q) a1Var.g; qVar != null; qVar = qVar.C) {
                qVar.B0();
            }
        }
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.H.y;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).d(m1Var);
        }
        if (!this.o0) {
            a1Var.g();
        }
        E();
        if (f0VarV2 != null) {
            f0VarV2.E();
        }
        androidx.compose.ui.viewinterop.c cVar = this.k0;
        if (cVar != null) {
            cVar.invoke(m1Var);
        }
        j0Var.j();
        if (!this.o0 && a1Var.f(8)) {
            F();
        }
        uVar.getClass();
        if (!androidx.compose.ui.platform.u.f() || (dVar = uVar.l0) == null || (lVarX = x()) == null || !lVarX.e.b(androidx.compose.ui.semantics.t.q)) {
            return;
        }
        dVar.E.a(this.y);
        dVar.e.h(dVar.z, this.y, true);
    }

    public final void d0(androidx.compose.ui.r rVar) {
        if (this.e && this.i0 != androidx.compose.ui.o.b) {
            androidx.compose.ui.internal.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.o0) {
            androidx.compose.ui.internal.a.a("modifier is updated when deactivated");
        }
        if (!H()) {
            this.j0 = rVar;
            return;
        }
        c(rVar);
        if (this.P) {
            F();
        }
    }

    public final void e() {
        this.b0 = this.a0;
        d0 d0Var = d0.z;
        this.a0 = d0Var;
        androidx.compose.runtime.collection.b bVarZ = z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            if (f0Var.a0 != d0Var) {
                f0Var.e();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final void e0(p2 p2Var) {
        if (kotlin.jvm.internal.l.a(this.Y, p2Var)) {
            return;
        }
        this.Y = p2Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) this.d0.g;
        if ((qVar.A & 16) != 0) {
            while (qVar != null) {
                if ((qVar.z & 16) != 0) {
                    ?? E = qVar;
                    ?? bVar = 0;
                    while (E != 0) {
                        if (E instanceof r1) {
                            ((r1) E).o0();
                        } else if ((E.z & 16) != 0 && (E instanceof j)) {
                            androidx.compose.ui.q qVar2 = ((j) E).M;
                            int i = 0;
                            E = E;
                            bVar = bVar;
                            while (qVar2 != null) {
                                if ((qVar2.z & 16) != 0) {
                                    i++;
                                    if (i == 1) {
                                        bVar = bVar;
                                        E = qVar2;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (E != 0) {
                                            bVar.b(E);
                                            E = 0;
                                        }
                                        bVar.b(qVar2);
                                    }
                                }
                                qVar2 = qVar2.C;
                                E = E;
                                bVar = bVar;
                            }
                            if (i == 1) {
                            }
                        }
                        E = k.e(bVar);
                    }
                }
                if ((qVar.A & 16) == 0) {
                    return;
                } else {
                    qVar = qVar.C;
                }
            }
        }
    }

    public final void f() {
        this.b0 = this.a0;
        this.a0 = d0.z;
        androidx.compose.runtime.collection.b bVarZ = z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            if (f0Var.a0 == d0.y) {
                f0Var.f();
            }
        }
    }

    public final void f0() {
        if (this.G <= 0 || !this.J) {
            return;
        }
        this.J = false;
        androidx.compose.runtime.collection.b bVar = this.I;
        if (bVar == null) {
            bVar = new androidx.compose.runtime.collection.b(new f0[16]);
            this.I = bVar;
        }
        bVar.g();
        androidx.compose.runtime.collection.b bVar2 = (androidx.compose.runtime.collection.b) this.H.y;
        Object[] objArr = bVar2.e;
        int i = bVar2.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var = (f0) objArr[i2];
            if (f0Var.e) {
                bVar.c(bVar.z, f0Var.z());
            } else {
                bVar.b(f0Var);
            }
        }
        j0 j0Var = this.e0;
        j0Var.p.V = true;
        r0 r0Var = j0Var.q;
        if (r0Var != null) {
            r0Var.P = true;
        }
    }

    public final String g(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        androidx.compose.runtime.collection.b bVarZ = z();
        Object[] objArr = bVarZ.e;
        int i3 = bVarZ.z;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(((f0) objArr[i4]).g(i + 1));
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void h() {
        androidx.compose.ui.autofill.d dVar;
        g0 g0Var;
        m1 m1Var = this.L;
        if (m1Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            f0 f0VarV = v();
            sb.append(f0VarV != null ? f0VarV.g(0) : null);
            androidx.compose.ui.internal.a.c(sb.toString());
            com.google.gson.b.b();
            return;
        }
        f0 f0VarV2 = v();
        j0 j0Var = this.e0;
        if (f0VarV2 != null) {
            f0VarV2.C();
            f0VarV2.E();
            v0 v0Var = j0Var.p;
            d0 d0Var = d0.z;
            v0Var.I = d0Var;
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                r0Var.G = d0Var;
            }
        }
        g0 g0Var2 = j0Var.p.T;
        g0Var2.b = true;
        g0Var2.c = false;
        g0Var2.d = false;
        g0Var2.e = false;
        g0Var2.f = null;
        r0 r0Var2 = j0Var.q;
        if (r0Var2 != null && (g0Var = r0Var2.N) != null) {
            g0Var.b = true;
            g0Var.c = false;
            g0Var.d = false;
            g0Var.e = false;
            g0Var.f = null;
        }
        a1 a1Var = this.d0;
        androidx.compose.ui.q qVar = (w1) a1Var.f;
        d1 d1Var = ((r) a1Var.d).M;
        for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
            d1Var2.l1();
            if (d1Var2.L.I()) {
                d1Var2.g1();
            }
        }
        androidx.compose.ui.input.pointer.b0 b0Var = this.l0;
        if (b0Var != null) {
            b0Var.invoke(m1Var);
        }
        for (androidx.compose.ui.q qVar2 = qVar; qVar2 != null; qVar2 = qVar2.B) {
            if (qVar2.K) {
                qVar2.I0();
            }
        }
        this.O = true;
        androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) this.H.y;
        Object[] objArr = bVar.e;
        int i = bVar.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).h();
        }
        this.O = false;
        while (qVar != null) {
            if (qVar.K) {
                qVar.C0();
            }
            qVar = qVar.B;
        }
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) m1Var;
        uVar.getLayoutNodes().g(this.y);
        t0 t0Var = uVar.u0;
        c2 c2Var = t0Var.b;
        ((com.app.mlounge.data.music.e) c2Var.y).z(this);
        ((com.app.mlounge.data.music.e) c2Var.z).z(this);
        ((com.app.mlounge.data.music.e) c2Var.A).z(this);
        ((androidx.compose.runtime.collection.b) t0Var.e.y).j(this);
        uVar.m0 = true;
        if (androidx.compose.ui.platform.u.f() && (dVar = uVar.l0) != null && dVar.E.e(this.y)) {
            dVar.e.h(dVar.z, this.y, false);
        }
        uVar.getRectManager().h(this);
        this.L = null;
        b0(null);
        this.N = 0;
        v0 v0Var2 = j0Var.p;
        v0Var2.F = Integer.MAX_VALUE;
        v0Var2.E = Integer.MAX_VALUE;
        v0Var2.O = false;
        r0 r0Var3 = j0Var.q;
        if (r0Var3 != null) {
            r0Var3.F = Integer.MAX_VALUE;
            r0Var3.E = Integer.MAX_VALUE;
            r0Var3.M = p0.z;
        }
        if (a1Var.f(8)) {
            androidx.compose.ui.semantics.l lVar = this.Q;
            this.Q = null;
            this.P = false;
            uVar.getSemanticsOwner().b(this, lVar);
            uVar.D();
        }
    }

    public final void i(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        try {
            ((d1) this.d0.e).M0(rVar, bVar);
        } catch (Throwable th) {
            Y(th);
            throw null;
        }
    }

    public final void k() {
        if (this.F != null) {
            T(this, false, 5);
        } else {
            V(this, false, 5);
        }
        v0 v0Var = this.e0.p;
        androidx.compose.ui.unit.a aVar = v0Var.G ? new androidx.compose.ui.unit.a(v0Var.A) : null;
        m1 m1Var = this.L;
        if (aVar != null) {
            if (m1Var != null) {
                ((androidx.compose.ui.platform.u) m1Var).v(this, aVar.a);
            }
        } else if (m1Var != null) {
            ((androidx.compose.ui.platform.u) m1Var).u(true);
        }
    }

    public final List l() {
        r0 r0Var = this.e0.q;
        r0Var.getClass();
        androidx.compose.runtime.collection.b bVar = r0Var.O;
        j0 j0Var = r0Var.C;
        j0Var.a.n();
        if (!r0Var.P) {
            return bVar.f();
        }
        f0 f0Var = j0Var.a;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (bVar.z <= i2) {
                r0 r0Var2 = f0Var2.e0.q;
                r0Var2.getClass();
                bVar.b(r0Var2);
            } else {
                r0 r0Var3 = f0Var2.e0.q;
                r0Var3.getClass();
                Object[] objArr2 = bVar.e;
                Object obj = objArr2[i2];
                objArr2[i2] = r0Var3;
            }
        }
        bVar.l(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z, bVar.z);
        r0Var.P = false;
        return bVar.f();
    }

    public final List m() {
        return this.e0.p.m0();
    }

    public final List n() {
        return z().f();
    }

    public final List o() {
        return ((androidx.compose.runtime.collection.b) this.H.y).f();
    }

    @Override // androidx.compose.ui.node.n1
    public final boolean p() {
        return H();
    }

    public final boolean q() {
        return this.e0.p.R;
    }

    public final boolean r() {
        return this.e0.p.Q;
    }

    public final d0 s() {
        return this.e0.p.I;
    }

    public final d0 t() {
        d0 d0Var;
        r0 r0Var = this.e0.q;
        return (r0Var == null || (d0Var = r0Var.G) == null) ? d0.z : d0Var;
    }

    public final String toString() {
        return androidx.compose.ui.platform.i0.q(this) + " children: " + ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) n()).y).z + " measurePolicy: " + this.U + " deactivated: " + this.o0;
    }

    public final androidx.compose.foundation.text.input.internal.o u() {
        androidx.compose.foundation.text.input.internal.o oVar = this.V;
        if (oVar != null) {
            return oVar;
        }
        androidx.compose.foundation.text.input.internal.o oVar2 = new androidx.compose.foundation.text.input.internal.o(this, this.U);
        this.V = oVar2;
        return oVar2;
    }

    public final f0 v() {
        f0 f0Var = this.K;
        while (f0Var != null && f0Var.e) {
            f0Var = f0Var.K;
        }
        return f0Var;
    }

    public final int w() {
        return this.e0.p.F;
    }

    public final androidx.compose.ui.semantics.l x() {
        if (H() && !this.o0 && this.d0.f(8)) {
            return this.Q;
        }
        return null;
    }

    public final androidx.compose.runtime.collection.b y() {
        boolean z = this.T;
        androidx.compose.runtime.collection.b bVar = this.S;
        if (z) {
            bVar.g();
            bVar.c(bVar.z, z());
            Arrays.sort(bVar.e, 0, bVar.z, r0);
            this.T = false;
        }
        return bVar;
    }

    public final androidx.compose.runtime.collection.b z() {
        f0();
        if (this.G == 0) {
            return (androidx.compose.runtime.collection.b) this.H.y;
        }
        androidx.compose.runtime.collection.b bVar = this.I;
        bVar.getClass();
        return bVar;
    }

    public f0(int i) {
        this(androidx.compose.ui.semantics.n.a.addAndGet(1), (i & 1) == 0);
    }
}
