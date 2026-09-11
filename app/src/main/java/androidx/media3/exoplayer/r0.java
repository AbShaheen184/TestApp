package androidx.media3.exoplayer;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final androidx.media3.exoplayer.analytics.g c;
    public final androidx.media3.common.util.g0 d;
    public final androidx.activity.y e;
    public long f;
    public int g;
    public boolean h;
    public p0 i;
    public p0 j;
    public p0 k;
    public p0 l;
    public p0 m;
    public int n;
    public Object o;
    public long p;
    public final androidx.media3.common.t0 a = new androidx.media3.common.t0();
    public final androidx.media3.common.u0 b = new androidx.media3.common.u0();
    public ArrayList q = new ArrayList();

    public r0(androidx.media3.exoplayer.analytics.g gVar, androidx.media3.common.util.g0 g0Var, androidx.activity.y yVar, l lVar) {
        this.c = gVar;
        this.d = g0Var;
        this.e = yVar;
    }

    public static androidx.media3.exoplayer.source.v o(androidx.media3.common.v0 v0Var, Object obj, long j, long j2, androidx.media3.common.u0 u0Var, androidx.media3.common.t0 t0Var) {
        v0Var.g(obj, t0Var);
        v0Var.n(t0Var.c, u0Var);
        v0Var.b(obj);
        int i = t0Var.g.a;
        if (i != 0) {
            if (i == 1) {
                t0Var.f(0);
            }
            t0Var.g.getClass();
            t0Var.g(0);
        }
        v0Var.g(obj, t0Var);
        int iC = t0Var.c(j);
        return iC == -1 ? new androidx.media3.exoplayer.source.v(obj, j2, t0Var.b(j)) : new androidx.media3.exoplayer.source.v(obj, iC, t0Var.e(iC), j2, -1);
    }

    public final p0 a() {
        p0 p0Var = this.i;
        if (p0Var == null) {
            return null;
        }
        if (p0Var == this.j) {
            this.j = p0Var.m;
        }
        if (p0Var == this.k) {
            this.k = p0Var.m;
        }
        p0Var.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            p0 p0Var2 = this.i;
            this.o = p0Var2.b;
            this.p = p0Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        p0 p0Var = this.i;
        p0Var.getClass();
        this.o = p0Var.b;
        this.p = p0Var.g.a.d;
        while (p0Var != null) {
            p0Var.i();
            p0Var = p0Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006e  */
    /* JADX WARN: Code duplicated, block: B:59:0x015d  */
    public final q0 c(androidx.media3.common.v0 v0Var, p0 p0Var, long j) {
        androidx.media3.common.v0 v0Var2;
        long j2;
        long jLongValue;
        long jMax;
        Object obj;
        long j3;
        long j4;
        long j5;
        long j6;
        long jMax2;
        long jQ;
        q0 q0Var = p0Var.g;
        long j7 = (p0Var.p + q0Var.f) - j;
        if (!q0Var.i) {
            androidx.media3.exoplayer.source.v vVar = q0Var.a;
            Object obj2 = vVar.a;
            int i = vVar.e;
            androidx.media3.common.t0 t0Var = this.a;
            v0Var.g(obj2, t0Var);
            boolean z = q0Var.h;
            if (!vVar.b()) {
                if (i != -1) {
                    t0Var.f(i);
                }
                int iE = t0Var.e(i);
                t0Var.g(i);
                if (iE != t0Var.g.a(i).a) {
                    return e(v0Var, vVar.a, vVar.e, iE, q0Var.f, vVar.d, z);
                }
                v0Var.g(obj2, t0Var);
                t0Var.d(i);
                t0Var.g.a(i).getClass();
                return f(v0Var, vVar.a, 0L, -9223372036854775807L, q0Var.f, vVar.d, false);
            }
            int i2 = vVar.b;
            int i3 = t0Var.g.a(i2).a;
            if (i3 == -1) {
                return null;
            }
            int iA = t0Var.g.a(i2).a(vVar.c);
            if (iA < i3) {
                return e(v0Var, vVar.a, i2, iA, q0Var.d, vVar.d, z);
            }
            long j8 = q0Var.d;
            if (j8 == -9223372036854775807L) {
                int i4 = t0Var.c;
                if (t0Var.d != -9223372036854775807L) {
                    jMax = -9223372036854775807L;
                } else {
                    androidx.media3.common.u0 u0Var = this.b;
                    v0Var.n(i4, u0Var);
                    if (!u0Var.i || u0Var.k) {
                        jMax = -9223372036854775807L;
                    } else {
                        jMax = Math.max(0L, j7);
                    }
                }
                v0Var2 = v0Var;
                Pair pairJ = v0Var2.j(this.b, t0Var, t0Var.c, -9223372036854775807L, jMax);
                if (pairJ == null) {
                    return null;
                }
                jLongValue = ((Long) pairJ.second).longValue();
                j2 = jMax;
            } else {
                v0Var2 = v0Var;
                j2 = -9223372036854775807L;
                jLongValue = j8;
            }
            int i5 = vVar.b;
            v0Var2.g(obj2, t0Var);
            t0Var.d(i5);
            t0Var.g.a(i5).getClass();
            return f(v0Var2, vVar.a, Math.max(0L, jLongValue), j2, q0Var.d, vVar.d, z);
        }
        q0 q0Var2 = p0Var.g;
        androidx.media3.exoplayer.source.v vVar2 = q0Var2.a;
        long j9 = q0Var2.d;
        int iD = v0Var.d(v0Var.b(vVar2.a), this.a, this.b, this.g, this.h);
        if (iD != -1) {
            androidx.media3.common.t0 t0Var2 = this.a;
            int i6 = v0Var.f(iD, t0Var2, true).c;
            Object obj3 = t0Var2.b;
            obj3.getClass();
            long j10 = vVar2.d;
            androidx.media3.common.u0 u0Var2 = this.b;
            if (v0Var.m(i6, u0Var2, 0L).n == iD) {
                int i7 = t0Var2.c;
                if (t0Var2.d != -9223372036854775807L) {
                    jMax2 = -9223372036854775807L;
                } else {
                    v0Var.n(i7, u0Var2);
                    if (!u0Var2.i || u0Var2.k) {
                        jMax2 = -9223372036854775807L;
                    } else {
                        jMax2 = Math.max(0L, j7);
                    }
                }
                Pair pairJ2 = v0Var.j(this.b, this.a, i6, -9223372036854775807L, jMax2);
                if (pairJ2 != null) {
                    Object obj4 = pairJ2.first;
                    long jLongValue2 = ((Long) pairJ2.second).longValue();
                    p0 p0Var2 = p0Var.m;
                    if (p0Var2 == null || !p0Var2.b.equals(obj4)) {
                        jQ = q(obj4);
                        if (jQ == -1) {
                            jQ = this.f;
                            this.f = 1 + jQ;
                        }
                    } else {
                        jQ = p0Var2.g.a.d;
                    }
                    obj = obj4;
                    j3 = jLongValue2;
                    j6 = jQ;
                    j5 = jMax2;
                    j4 = -9223372036854775807L;
                }
            } else {
                obj = obj3;
                j3 = 0;
                j4 = 0;
                j5 = -9223372036854775807L;
                j6 = j10;
            }
            androidx.media3.exoplayer.source.v vVarO = o(v0Var, obj, j3, j6, this.b, this.a);
            if (j4 != -9223372036854775807L && j9 != -9223372036854775807L) {
                int i8 = v0Var.g(vVar2.a, t0Var2).g.a;
                t0Var2.g.getClass();
                if (i8 > 0) {
                    t0Var2.g(0);
                }
            }
            return d(v0Var, vVarO, j4, j3, j5);
        }
        return null;
    }

    public final q0 d(androidx.media3.common.v0 v0Var, androidx.media3.exoplayer.source.v vVar, long j, long j2, long j3) {
        v0Var.g(vVar.a, this.a);
        boolean zB = vVar.b();
        Object obj = vVar.a;
        return zB ? e(v0Var, obj, vVar.b, vVar.c, j, vVar.d, false) : f(v0Var, obj, j2, j3, j, vVar.d, false);
    }

    public final q0 e(androidx.media3.common.v0 v0Var, Object obj, int i, int i2, long j, long j2, boolean z) {
        androidx.media3.exoplayer.source.v vVar = new androidx.media3.exoplayer.source.v(obj, i, i2, j2, -1);
        androidx.media3.common.t0 t0Var = this.a;
        long jA = v0Var.g(obj, t0Var).a(i, i2);
        if (i2 == t0Var.e(i)) {
            t0Var.g.getClass();
        }
        t0Var.g(i);
        long jMax = 0;
        if (jA != -9223372036854775807L && 0 >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new q0(vVar, jMax, -9223372036854775807L, j, -9223372036854775807L, jA, z, false, false, false, false);
    }

    public final q0 f(androidx.media3.common.v0 v0Var, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        androidx.media3.common.t0 t0Var = this.a;
        v0Var.g(obj, t0Var);
        int iB = t0Var.b(j);
        boolean z2 = false;
        if (iB != -1) {
            t0Var.g(iB);
        } else if (t0Var.g.a > 0) {
            t0Var.g(0);
        }
        androidx.media3.exoplayer.source.v vVar = new androidx.media3.exoplayer.source.v(obj, j4, iB);
        if (!vVar.b() && iB == -1) {
            z2 = true;
        }
        boolean zJ = j(v0Var, vVar);
        boolean zI = i(v0Var, vVar, z2);
        if (iB != -1) {
            t0Var.g(iB);
        }
        if (iB != -1) {
            t0Var.f(iB);
        }
        if (iB != -1) {
            t0Var.d(iB);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        long j6 = (j5 == -9223372036854775807L || j5 == Long.MIN_VALUE) ? t0Var.d : j5;
        return new q0(vVar, (j6 == -9223372036854775807L || j < j6) ? j : Math.max(0L, j6 - ((long) 1)), j2, j3, j5, j6, z, false, z2, zJ, zI);
    }

    public final p0 g() {
        return this.k;
    }

    public final q0 h(androidx.media3.common.v0 v0Var, q0 q0Var) {
        long j;
        long jA;
        androidx.media3.exoplayer.source.v vVar = q0Var.a;
        boolean zB = vVar.b();
        int i = vVar.e;
        boolean z = !zB && i == -1;
        int i2 = vVar.b;
        boolean zJ = j(v0Var, vVar);
        boolean zI = i(v0Var, vVar, z);
        Object obj = vVar.a;
        androidx.media3.common.t0 t0Var = this.a;
        v0Var.g(obj, t0Var);
        if (vVar.b() || i == -1) {
            j = -9223372036854775807L;
        } else {
            t0Var.d(i);
            j = 0;
        }
        if (vVar.b()) {
            jA = t0Var.a(i2, vVar.c);
        } else {
            jA = (j == -9223372036854775807L || j == Long.MIN_VALUE) ? t0Var.d : j;
        }
        if (vVar.b()) {
            t0Var.g(i2);
        } else if (i != -1) {
            t0Var.g(i);
        }
        return new q0(vVar, q0Var.b, q0Var.c, q0Var.d, j, jA, q0Var.g, false, z, zJ, zI);
    }

    public final boolean i(androidx.media3.common.v0 v0Var, androidx.media3.exoplayer.source.v vVar, boolean z) {
        int iB = v0Var.b(vVar.a);
        if (!v0Var.m(v0Var.f(iB, this.a, false).c, this.b, 0L).i) {
            if (v0Var.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(androidx.media3.common.v0 v0Var, androidx.media3.exoplayer.source.v vVar) {
        boolean z = !vVar.b() && vVar.e == -1;
        Object obj = vVar.a;
        if (z) {
            if (v0Var.m(v0Var.g(obj, this.a).c, this.b, 0L).o == v0Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        p0 p0Var = this.m;
        if (p0Var == null || p0Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                p0 p0Var2 = (p0) this.q.get(i);
                if (!p0Var2.h()) {
                    this.m = p0Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        com.google.common.collect.d0 d0VarK = com.google.common.collect.h0.k();
        for (p0 p0Var = this.i; p0Var != null; p0Var = p0Var.m) {
            d0VarK.b(p0Var.g.a);
        }
        p0 p0Var2 = this.j;
        this.d.d(new androidx.compose.foundation.text.contextmenu.internal.g(2, this, d0VarK, p0Var2 == null ? null : p0Var2.g.a));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public final void m(long j) {
        p0 p0Var = this.l;
        if (p0Var != null) {
            com.google.android.material.motion.a.q(p0Var.m == null);
            if (p0Var.e) {
                p0Var.a.v(j - p0Var.p);
            }
        }
    }

    public final int n(p0 p0Var) {
        p0Var.getClass();
        int i = 0;
        if (p0Var.equals(this.l)) {
            return 0;
        }
        this.l = p0Var;
        while (true) {
            p0Var = p0Var.m;
            if (p0Var == null) {
                break;
            }
            if (p0Var == this.j) {
                p0 p0Var2 = this.i;
                this.j = p0Var2;
                this.k = p0Var2;
                i = 3;
            }
            if (p0Var == this.k) {
                this.k = this.j;
                i |= 2;
            }
            p0Var.i();
            this.n--;
        }
        p0 p0Var3 = this.l;
        p0Var3.getClass();
        if (p0Var3.m != null) {
            p0Var3.b();
            p0Var3.m = null;
            p0Var3.c();
        }
        l();
        return i;
    }

    public final androidx.media3.exoplayer.source.v p(androidx.media3.common.v0 v0Var, Object obj, long j) {
        long jQ;
        int iB;
        Object obj2 = obj;
        androidx.media3.common.t0 t0Var = this.a;
        int i = v0Var.g(obj2, t0Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (iB = v0Var.b(obj3)) == -1 || v0Var.f(iB, t0Var, false).c != i) {
            p0 p0Var = this.i;
            while (true) {
                if (p0Var == null) {
                    p0 p0Var2 = this.i;
                    while (true) {
                        if (p0Var2 == null) {
                            jQ = q(obj2);
                            if (jQ != -1) {
                                break;
                            }
                            jQ = this.f;
                            this.f = 1 + jQ;
                            if (this.i != null) {
                                break;
                            }
                            this.o = obj2;
                            this.p = jQ;
                            break;
                        }
                        int iB2 = v0Var.b(p0Var2.b);
                        if (iB2 != -1 && v0Var.f(iB2, t0Var, false).c == i) {
                            jQ = p0Var2.g.a.d;
                            break;
                        }
                        p0Var2 = p0Var2.m;
                    }
                } else {
                    if (p0Var.b.equals(obj2)) {
                        jQ = p0Var.g.a.d;
                        break;
                    }
                    p0Var = p0Var.m;
                }
            }
        } else {
            jQ = this.p;
        }
        v0Var.g(obj2, t0Var);
        int i2 = t0Var.c;
        androidx.media3.common.u0 u0Var = this.b;
        v0Var.n(i2, u0Var);
        boolean z = false;
        for (int iB3 = v0Var.b(obj); iB3 >= u0Var.n; iB3--) {
            v0Var.f(iB3, t0Var, true);
            boolean z2 = t0Var.g.a > 0;
            z |= z2;
            if (t0Var.c(t0Var.d) != -1) {
                obj2 = t0Var.b;
                obj2.getClass();
            }
            if (z && (!z2 || t0Var.d != 0)) {
                break;
            }
        }
        return o(v0Var, obj2, j, jQ, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            p0 p0Var = (p0) this.q.get(i);
            if (p0Var.b.equals(obj)) {
                return p0Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(androidx.media3.common.v0 v0Var) {
        androidx.media3.common.v0 v0Var2;
        p0 p0Var;
        p0 p0Var2 = this.i;
        if (p0Var2 == null) {
            return 0;
        }
        int iB = v0Var.b(p0Var2.b);
        while (true) {
            v0Var2 = v0Var;
            iB = v0Var2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                p0Var = p0Var2.m;
                if (p0Var == null || p0Var2.g.i) {
                    break;
                }
                p0Var2 = p0Var;
            }
            if (iB == -1 || p0Var == null || v0Var2.b(p0Var.b) != iB) {
                break;
            }
            p0Var2 = p0Var;
            v0Var = v0Var2;
        }
        int iN = n(p0Var2);
        p0Var2.g = h(v0Var2, p0Var2.g);
        return iN;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    public final int s(androidx.media3.common.v0 v0Var, long j, long j2, long j3) {
        long j4;
        int i;
        q0 q0VarB;
        int i2;
        p0 p0Var = this.i;
        p0 p0Var2 = null;
        while (p0Var != null) {
            q0 q0Var = p0Var.g;
            if (p0Var2 != null) {
                q0 q0VarC = c(v0Var, p0Var2, j);
                if (q0VarC != null) {
                    long j5 = q0VarC.b;
                    androidx.media3.exoplayer.source.v vVar = q0Var.a;
                    long j6 = q0Var.c;
                    j4 = -9223372036854775807L;
                    long j7 = q0Var.b;
                    i = 0;
                    if (vVar.equals(q0VarC.a)) {
                        if (j7 != j5) {
                            if (j6 != -9223372036854775807L) {
                                long j8 = q0VarC.c;
                                if (j8 != -9223372036854775807L) {
                                    if (Math.abs((j5 - j8) - (j7 - j6)) >= 5000000) {
                                    }
                                }
                            }
                        }
                        q0VarB = j7 != j5 ? q0VarC.b(j7, j6) : q0VarC;
                    }
                }
                return n(p0Var2);
            }
            q0VarB = h(v0Var, q0Var);
            j4 = -9223372036854775807L;
            i = 0;
            long j9 = q0VarB.f;
            long j10 = q0Var.d;
            long j11 = q0Var.f;
            p0Var.g = q0VarB.a(j10);
            if (j11 != j9) {
                p0Var.k();
                long j12 = j9 == j4 ? Long.MAX_VALUE : j9 + p0Var.p;
                int i3 = 1;
                int i4 = (p0Var != this.j || p0Var.g.h || (j2 != Long.MIN_VALUE && j2 < j12)) ? i : 1;
                int i5 = (p0Var != this.k || (j3 != Long.MIN_VALUE && j3 < j12)) ? i : 1;
                int iN = n(p0Var);
                if (iN != 0) {
                    return iN;
                }
                if (j11 == j4 && q0Var.e == Long.MIN_VALUE) {
                    long j13 = q0VarB.e;
                    if (j13 == j4 || j13 == Long.MIN_VALUE) {
                        i2 = i;
                    } else {
                        i2 = 1;
                    }
                } else {
                    i2 = i;
                }
                if (i4 == 0 || (j11 == j4 && i2 == 0)) {
                    i3 = i;
                }
                return i5 != 0 ? i3 | 2 : i3;
            }
            p0Var2 = p0Var;
            p0Var = p0Var.m;
        }
        return 0;
    }
}
