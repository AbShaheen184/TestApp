package androidx.media3.common;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final com.google.common.collect.h0 i;
    public final com.google.common.collect.h0 j;
    public final com.google.common.collect.h0 k;
    public final com.google.common.collect.h0 l;
    public final com.google.common.collect.h0 m;
    public final int n;
    public final int o;
    public final com.google.common.collect.h0 p;
    public final y0 q;
    public final com.google.common.collect.h0 r;
    public final com.google.common.collect.h0 s;
    public final boolean t;
    public final int u;
    public final com.google.common.collect.f1 v;
    public final com.google.common.collect.k0 w;

    static {
        new a1(new z0());
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(2);
        androidx.media3.common.util.j0.K(3);
        androidx.media3.common.util.j0.K(4);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(5, 6, 7, 8, 9);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(10, 11, 12, 13, 14);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(15, 16, 17, 18, 19);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(20, 21, 22, 23, 24);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(25, 26, 27, 28, 29);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.A(30, 31, 32, 33, 34);
        androidx.media3.common.util.j0.K(35);
        androidx.media3.common.util.j0.K(36);
        androidx.media3.common.util.j0.K(37);
        androidx.media3.common.util.j0.K(38);
    }

    public a1(z0 z0Var) {
        this.a = z0Var.a;
        this.b = z0Var.b;
        this.c = z0Var.c;
        this.d = z0Var.d;
        this.e = z0Var.e;
        this.f = z0Var.f;
        this.g = z0Var.g;
        this.h = z0Var.h;
        this.i = z0Var.i;
        this.j = z0Var.j;
        this.k = z0Var.k;
        this.l = z0Var.l;
        this.n = z0Var.n;
        this.m = z0Var.m;
        this.o = z0Var.o;
        this.p = z0Var.p;
        this.q = z0Var.q;
        this.r = z0Var.r;
        this.t = z0Var.s;
        this.s = z0Var.t;
        this.u = z0Var.u;
        this.v = com.google.common.collect.f1.b(z0Var.v);
        this.w = com.google.common.collect.k0.l(z0Var.w);
    }

    public z0 a() {
        z0 z0Var = new z0();
        z0Var.c(this);
        return z0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.a != a1Var.a || this.b != a1Var.b || this.c != a1Var.c || this.d != a1Var.d || this.h != a1Var.h || this.e != a1Var.e || this.f != a1Var.f || this.g != a1Var.g || !this.i.equals(a1Var.i) || !this.j.equals(a1Var.j) || !this.k.equals(a1Var.k) || !this.l.equals(a1Var.l) || this.n != a1Var.n || !this.m.equals(a1Var.m) || this.o != a1Var.o || !this.p.equals(a1Var.p) || !this.q.equals(a1Var.q) || !this.s.equals(a1Var.s) || !this.r.equals(a1Var.r) || this.t != a1Var.t || this.u != a1Var.u) {
            return false;
        }
        com.google.common.collect.f1 f1Var = a1Var.v;
        com.google.common.collect.f1 f1Var2 = this.v;
        f1Var2.getClass();
        return com.google.common.collect.q.i(f1Var, f1Var2) && this.w.equals(a1Var.w);
    }

    public int hashCode() {
        int iHashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.w.hashCode() + ((this.v.hashCode() + ((((this.s.hashCode() + ((((this.r.hashCode() + ((iHashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 31) + this.u) * 28629151)) * 31);
    }
}
