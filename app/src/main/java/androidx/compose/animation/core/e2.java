package androidx.compose.animation.core;

import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 {
    public final j2 a;
    public final e2 b;
    public final String c;
    public final androidx.compose.runtime.h1 d;
    public final androidx.compose.runtime.h1 e;
    public final androidx.compose.runtime.f1 f = new androidx.compose.runtime.f1(0);
    public final androidx.compose.runtime.f1 g = new androidx.compose.runtime.f1(Long.MIN_VALUE);
    public final androidx.compose.runtime.h1 h;
    public final androidx.compose.runtime.snapshots.q i;
    public final androidx.compose.runtime.snapshots.q j;
    public final androidx.compose.runtime.h1 k;
    public final androidx.compose.runtime.e0 l;

    public e2(j2 j2Var, e2 e2Var, String str) {
        this.a = j2Var;
        this.b = e2Var;
        this.c = str;
        this.d = androidx.compose.runtime.s.r(j2Var.n());
        this.e = androidx.compose.runtime.s.r(new z1(j2Var.n(), j2Var.n()));
        Boolean bool = Boolean.FALSE;
        this.h = androidx.compose.runtime.s.r(bool);
        this.i = new androidx.compose.runtime.snapshots.q();
        this.j = new androidx.compose.runtime.snapshots.q();
        this.k = androidx.compose.runtime.s.r(bool);
        this.l = androidx.compose.runtime.s.k(new u1(this, 1));
        j2Var.t(this);
    }

    public final void a(Object obj, androidx.compose.runtime.r rVar, int i) {
        int i2;
        rVar.c0(-1493585151);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? rVar.f(obj) : rVar.h(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.f(this) ? 32 : 16;
        }
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            if (g()) {
                rVar.b0(416369985);
            } else {
                rVar.b0(466062241);
                p(obj);
                int i3 = i2 & Token.ASSIGN_MOD;
                boolean z = i3 == 32;
                Object objQ = rVar.Q();
                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                if (z || objQ == fVar) {
                    objQ = androidx.compose.runtime.s.k(new u1(this, 0));
                    rVar.l0(objQ);
                }
                if (((Boolean) ((androidx.compose.runtime.t2) objQ).getValue()).booleanValue()) {
                    rVar.b0(466470356);
                    Object objQ2 = rVar.Q();
                    if (objQ2 == fVar) {
                        objQ2 = androidx.compose.runtime.j0.f(rVar);
                        rVar.l0(objQ2);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objQ2;
                    boolean zH = rVar.h(coroutineScope) | (i3 == 32);
                    Object objQ3 = rVar.Q();
                    if (zH || objQ3 == fVar) {
                        objQ3 = new androidx.activity.compose.h(3, coroutineScope, this);
                        rVar.l0(objQ3);
                    }
                    androidx.compose.runtime.j0.a(coroutineScope, this, (kotlin.jvm.functions.l) objQ3, rVar);
                } else {
                    rVar.b0(416369985);
                }
                rVar.p(false);
            }
            rVar.p(false);
        } else {
            rVar.W();
        }
        androidx.compose.runtime.q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v1(this, obj, i, 0);
        }
    }

    public final long b() {
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((a2) qVar.get(i)).I.g());
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((e2) qVar2.get(i2)).b());
        }
        return jMax;
    }

    public final void c() {
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            a2 a2Var = (a2) qVar.get(i);
            a2Var.C = null;
            a2Var.B = null;
            a2Var.F = false;
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((e2) qVar2.get(i2)).c();
        }
    }

    public final boolean d() {
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            if (((a2) qVar.get(i)).B != null) {
                return true;
            }
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((e2) qVar2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        e2 e2Var = this.b;
        return e2Var != null ? e2Var.e() : this.f.g();
    }

    public final y1 f() {
        return (y1) this.e.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void h(long j, boolean z) {
        androidx.compose.runtime.f1 f1Var = this.g;
        long jG = f1Var.g();
        j2 j2Var = this.a;
        if (jG == Long.MIN_VALUE) {
            f1Var.h(j);
            ((androidx.compose.runtime.h1) j2Var.e).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((androidx.compose.runtime.h1) j2Var.e).getValue()).booleanValue()) {
            ((androidx.compose.runtime.h1) j2Var.e).setValue(Boolean.TRUE);
        }
        this.h.setValue(Boolean.FALSE);
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            a2 a2Var = (a2) qVar.get(i);
            androidx.compose.runtime.h1 h1Var = a2Var.D;
            androidx.compose.runtime.h1 h1Var2 = a2Var.D;
            if (!((Boolean) h1Var.getValue()).booleanValue()) {
                long jB = z ? a2Var.b().b() : j;
                a2Var.e(a2Var.b().f(jB));
                a2Var.H = a2Var.b().d(jB);
                if (a2Var.b().e(jB)) {
                    h1Var2.setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) h1Var2.getValue()).booleanValue()) {
                z2 = false;
            }
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e2 e2Var = (e2) qVar2.get(i2);
            androidx.compose.runtime.h1 h1Var3 = e2Var.d;
            j2 j2Var2 = e2Var.a;
            if (!kotlin.jvm.internal.l.a(h1Var3.getValue(), j2Var2.n())) {
                e2Var.h(j, z);
            }
            if (!kotlin.jvm.internal.l.a(e2Var.d.getValue(), j2Var2.n())) {
                z2 = false;
            }
        }
        if (z2) {
            i();
        }
    }

    public final void i() {
        this.g.h(Long.MIN_VALUE);
        j2 j2Var = this.a;
        if (j2Var instanceof p0) {
            ((p0) j2Var).s(this.d.getValue());
        }
        n(0L);
        ((androidx.compose.runtime.h1) j2Var.e).setValue(Boolean.FALSE);
        androidx.compose.runtime.snapshots.q qVar = this.j;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            ((e2) qVar.get(i)).i();
        }
    }

    public final void j(float f) {
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            a2 a2Var = (a2) qVar.get(i);
            a2Var.getClass();
            if (f == -4.0f || f == -5.0f) {
                t1 t1Var = a2Var.C;
                if (t1Var != null) {
                    a2Var.b().h(t1Var.c);
                    a2Var.B = null;
                    a2Var.C = null;
                }
                Object obj = f == -4.0f ? a2Var.b().d : a2Var.b().c;
                a2Var.b().h(obj);
                a2Var.b().i(obj);
                a2Var.e(obj);
                a2Var.I.h(a2Var.b().b());
            } else {
                a2Var.E.h(f);
            }
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((e2) qVar2.get(i2)).j(f);
        }
    }

    public final void k(Object obj, Object obj2) {
        this.g.h(Long.MIN_VALUE);
        j2 j2Var = this.a;
        ((androidx.compose.runtime.h1) j2Var.e).setValue(Boolean.FALSE);
        boolean zG = g();
        androidx.compose.runtime.h1 h1Var = this.d;
        if (!zG || !kotlin.jvm.internal.l.a(j2Var.n(), obj) || !kotlin.jvm.internal.l.a(h1Var.getValue(), obj2)) {
            if (!kotlin.jvm.internal.l.a(j2Var.n(), obj) && (j2Var instanceof p0)) {
                ((p0) j2Var).s(obj);
            }
            h1Var.setValue(obj2);
            this.k.setValue(Boolean.TRUE);
            this.e.setValue(new z1(obj, obj2));
        }
        androidx.compose.runtime.snapshots.q qVar = this.j;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            e2 e2Var = (e2) qVar.get(i);
            e2Var.getClass();
            if (e2Var.g()) {
                e2Var.k(e2Var.a.n(), e2Var.d.getValue());
            }
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.i;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((a2) qVar2.get(i2)).d(0L);
        }
    }

    public final void l(long j) {
        androidx.compose.runtime.f1 f1Var = this.g;
        if (f1Var.g() == Long.MIN_VALUE) {
            f1Var.h(j);
        }
        n(j);
        this.h.setValue(Boolean.FALSE);
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            ((a2) qVar.get(i)).d(j);
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            e2 e2Var = (e2) qVar2.get(i2);
            if (!kotlin.jvm.internal.l.a(e2Var.d.getValue(), e2Var.a.n())) {
                e2Var.l(j);
            }
        }
    }

    public final void m(y0 y0Var) {
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            a2 a2Var = (a2) qVar.get(i);
            androidx.compose.runtime.h1 h1Var = a2Var.G;
            if (!kotlin.jvm.internal.l.a(a2Var.b().c, a2Var.b().d)) {
                a2Var.C = a2Var.b();
                a2Var.B = y0Var;
            }
            a2Var.A.setValue(new t1(a2Var.K, a2Var.e, h1Var.getValue(), h1Var.getValue(), a2Var.H.c()));
            a2Var.I.h(a2Var.b().b());
            a2Var.F = true;
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((e2) qVar2.get(i2)).m(y0Var);
        }
    }

    public final void n(long j) {
        if (this.b == null) {
            this.f.h(j);
        }
    }

    public final void o() {
        t1 t1Var;
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            a2 a2Var = (a2) qVar.get(i);
            y0 y0Var = a2Var.B;
            if (y0Var != null && (t1Var = a2Var.C) != null) {
                long jG = kotlin.math.a.G(y0Var.g * ((double) y0Var.d));
                Object objF = t1Var.f(jG);
                if (a2Var.F) {
                    a2Var.b().i(objF);
                }
                a2Var.b().h(objF);
                a2Var.I.h(a2Var.b().b());
                if (a2Var.E.g() == -2.0f || a2Var.F) {
                    a2Var.e(objF);
                } else {
                    a2Var.d(a2Var.L.e());
                }
                if (jG >= y0Var.g) {
                    a2Var.B = null;
                    a2Var.C = null;
                } else {
                    y0Var.c = false;
                }
            }
        }
        androidx.compose.runtime.snapshots.q qVar2 = this.j;
        int size2 = qVar2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((e2) qVar2.get(i2)).o();
        }
    }

    public final void p(Object obj) {
        androidx.compose.runtime.h1 h1Var = this.d;
        if (kotlin.jvm.internal.l.a(h1Var.getValue(), obj)) {
            return;
        }
        this.e.setValue(new z1(h1Var.getValue(), obj));
        j2 j2Var = this.a;
        if (!kotlin.jvm.internal.l.a(j2Var.n(), h1Var.getValue())) {
            j2Var.s(h1Var.getValue());
        }
        h1Var.setValue(obj);
        if (this.g.g() == Long.MIN_VALUE) {
            this.h.setValue(Boolean.TRUE);
        }
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        for (int i = 0; i < size; i++) {
            ((a2) qVar.get(i)).E.h(-2.0f);
        }
    }

    public final String toString() {
        androidx.compose.runtime.snapshots.q qVar = this.i;
        int size = qVar.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((a2) qVar.get(i)) + ", ";
        }
        return str;
    }
}
