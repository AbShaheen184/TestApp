package androidx.media3.exoplayer;

import android.os.SystemClock;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {
    public static final androidx.media3.exoplayer.source.v u = new androidx.media3.exoplayer.source.v(new Object());
    public final androidx.media3.common.v0 a;
    public final androidx.media3.exoplayer.source.v b;
    public final long c;
    public final long d;
    public final int e;
    public final j f;
    public final boolean g;
    public final androidx.media3.exoplayer.source.i1 h;
    public final androidx.media3.exoplayer.trackselection.t i;
    public final List j;
    public final androidx.media3.exoplayer.source.v k;
    public final boolean l;
    public final int m;
    public final int n;
    public final androidx.media3.common.l0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public c1(androidx.media3.common.v0 v0Var, androidx.media3.exoplayer.source.v vVar, long j, long j2, int i, j jVar, boolean z, androidx.media3.exoplayer.source.i1 i1Var, androidx.media3.exoplayer.trackselection.t tVar, List list, androidx.media3.exoplayer.source.v vVar2, boolean z2, int i2, int i3, androidx.media3.common.l0 l0Var, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = v0Var;
        this.b = vVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = jVar;
        this.g = z;
        this.h = i1Var;
        this.i = tVar;
        this.j = list;
        this.k = vVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = l0Var;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static c1 k(androidx.media3.exoplayer.trackselection.t tVar) {
        androidx.media3.common.s0 s0Var = androidx.media3.common.v0.a;
        androidx.media3.exoplayer.source.i1 i1Var = androidx.media3.exoplayer.source.i1.d;
        com.google.common.collect.a1 a1Var = com.google.common.collect.a1.B;
        androidx.media3.common.l0 l0Var = androidx.media3.common.l0.d;
        androidx.media3.exoplayer.source.v vVar = u;
        return new c1(s0Var, vVar, -9223372036854775807L, 0L, 1, null, false, i1Var, tVar, a1Var, vVar, false, 1, 0, l0Var, 0L, 0L, 0L, 0L, false);
    }

    public final c1 a() {
        return new c1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final c1 b(boolean z) {
        return new c1(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final c1 c(androidx.media3.exoplayer.source.v vVar) {
        return new c1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, vVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final c1 d(androidx.media3.exoplayer.source.v vVar, long j, long j2, long j3, long j4, androidx.media3.exoplayer.source.i1 i1Var, androidx.media3.exoplayer.trackselection.t tVar, List list) {
        return new c1(this.a, vVar, j2, j3, this.e, this.f, this.g, i1Var, tVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final c1 e(int i, int i2, boolean z) {
        return new c1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final c1 f(j jVar) {
        return new c1(this.a, this.b, this.c, this.d, this.e, jVar, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final c1 g(androidx.media3.common.l0 l0Var) {
        return new c1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, l0Var, this.q, this.r, this.s, this.t, this.p);
    }

    public final c1 h(int i) {
        return new c1(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final c1 i(boolean z) {
        return new c1(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final c1 j(androidx.media3.common.v0 v0Var) {
        return new c1(v0Var, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return androidx.media3.common.util.j0.Q(androidx.media3.common.util.j0.d0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
