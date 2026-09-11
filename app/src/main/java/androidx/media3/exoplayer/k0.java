package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import androidx.appcompat.widget.c2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Handler.Callback, androidx.media3.exoplayer.source.t, androidx.media3.exoplayer.video.u {
    public static final long D0 = androidx.media3.common.util.j0.d0(10000);
    public final androidx.media3.exoplayer.trackselection.o A;
    public final androidx.media3.exoplayer.trackselection.t B;
    public boolean B0;
    public final g C;
    public final androidx.media3.exoplayer.upstream.f D;
    public final androidx.media3.common.util.g0 E;
    public final com.google.android.gms.cloudmessaging.n F;
    public final Looper G;
    public final androidx.media3.common.u0 H;
    public final androidx.media3.common.t0 I;
    public final long J;
    public final h K;
    public final ArrayList L;
    public final androidx.media3.common.util.e0 M;
    public final q N;
    public final r0 O;
    public final b1 P;
    public final e Q;
    public final long R;
    public final androidx.media3.exoplayer.analytics.k S;
    public final androidx.media3.exoplayer.analytics.g T;
    public final androidx.media3.common.util.g0 U;
    public final boolean V;
    public final androidx.media3.common.audio.d W;
    public final boolean X;
    public k1 Y;
    public boolean a0;
    public boolean b0;
    public j0 c0;
    public int d0;
    public final i1[] e;
    public c1 e0;
    public h0 f0;
    public boolean g0;
    public boolean i0;
    public boolean j0;
    public boolean l0;
    public int m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public int r0;
    public j0 s0;
    public long t0;
    public long u0;
    public int v0;
    public boolean w0;
    public j x0;
    public final a[] y;
    public final boolean[] z;
    public l z0;
    public long A0 = -9223372036854775807L;
    public boolean h0 = false;
    public float C0 = 1.0f;
    public j1 Z = j1.b;
    public long y0 = -9223372036854775807L;
    public long k0 = -9223372036854775807L;

    public k0(Context context, a[] aVarArr, a[] aVarArr2, androidx.media3.exoplayer.trackselection.o oVar, androidx.media3.exoplayer.trackselection.t tVar, g gVar, androidx.media3.exoplayer.upstream.f fVar, int i, boolean z, androidx.media3.exoplayer.analytics.g gVar2, k1 k1Var, e eVar, long j, Looper looper, androidx.media3.common.util.e0 e0Var, q qVar, androidx.media3.exoplayer.analytics.k kVar, l lVar, final androidx.media3.exoplayer.video.u uVar, boolean z2) {
        Looper looper2;
        this.N = qVar;
        this.A = oVar;
        this.B = tVar;
        this.C = gVar;
        this.D = fVar;
        this.m0 = i;
        this.n0 = z;
        this.Y = k1Var;
        this.Q = eVar;
        this.R = j;
        boolean z3 = false;
        this.M = e0Var;
        this.S = kVar;
        this.z0 = lVar;
        this.T = gVar2;
        this.X = z2;
        this.J = gVar.o;
        androidx.media3.common.s0 s0Var = androidx.media3.common.v0.a;
        c1 c1VarK = c1.k(tVar);
        this.e0 = c1VarK;
        this.f0 = new h0(c1VarK);
        this.y = new a[aVarArr.length];
        this.z = new boolean[aVarArr.length];
        oVar.getClass();
        this.e = new i1[aVarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            a aVar = aVarArr[i2];
            aVar.B = i2;
            aVar.C = kVar;
            aVar.D = e0Var;
            this.y[i2] = aVar;
            a aVar2 = this.y[i2];
            synchronized (aVar2.e) {
                aVar2.O = oVar;
            }
            a aVar3 = aVarArr2[i2];
            if (aVar3 != null) {
                aVar3.B = i2;
                aVar3.C = kVar;
                aVar3.D = e0Var;
                z4 = true;
            }
            i1[] i1VarArr = this.e;
            a aVar4 = aVarArr[i2];
            i1 i1Var = new i1();
            i1Var.e = aVar4;
            i1Var.c = i2;
            i1Var.f = aVar3;
            i1Var.d = 0;
            i1Var.a = false;
            i1Var.b = false;
            i1VarArr[i2] = i1Var;
        }
        this.V = z4;
        this.K = new h(this, e0Var);
        this.L = new ArrayList();
        this.H = new androidx.media3.common.u0();
        this.I = new androidx.media3.common.t0();
        com.google.android.material.motion.a.q(oVar.a == null);
        oVar.a = this;
        oVar.b = fVar;
        this.w0 = true;
        androidx.media3.common.util.g0 g0VarA = e0Var.a(looper, null);
        this.U = g0VarA;
        this.O = new r0(gVar2, g0VarA, new androidx.activity.y(this, 12), lVar);
        this.P = new b1(this, gVar2, g0VarA, kVar);
        com.google.android.gms.cloudmessaging.n nVar = new com.google.android.gms.cloudmessaging.n();
        nVar.y = new Object();
        nVar.z = null;
        nVar.A = null;
        nVar.e = 0;
        this.F = nVar;
        synchronized (nVar.y) {
            try {
                if (((Looper) nVar.z) == null) {
                    if (nVar.e == 0 && ((HandlerThread) nVar.A) == null) {
                        z3 = true;
                    }
                    com.google.android.material.motion.a.q(z3);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    nVar.A = handlerThread;
                    handlerThread.start();
                    nVar.z = ((HandlerThread) nVar.A).getLooper();
                }
                nVar.e++;
                looper2 = (Looper) nVar.z;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.G = looper2;
        androidx.media3.common.util.g0 g0VarA2 = e0Var.a(looper2, this);
        this.E = g0VarA2;
        this.W = new androidx.media3.common.audio.d(context, looper2, this);
        g0VarA2.b(35, new androidx.media3.exoplayer.video.u() { // from class: androidx.media3.exoplayer.d0
            @Override // androidx.media3.exoplayer.video.u
            public final void c(long j2, long j3, androidx.media3.common.r rVar, MediaFormat mediaFormat) {
                uVar.c(j2, j3, rVar, mediaFormat);
                this.e.c(j2, j3, rVar, mediaFormat);
            }
        }).b();
        g0VarA2.b(39, new e0(this)).b();
    }

    public static Pair S(androidx.media3.common.v0 v0Var, j0 j0Var, boolean z, int i, boolean z2, androidx.media3.common.u0 u0Var, androidx.media3.common.t0 t0Var) {
        int iT;
        androidx.media3.common.v0 v0Var2 = j0Var.a;
        if (v0Var.p()) {
            return null;
        }
        androidx.media3.common.v0 v0Var3 = v0Var2.p() ? v0Var : v0Var2;
        try {
            Pair pairI = v0Var3.i(u0Var, t0Var, j0Var.b, j0Var.c);
            if (!v0Var.equals(v0Var3)) {
                if (v0Var.b(pairI.first) == -1) {
                    if (!z || (iT = T(u0Var, t0Var, i, z2, pairI.first, v0Var3, v0Var)) == -1) {
                        return null;
                    }
                    return v0Var.i(u0Var, t0Var, iT, -9223372036854775807L);
                }
                if (v0Var3.g(pairI.first, t0Var).f && v0Var3.m(t0Var.c, u0Var, 0L).n == v0Var3.b(pairI.first)) {
                    return v0Var.i(u0Var, t0Var, v0Var.g(pairI.first, t0Var).c, j0Var.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(androidx.media3.common.u0 u0Var, androidx.media3.common.t0 t0Var, int i, boolean z, Object obj, androidx.media3.common.v0 v0Var, androidx.media3.common.v0 v0Var2) {
        androidx.media3.common.v0 v0Var3 = v0Var;
        Object obj2 = v0Var3.m(v0Var3.g(obj, t0Var).c, u0Var, 0L).a;
        for (int i2 = 0; i2 < v0Var2.o(); i2++) {
            if (v0Var2.m(i2, u0Var, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int iB = v0Var3.b(obj);
        int iH = v0Var3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            androidx.media3.common.v0 v0Var4 = v0Var3;
            int iD = v0Var4.d(iB, t0Var, u0Var, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = v0Var2.b(v0Var4.l(iD));
            i3++;
            v0Var3 = v0Var4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return v0Var2.f(iB2, t0Var, false).c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.u, androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public static boolean z(p0 p0Var) {
        if (p0Var != null) {
            try {
                ?? r1 = p0Var.a;
                if (p0Var.e) {
                    for (androidx.media3.exoplayer.source.w0 w0Var : p0Var.c) {
                        if (w0Var != null) {
                            w0Var.b();
                        }
                    }
                } else {
                    r1.h();
                }
                if ((!p0Var.e ? 0L : r1.f()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, androidx.media3.exoplayer.source.v vVar) {
        r0 r0Var = this.O;
        p0 p0Var = r0Var.k;
        if (p0Var != null && p0Var.g.a.equals(vVar)) {
            i1 i1Var = this.e[i];
            p0 p0Var2 = r0Var.k;
            int i2 = i1Var.d;
            boolean z = (i2 == 2 || i2 == 4) && i1Var.d(p0Var2) == ((a) i1Var.e);
            boolean z2 = i1Var.d == 3 && i1Var.d(p0Var2) == ((a) i1Var.f);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.a0;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        c1 c1Var = this.e0;
        if (c1Var.l == z2 && c1Var.n == i2 && c1Var.m == i3) {
            return;
        }
        this.e0 = c1Var.e(i3, i2, z2);
        D0(false, false);
        r0 r0Var = this.O;
        for (p0 p0Var = r0Var.i; p0Var != null; p0Var = p0Var.m) {
            for (androidx.media3.exoplayer.trackselection.q qVar : p0Var.o.c) {
                if (qVar != null) {
                    qVar.f(z2);
                }
            }
        }
        if (!r0()) {
            v0();
            B0();
            c1 c1Var2 = this.e0;
            if (c1Var2.p) {
                this.e0 = c1Var2.i(false);
            }
            r0Var.m(this.t0);
            return;
        }
        int i4 = this.e0.e;
        androidx.media3.common.util.g0 g0Var = this.E;
        if (i4 != 3) {
            if (i4 == 2) {
                g0Var.f(2);
            }
        } else {
            h hVar = this.K;
            hVar.C = true;
            hVar.e.f();
            t0();
            g0Var.f(2);
        }
    }

    public final boolean B() {
        p0 p0Var = this.O.i;
        long j = p0Var.g.f;
        if (p0Var.e) {
            return j == -9223372036854775807L || this.e0.s < j || !r0();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Type inference failed for: r2v21, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final void B0() {
        androidx.media3.common.l0 l0VarE;
        long j;
        float f;
        p0 p0Var = this.O.i;
        if (p0Var == null) {
            return;
        }
        long jP = p0Var.e ? p0Var.a.p() : -9223372036854775807L;
        if (jP != -9223372036854775807L) {
            if (!p0Var.g()) {
                this.O.n(p0Var);
                u(false);
                C();
            }
            Q(jP, true);
            if (jP != this.e0.s) {
                c1 c1Var = this.e0;
                this.e0 = y(c1Var.b, jP, c1Var.c, jP, true, 5);
            }
        } else {
            h hVar = this.K;
            boolean z = p0Var != this.O.j;
            l1 l1Var = hVar.e;
            a aVar = hVar.z;
            if (aVar == null || aVar.m() || ((z && hVar.z.E != 2) || (!hVar.z.o() && (z || hVar.z.l())))) {
                hVar.B = true;
                if (hVar.C) {
                    l1Var.f();
                }
            } else {
                o0 o0Var = hVar.A;
                o0Var.getClass();
                long jB = o0Var.b();
                if (!hVar.B) {
                    l1Var.d(jB);
                    l0VarE = o0Var.e();
                    if (!l0VarE.equals((androidx.media3.common.l0) l1Var.B)) {
                        l1Var.a(l0VarE);
                        hVar.y.E.b(16, l0VarE).b();
                    }
                } else if (jB >= l1Var.b()) {
                    hVar.B = false;
                    if (hVar.C) {
                        l1Var.f();
                    }
                    l1Var.d(jB);
                    l0VarE = o0Var.e();
                    if (!l0VarE.equals((androidx.media3.common.l0) l1Var.B)) {
                        l1Var.a(l0VarE);
                        hVar.y.E.b(16, l0VarE).b();
                    }
                } else if (l1Var.y) {
                    l1Var.d(l1Var.b());
                    l1Var.y = false;
                }
            }
            long jB2 = hVar.b();
            this.t0 = jB2;
            long j2 = jB2 - p0Var.p;
            long j3 = this.e0.s;
            if (!this.L.isEmpty() && !this.e0.b.b()) {
                if (this.w0) {
                    this.w0 = false;
                }
                c1 c1Var2 = this.e0;
                c1Var2.a.b(c1Var2.b.a);
                int iMin = Math.min(this.v0, this.L.size());
                if (iMin > 0 && this.L.get(iMin - 1) != null) {
                    androidx.transition.k.i();
                    return;
                } else {
                    if (iMin < this.L.size() && this.L.get(iMin) != null) {
                        androidx.transition.k.i();
                        return;
                    }
                    this.v0 = iMin;
                }
            }
            if (this.K.c()) {
                boolean z2 = !this.f0.d;
                c1 c1Var3 = this.e0;
                this.e0 = y(c1Var3.b, j2, c1Var3.c, j2, z2, 6);
            } else {
                c1 c1Var4 = this.e0;
                c1Var4.s = j2;
                c1Var4.t = SystemClock.elapsedRealtime();
            }
        }
        this.e0.q = this.O.l.d();
        c1 c1Var5 = this.e0;
        c1Var5.r = p(c1Var5.q);
        c1 c1Var6 = this.e0;
        if (c1Var6.l && c1Var6.e == 3 && s0(c1Var6.a, c1Var6.b)) {
            c1 c1Var7 = this.e0;
            float f2 = 1.0f;
            if (c1Var7.o.a == 1.0f) {
                e eVar = this.Q;
                long jK = k(c1Var7.a, c1Var7.b.a, c1Var7.s);
                long j4 = this.e0.r;
                if (eVar.c != -9223372036854775807L) {
                    long j5 = jK - j4;
                    long j6 = eVar.m;
                    if (j6 == -9223372036854775807L) {
                        eVar.m = j5;
                        eVar.n = 0L;
                    } else {
                        long jMax = Math.max(j5, (long) ((j5 * 9.999871E-4f) + (j6 * 0.999f)));
                        eVar.m = jMax;
                        eVar.n = (long) ((9.999871E-4f * Math.abs(j5 - jMax)) + (eVar.n * 0.999f));
                    }
                    if (eVar.l != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - eVar.l < 1000) {
                            f2 = eVar.k;
                        }
                    } else {
                        j = 1000;
                    }
                    eVar.l = SystemClock.elapsedRealtime();
                    long j7 = (eVar.n * 3) + eVar.m;
                    if (eVar.h > j7) {
                        float fQ = androidx.media3.common.util.j0.Q(j);
                        f = 1.0E-7f;
                        long[] jArr = {j7, eVar.e, eVar.h - (((long) ((eVar.k - 1.0f) * fQ)) + ((long) ((eVar.i - 1.0f) * fQ)))};
                        long j8 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j9 = jArr[i];
                            if (j9 > j8) {
                                j8 = j9;
                            }
                        }
                        eVar.h = j8;
                    } else {
                        f = 1.0E-7f;
                        long jK2 = androidx.media3.common.util.j0.k(jK - ((long) (Math.max(0.0f, eVar.k - 1.0f) / 1.0E-7f)), eVar.h, j7);
                        eVar.h = jK2;
                        long j10 = eVar.g;
                        if (j10 != -9223372036854775807L && jK2 > j10) {
                            eVar.h = j10;
                        }
                    }
                    long j11 = jK - eVar.h;
                    if (Math.abs(j11) < eVar.a) {
                        eVar.k = 1.0f;
                    } else {
                        eVar.k = androidx.media3.common.util.j0.i((f * j11) + 1.0f, eVar.j, eVar.i);
                    }
                    f2 = eVar.k;
                }
                if (this.K.e().a != f2) {
                    androidx.media3.common.l0 l0Var = new androidx.media3.common.l0(f2, this.e0.o.b);
                    this.E.e(16);
                    this.K.a(l0Var);
                    x(this.e0.o, this.K.e().a, false, false);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [androidx.media3.exoplayer.source.y0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public final void C() {
        boolean zB;
        if (z(this.O.l)) {
            p0 p0Var = this.O.l;
            long jP = p(!p0Var.e ? 0L : p0Var.a.f());
            p0 p0Var2 = this.O.i;
            long j = s0(this.e0.a, p0Var.g.a) ? this.Q.h : -9223372036854775807L;
            androidx.media3.exoplayer.analytics.k kVar = this.S;
            androidx.media3.common.v0 v0Var = this.e0.a;
            androidx.media3.exoplayer.source.v vVar = p0Var.g.a;
            float f = this.K.e().a;
            boolean z = this.e0.l;
            l0 l0Var = new l0(kVar, v0Var, vVar, jP, f, this.j0, j);
            zB = this.C.b(l0Var);
            p0 p0Var3 = this.O.i;
            if (!zB && p0Var3.e && jP < 500000 && this.J > 0) {
                p0Var3.a.k(this.e0.s);
                zB = this.C.b(l0Var);
            }
        } else {
            zB = false;
        }
        this.l0 = zB;
        if (zB) {
            p0 p0Var4 = this.O.l;
            p0Var4.getClass();
            m0 m0Var = new m0();
            m0Var.a = this.t0 - p0Var4.p;
            float f2 = this.K.e().a;
            com.google.android.material.motion.a.f(f2 > 0.0f || f2 == -3.4028235E38f);
            m0Var.b = f2;
            long j2 = this.k0;
            com.google.android.material.motion.a.f(j2 >= 0 || j2 == -9223372036854775807L);
            m0Var.c = j2;
            n0 n0Var = new n0(m0Var);
            com.google.android.material.motion.a.q(p0Var4.m == null);
            p0Var4.a.d(n0Var);
        }
        w0();
    }

    public final void C0(androidx.media3.common.v0 v0Var, androidx.media3.exoplayer.source.v vVar, androidx.media3.common.v0 v0Var2, androidx.media3.exoplayer.source.v vVar2, long j, boolean z) {
        boolean zS0 = s0(v0Var, vVar);
        Object obj = vVar.a;
        if (!zS0) {
            androidx.media3.common.l0 l0Var = vVar.b() ? androidx.media3.common.l0.d : this.e0.o;
            h hVar = this.K;
            if (hVar.e().equals(l0Var)) {
                return;
            }
            this.E.e(16);
            hVar.a(l0Var);
            x(this.e0.o, l0Var.a, false, false);
            return;
        }
        androidx.media3.common.t0 t0Var = this.I;
        int i = v0Var.g(obj, t0Var).c;
        androidx.media3.common.u0 u0Var = this.H;
        v0Var.n(i, u0Var);
        androidx.media3.common.x xVar = u0Var.j;
        e eVar = this.Q;
        eVar.getClass();
        eVar.c = androidx.media3.common.util.j0.Q(xVar.a);
        eVar.f = androidx.media3.common.util.j0.Q(xVar.b);
        eVar.g = androidx.media3.common.util.j0.Q(xVar.c);
        float f = xVar.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        eVar.j = f;
        float f2 = xVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        eVar.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            eVar.c = -9223372036854775807L;
        }
        eVar.a();
        if (j != -9223372036854775807L) {
            eVar.d = k(v0Var, obj, j);
            eVar.a();
            return;
        }
        if (!Objects.equals(!v0Var2.p() ? v0Var2.m(v0Var2.g(vVar2.a, t0Var).c, u0Var, 0L).a : null, u0Var.a) || z) {
            eVar.d = -9223372036854775807L;
            eVar.a();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.u, androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public final void D() {
        r0 r0Var = this.O;
        r0Var.k();
        p0 p0Var = r0Var.m;
        if (p0Var != null) {
            ?? r1 = p0Var.a;
            if ((!p0Var.d || p0Var.e) && !r1.n()) {
                androidx.media3.common.v0 v0Var = this.e0.a;
                if (p0Var.e) {
                    r1.t();
                }
                Iterator it = this.C.q.values().iterator();
                while (it.hasNext()) {
                    if (((f) it.next()).b) {
                        return;
                    }
                }
                if (!p0Var.d) {
                    long j = p0Var.g.b;
                    p0Var.d = true;
                    r1.q(this, j);
                    return;
                }
                m0 m0Var = new m0();
                m0Var.a = this.t0 - p0Var.p;
                float f = this.K.e().a;
                com.google.android.material.motion.a.f(f > 0.0f || f == -3.4028235E38f);
                m0Var.b = f;
                long j2 = this.k0;
                com.google.android.material.motion.a.f(j2 >= 0 || j2 == -9223372036854775807L);
                m0Var.c = j2;
                n0 n0Var = new n0(m0Var);
                com.google.android.material.motion.a.q(p0Var.m == null);
                r1.d(n0Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long jElapsedRealtime;
        this.j0 = z;
        if (!z || z2) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.M.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.k0 = jElapsedRealtime;
    }

    public final void E() {
        h0 h0Var = this.f0;
        c1 c1Var = this.e0;
        boolean z = h0Var.c | (((c1) h0Var.f) != c1Var);
        h0Var.c = z;
        h0Var.f = c1Var;
        if (z) {
            c0 c0Var = this.N.e;
            c0Var.j.d(new androidx.activity.c(9, c0Var, h0Var));
            this.f0 = new h0(this.e0);
        }
    }

    public final void F(int i) {
        i1 i1Var = this.e[i];
        try {
            p0 p0Var = this.O.i;
            p0Var.getClass();
            a aVarD = i1Var.d(p0Var);
            aVarD.getClass();
            androidx.media3.exoplayer.source.w0 w0Var = aVarD.F;
            w0Var.getClass();
            w0Var.b();
        } catch (IOException | RuntimeException e) {
            int i2 = ((a) i1Var.e).y;
            if (i2 != 3 && i2 != 5) {
                throw e;
            }
            androidx.media3.exoplayer.trackselection.t tVar = this.O.i.o;
            androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Disabling track due to error: ".concat(androidx.media3.common.r.c(tVar.c[i].n())), e);
            androidx.media3.exoplayer.trackselection.t tVar2 = new androidx.media3.exoplayer.trackselection.t((h1[]) tVar.b.clone(), (androidx.media3.exoplayer.trackselection.q[]) tVar.c.clone(), tVar.d, tVar.e);
            tVar2.b[i] = null;
            tVar2.c[i] = null;
            g(i);
            p0 p0Var2 = this.O.i;
            p0Var2.a(tVar2, this.e0.s, false, new boolean[p0Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.z;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.U.d(new androidx.compose.foundation.text.input.internal.d(this, i, z));
        }
    }

    public final void H() throws Throwable {
        v(this.P.c(), true);
    }

    public final void I() {
        this.f0.e(1);
        throw null;
    }

    public final void J() {
        this.f0.e(1);
        O(false, false, false, true);
        g gVar = this.C;
        ConcurrentHashMap concurrentHashMap = gVar.q;
        long id = Thread.currentThread().getId();
        long j = gVar.r;
        com.google.android.material.motion.a.p("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        gVar.r = id;
        androidx.media3.exoplayer.analytics.k kVar = this.S;
        f fVar = (f) concurrentHashMap.get(kVar);
        if (fVar == null) {
            f fVar2 = new f();
            fVar2.a = 1;
            concurrentHashMap.put(kVar, fVar2);
        } else {
            fVar.a++;
        }
        f fVar3 = (f) concurrentHashMap.get(kVar);
        fVar3.getClass();
        Integer num = (Integer) gVar.p.get(kVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? gVar.l : num.intValue();
        if (iIntValue == -1) {
            iIntValue = 13107200;
        }
        fVar3.c = iIntValue;
        fVar3.b = false;
        n0(this.e0.a.p() ? 4 : 2);
        c1 c1Var = this.e0;
        boolean z = c1Var.l;
        A0(this.W.c(c1Var.e, z), c1Var.n, c1Var.m, z);
        androidx.media3.exoplayer.upstream.f fVar4 = this.D;
        fVar4.getClass();
        b1 b1Var = this.P;
        ArrayList arrayList = (ArrayList) b1Var.c;
        com.google.android.material.motion.a.q(!b1Var.a);
        b1Var.l = fVar4;
        for (int i = 0; i < arrayList.size(); i++) {
            a1 a1Var = (a1) arrayList.get(i);
            b1Var.g(a1Var);
            ((HashSet) b1Var.h).add(a1Var);
        }
        b1Var.a = true;
        this.E.f(2);
    }

    public final void K(androidx.media3.common.util.h hVar) {
        com.google.android.gms.cloudmessaging.n nVar = this.F;
        androidx.media3.common.util.g0 g0Var = this.E;
        try {
            O(true, false, true, false);
            L();
            g gVar = this.C;
            androidx.media3.exoplayer.analytics.k kVar = this.S;
            ConcurrentHashMap concurrentHashMap = gVar.q;
            f fVar = (f) concurrentHashMap.get(kVar);
            if (fVar != null) {
                int i = fVar.a - 1;
                fVar.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(kVar);
                    gVar.c();
                }
            }
            if (gVar.q.isEmpty()) {
                gVar.r = -1L;
            }
            androidx.media3.common.audio.d dVar = this.W;
            dVar.c = null;
            dVar.a();
            dVar.b(0);
            this.A.k();
            n0(1);
        } finally {
            g0Var.a.removeCallbacksAndMessages(null);
            nVar.d();
            hVar.c();
        }
    }

    public final void L() {
        for (int i = 0; i < this.e.length; i++) {
            a aVar = this.y[i];
            synchronized (aVar.e) {
                aVar.O = null;
            }
            i1 i1Var = this.e[i];
            a aVar2 = (a) i1Var.e;
            com.google.android.material.motion.a.q(aVar2.E == 0);
            aVar2.s();
            i1Var.a = false;
            a aVar3 = (a) i1Var.f;
            if (aVar3 != null) {
                com.google.android.material.motion.a.q(aVar3.E == 0);
                aVar3.s();
                i1Var.b = false;
            }
        }
    }

    public final void M(int i, int i2, androidx.media3.exoplayer.source.z0 z0Var) throws Throwable {
        this.f0.e(1);
        b1 b1Var = this.P;
        b1Var.getClass();
        com.google.android.material.motion.a.f(i >= 0 && i <= i2 && i2 <= ((ArrayList) b1Var.c).size());
        b1Var.k = z0Var;
        b1Var.i(i, i2);
        v(b1Var.c(), false);
    }

    /* JADX WARN: Code duplicated, block: B:78:0x016c  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    public final void N() {
        int i;
        int i2;
        float f = this.K.e().a;
        r0 r0Var = this.O;
        p0 p0Var = r0Var.i;
        p0 p0Var2 = r0Var.j;
        androidx.media3.exoplayer.trackselection.t tVar = null;
        p0 p0Var3 = p0Var;
        boolean z = true;
        while (p0Var3 != null && p0Var3.e) {
            c1 c1Var = this.e0;
            androidx.media3.exoplayer.trackselection.t tVarJ = p0Var3.j(f, c1Var.a, c1Var.l);
            androidx.media3.exoplayer.trackselection.t tVar2 = p0Var3 == this.O.i ? tVarJ : tVar;
            androidx.media3.exoplayer.trackselection.t tVar3 = p0Var3.o;
            androidx.media3.exoplayer.trackselection.q[] qVarArr = tVarJ.c;
            if (tVar3 != null && tVar3.c.length == qVarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= qVarArr.length) {
                        if (p0Var3 == p0Var2) {
                            z = false;
                        }
                        p0Var3 = p0Var3.m;
                        tVar = tVar2;
                    } else if (tVarJ.a(tVar3, i3)) {
                        i3++;
                    }
                }
            }
            r0 r0Var2 = this.O;
            if (!z) {
                i = 4;
                r0Var2.n(p0Var3);
                if (p0Var3.e) {
                    long jMax = Math.max(p0Var3.g.b, this.t0 - p0Var3.p);
                    if (this.V && d() && this.O.k == p0Var3) {
                        f();
                    }
                    i2 = 4;
                    p0Var3.a(tVarJ, jMax, false, new boolean[p0Var3.j.length]);
                }
                u(true);
                if (this.e0.e != i2) {
                    C();
                    B0();
                    this.E.f(2);
                    return;
                }
                return;
            }
            p0 p0Var4 = r0Var2.i;
            boolean z2 = (r0Var2.n(p0Var4) & 1) != 0;
            boolean[] zArr = new boolean[this.e.length];
            tVar2.getClass();
            long jA = p0Var4.a(tVar2, this.e0.s, z2, zArr);
            c1 c1Var2 = this.e0;
            boolean z3 = (c1Var2.e == 4 || jA == c1Var2.s) ? false : true;
            c1 c1Var3 = this.e0;
            i = 4;
            this.e0 = y(c1Var3.b, jA, c1Var3.c, c1Var3.d, z3, 5);
            if (z3) {
                Q(jA, true);
            }
            f();
            boolean[] zArr2 = new boolean[this.e.length];
            int i4 = 0;
            while (true) {
                i1[] i1VarArr = this.e;
                if (i4 >= i1VarArr.length) {
                    break;
                }
                int iC = i1VarArr[i4].c();
                zArr2[i4] = this.e[i4].g();
                i1 i1Var = this.e[i4];
                androidx.media3.exoplayer.source.w0 w0Var = p0Var4.c[i4];
                h hVar = this.K;
                long j = this.t0;
                boolean z4 = zArr[i4];
                a aVar = (a) i1Var.e;
                if (i1.h(aVar)) {
                    if (w0Var != aVar.F) {
                        i1Var.a(aVar, hVar);
                    } else if (z4) {
                        aVar.B(j, false, true);
                    }
                }
                a aVar2 = (a) i1Var.f;
                if (aVar2 != null && i1.h(aVar2)) {
                    if (w0Var != aVar2.F) {
                        i1Var.a(aVar2, hVar);
                    } else if (z4) {
                        aVar2.B(j, false, true);
                    }
                }
                if (iC - this.e[i4].c() > 0) {
                    G(i4, false);
                }
                this.r0 -= iC - this.e[i4].c();
                i4++;
            }
            j(zArr2, this.t0);
            p0Var4.h = true;
            i2 = i;
            u(true);
            if (this.e0.e != i2) {
                C();
                B0();
                this.E.f(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0137  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0143  */
    /* JADX WARN: Code duplicated, block: B:68:0x0148  */
    /* JADX WARN: Code duplicated, block: B:70:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:77:0x0180  */
    /* JADX WARN: Code duplicated, block: B:79:0x018a  */
    /* JADX WARN: Code duplicated, block: B:82:0x0198 A[LOOP:3: B:80:0x0190->B:82:0x0198, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x01c2  */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        androidx.media3.common.v0 g1Var;
        androidx.media3.exoplayer.source.v vVar;
        c1 c1Var;
        j jVar;
        androidx.media3.exoplayer.source.i1 i1Var;
        androidx.media3.exoplayer.trackselection.t tVar;
        List list;
        r0 r0Var;
        int i;
        this.E.e(2);
        this.b0 = false;
        if (this.c0 != null) {
            this.f0.e(1);
            this.c0 = null;
        }
        this.x0 = null;
        D0(false, true);
        h hVar = this.K;
        hVar.C = false;
        l1 l1Var = hVar.e;
        if (l1Var.y) {
            l1Var.d(l1Var.b());
            l1Var.y = false;
        }
        this.t0 = 1000000000000L;
        for (int i2 = 0; i2 < this.e.length; i2++) {
            try {
                g(i2);
            } catch (j e) {
                e = e;
                androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Disable failed.", e);
            } catch (RuntimeException e2) {
                e = e2;
                androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.A0 = -9223372036854775807L;
        if (z) {
            for (i1 i1Var2 : this.e) {
                try {
                    i1Var2.k();
                } catch (RuntimeException e3) {
                    androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Reset failed.", e3);
                }
            }
        }
        this.r0 = 0;
        c1 c1Var2 = this.e0;
        androidx.media3.exoplayer.source.v vVar2 = c1Var2.b;
        long j4 = c1Var2.s;
        if (this.e0.b.b()) {
            j = this.e0.c;
        } else {
            c1 c1Var3 = this.e0;
            androidx.media3.common.t0 t0Var = this.I;
            androidx.media3.exoplayer.source.v vVar3 = c1Var3.b;
            androidx.media3.common.v0 v0Var = c1Var3.a;
            if (v0Var.p() || v0Var.g(vVar3.a, t0Var).f) {
                j = this.e0.c;
            } else {
                j = this.e0.s;
            }
        }
        if (z2) {
            this.s0 = null;
            Pair pairN = n(this.e0.a);
            vVar2 = (androidx.media3.exoplayer.source.v) pairN.first;
            long jLongValue = ((Long) pairN.second).longValue();
            z5 = vVar2.equals(this.e0.b) ? false : true;
            j2 = jLongValue;
            j3 = -9223372036854775807L;
        } else {
            j2 = j4;
            j3 = j;
            z5 = false;
        }
        this.O.b();
        this.l0 = false;
        androidx.media3.common.v0 v0Var2 = this.e0.a;
        if (z3 && (v0Var2 instanceof g1)) {
            g1 g1Var2 = (g1) v0Var2;
            androidx.media3.exoplayer.source.z0 z0Var = (androidx.media3.exoplayer.source.z0) this.P.k;
            androidx.media3.common.v0[] v0VarArr = g1Var2.h;
            androidx.media3.common.v0[] v0VarArr2 = new androidx.media3.common.v0[v0VarArr.length];
            for (int i3 = 0; i3 < v0VarArr.length; i3++) {
                v0VarArr2[i3] = new f1(v0VarArr[i3]);
            }
            g1Var = new g1(v0VarArr2, g1Var2.i, z0Var);
            if (vVar2.b != -1) {
                g1Var.g(vVar2.a, this.I);
                int i4 = this.I.c;
                androidx.media3.common.u0 u0Var = this.H;
                g1Var.m(i4, u0Var, 0L);
                if (u0Var.a()) {
                    vVar = new androidx.media3.exoplayer.source.v(vVar2.d, vVar2.a);
                }
            }
            c1Var = this.e0;
            int i5 = c1Var.e;
            if (z4) {
                jVar = null;
            } else {
                jVar = c1Var.f;
            }
            if (z5) {
                i1Var = androidx.media3.exoplayer.source.i1.d;
            } else {
                i1Var = c1Var.h;
            }
            androidx.media3.exoplayer.source.i1 i1Var3 = i1Var;
            if (z5) {
                tVar = this.B;
            } else {
                tVar = c1Var.i;
            }
            androidx.media3.exoplayer.trackselection.t tVar2 = tVar;
            if (z5) {
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                list = com.google.common.collect.a1.B;
            } else {
                list = c1Var.j;
            }
            this.e0 = new c1(g1Var, vVar, j3, j2, i5, jVar, false, i1Var3, tVar2, list, vVar, c1Var.l, c1Var.m, c1Var.n, c1Var.o, j2, 0L, j2, 0L, false);
            if (z3) {
                r0Var = this.O;
                if (!r0Var.q.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i = 0; i < r0Var.q.size(); i++) {
                        ((p0) r0Var.q.get(i)).i();
                    }
                    r0Var.q = arrayList;
                    r0Var.m = null;
                    r0Var.k();
                }
                b1 b1Var = this.P;
                HashMap map = (HashMap) b1Var.f;
                for (z0 z0Var2 : map.values()) {
                    try {
                        z0Var2.a.o(z0Var2.b);
                    } catch (RuntimeException e4) {
                        androidx.media3.common.util.c.g("MediaSourceList", "Failed to release child source.", e4);
                    }
                    androidx.media3.exoplayer.source.a aVar = z0Var2.a;
                    y0 y0Var = z0Var2.c;
                    aVar.r(y0Var);
                    z0Var2.a.q(y0Var);
                }
                map.clear();
                ((HashSet) b1Var.h).clear();
                b1Var.a = false;
            }
        }
        g1Var = v0Var2;
        vVar = vVar2;
        c1Var = this.e0;
        int i6 = c1Var.e;
        if (z4) {
            jVar = null;
        } else {
            jVar = c1Var.f;
        }
        if (z5) {
            i1Var = androidx.media3.exoplayer.source.i1.d;
        } else {
            i1Var = c1Var.h;
        }
        androidx.media3.exoplayer.source.i1 i1Var4 = i1Var;
        if (z5) {
            tVar = this.B;
        } else {
            tVar = c1Var.i;
        }
        androidx.media3.exoplayer.trackselection.t tVar3 = tVar;
        if (z5) {
            com.google.common.collect.e0 e0Var2 = com.google.common.collect.h0.y;
            list = com.google.common.collect.a1.B;
        } else {
            list = c1Var.j;
        }
        this.e0 = new c1(g1Var, vVar, j3, j2, i6, jVar, false, i1Var4, tVar3, list, vVar, c1Var.l, c1Var.m, c1Var.n, c1Var.o, j2, 0L, j2, 0L, false);
        if (z3) {
            r0Var = this.O;
            if (!r0Var.q.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i < r0Var.q.size()) {
                    ((p0) r0Var.q.get(i)).i();
                }
                r0Var.q = arrayList2;
                r0Var.m = null;
                r0Var.k();
            }
            b1 b1Var2 = this.P;
            HashMap map2 = (HashMap) b1Var2.f;
            while (r5.hasNext()) {
                z0Var2.a.o(z0Var2.b);
                androidx.media3.exoplayer.source.a aVar2 = z0Var2.a;
                y0 y0Var2 = z0Var2.c;
                aVar2.r(y0Var2);
                z0Var2.a.q(y0Var2);
            }
            map2.clear();
            ((HashSet) b1Var2.h).clear();
            b1Var2.a = false;
        }
    }

    public final void P() {
        p0 p0Var = this.O.i;
        this.i0 = p0Var != null && p0Var.g.j && this.h0;
    }

    public final void Q(long j, boolean z) {
        p0 p0Var = this.O.i;
        long j2 = j + (p0Var == null ? 1000000000000L : p0Var.p);
        this.t0 = j2;
        this.K.e.d(j2);
        for (i1 i1Var : this.e) {
            long j3 = this.t0;
            a aVarD = i1Var.d(p0Var);
            if (aVarD != null) {
                aVarD.B(j3, false, z);
            }
        }
        for (p0 p0Var2 = r0.i; p0Var2 != null; p0Var2 = p0Var2.m) {
            for (androidx.media3.exoplayer.trackselection.q qVar : p0Var2.o.c) {
                if (qVar != null) {
                    qVar.s();
                }
            }
        }
    }

    public final void R(androidx.media3.common.v0 v0Var, androidx.media3.common.v0 v0Var2) {
        if (v0Var.p() && v0Var2.p()) {
            return;
        }
        ArrayList arrayList = this.L;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            androidx.privacysandbox.ads.adservices.java.internal.a.C(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z;
        if (this.a0) {
            this.Z.getClass();
            z = true;
        } else {
            z = false;
        }
        c1 c1Var = this.e0;
        long jMin = 1000;
        long j2 = D0;
        if (z) {
            jMin = c1Var.e != 3 ? j2 : 1000L;
            for (i1 i1Var : this.e) {
                long j3 = this.t0;
                long j4 = this.u0;
                a aVar = (a) i1Var.f;
                a aVar2 = (a) i1Var.e;
                long jI = i1.h(aVar2) ? aVar2.i(j3, j4) : Long.MAX_VALUE;
                if (aVar != null && aVar.E != 0) {
                    jI = Math.min(jI, aVar.i(j3, j4));
                }
                jMin = Math.min(jMin, androidx.media3.common.util.j0.d0(jI));
            }
            if (this.e0.m()) {
                p0 p0Var = this.O.i;
                p0 p0Var2 = p0Var != null ? p0Var.m : null;
                if (p0Var2 != null) {
                    if ((androidx.media3.common.util.j0.Q(jMin) * this.e0.o.a) + this.t0 >= p0Var2.e()) {
                        jMin = Math.min(jMin, j2);
                    }
                }
            }
        } else if (c1Var.e != 3 || r0()) {
            jMin = j2;
        }
        this.E.a.sendEmptyMessageAtTime(2, j + jMin);
    }

    public final void V(boolean z) {
        androidx.media3.exoplayer.source.v vVar = this.O.i.g.a;
        long jX = X(vVar, this.e0.s, true, false);
        if (jX != this.e0.s) {
            c1 c1Var = this.e0;
            this.e0 = y(vVar, jX, c1Var.c, c1Var.d, z, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final void W(j0 j0Var) throws Throwable {
        long jLongValue;
        long jMax;
        androidx.media3.exoplayer.source.v vVarP;
        long j;
        boolean z;
        long j2;
        long j3;
        long jI;
        androidx.media3.exoplayer.source.v vVar;
        long j4;
        long j5;
        c1 c1Var;
        int i;
        int i2;
        long j6;
        k0 k0Var = this;
        if (k0Var.b0) {
            if (k0Var.c0 != null) {
                k0Var.d0++;
                k0Var.f0.e(1);
            }
            k0Var.c0 = j0Var;
            return;
        }
        k0Var.f0.e(1);
        Pair pairS = S(k0Var.e0.a, j0Var, true, k0Var.m0, k0Var.n0, k0Var.H, k0Var.I);
        if (pairS == null) {
            Pair pairN = k0Var.n(k0Var.e0.a);
            vVarP = (androidx.media3.exoplayer.source.v) pairN.first;
            jLongValue = ((Long) pairN.second).longValue();
            z = !k0Var.e0.a.p();
            j = 0;
            jMax = -9223372036854775807L;
        } else {
            Object obj = pairS.first;
            jLongValue = ((Long) pairS.second).longValue();
            jMax = j0Var.c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            vVarP = k0Var.O.p(k0Var.e0.a, obj, jLongValue);
            if (vVarP.b()) {
                k0Var.e0.a.g(vVarP.a, k0Var.I);
                if (k0Var.I.e(vVarP.b) == vVarP.c) {
                    k0Var.I.g.getClass();
                }
                k0Var.I.g.a(vVarP.b).getClass();
                jMax = Math.max(jMax, 0L);
                jLongValue = 0;
                j = 0;
            } else {
                j = 0;
                if (j0Var.c != -9223372036854775807L) {
                    z = false;
                }
            }
            z = true;
        }
        try {
            try {
                if (!k0Var.e0.a.p()) {
                    c1 c1Var2 = k0Var.e0;
                    if (pairS == null) {
                        if (c1Var2.e != 1) {
                            k0Var.n0(4);
                        }
                        k0Var.O(false, true, false, true);
                    } else {
                        if (vVarP.equals(c1Var2.b)) {
                            p0 p0Var = k0Var.O.i;
                            if (p0Var == null || !p0Var.e || jLongValue == j) {
                                jI = jLongValue;
                            } else {
                                ?? r0 = p0Var.a;
                                long j7 = k0Var.H.m;
                                if (k0Var.a0 && j7 != -9223372036854775807L) {
                                    k0Var.Z.getClass();
                                }
                                jI = r0.i(jLongValue, k0Var.Y);
                            }
                            if (androidx.media3.common.util.j0.d0(jI) == androidx.media3.common.util.j0.d0(k0Var.e0.s) && ((i = (c1Var = k0Var.e0).e) == 2 || i == 3)) {
                                j5 = c1Var.s;
                                i2 = 2;
                                j6 = j5;
                                z = z;
                                vVar = vVarP;
                                j4 = jMax;
                            }
                        } else {
                            jI = jLongValue;
                        }
                        try {
                            boolean z2 = k0Var.e0.e == 4;
                            try {
                                r0 r0Var = k0Var.O;
                                long jX = k0Var.X(vVarP, jI, r0Var.i != r0Var.j, z2);
                                z |= jLongValue != jX;
                                try {
                                    c1 c1Var3 = k0Var.e0;
                                    androidx.media3.exoplayer.source.v vVar2 = vVarP;
                                    try {
                                        androidx.media3.common.v0 v0Var = c1Var3.a;
                                        long j8 = jMax;
                                        try {
                                            k0Var.C0(v0Var, vVar2, v0Var, c1Var3.b, j8, true);
                                            vVar = vVar2;
                                            j4 = j8;
                                            j5 = jX;
                                            i2 = 2;
                                            j6 = j5;
                                            k0Var = this;
                                        } catch (Throwable th) {
                                            th = th;
                                            vVarP = vVar2;
                                            j2 = j8;
                                            j3 = jX;
                                            k0Var.e0 = k0Var.y(vVarP, j3, j2, j3, z, 2);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        vVarP = vVar2;
                                        j2 = jMax;
                                        j3 = jX;
                                        k0Var.e0 = k0Var.y(vVarP, j3, j2, j3, z, 2);
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j2 = jMax;
                                j3 = jLongValue;
                                k0Var.e0 = k0Var.y(vVarP, j3, j2, j3, z, 2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                    k0Var.e0 = k0Var.y(vVar, j5, j4, j6, z, i2);
                }
                k0Var.s0 = j0Var;
                z = z;
                vVar = vVarP;
                j5 = jLongValue;
                j4 = jMax;
                i2 = 2;
                j6 = j5;
                k0Var = this;
                k0Var.e0 = k0Var.y(vVar, j5, j4, j6, z, i2);
            } catch (Throwable th6) {
                th = th6;
                z = z;
                vVarP = vVarP;
                j3 = jLongValue;
                j2 = jMax;
            }
        } catch (Throwable th7) {
            th = th7;
            z = z;
            vVarP = vVarP;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0115  */
    /* JADX WARN: Type inference failed for: r10v14, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final long X(androidx.media3.exoplayer.source.v vVar, long j, boolean z, boolean z2) {
        r0 r0Var;
        int i;
        v0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.e0.e == 3) {
            n0(2);
        }
        p0 p0Var = this.O.i;
        p0 p0Var2 = p0Var;
        while (p0Var2 != null && !vVar.equals(p0Var2.g.a)) {
            p0Var2 = p0Var2.m;
        }
        if (z || p0Var != p0Var2 || (p0Var2 != null && p0Var2.p + j < 0)) {
            for (int i2 = 0; i2 < this.e.length; i2++) {
                g(i2);
            }
            this.A0 = -9223372036854775807L;
            if (p0Var2 != null) {
                while (true) {
                    r0Var = this.O;
                    if (r0Var.i == p0Var2) {
                        break;
                    }
                    r0Var.a();
                }
                r0Var.n(p0Var2);
                p0Var2.p = 1000000000000L;
                j(new boolean[this.e.length], this.O.j.e());
                p0Var2.h = true;
            }
        }
        f();
        if (this.a0) {
            for (i1 i1Var : this.e) {
                if (i1Var.g() && ((i = ((a) i1Var.e).y) == 2 || i == 4)) {
                    this.b0 = true;
                    break;
                }
            }
        }
        r0 r0Var2 = this.O;
        if (p0Var2 != null) {
            r0Var2.n(p0Var2);
            if (!p0Var2.e) {
                p0Var2.g = p0Var2.g.b(j, -9223372036854775807L);
            } else if (p0Var2.f) {
                if (this.a0) {
                    this.Z.getClass();
                    if (this.e0.a.p() || !p0Var2.g.a.equals(this.e0.b)) {
                        j = p0Var2.a.j(j);
                        p0Var2.a.k(j - this.J);
                    } else {
                        long j2 = p0Var2.p + j;
                        boolean z4 = true;
                        for (i1 i1Var2 : this.e) {
                            if (i1Var2.g()) {
                                a aVarD = i1Var2.d(p0Var2);
                                z4 &= aVarD != null && aVarD.F(j2);
                            }
                        }
                        if (z4) {
                            ?? r10 = p0Var2.a;
                            long j3 = this.e0.s;
                            k1 k1Var = k1.c;
                            if (r10.i(j3, k1Var) == p0Var2.a.i(j, k1Var)) {
                                z3 = false;
                            } else {
                                j = p0Var2.a.j(j);
                                p0Var2.a.k(j - this.J);
                            }
                        } else {
                            j = p0Var2.a.j(j);
                            p0Var2.a.k(j - this.J);
                        }
                    }
                } else {
                    j = p0Var2.a.j(j);
                    p0Var2.a.k(j - this.J);
                }
            }
            Q(j, z3);
            C();
        } else {
            r0Var2.b();
            Q(j, true);
        }
        u(false);
        this.E.f(2);
        return j;
    }

    public final void Y(e1 e1Var) {
        e1Var.getClass();
        androidx.media3.common.util.g0 g0Var = this.E;
        if (e1Var.e != this.G) {
            g0Var.b(15, e1Var).b();
            return;
        }
        synchronized (e1Var) {
        }
        try {
            e1Var.a.d(e1Var.c, e1Var.d);
            e1Var.a(true);
            int i = this.e0.e;
            if (i == 3 || i == 2) {
                g0Var.f(2);
            }
        } catch (Throwable th) {
            e1Var.a(true);
            throw th;
        }
    }

    public final void Z(e1 e1Var) {
        Looper looper = e1Var.e;
        if (looper.getThread().isAlive()) {
            this.M.a(looper, null).d(new androidx.activity.l(this, e1Var));
        } else {
            androidx.media3.common.util.c.t("TAG", "Trying to send message on a dead thread.");
            e1Var.a(false);
        }
    }

    public final void a(g0 g0Var, int i) throws Throwable {
        this.f0.e(1);
        b1 b1Var = this.P;
        if (i == -1) {
            i = ((ArrayList) b1Var.c).size();
        }
        v(b1Var.a(i, g0Var.a, g0Var.b), false);
    }

    public final void a0(androidx.media3.common.e eVar, boolean z) {
        androidx.media3.exoplayer.trackselection.o oVar = this.A;
        if (!oVar.i.equals(eVar)) {
            oVar.i = eVar;
            oVar.i();
        }
        if (!z) {
            eVar = null;
        }
        androidx.media3.common.audio.d dVar = this.W;
        if (!Objects.equals(dVar.d, eVar)) {
            dVar.d = eVar;
            int i = eVar == null ? 0 : 1;
            dVar.f = i;
            com.google.android.material.motion.a.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        c1 c1Var = this.e0;
        boolean z2 = c1Var.l;
        A0(dVar.c(c1Var.e, z2), c1Var.n, c1Var.m, z2);
    }

    public final void b() {
        for (i1 i1Var : this.e) {
            j1 j1Var = this.a0 ? this.Z : null;
            ((a) i1Var.e).d(18, j1Var);
            a aVar = (a) i1Var.f;
            if (aVar != null) {
                aVar.d(18, j1Var);
            }
        }
    }

    public final void b0(boolean z, androidx.media3.common.util.h hVar) {
        if (this.o0 != z) {
            this.o0 = z;
            if (!z) {
                for (i1 i1Var : this.e) {
                    i1Var.k();
                }
            }
        }
        if (hVar != null) {
            hVar.c();
        }
    }

    @Override // androidx.media3.exoplayer.video.u
    public final void c(long j, long j2, androidx.media3.common.r rVar, MediaFormat mediaFormat) {
        if (this.b0) {
            this.E.a(37).b();
        }
    }

    public final void c0(e0 e0Var) {
        for (i1 i1Var : this.e) {
            a aVar = (a) i1Var.e;
            if (aVar.y == 4) {
                aVar.d(23, e0Var);
                a aVar2 = (a) i1Var.f;
                if (aVar2 != null) {
                    aVar2.d(23, e0Var);
                }
            }
        }
    }

    public final boolean d() {
        if (!this.V) {
            return false;
        }
        for (i1 i1Var : this.e) {
            if (i1Var.f()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(g0 g0Var) throws Throwable {
        this.f0.e(1);
        int i = g0Var.c;
        androidx.media3.exoplayer.source.z0 z0Var = g0Var.b;
        ArrayList arrayList = g0Var.a;
        if (i != -1) {
            this.s0 = new j0(new g1(arrayList, z0Var), g0Var.c, g0Var.d);
        }
        b1 b1Var = this.P;
        ArrayList arrayList2 = (ArrayList) b1Var.c;
        b1Var.i(0, arrayList2.size());
        v(b1Var.a(arrayList2.size(), arrayList, z0Var), false);
    }

    public final void e() {
        N();
        V(true);
    }

    public final void e0(boolean z) {
        this.h0 = z;
        P();
        if (this.i0) {
            r0 r0Var = this.O;
            if (r0Var.j != r0Var.i) {
                V(true);
                u(false);
            }
        }
    }

    public final void f() {
        a aVar;
        if (this.V && d()) {
            for (i1 i1Var : this.e) {
                int iC = i1Var.c();
                h hVar = this.K;
                if (i1Var.f()) {
                    int i = i1Var.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        try {
                            aVar = (a) i1Var.e;
                        } catch (RuntimeException e) {
                            androidx.media3.common.util.c.g("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        aVar = (a) i1Var.f;
                        aVar.getClass();
                    }
                    i1Var.a(aVar, hVar);
                    try {
                        i1Var.i(z);
                    } catch (RuntimeException e2) {
                        androidx.media3.common.util.c.g("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    i1Var.d = i2;
                }
                this.r0 -= iC - i1Var.c();
            }
            this.A0 = -9223372036854775807L;
        }
    }

    public final void f0(androidx.media3.common.l0 l0Var) {
        this.E.e(16);
        h hVar = this.K;
        hVar.a(l0Var);
        androidx.media3.common.l0 l0VarE = hVar.e();
        x(l0VarE, l0VarE.a, true, true);
    }

    public final void g(int i) {
        i1[] i1VarArr = this.e;
        int iC = i1VarArr[i].c();
        i1 i1Var = i1VarArr[i];
        a aVar = (a) i1Var.e;
        h hVar = this.K;
        i1Var.a(aVar, hVar);
        a aVar2 = (a) i1Var.f;
        if (aVar2 != null) {
            boolean z = (aVar2.E == 0 || i1Var.d == 3) ? false : true;
            i1Var.a(aVar2, hVar);
            i1Var.i(false);
            if (z) {
                a aVar3 = (a) i1Var.e;
                aVar2.getClass();
                aVar2.d(17, aVar3);
            }
        }
        i1Var.d = 0;
        G(i, false);
        this.r0 -= iC;
    }

    public final void g0(l lVar) {
        this.z0 = lVar;
        androidx.media3.common.v0 v0Var = this.e0.a;
        r0 r0Var = this.O;
        r0Var.getClass();
        lVar.getClass();
        if (r0Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < r0Var.q.size(); i++) {
            ((p0) r0Var.q.get(i)).i();
        }
        r0Var.q = arrayList;
        r0Var.m = null;
        r0Var.k();
    }

    /* JADX WARN: Code duplicated, block: B:116:0x01da  */
    /* JADX WARN: Code duplicated, block: B:153:0x024e  */
    /* JADX WARN: Code duplicated, block: B:155:0x025b  */
    /* JADX WARN: Code duplicated, block: B:189:0x02da  */
    /* JADX WARN: Code duplicated, block: B:192:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:194:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:195:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:197:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:201:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:208:0x0314  */
    /* JADX WARN: Code duplicated, block: B:210:0x0317  */
    /* JADX WARN: Code duplicated, block: B:211:0x031f  */
    /* JADX WARN: Code duplicated, block: B:213:0x032c  */
    /* JADX WARN: Code duplicated, block: B:214:0x0336  */
    /* JADX WARN: Code duplicated, block: B:218:0x034c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0355  */
    /* JADX WARN: Code duplicated, block: B:224:0x035a  */
    /* JADX WARN: Code duplicated, block: B:228:0x0361  */
    /* JADX WARN: Code duplicated, block: B:231:0x0368  */
    /* JADX WARN: Code duplicated, block: B:234:0x0373  */
    /* JADX WARN: Code duplicated, block: B:247:0x038e  */
    /* JADX WARN: Code duplicated, block: B:256:0x02f3 A[EDGE_INSN: B:256:0x02f3->B:199:0x02f3 BREAK  A[LOOP:1: B:190:0x02db->B:198:0x02f0], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final void h() {
        boolean z;
        boolean z2;
        long j;
        boolean z3;
        boolean z4;
        boolean zB;
        int i;
        boolean z5;
        long j2;
        androidx.media3.common.util.e0 e0Var;
        boolean z6;
        c1 c1Var;
        int i2;
        int i3;
        i1[] i1VarArr;
        c1 c1Var2;
        boolean z7;
        this.M.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        this.E.e(2);
        if (!this.X) {
            z0();
        }
        int i4 = this.e0.e;
        if (i4 == 1 || i4 == 4) {
            return;
        }
        if (this.X) {
            z0();
        }
        p0 p0Var = this.O.i;
        if (p0Var == null) {
            U(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (p0Var.e) {
            this.M.getClass();
            this.u0 = androidx.media3.common.util.j0.Q(SystemClock.elapsedRealtime());
            p0Var.a.k(this.e0.s - this.J);
            z = true;
            z2 = true;
            int i5 = 0;
            while (true) {
                i1[] i1VarArr2 = this.e;
                if (i5 >= i1VarArr2.length) {
                    break;
                }
                i1 i1Var = i1VarArr2[i5];
                if (i1Var.c() == 0) {
                    G(i5, false);
                } else {
                    long j3 = this.t0;
                    long j4 = this.u0;
                    a aVar = (a) i1Var.f;
                    a aVar2 = (a) i1Var.e;
                    if (i1.h(aVar2)) {
                        aVar2.z(j3, j4);
                    }
                    if (aVar != null && aVar.E != 0) {
                        aVar.z(j3, j4);
                    }
                    if (z) {
                        a aVar3 = (a) i1Var.f;
                        a aVar4 = (a) i1Var.e;
                        boolean zM = i1.h(aVar4) ? aVar4.m() : true;
                        if (aVar3 != null && aVar3.E != 0) {
                            zM &= aVar3.m();
                        }
                        if (zM) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    a aVarD = i1Var.d(p0Var);
                    boolean z8 = aVarD == null || aVarD.l() || aVarD.o() || aVarD.m();
                    G(i5, z8);
                    z2 = z2 && z8;
                    if (!z8) {
                        F(i5);
                    }
                }
                i5++;
            }
        } else {
            p0Var.a.h();
            z = true;
            z2 = true;
        }
        long j5 = p0Var.g.f;
        boolean z9 = z && p0Var.e && (j5 == -9223372036854775807L || j5 <= this.e0.s);
        if (z9 && this.i0) {
            this.i0 = false;
            int i6 = this.e0.n;
            this.f0.e(0);
            A0(this.W.c(this.e0.e, false), i6, 5, false);
        }
        if (!z9 || !p0Var.g.k) {
            c1 c1Var3 = this.e0;
            if (c1Var3.e == 2) {
                r0 r0Var = this.O;
                if (this.r0 != 0) {
                    if (!z2) {
                        zB = false;
                    } else if (c1Var3.g) {
                        p0 p0Var2 = r0Var.i;
                        long j6 = s0(c1Var3.a, p0Var2.g.a) ? this.Q.h : -9223372036854775807L;
                        p0 p0Var3 = r0Var.l;
                        boolean z10 = p0Var3.g() && p0Var3.g.k;
                        boolean z11 = p0Var3.g.a.b() && !p0Var3.e;
                        if (z10 || z11) {
                            j = -9223372036854775807L;
                        } else {
                            long jP = p(p0Var3.d());
                            g gVar = this.C;
                            androidx.media3.exoplayer.analytics.k kVar = this.S;
                            j = -9223372036854775807L;
                            androidx.media3.common.v0 v0Var = this.e0.a;
                            androidx.media3.exoplayer.source.v vVar = p0Var2.g.a;
                            float f = this.K.e().a;
                            boolean z12 = this.e0.l;
                            boolean z13 = this.j0;
                            gVar.getClass();
                            long j7 = j6;
                            androidx.media3.common.y yVar = v0Var.m(v0Var.g(vVar.a, gVar.b).c, gVar.a, 0L).c.b;
                            if (yVar == null) {
                                z4 = false;
                            } else {
                                String scheme = yVar.a.getScheme();
                                if (TextUtils.isEmpty(scheme) || g.s.contains(scheme)) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                            long jE = androidx.media3.common.util.j0.E(f, jP);
                            long jMin = z13 ? z4 ? gVar.k : gVar.j : z4 ? gVar.i : gVar.h;
                            if (j7 != -9223372036854775807L) {
                                jMin = Math.min(j7 / 2, jMin);
                            }
                            if (jMin > 0 && jE < jMin) {
                                if (!(z4 ? gVar.n : gVar.m)) {
                                    f fVar = (f) gVar.q.get(kVar);
                                    fVar.getClass();
                                    synchronized (fVar) {
                                        i = fVar.d;
                                    }
                                    int i7 = i * gVar.c.b;
                                    f fVar2 = (f) gVar.q.get(kVar);
                                    fVar2.getClass();
                                    if (i7 >= fVar2.c) {
                                    }
                                }
                                zB = false;
                            }
                        }
                        zB = true;
                    } else {
                        j = -9223372036854775807L;
                        zB = true;
                    }
                    if (zB) {
                        n0(3);
                        this.x0 = null;
                        if (r0()) {
                            D0(false, false);
                            h hVar = this.K;
                            z3 = true;
                            hVar.C = true;
                            hVar.e.f();
                            t0();
                        }
                    }
                    if (this.e0.e == 2) {
                        i3 = 0;
                        while (true) {
                            i1VarArr = this.e;
                            if (i3 < i1VarArr.length) {
                                break;
                            }
                            if (i1VarArr[i3].d(p0Var) != null) {
                                z7 = z3;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                F(i3);
                            }
                            i3++;
                        }
                        c1Var2 = this.e0;
                        if (c1Var2.g && c1Var2.r < 500000 && z(this.O.l) && r0()) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        j2 = this.y0;
                        e0Var = this.M;
                        if (j2 == -9223372036854775807L) {
                            e0Var.getClass();
                            this.y0 = SystemClock.elapsedRealtime();
                        } else {
                            e0Var.getClass();
                            if (SystemClock.elapsedRealtime() - this.y0 >= 4000) {
                                throw new androidx.media3.common.util.d0(0, 4000);
                            }
                        }
                    } else {
                        this.y0 = -9223372036854775807L;
                    }
                    if (r0() || this.e0.e != 3) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    if (this.q0 || !this.p0 || !z6) {
                        z3 = false;
                    }
                    c1Var = this.e0;
                    if (c1Var.p != z3) {
                        this.e0 = c1Var.i(z3);
                    }
                    this.p0 = false;
                    if (!z3 && (i2 = this.e0.e) != 4 && (z6 || i2 == 2 || (i2 == 3 && this.r0 != 0))) {
                        U(jUptimeMillis);
                    }
                    Trace.endSection();
                }
                zB = B();
                j = -9223372036854775807L;
                if (zB) {
                    n0(3);
                    this.x0 = null;
                    if (r0()) {
                        D0(false, false);
                        h hVar2 = this.K;
                        z3 = true;
                        hVar2.C = true;
                        hVar2.e.f();
                        t0();
                    }
                }
                if (this.e0.e == 2) {
                    i3 = 0;
                    while (true) {
                        i1VarArr = this.e;
                        if (i3 < i1VarArr.length) {
                            break;
                            break;
                        }
                        if (i1VarArr[i3].d(p0Var) != null) {
                            z7 = z3;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            F(i3);
                        }
                        i3++;
                    }
                    c1Var2 = this.e0;
                    if (c1Var2.g) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    this.y0 = -9223372036854775807L;
                } else {
                    j2 = this.y0;
                    e0Var = this.M;
                    if (j2 == -9223372036854775807L) {
                        e0Var.getClass();
                        this.y0 = SystemClock.elapsedRealtime();
                    } else {
                        e0Var.getClass();
                        if (SystemClock.elapsedRealtime() - this.y0 >= 4000) {
                            throw new androidx.media3.common.util.d0(0, 4000);
                        }
                    }
                }
                if (r0()) {
                    z6 = false;
                } else {
                    z6 = false;
                }
                if (this.q0) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                c1Var = this.e0;
                if (c1Var.p != z3) {
                    this.e0 = c1Var.i(z3);
                }
                this.p0 = false;
                if (!z3) {
                    U(jUptimeMillis);
                }
                Trace.endSection();
            }
            j = -9223372036854775807L;
            z3 = true;
            if (this.e0.e == 3 && (this.r0 != 0 ? !z2 : !B())) {
                D0(r0(), false);
                n0(2);
                if (this.j0) {
                    for (p0 p0Var4 = this.O.i; p0Var4 != null; p0Var4 = p0Var4.m) {
                        for (androidx.media3.exoplayer.trackselection.q qVar : p0Var4.o.c) {
                            if (qVar != null) {
                                qVar.t();
                            }
                        }
                    }
                    e eVar = this.Q;
                    long j8 = eVar.h;
                    if (j8 != j) {
                        long j9 = j8 + eVar.b;
                        eVar.h = j9;
                        long j10 = eVar.g;
                        if (j10 != j && j9 > j10) {
                            eVar.h = j10;
                        }
                        eVar.l = j;
                    }
                }
                v0();
            }
            if (this.e0.e == 2) {
                i3 = 0;
                while (true) {
                    i1VarArr = this.e;
                    if (i3 < i1VarArr.length) {
                        break;
                        break;
                    }
                    if (i1VarArr[i3].d(p0Var) != null) {
                        z7 = z3;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        F(i3);
                    }
                    i3++;
                }
                c1Var2 = this.e0;
                if (c1Var2.g) {
                    z5 = false;
                } else {
                    z5 = false;
                }
            } else {
                z5 = false;
            }
            if (z5) {
                this.y0 = -9223372036854775807L;
            } else {
                j2 = this.y0;
                e0Var = this.M;
                if (j2 == -9223372036854775807L) {
                    e0Var.getClass();
                    this.y0 = SystemClock.elapsedRealtime();
                } else {
                    e0Var.getClass();
                    if (SystemClock.elapsedRealtime() - this.y0 >= 4000) {
                        throw new androidx.media3.common.util.d0(0, 4000);
                    }
                }
            }
            if (r0()) {
                z6 = false;
            } else {
                z6 = false;
            }
            if (this.q0) {
                z3 = false;
            } else {
                z3 = false;
            }
            c1Var = this.e0;
            if (c1Var.p != z3) {
                this.e0 = c1Var.i(z3);
            }
            this.p0 = false;
            if (!z3) {
                U(jUptimeMillis);
            }
            Trace.endSection();
        }
        n0(4);
        v0();
        z3 = true;
        if (this.e0.e == 2) {
            i3 = 0;
            while (true) {
                i1VarArr = this.e;
                if (i3 < i1VarArr.length) {
                    break;
                    break;
                }
                if (i1VarArr[i3].d(p0Var) != null) {
                    z7 = z3;
                } else {
                    z7 = false;
                }
                if (z7) {
                    F(i3);
                }
                i3++;
            }
            c1Var2 = this.e0;
            if (c1Var2.g) {
                z5 = false;
            } else {
                z5 = false;
            }
        } else {
            z5 = false;
        }
        if (z5) {
            this.y0 = -9223372036854775807L;
        } else {
            j2 = this.y0;
            e0Var = this.M;
            if (j2 == -9223372036854775807L) {
                e0Var.getClass();
                this.y0 = SystemClock.elapsedRealtime();
            } else {
                e0Var.getClass();
                if (SystemClock.elapsedRealtime() - this.y0 >= 4000) {
                    throw new androidx.media3.common.util.d0(0, 4000);
                }
            }
        }
        if (r0()) {
            z6 = false;
        } else {
            z6 = false;
        }
        if (this.q0) {
            z3 = false;
        } else {
            z3 = false;
        }
        c1Var = this.e0;
        if (c1Var.p != z3) {
            this.e0 = c1Var.i(z3);
        }
        this.p0 = false;
        if (!z3) {
            U(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void h0(int i) {
        this.m0 = i;
        androidx.media3.common.v0 v0Var = this.e0.a;
        r0 r0Var = this.O;
        r0Var.g = i;
        int iR = r0Var.r(v0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            f();
        }
        u(false);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i;
        p0 p0Var;
        androidx.media3.exoplayer.source.v vVar;
        p0 p0Var2;
        int i2;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i4 = message.arg2;
                    this.f0.e(1);
                    A0(this.W.c(this.e0.e, z), i4 >> 4, i4 & 15, z);
                    break;
                case 2:
                    h();
                    break;
                case 3:
                    W((j0) message.obj);
                    break;
                case 4:
                    f0((androidx.media3.common.l0) message.obj);
                    break;
                case 5:
                    k0((k1) message.obj);
                    break;
                case 6:
                    u0(false, true);
                    break;
                case 7:
                    K((androidx.media3.common.util.h) message.obj);
                    return true;
                case 8:
                    w((androidx.media3.exoplayer.source.u) message.obj);
                    break;
                case 9:
                    s((androidx.media3.exoplayer.source.u) message.obj);
                    break;
                case 10:
                    N();
                    break;
                case 11:
                    h0(message.arg1);
                    break;
                case 12:
                    l0(message.arg1 != 0);
                    break;
                case 13:
                    b0(message.arg1 != 0, (androidx.media3.common.util.h) message.obj);
                    break;
                case 14:
                    Y((e1) message.obj);
                    break;
                case 15:
                    Z((e1) message.obj);
                    break;
                case 16:
                    androidx.media3.common.l0 l0Var = (androidx.media3.common.l0) message.obj;
                    x(l0Var, l0Var.a, true, false);
                    break;
                case 17:
                    d0((g0) message.obj);
                    break;
                case 18:
                    a((g0) message.obj, message.arg1);
                    break;
                case 19:
                    androidx.privacysandbox.ads.adservices.java.internal.a.C(message.obj);
                    I();
                    throw null;
                case 20:
                    M(message.arg1, message.arg2, (androidx.media3.exoplayer.source.z0) message.obj);
                    break;
                case 21:
                    m0((androidx.media3.exoplayer.source.z0) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    e0(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    e();
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    y0(message.arg1, (List) message.obj, message.arg2);
                    break;
                case 28:
                    g0((l) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    p0(pair.first, (androidx.media3.common.util.h) pair.second);
                    break;
                case 31:
                    a0((androidx.media3.common.e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    q0(((Float) message.obj).floatValue());
                    break;
                case Token.GETPROP /* 33 */:
                    q(message.arg1);
                    break;
                case Token.GETPROPNOWARN /* 34 */:
                    r();
                    break;
                case 35:
                    o0((androidx.media3.exoplayer.video.u) message.obj);
                    break;
                case Token.GETPROPNOWARN_SUPER /* 36 */:
                    i0(((Boolean) message.obj).booleanValue());
                    break;
                case Token.SETPROP /* 37 */:
                    this.b0 = false;
                    j0 j0Var = this.c0;
                    if (j0Var != null) {
                        W(j0Var);
                        this.c0 = null;
                    }
                    break;
                case Token.SETPROP_SUPER /* 38 */:
                    j0((j1) message.obj);
                    break;
                case Token.GETELEM /* 39 */:
                    c0((e0) message.obj);
                    break;
            }
        } catch (androidx.media3.common.j0 e) {
            boolean z2 = e.e;
            int i5 = e.y;
            if (i5 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i5 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                t(e, i3);
            }
            i3 = i2;
            t(e, i3);
        } catch (androidx.media3.datasource.i e2) {
            t(e2, e2.e);
        } catch (androidx.media3.exoplayer.drm.b e3) {
            t(e3, e3.e);
        } catch (j e4) {
            e = e4;
            int i6 = e.z;
            r0 r0Var = this.O;
            if (i6 == 1 && (p0Var2 = r0Var.j) != null && e.E == null) {
                e = e.a(p0Var2.g.a);
            }
            int i7 = e.z;
            androidx.media3.common.util.g0 g0Var = this.E;
            if (i7 == 1 && (vVar = e.E) != null && A(e.B, vVar)) {
                this.B0 = true;
                f();
                p0 p0VarG = r0Var.g();
                p0 p0Var3 = r0Var.i;
                if (p0Var3 != p0VarG) {
                    while (p0Var3 != null) {
                        p0 p0Var4 = p0Var3.m;
                        if (p0Var4 == p0VarG) {
                            break;
                        }
                        p0Var3 = p0Var4;
                    }
                }
                r0Var.n(p0Var3);
                if (this.e0.e != 4) {
                    C();
                    g0Var.f(2);
                }
            } else {
                j jVar = this.x0;
                if (jVar != null) {
                    jVar.addSuppressed(e);
                    e = this.x0;
                }
                if (e.z == 1 && r0Var.i != r0Var.j) {
                    while (true) {
                        p0Var = r0Var.i;
                        if (p0Var == r0Var.j) {
                            break;
                        }
                        r0Var.a();
                    }
                    com.google.android.material.motion.a.k(p0Var);
                    E();
                    q0 q0Var = p0Var.g;
                    androidx.media3.exoplayer.source.v vVar2 = q0Var.a;
                    long j = q0Var.b;
                    this.e0 = y(vVar2, j, q0Var.d, j, true, 0);
                }
                if (e.F && (this.x0 == null || (i = e.e) == 5004 || i == 5003)) {
                    androidx.media3.common.util.c.u("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.x0 == null) {
                        this.x0 = e;
                    }
                    androidx.media3.common.util.f0 f0VarB = g0Var.b(25, e);
                    Handler handler = g0Var.a;
                    Message message2 = f0VarB.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    f0VarB.a();
                } else {
                    androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Playback error", e);
                    u0(true, false);
                    this.e0 = this.e0.f(e);
                }
            }
        } catch (androidx.media3.exoplayer.source.b e5) {
            t(e5, 1002);
        } catch (IOException e6) {
            t(e6, 2000);
        } catch (RuntimeException e7) {
            j jVar2 = new j(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Playback error", jVar2);
            u0(true, false);
            this.e0 = this.e0.f(jVar2);
        }
        E();
        return true;
    }

    public final void i(p0 p0Var, int i, boolean z, long j) {
        i1 i1Var = this.e[i];
        boolean zG = i1Var.g();
        a aVar = (a) i1Var.e;
        if (zG) {
            return;
        }
        boolean z2 = p0Var == this.O.i;
        androidx.media3.exoplayer.trackselection.t tVar = p0Var.o;
        h1 h1Var = tVar.b[i];
        androidx.media3.exoplayer.trackselection.q qVar = tVar.c[i];
        boolean z3 = r0() && this.e0.e == 3;
        boolean z4 = !z && z3;
        this.r0++;
        androidx.media3.exoplayer.source.w0 w0Var = p0Var.c[i];
        long j2 = p0Var.p;
        androidx.media3.exoplayer.source.v vVar = p0Var.g.a;
        a aVar2 = (a) i1Var.f;
        int length = qVar != null ? qVar.length() : 0;
        androidx.media3.common.r[] rVarArr = new androidx.media3.common.r[length];
        for (int i2 = 0; i2 < length; i2++) {
            qVar.getClass();
            rVarArr[i2] = qVar.g(i2);
        }
        int i3 = i1Var.d;
        h hVar = this.K;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            i1Var.a = true;
            com.google.android.material.motion.a.q(aVar.E == 0);
            aVar.A = h1Var;
            aVar.N = vVar;
            aVar.E = 1;
            aVar.q(z4, z2);
            aVar.A(rVarArr, w0Var, j, j2, vVar);
            aVar.B(j, z4, true);
            hVar.d(aVar);
        } else {
            i1Var.b = true;
            aVar2.getClass();
            com.google.android.material.motion.a.q(aVar2.E == 0);
            aVar2.A = h1Var;
            aVar2.N = vVar;
            aVar2.E = 1;
            aVar2.q(z4, z2);
            aVar2.A(rVarArr, w0Var, j, j2, vVar);
            aVar2.B(j, z4, true);
            hVar.d(aVar2);
        }
        f0 f0Var = new f0(this);
        a aVarD = i1Var.d(p0Var);
        aVarD.getClass();
        aVarD.d(11, f0Var);
        if (z3 && z2) {
            i1Var.m();
        }
    }

    public final void i0(boolean z) throws Throwable {
        if (!z) {
            j0 j0Var = this.c0;
            androidx.media3.common.util.g0 g0Var = this.E;
            if (j0Var != null && this.b0 && !g0Var.a.hasMessages(37)) {
                this.d0++;
            }
            int i = this.d0;
            if (i > 0) {
                this.U.d(new androidx.activity.l(this, i));
            }
            this.d0 = 0;
            this.b0 = false;
            g0Var.e(37);
            j0 j0Var2 = this.c0;
            if (j0Var2 != null) {
                W(j0Var2);
                this.c0 = null;
                this.b0 = false;
            }
        }
        this.a0 = z;
        b();
    }

    public final void j(boolean[] zArr, long j) {
        i1[] i1VarArr;
        long j2;
        p0 p0Var = this.O.j;
        androidx.media3.exoplayer.trackselection.t tVar = p0Var.o;
        int i = 0;
        while (true) {
            i1VarArr = this.e;
            if (i >= i1VarArr.length) {
                break;
            }
            if (!tVar.b(i)) {
                i1VarArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < i1VarArr.length) {
            if (tVar.b(i2) && i1VarArr[i2].d(p0Var) == null) {
                j2 = j;
                i(p0Var, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final void j0(j1 j1Var) {
        this.Z = j1Var;
        b();
    }

    public final long k(androidx.media3.common.v0 v0Var, Object obj, long j) {
        androidx.media3.common.t0 t0Var = this.I;
        int i = v0Var.g(obj, t0Var).c;
        androidx.media3.common.u0 u0Var = this.H;
        v0Var.n(i, u0Var);
        if (u0Var.f != -9223372036854775807L && u0Var.a() && u0Var.i) {
            return androidx.media3.common.util.j0.Q(androidx.media3.common.util.j0.C(u0Var.g) - u0Var.f) - (j + t0Var.e);
        }
        return -9223372036854775807L;
    }

    public final void k0(k1 k1Var) {
        this.Y = k1Var;
    }

    public final long l(p0 p0Var) {
        if (p0Var == null) {
            return 0L;
        }
        long jMax = p0Var.p;
        if (!p0Var.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            i1[] i1VarArr = this.e;
            if (i >= i1VarArr.length) {
                return jMax;
            }
            if (i1VarArr[i].d(p0Var) != null) {
                a aVarD = i1VarArr[i].d(p0Var);
                Objects.requireNonNull(aVarD);
                long j = aVarD.J;
                if (j == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(j, jMax);
            }
            i++;
        }
    }

    public final void l0(boolean z) {
        this.n0 = z;
        androidx.media3.common.v0 v0Var = this.e0.a;
        r0 r0Var = this.O;
        r0Var.h = z;
        int iR = r0Var.r(v0Var);
        if ((iR & 1) != 0) {
            V(true);
        } else if ((iR & 2) != 0) {
            f();
        }
        u(false);
    }

    @Override // androidx.media3.exoplayer.source.t
    public final void m(androidx.media3.exoplayer.source.u uVar) {
        this.E.b(8, uVar).b();
    }

    public final void m0(androidx.media3.exoplayer.source.z0 z0Var) throws Throwable {
        this.f0.e(1);
        b1 b1Var = this.P;
        int size = ((ArrayList) b1Var.c).size();
        if (z0Var.b.length != size) {
            z0Var = new androidx.media3.exoplayer.source.z0(new Random(z0Var.a.nextLong())).a(size);
        }
        b1Var.k = z0Var;
        v(b1Var.c(), false);
    }

    public final Pair n(androidx.media3.common.v0 v0Var) {
        long j = 0;
        if (v0Var.p()) {
            return Pair.create(c1.u, 0L);
        }
        int iA = v0Var.a(this.n0);
        Pair pairI = v0Var.i(this.H, this.I, iA, -9223372036854775807L);
        androidx.media3.exoplayer.source.v vVarP = this.O.p(v0Var, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (vVarP.b()) {
            Object obj = vVarP.a;
            androidx.media3.common.t0 t0Var = this.I;
            v0Var.g(obj, t0Var);
            if (vVarP.c == t0Var.e(vVarP.b)) {
                t0Var.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(vVarP, Long.valueOf(j));
    }

    public final void n0(int i) {
        c1 c1Var = this.e0;
        if (c1Var.e != i) {
            if (i != 2) {
                this.y0 = -9223372036854775807L;
            }
            if (i != 3 && c1Var.p) {
                this.e0 = c1Var.i(false);
            }
            this.e0 = this.e0.h(i);
        }
    }

    @Override // androidx.media3.exoplayer.source.x0
    public final void o(androidx.media3.exoplayer.source.y0 y0Var) {
        this.E.b(9, (androidx.media3.exoplayer.source.u) y0Var).b();
    }

    public final void o0(androidx.media3.exoplayer.video.u uVar) {
        for (i1 i1Var : this.e) {
            a aVar = (a) i1Var.e;
            if (aVar.y == 2) {
                aVar.d(7, uVar);
                a aVar2 = (a) i1Var.f;
                if (aVar2 != null) {
                    aVar2.d(7, uVar);
                }
            }
        }
    }

    public final long p(long j) {
        p0 p0Var = this.O.l;
        if (p0Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.t0 - p0Var.p));
    }

    public final void p0(Object obj, androidx.media3.common.util.h hVar) {
        for (i1 i1Var : this.e) {
            a aVar = (a) i1Var.e;
            if (aVar.y == 2) {
                int i = i1Var.d;
                if (i == 4 || i == 1) {
                    a aVar2 = (a) i1Var.f;
                    aVar2.getClass();
                    aVar2.d(1, obj);
                } else {
                    aVar.d(1, obj);
                }
            }
        }
        int i2 = this.e0.e;
        if (i2 == 3 || i2 == 2) {
            this.E.f(2);
        }
        if (hVar != null) {
            hVar.c();
        }
    }

    public final void q(int i) {
        c1 c1Var = this.e0;
        A0(i, c1Var.n, c1Var.m, c1Var.l);
    }

    public final void q0(float f) {
        this.C0 = f;
        float f2 = f * this.W.g;
        for (i1 i1Var : this.e) {
            a aVar = (a) i1Var.e;
            if (aVar.y == 1) {
                aVar.d(2, Float.valueOf(f2));
                a aVar2 = (a) i1Var.f;
                if (aVar2 != null) {
                    aVar2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void r() {
        q0(this.C0);
    }

    public final boolean r0() {
        c1 c1Var = this.e0;
        return c1Var.l && c1Var.n == 0;
    }

    public final void s(androidx.media3.exoplayer.source.u uVar) {
        r0 r0Var = this.O;
        p0 p0Var = r0Var.l;
        if (p0Var != null && p0Var.a == uVar) {
            r0Var.m(this.t0);
            C();
            return;
        }
        p0 p0Var2 = r0Var.m;
        if (p0Var2 == null || p0Var2.a != uVar) {
            return;
        }
        D();
    }

    public final boolean s0(androidx.media3.common.v0 v0Var, androidx.media3.exoplayer.source.v vVar) {
        if (vVar.b() || v0Var.p()) {
            return false;
        }
        int i = v0Var.g(vVar.a, this.I).c;
        androidx.media3.common.u0 u0Var = this.H;
        v0Var.n(i, u0Var);
        return u0Var.a() && u0Var.i && u0Var.f != -9223372036854775807L;
    }

    public final void t(IOException iOException, int i) {
        j jVar = new j(0, iOException, i);
        p0 p0Var = this.O.i;
        if (p0Var != null) {
            jVar = jVar.a(p0Var.g.a);
        }
        androidx.media3.common.util.c.g("ExoPlayerImplInternal", "Playback error", jVar);
        u0(false, false);
        this.e0 = this.e0.f(jVar);
    }

    public final void t0() {
        p0 p0Var = this.O.i;
        if (p0Var == null) {
            return;
        }
        androidx.media3.exoplayer.trackselection.t tVar = p0Var.o;
        int i = 0;
        while (true) {
            i1[] i1VarArr = this.e;
            if (i >= i1VarArr.length) {
                return;
            }
            if (tVar.b(i)) {
                i1VarArr[i].m();
            }
            i++;
        }
    }

    public final void u(boolean z) {
        p0 p0Var = this.O.l;
        androidx.media3.exoplayer.source.v vVar = p0Var == null ? this.e0.b : p0Var.g.a;
        boolean zEquals = this.e0.k.equals(vVar);
        if (!zEquals) {
            this.e0 = this.e0.c(vVar);
        }
        c1 c1Var = this.e0;
        c1Var.q = p0Var == null ? c1Var.s : p0Var.d();
        c1 c1Var2 = this.e0;
        c1Var2.r = p(c1Var2.q);
        if ((!zEquals || z) && p0Var != null && p0Var.e) {
            x0(p0Var.g.a, p0Var.o);
        }
    }

    public final void u0(boolean z, boolean z2) {
        O(z || !this.o0, false, true, false);
        this.f0.e(z2 ? 1 : 0);
        g gVar = this.C;
        ConcurrentHashMap concurrentHashMap = gVar.q;
        androidx.media3.exoplayer.analytics.k kVar = this.S;
        f fVar = (f) concurrentHashMap.get(kVar);
        if (fVar != null) {
            int i = fVar.a - 1;
            fVar.a = i;
            if (i == 0) {
                concurrentHashMap.remove(kVar);
                gVar.c();
            }
        }
        this.W.c(1, this.e0.l);
        n0(1);
    }

    /* JADX WARN: Code duplicated, block: B:158:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:246:0x040e  */
    /* JADX WARN: Code duplicated, block: B:247:0x0410  */
    /* JADX WARN: Code duplicated, block: B:252:0x0429  */
    /* JADX WARN: Code duplicated, block: B:254:0x042f  */
    /* JADX WARN: Code duplicated, block: B:255:0x0431  */
    /* JADX WARN: Code duplicated, block: B:259:0x0457  */
    /* JADX WARN: Code duplicated, block: B:264:0x046e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0470  */
    /* JADX WARN: Code duplicated, block: B:268:0x047d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0487  */
    /* JADX WARN: Code duplicated, block: B:272:0x048d  */
    /* JADX WARN: Code duplicated, block: B:273:0x048f  */
    /* JADX WARN: Code duplicated, block: B:277:0x04b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [androidx.media3.common.v0] */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.media3.common.v0] */
    /* JADX WARN: Type inference failed for: r2v15, types: [androidx.media3.exoplayer.c1] */
    /* JADX WARN: Type inference failed for: r2v32, types: [androidx.media3.exoplayer.r0] */
    /* JADX WARN: Type inference failed for: r45v0, types: [androidx.media3.exoplayer.k0] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [androidx.media3.common.v0] */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void v(androidx.media3.common.v0 v0Var, boolean z) throws Throwable {
        long j;
        androidx.media3.common.u0 u0Var;
        Object obj;
        int iA;
        long jK;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.media3.common.v0 v0Var2;
        androidx.media3.common.t0 t0Var;
        boolean z5;
        androidx.media3.common.v0 v0Var3;
        androidx.media3.common.t0 t0Var2;
        androidx.media3.common.v0 v0Var4;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        int i;
        i0 i0Var;
        int i2;
        long jLongValue;
        boolean z6;
        int iA2;
        boolean z7;
        androidx.media3.common.t0 t0Var3;
        androidx.media3.common.v0 v0Var5;
        ?? r11;
        androidx.media3.exoplayer.source.v vVar;
        long j7;
        androidx.media3.exoplayer.source.v vVar2;
        boolean z8;
        long j8;
        boolean z9;
        ?? r8;
        p0 p0Var;
        long j9;
        androidx.media3.exoplayer.source.v vVar3;
        boolean z10;
        long j10;
        c1 c1Var = this.e0;
        j0 j0Var = this.s0;
        r0 r0Var = this.O;
        int i3 = this.m0;
        boolean z11 = this.n0;
        androidx.media3.common.u0 u0Var2 = this.H;
        androidx.media3.common.t0 t0Var4 = this.I;
        if (v0Var.p()) {
            androidx.media3.exoplayer.source.v vVar4 = c1.u;
            boolean z12 = (vVar4.equals(c1Var.b) && c1Var.s == 0) ? false : true;
            i0 i0Var2 = new i0(vVar4, 0L, -9223372036854775807L, false, true, false, z12, z12 && z && !c1Var.a.p() && !c1Var.a.g(c1Var.b.a, t0Var4).f, 4);
            v0Var5 = v0Var;
            j4 = 0;
            i0Var = i0Var2;
            t0Var3 = t0Var4;
        } else {
            androidx.media3.exoplayer.source.v vVar5 = c1Var.b;
            Object obj2 = vVar5.a;
            androidx.media3.common.v0 v0Var6 = c1Var.a;
            boolean z13 = v0Var6.p() || v0Var6.g(vVar5.a, t0Var4).f;
            long jMin = (c1Var.b.b() || z13) ? c1Var.c : c1Var.s;
            if (j0Var != null) {
                boolean z14 = true;
                j = 1;
                androidx.media3.common.v0 v0Var7 = v0Var;
                Pair pairS = S(v0Var7, j0Var, true, i3, z11, u0Var2, t0Var4);
                if (pairS == null) {
                    iA2 = v0Var7.a(z11);
                    obj = obj2;
                    jLongValue = jMin;
                    z6 = false;
                    z7 = false;
                } else {
                    long j11 = j0Var.c;
                    obj = pairS.first;
                    if (j11 == -9223372036854775807L) {
                        iA2 = v0Var7.g(obj, t0Var4).c;
                        obj = obj2;
                        jLongValue = jMin;
                        z6 = false;
                    } else {
                        jLongValue = ((Long) pairS.second).longValue();
                        z6 = true;
                        iA2 = -1;
                    }
                    z7 = c1Var.e == 4;
                    z14 = false;
                }
                z4 = z6;
                z3 = z14;
                z2 = z7;
                jMin = jLongValue;
                iA = iA2;
                u0Var = u0Var2;
                v0Var4 = v0Var7;
                t0Var2 = t0Var4;
            } else {
                j = 1;
                androidx.media3.common.v0 v0Var8 = v0Var;
                if (c1Var.a.p()) {
                    iA = v0Var8.a(z11);
                    u0Var = u0Var2;
                    obj = obj2;
                } else if (v0Var8.b(obj2) == -1) {
                    int iT = T(u0Var2, t0Var4, i3, z11, obj, c1Var.a, v0Var8);
                    u0Var = u0Var2;
                    if (iT == -1) {
                        obj = obj2;
                        v0Var2 = v0Var8;
                        t0Var = t0Var4;
                        iT = v0Var2.a(z11);
                        z5 = true;
                    } else {
                        obj = obj2;
                        v0Var2 = v0Var8;
                        t0Var = t0Var4;
                        z5 = false;
                    }
                    iA = iT;
                    z3 = z5;
                    z2 = false;
                    v0Var3 = v0Var2;
                    z4 = false;
                    v0Var4 = v0Var3;
                    t0Var2 = t0Var;
                } else {
                    u0Var = u0Var2;
                    if (jMin == -9223372036854775807L) {
                        obj = obj2;
                        iA = v0Var8.g(obj, t0Var4).c;
                    } else if (z13) {
                        c1Var.a.g(vVar5.a, t0Var4);
                        if (c1Var.a.m(t0Var4.c, u0Var, 0L).n == c1Var.a.b(vVar5.a)) {
                            Pair pairI = v0Var8.i(u0Var, t0Var4, v0Var8.g(obj, t0Var4).c, jMin + t0Var4.e);
                            obj = pairI.first;
                            jK = ((Long) pairI.second).longValue();
                        } else {
                            jK = v0Var8.g(obj, t0Var4).d != -9223372036854775807L ? androidx.media3.common.util.j0.k(jMin, 0L, t0Var4.d - 1) : jMin;
                        }
                        jMin = jK;
                        iA = -1;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        v0Var4 = v0Var8;
                        t0Var2 = t0Var4;
                    } else {
                        iA = -1;
                    }
                }
                z2 = false;
                z3 = false;
                v0Var3 = v0Var8;
                t0Var = t0Var4;
                z4 = false;
                v0Var4 = v0Var3;
                t0Var2 = t0Var;
            }
            if (iA != -1) {
                Pair pairI2 = v0Var4.i(u0Var, t0Var2, iA, -9223372036854775807L);
                obj = pairI2.first;
                jMin = ((Long) pairI2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                j2 = jMin;
            }
            androidx.media3.exoplayer.source.v vVarP = r0Var.p(v0Var4, obj, jMin);
            int i4 = vVarP.e;
            boolean z15 = i4 == -1 || ((i2 = vVar5.e) != -1 && i4 >= i2);
            boolean zEquals = vVar5.a.equals(obj);
            boolean z16 = zEquals && !vVar5.b() && !vVarP.b() && z15;
            androidx.media3.common.t0 t0VarG = v0Var4.g(obj, t0Var2);
            if (z13 || jMin != j2) {
                j3 = j2;
            } else {
                Object obj3 = vVar5.a;
                int i5 = vVar5.b;
                j3 = j2;
                if (obj3.equals(vVarP.a)) {
                    if (vVar5.b()) {
                        t0VarG.g(i5);
                    }
                    if (vVarP.b()) {
                        t0VarG.g(vVarP.b);
                    }
                }
            }
            if (z16) {
                vVarP = vVar5;
            }
            if (!vVarP.b()) {
                if (zEquals && vVar5.b()) {
                    androidx.media3.common.a aVarA = v0Var4.g(obj, t0Var2).g.a(vVar5.b);
                    aVarA.getClass();
                    long j12 = c1Var.c;
                    j4 = 0;
                    if (j12 == -9223372036854775807L || 0 > j12) {
                        int i6 = aVarA.a;
                        int i7 = vVar5.c;
                        if (i6 > i7 && aVarA.e[i7] == 2) {
                            long j13 = v0Var4.g(obj, t0Var2).d;
                            if (j13 != -9223372036854775807L) {
                                jMin = Math.min(j13 - j, jMin);
                            }
                            j5 = jMin;
                            j6 = j5;
                        }
                    }
                } else {
                    j4 = 0;
                }
                j5 = jMin;
                j6 = j3;
            } else if (vVarP.equals(vVar5)) {
                j5 = c1Var.s;
                j6 = j3;
                j4 = 0;
            } else {
                v0Var4.g(vVarP.a, t0Var2);
                if (vVarP.c == t0Var2.e(vVarP.b)) {
                    t0Var2.g.getClass();
                }
                j6 = j3;
                j4 = 0;
                j5 = 0;
            }
            boolean z17 = (vVarP.equals(c1Var.b) && j5 == c1Var.s) ? false : true;
            int i8 = v0Var4.b(c1Var.b.a) == -1 ? 4 : 3;
            if (!vVarP.a.equals(c1Var.b.a) || vVarP.b == -1) {
                i = i8;
            } else {
                androidx.media3.common.a aVarA2 = v0Var4.g(vVarP.a, t0Var2).g.a(vVarP.b);
                int i9 = vVarP.c;
                int[] iArr = aVarA2.e;
                if (i9 >= iArr.length || iArr[i9] != 2) {
                    i = 0;
                } else {
                    i = i8;
                }
            }
            i0Var = new i0(vVarP, j5, j6, z2, z3, z4, z17, z17 && z && !c1Var.a.p() && !c1Var.a.g(c1Var.b.a, t0Var2).f, i);
            v0Var5 = v0Var4;
            t0Var3 = t0Var2;
        }
        androidx.media3.exoplayer.source.v vVar6 = i0Var.a;
        long jX = i0Var.b;
        try {
            if (i0Var.e) {
                z9 = true;
                if (this.e0.e != 1) {
                    n0(4);
                }
                O(false, false, false, true);
            } else {
                z9 = true;
            }
            i1[] i1VarArr = this.e;
            int length = i1VarArr.length;
            int i10 = 0;
            ?? r9 = t0Var3;
            while (i10 < length) {
                i1 i1Var = i1VarArr[i10];
                a aVar = (a) i1Var.e;
                boolean zEquals2 = Objects.equals(aVar.M, v0Var5);
                if (!zEquals2) {
                    aVar.M = v0Var5;
                    aVar.x();
                }
                a aVar2 = (a) i1Var.f;
                if (aVar2 != null && !Objects.equals(aVar2.M, v0Var5)) {
                    aVar2.M = v0Var5;
                    aVar2.x();
                }
                i10++;
                r9 = zEquals2;
            }
            try {
                if (i0Var.g) {
                    r9 = v0Var5;
                    if (r9.p()) {
                        vVar = vVar6;
                    } else {
                        for (p0 p0Var2 = this.O.i; p0Var2 != null; p0Var2 = p0Var2.m) {
                            if (p0Var2.g.a.equals(vVar6)) {
                                p0Var2.g = this.O.h(r9, p0Var2.g);
                                p0Var2.k();
                            }
                        }
                        boolean z18 = i0Var.d;
                        try {
                            r0 r0Var2 = this.O;
                            vVar = vVar6;
                            try {
                                jX = X(vVar, jX, r0Var2.i != r0Var2.j ? z9 : false, z18);
                            } catch (Throwable th) {
                                th = th;
                                jX = jX;
                                r8 = r9;
                                r11 = r8;
                                c1 c1Var2 = this.e0;
                                androidx.media3.common.v0 v0Var9 = c1Var2.a;
                                androidx.media3.exoplayer.source.v vVar7 = c1Var2.b;
                                if (i0Var.f) {
                                    j7 = jX;
                                } else {
                                    j7 = -9223372036854775807L;
                                }
                                vVar2 = vVar;
                                C0(r11, vVar2, v0Var9, vVar7, j7, false);
                                if (i0Var.g) {
                                    long j14 = i0Var.c;
                                    z8 = i0Var.h;
                                    if (z8) {
                                        j8 = jX;
                                    } else {
                                        j8 = this.e0.d;
                                    }
                                    this.e0 = y(vVar2, jX, j14, j8, z8, i0Var.i);
                                } else {
                                    long j15 = i0Var.c;
                                    z8 = i0Var.h;
                                    if (z8) {
                                        j8 = jX;
                                    } else {
                                        j8 = this.e0.d;
                                    }
                                    this.e0 = y(vVar2, jX, j15, j8, z8, i0Var.i);
                                }
                                P();
                                R(r11, this.e0.a);
                                this.e0 = this.e0.j(r11);
                                if (!r11.p()) {
                                    this.s0 = null;
                                }
                                u(false);
                                this.E.f(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            vVar = vVar6;
                            r8 = r9;
                            r11 = r8;
                            c1 c1Var3 = this.e0;
                            androidx.media3.common.v0 v0Var10 = c1Var3.a;
                            androidx.media3.exoplayer.source.v vVar8 = c1Var3.b;
                            if (i0Var.f) {
                                j7 = jX;
                            } else {
                                j7 = -9223372036854775807L;
                            }
                            vVar2 = vVar;
                            C0(r11, vVar2, v0Var10, vVar8, j7, false);
                            if (i0Var.g) {
                                long j16 = i0Var.c;
                                z8 = i0Var.h;
                                if (z8) {
                                    j8 = jX;
                                } else {
                                    j8 = this.e0.d;
                                }
                                this.e0 = y(vVar2, jX, j16, j8, z8, i0Var.i);
                            } else {
                                long j17 = i0Var.c;
                                z8 = i0Var.h;
                                if (z8) {
                                    j8 = jX;
                                } else {
                                    j8 = this.e0.d;
                                }
                                this.e0 = y(vVar2, jX, j17, j8, z8, i0Var.i);
                            }
                            P();
                            R(r11, this.e0.a);
                            this.e0 = this.e0.j(r11);
                            if (!r11.p()) {
                                this.s0 = null;
                            }
                            u(false);
                            this.E.f(2);
                            throw th;
                        }
                    }
                    c1 c1Var4 = this.e0;
                    androidx.media3.common.v0 v0Var11 = c1Var4.a;
                    androidx.media3.exoplayer.source.v vVar9 = c1Var4.b;
                    if (i0Var.f) {
                        j9 = jX;
                    } else {
                        j9 = -9223372036854775807L;
                    }
                    vVar3 = vVar;
                    C0(v0Var, vVar3, v0Var11, vVar9, j9, false);
                    if (i0Var.g) {
                        long j18 = i0Var.c;
                        z10 = i0Var.h;
                        if (z10) {
                            j10 = jX;
                        } else {
                            j10 = this.e0.d;
                        }
                        this.e0 = y(vVar3, jX, j18, j10, z10, i0Var.i);
                    } else {
                        long j19 = i0Var.c;
                        z10 = i0Var.h;
                        if (z10) {
                            j10 = jX;
                        } else {
                            j10 = this.e0.d;
                        }
                        this.e0 = y(vVar3, jX, j19, j10, z10, i0Var.i);
                    }
                    P();
                    R(v0Var, this.e0.a);
                    this.e0 = this.e0.j(v0Var);
                    if (!v0Var.p()) {
                        this.s0 = null;
                    }
                    u(false);
                    this.E.f(2);
                    return;
                }
                try {
                    p0 p0Var3 = this.O.j;
                    try {
                        try {
                            int iS = this.O.s(v0Var, this.t0, p0Var3 == null ? j4 : l(p0Var3), (!d() || (p0Var = this.O.k) == null) ? j4 : l(p0Var));
                            if ((iS & 1) != 0) {
                                V(false);
                            } else if ((iS & 2) != 0) {
                                f();
                            }
                            vVar = vVar6;
                            c1 c1Var5 = this.e0;
                            androidx.media3.common.v0 v0Var12 = c1Var5.a;
                            androidx.media3.exoplayer.source.v vVar10 = c1Var5.b;
                            if (i0Var.f) {
                                j9 = jX;
                            } else {
                                j9 = -9223372036854775807L;
                            }
                            vVar3 = vVar;
                            C0(v0Var, vVar3, v0Var12, vVar10, j9, false);
                            if (i0Var.g || i0Var.c != this.e0.c) {
                                long j110 = i0Var.c;
                                z10 = i0Var.h;
                                if (z10) {
                                    j10 = jX;
                                } else {
                                    j10 = this.e0.d;
                                }
                                this.e0 = y(vVar3, jX, j110, j10, z10, i0Var.i);
                            }
                            P();
                            R(v0Var, this.e0.a);
                            this.e0 = this.e0.j(v0Var);
                            if (!v0Var.p()) {
                                this.s0 = null;
                            }
                            u(false);
                            this.E.f(2);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            r9 = v0Var;
                            vVar = vVar6;
                            r8 = r9;
                            r11 = r8;
                            c1 c1Var6 = this.e0;
                            androidx.media3.common.v0 v0Var13 = c1Var6.a;
                            androidx.media3.exoplayer.source.v vVar11 = c1Var6.b;
                            if (i0Var.f) {
                                j7 = jX;
                            } else {
                                j7 = -9223372036854775807L;
                            }
                            vVar2 = vVar;
                            C0(r11, vVar2, v0Var13, vVar11, j7, false);
                            if (i0Var.g) {
                                long j111 = i0Var.c;
                                z8 = i0Var.h;
                                if (z8) {
                                    j8 = jX;
                                } else {
                                    j8 = this.e0.d;
                                }
                                this.e0 = y(vVar2, jX, j111, j8, z8, i0Var.i);
                            } else {
                                long j112 = i0Var.c;
                                z8 = i0Var.h;
                                if (z8) {
                                    j8 = jX;
                                } else {
                                    j8 = this.e0.d;
                                }
                                this.e0 = y(vVar2, jX, j112, j8, z8, i0Var.i);
                            }
                            P();
                            R(r11, this.e0.a);
                            this.e0 = this.e0.j(r11);
                            if (!r11.p()) {
                                this.s0 = null;
                            }
                            u(false);
                            this.E.f(2);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        r9 = v0Var;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    r9 = v0Var5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            r11 = v0Var5;
            vVar = vVar6;
        }
        c1 c1Var7 = this.e0;
        androidx.media3.common.v0 v0Var14 = c1Var7.a;
        androidx.media3.exoplayer.source.v vVar12 = c1Var7.b;
        if (i0Var.f) {
            j7 = jX;
        } else {
            j7 = -9223372036854775807L;
        }
        vVar2 = vVar;
        C0(r11, vVar2, v0Var14, vVar12, j7, false);
        if (i0Var.g || i0Var.c != this.e0.c) {
            long j113 = i0Var.c;
            z8 = i0Var.h;
            if (z8) {
                j8 = jX;
            } else {
                j8 = this.e0.d;
            }
            this.e0 = y(vVar2, jX, j113, j8, z8, i0Var.i);
        }
        P();
        R(r11, this.e0.a);
        this.e0 = this.e0.j(r11);
        if (!r11.p()) {
            this.s0 = null;
        }
        u(false);
        this.E.f(2);
        throw th;
    }

    public final void v0() {
        h hVar = this.K;
        hVar.C = false;
        l1 l1Var = hVar.e;
        if (l1Var.y) {
            l1Var.d(l1Var.b());
            l1Var.y = false;
        }
        for (i1 i1Var : this.e) {
            a aVar = (a) i1Var.f;
            a aVar2 = (a) i1Var.e;
            if (i1.h(aVar2)) {
                i1.b(aVar2);
            }
            if (aVar != null && aVar.E != 0) {
                i1.b(aVar);
            }
        }
    }

    public final void w(androidx.media3.exoplayer.source.u uVar) {
        p0 p0Var;
        r0 r0Var = this.O;
        p0 p0Var2 = r0Var.l;
        h hVar = this.K;
        if (p0Var2 != null && p0Var2.a == uVar) {
            p0Var2.getClass();
            if (!p0Var2.e) {
                float f = hVar.e().a;
                c1 c1Var = this.e0;
                p0Var2.f(f, c1Var.a, c1Var.l);
            }
            x0(p0Var2.g.a, p0Var2.o);
            if (p0Var2 == r0Var.i) {
                Q(p0Var2.g.b, true);
                j(new boolean[this.e.length], r0Var.j.e());
                p0Var2.h = true;
                c1 c1Var2 = this.e0;
                androidx.media3.exoplayer.source.v vVar = c1Var2.b;
                long j = p0Var2.g.b;
                this.e0 = y(vVar, j, c1Var2.c, j, false, 5);
            }
            C();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= r0Var.q.size()) {
                p0Var = null;
                break;
            }
            p0Var = (p0) r0Var.q.get(i);
            if (p0Var.a == uVar) {
                break;
            } else {
                i++;
            }
        }
        if (p0Var != null) {
            com.google.android.material.motion.a.q(true ^ p0Var.e);
            float f2 = hVar.e().a;
            c1 c1Var3 = this.e0;
            p0Var.f(f2, c1Var3.a, c1Var3.l);
            p0 p0Var3 = r0Var.m;
            if (p0Var3 == null || p0Var3.a != uVar) {
                return;
            }
            D();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.media3.exoplayer.source.y0, java.lang.Object] */
    public final void w0() {
        p0 p0Var = this.O.l;
        boolean z = this.l0 || (p0Var != null && p0Var.a.n());
        c1 c1Var = this.e0;
        if (z != c1Var.g) {
            this.e0 = c1Var.b(z);
        }
    }

    public final void x(androidx.media3.common.l0 l0Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f0.e(1);
            }
            this.e0 = this.e0.g(l0Var);
        }
        float f2 = l0Var.a;
        p0 p0Var = this.O.i;
        while (true) {
            i = 0;
            if (p0Var == null) {
                break;
            }
            androidx.media3.exoplayer.trackselection.q[] qVarArr = p0Var.o.c;
            int length = qVarArr.length;
            while (i < length) {
                androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i];
                if (qVar != null) {
                    qVar.q(f2);
                }
                i++;
            }
            p0Var = p0Var.m;
        }
        i1[] i1VarArr = this.e;
        int length2 = i1VarArr.length;
        while (i < length2) {
            i1 i1Var = i1VarArr[i];
            float f3 = l0Var.a;
            ((a) i1Var.e).C(f, f3);
            a aVar = (a) i1Var.f;
            if (aVar != null) {
                aVar.C(f, f3);
            }
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:15:0x0079  */
    public final void x0(androidx.media3.exoplayer.source.v vVar, androidx.media3.exoplayer.trackselection.t tVar) {
        boolean z;
        p0 p0Var = this.O.l;
        p0Var.getClass();
        p(p0Var.d());
        if (s0(this.e0.a, p0Var.g.a)) {
            long j = this.Q.h;
        }
        androidx.media3.common.v0 v0Var = this.e0.a;
        float f = this.K.e().a;
        boolean z2 = this.e0.l;
        androidx.media3.exoplayer.trackselection.q[] qVarArr = tVar.c;
        g gVar = this.C;
        gVar.getClass();
        com.google.common.collect.f1 f1Var = gVar.p;
        androidx.media3.exoplayer.analytics.k kVar = this.S;
        Integer num = (Integer) f1Var.get(kVar.a);
        int iIntValue = (num == null || num.intValue() == -1) ? gVar.l : num.intValue();
        f fVar = (f) gVar.q.get(kVar);
        fVar.getClass();
        if (iIntValue == -1) {
            androidx.media3.common.y yVar = v0Var.m(v0Var.g(vVar.a, gVar.b).c, gVar.a, 0L).c.b;
            if (yVar == null) {
                z = false;
            } else {
                String scheme = yVar.a.getScheme();
                if (TextUtils.isEmpty(scheme) || g.s.contains(scheme)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            int length = qVarArr.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < length) {
                    androidx.media3.exoplayer.trackselection.q qVar = qVarArr[i];
                    if (qVar != null) {
                        switch (qVar.c().c) {
                            case -2:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            case 1:
                                i2 += i3;
                                break;
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 2:
                                i3 = z ? 19660800 : 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                            case 4:
                                i3 = 26214400;
                                i2 += i3;
                                break;
                            default:
                                net.luminis.tls.engine.impl.c.a();
                                break;
                        }
                        return;
                    }
                    i++;
                } else {
                    iIntValue = androidx.media3.common.util.j0.j(i2, 13107200, 210239488);
                }
            }
        }
        fVar.c = iIntValue;
        gVar.c();
    }

    public final c1 y(androidx.media3.exoplayer.source.v vVar, long j, long j2, long j3, boolean z, int i) {
        com.google.common.collect.a1 a1VarG;
        boolean z2;
        this.w0 = (!this.w0 && j == this.e0.s && vVar.equals(this.e0.b)) ? false : true;
        P();
        c1 c1Var = this.e0;
        androidx.media3.exoplayer.source.i1 i1Var = c1Var.h;
        androidx.media3.exoplayer.trackselection.t tVar = c1Var.i;
        List list = c1Var.j;
        if (this.P.a) {
            p0 p0Var = this.O.i;
            i1Var = p0Var == null ? androidx.media3.exoplayer.source.i1.d : p0Var.n;
            tVar = p0Var == null ? this.B : p0Var.o;
            androidx.media3.exoplayer.trackselection.q[] qVarArr = tVar.c;
            com.google.common.collect.d0 d0Var = new com.google.common.collect.d0(4);
            boolean z3 = false;
            for (androidx.media3.exoplayer.trackselection.q qVar : qVarArr) {
                if (qVar != null) {
                    androidx.media3.common.h0 h0Var = qVar.g(0).l;
                    if (h0Var == null) {
                        d0Var.b(new androidx.media3.common.h0(new androidx.media3.common.g0[0]));
                    } else {
                        d0Var.b(h0Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                a1VarG = d0Var.g();
            } else {
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                a1VarG = com.google.common.collect.a1.B;
            }
            list = a1VarG;
            if (p0Var != null) {
                q0 q0Var = p0Var.g;
                if (q0Var.d != j2) {
                    p0Var.g = q0Var.a(j2);
                }
            }
            i1[] i1VarArr = this.e;
            r0 r0Var = this.O;
            p0 p0Var2 = r0Var.i;
            if (p0Var2 == r0Var.j && p0Var2 != null) {
                androidx.media3.exoplayer.trackselection.t tVar2 = p0Var2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= i1VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (tVar2.b(i2)) {
                        if (((a) i1VarArr[i2].e).y != 1) {
                            z2 = false;
                            break;
                        }
                        if (tVar2.b[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.q0) {
                    this.q0 = z5;
                    if (!z5 && this.e0.p) {
                        this.E.f(2);
                    }
                }
            }
        } else if (!vVar.equals(c1Var.b)) {
            i1Var = androidx.media3.exoplayer.source.i1.d;
            tVar = this.B;
            list = com.google.common.collect.a1.B;
        }
        androidx.media3.exoplayer.source.i1 i1Var2 = i1Var;
        androidx.media3.exoplayer.trackselection.t tVar3 = tVar;
        List list2 = list;
        if (z) {
            h0 h0Var2 = this.f0;
            if (!h0Var2.d || h0Var2.e == 5) {
                h0Var2.c = true;
                h0Var2.d = true;
                h0Var2.e = i;
            } else {
                com.google.android.material.motion.a.f(i == 5);
            }
        }
        c1 c1Var2 = this.e0;
        return c1Var2.d(vVar, j, j2, j3, p(c1Var2.q), i1Var2, tVar3, list2);
    }

    public final void y0(int i, List list, int i2) throws Throwable {
        this.f0.e(1);
        b1 b1Var = this.P;
        b1Var.getClass();
        ArrayList arrayList = (ArrayList) b1Var.c;
        com.google.android.material.motion.a.f(i >= 0 && i <= i2 && i2 <= arrayList.size());
        com.google.android.material.motion.a.f(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((a1) arrayList.get(i3)).a.s((androidx.media3.common.c0) list.get(i3 - i));
        }
        v(b1Var.c(), false);
    }

    /* JADX WARN: Code duplicated, block: B:150:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:18:0x0045  */
    /* JADX WARN: Code duplicated, block: B:206:0x039f  */
    /* JADX WARN: Code duplicated, block: B:208:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:210:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:217:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:231:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:244:0x0417  */
    /* JADX WARN: Code duplicated, block: B:324:0x0548  */
    /* JADX WARN: Type inference failed for: r1v49, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.media3.exoplayer.source.u, java.lang.Object] */
    public final void z0() {
        p0 p0Var;
        p0 p0Var2;
        p0 p0Var3;
        boolean z;
        boolean z2;
        androidx.media3.exoplayer.trackselection.t tVar;
        p0 p0Var4;
        p0 p0Var5;
        p0 p0Var6;
        androidx.media3.exoplayer.trackselection.t tVar2;
        int length;
        int i;
        a aVar;
        boolean zB;
        a aVar2;
        byte b;
        int i2;
        int i3;
        p0 p0Var7;
        p0 p0Var8;
        boolean z3;
        int i4;
        if (this.e0.a.p() || !this.P.a) {
            return;
        }
        this.O.m(this.t0);
        r0 r0Var = this.O;
        p0 p0Var9 = r0Var.l;
        long j = -9223372036854775807L;
        if (p0Var9 == null || (!p0Var9.g.k && p0Var9.g() && r0Var.l.g.f != -9223372036854775807L && r0Var.n < 100)) {
            r0 r0Var2 = this.O;
            long j2 = this.t0;
            c1 c1Var = this.e0;
            p0 p0Var10 = r0Var2.l;
            q0 q0VarD = p0Var10 == null ? r0Var2.d(c1Var.a, c1Var.b, c1Var.c, c1Var.s, -9223372036854775807L) : r0Var2.c(c1Var.a, p0Var10, j2);
            if (q0VarD != null) {
                r0 r0Var3 = this.O;
                p0 p0Var11 = r0Var3.l;
                long j3 = p0Var11 == null ? 1000000000000L : (p0Var11.p + p0Var11.g.f) - q0VarD.b;
                int i5 = 0;
                while (true) {
                    if (i5 >= r0Var3.q.size()) {
                        p0Var = null;
                        break;
                    }
                    q0 q0Var = ((p0) r0Var3.q.get(i5)).g;
                    long j4 = q0Var.f;
                    long j5 = q0VarD.f;
                    if ((j4 == -9223372036854775807L || j4 == j5) && q0Var.b == q0VarD.b && q0Var.a.equals(q0VarD.a)) {
                        p0Var = (p0) r0Var3.q.remove(i5);
                        break;
                    }
                    i5++;
                }
                if (p0Var == null) {
                    k0 k0Var = (k0) r0Var3.e.y;
                    a[] aVarArr = k0Var.y;
                    androidx.media3.exoplayer.trackselection.o oVar = k0Var.A;
                    g gVar = k0Var.C;
                    androidx.media3.exoplayer.analytics.k kVar = k0Var.S;
                    gVar.getClass();
                    c2 c2Var = new c2(gVar, kVar);
                    b1 b1Var = k0Var.P;
                    androidx.media3.exoplayer.trackselection.t tVar3 = k0Var.B;
                    k0Var.z0.getClass();
                    p0Var = new p0(aVarArr, j3, oVar, c2Var, b1Var, q0VarD, tVar3);
                } else {
                    p0Var.g = q0VarD;
                    p0Var.p = j3;
                }
                p0 p0Var12 = r0Var3.l;
                if (p0Var12 == null) {
                    r0Var3.i = p0Var;
                    r0Var3.j = p0Var;
                    r0Var3.k = p0Var;
                } else if (p0Var != p0Var12.m) {
                    p0Var12.b();
                    p0Var12.m = p0Var;
                    p0Var12.c();
                }
                r0Var3.o = null;
                r0Var3.l = p0Var;
                r0Var3.n++;
                r0Var3.l();
                if (!p0Var.d) {
                    long j6 = q0VarD.b;
                    p0Var.d = true;
                    p0Var.a.q(this, j6);
                } else if (p0Var.e) {
                    this.E.b(8, p0Var.a).b();
                }
                if (this.O.i == p0Var) {
                    Q(q0VarD.b, true);
                }
                u(false);
            } else {
                j = -9223372036854775807L;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.l0) {
            this.l0 = z(this.O.l);
            w0();
        } else {
            C();
        }
        r0 r0Var4 = this.O;
        if (!this.i0 && this.V && !this.B0 && !d() && (p0Var7 = r0Var4.k) != null && p0Var7 == r0Var4.j && (p0Var8 = p0Var7.m) != null && (z3 = p0Var8.e)) {
            com.google.android.material.motion.a.q(z3);
            if (((long) ((p0Var8.e() - this.t0) / this.K.e().a)) <= 10000000) {
                p0 p0Var13 = r0Var4.k;
                p0Var13.getClass();
                r0Var4.k = p0Var13.m;
                r0Var4.l();
                r0Var4.k.getClass();
                i1[] i1VarArr = this.e;
                p0 p0Var14 = r0Var4.k;
                if (p0Var14 != null) {
                    androidx.media3.exoplayer.trackselection.t tVar4 = p0Var14.o;
                    for (int i6 = 0; i6 < i1VarArr.length; i6++) {
                        if (tVar4.b(i6)) {
                            i1 i1Var = i1VarArr[i6];
                            if (((a) i1Var.f) != null && !i1Var.f()) {
                                i1 i1Var2 = i1VarArr[i6];
                                com.google.android.material.motion.a.q(!i1Var2.f());
                                if (i1.h((a) i1Var2.e)) {
                                    i4 = 3;
                                } else {
                                    a aVar3 = (a) i1Var2.f;
                                    i4 = (aVar3 == null || aVar3.E == 0) ? 2 : 4;
                                }
                                i1Var2.d = i4;
                                i(p0Var14, i6, false, p0Var14.e());
                            }
                        }
                    }
                    if (d()) {
                        this.A0 = p0Var14.a.p();
                        if (!p0Var14.g()) {
                            r0Var4.n(p0Var14);
                            u(false);
                            C();
                        }
                    }
                }
            }
        }
        boolean z4 = this.V;
        i1[] i1VarArr2 = this.e;
        r0 r0Var5 = this.O;
        p0 p0Var15 = r0Var5.j;
        if (p0Var15 != null) {
            if (p0Var15.m == null || this.i0) {
                if (p0Var15.g.k || this.i0) {
                    for (i1 i1Var3 : i1VarArr2) {
                        if (i1Var3.d(p0Var15) != null) {
                            a aVarD = i1Var3.d(p0Var15);
                            aVarD.getClass();
                            if (aVarD.l()) {
                                long j7 = p0Var15.g.f;
                                long j8 = (j7 == -9223372036854775807L || j7 == Long.MIN_VALUE) ? -9223372036854775807L : j7 + p0Var15.p;
                                a aVarD2 = i1Var3.d(p0Var15);
                                aVarD2.getClass();
                                i1.l(aVarD2, j8);
                            }
                        }
                    }
                }
            } else if (p0Var15.e) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i1VarArr2.length) {
                        if (!d() || r0Var5.k != r0Var5.j) {
                            p0 p0Var16 = p0Var15.m;
                            if (!p0Var16.e && this.t0 < p0Var16.e()) {
                                break;
                            }
                            p0 p0Var17 = p0Var15.m;
                            boolean z5 = p0Var17.e;
                            if (!z5) {
                                tVar = p0Var15.o;
                                p0Var4 = r0Var5.k;
                                p0Var5 = r0Var5.j;
                                if (p0Var4 == p0Var5) {
                                    p0Var5.getClass();
                                    r0Var5.k = p0Var5.m;
                                }
                                p0 p0Var18 = r0Var5.j;
                                p0Var18.getClass();
                                r0Var5.j = p0Var18.m;
                                r0Var5.l();
                                p0Var6 = r0Var5.j;
                                p0Var6.getClass();
                                tVar2 = p0Var6.o;
                                androidx.media3.common.v0 v0Var = this.e0.a;
                                C0(v0Var, p0Var6.g.a, v0Var, p0Var15.g.a, -9223372036854775807L, false);
                                if (p0Var6.e) {
                                    length = i1VarArr2.length;
                                    for (i = 0; i < length; i++) {
                                        i1 i1Var4 = i1VarArr2[i];
                                        long jE = p0Var6.e();
                                        aVar = (a) i1Var4.e;
                                        int i8 = i1Var4.c;
                                        zB = tVar.b(i8);
                                        boolean zB2 = tVar2.b(i8);
                                        aVar2 = (a) i1Var4.f;
                                        if (aVar2 != null) {
                                            aVar2 = aVar;
                                        } else {
                                            aVar2 = aVar;
                                        }
                                        if (zB) {
                                            b = -2;
                                        } else {
                                            b = -2;
                                        }
                                    }
                                    break;
                                    break;
                                }
                                length = i1VarArr2.length;
                                while (i < length) {
                                    i1 i1Var5 = i1VarArr2[i];
                                    long jE2 = p0Var6.e();
                                    aVar = (a) i1Var5.e;
                                    int i9 = i1Var5.c;
                                    zB = tVar.b(i9);
                                    boolean zB3 = tVar2.b(i9);
                                    aVar2 = (a) i1Var5.f;
                                    if (aVar2 != null) {
                                        aVar2 = aVar;
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    if (zB) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            com.google.android.material.motion.a.q(z5);
                            if (((long) ((p0Var17.e() - this.t0) / this.K.e().a)) > 10000000) {
                                break;
                            }
                            tVar = p0Var15.o;
                            p0Var4 = r0Var5.k;
                            p0Var5 = r0Var5.j;
                            if (p0Var4 == p0Var5) {
                                p0Var5.getClass();
                                r0Var5.k = p0Var5.m;
                            }
                            p0 p0Var19 = r0Var5.j;
                            p0Var19.getClass();
                            r0Var5.j = p0Var19.m;
                            r0Var5.l();
                            p0Var6 = r0Var5.j;
                            p0Var6.getClass();
                            tVar2 = p0Var6.o;
                            androidx.media3.common.v0 v0Var2 = this.e0.a;
                            C0(v0Var2, p0Var6.g.a, v0Var2, p0Var15.g.a, -9223372036854775807L, false);
                            if (p0Var6.e && ((z4 && this.A0 != j) || p0Var6.a.p() != j)) {
                                this.A0 = j;
                                boolean z6 = z4 && !this.B0;
                                if (z6) {
                                    for (int i10 = 0; i10 < i1VarArr2.length; i10++) {
                                        boolean zB4 = tVar2.b(i10);
                                        androidx.media3.exoplayer.trackselection.q[] qVarArr = tVar2.c;
                                        if (zB4 && ((a) i1VarArr2[i10].e).y != -2 && !androidx.media3.common.i0.a(qVarArr[i10].n().o, qVarArr[i10].n().k) && !i1VarArr2[i10].f()) {
                                            z6 = false;
                                            break;
                                        }
                                    }
                                }
                                if (!z6) {
                                    long jE3 = p0Var6.e();
                                    for (i1 i1Var6 : i1VarArr2) {
                                        a aVar4 = (a) i1Var6.f;
                                        a aVar5 = (a) i1Var6.e;
                                        if (i1.h(aVar5) && (i3 = i1Var6.d) != 4 && i3 != 2) {
                                            i1.l(aVar5, jE3);
                                        }
                                        if (aVar4 != null) {
                                            if ((aVar4.E != 0) && i1Var6.d != 3) {
                                                i1.l(aVar4, jE3);
                                            }
                                        }
                                    }
                                    if (!p0Var6.g()) {
                                        r0Var5.n(p0Var6);
                                        u(false);
                                        C();
                                        break;
                                    }
                                    break;
                                }
                                length = i1VarArr2.length;
                                while (i < length) {
                                    i1 i1Var7 = i1VarArr2[i];
                                    long jE4 = p0Var6.e();
                                    aVar = (a) i1Var7.e;
                                    int i11 = i1Var7.c;
                                    zB = tVar.b(i11);
                                    boolean zB5 = tVar2.b(i11);
                                    aVar2 = (a) i1Var7.f;
                                    if (aVar2 != null) {
                                        aVar2 = aVar;
                                    } else {
                                        aVar2 = aVar;
                                    }
                                    if (zB) {
                                        b = -2;
                                    } else {
                                        b = -2;
                                    }
                                }
                                break;
                                break;
                            }
                            length = i1VarArr2.length;
                            while (i < length) {
                                i1 i1Var8 = i1VarArr2[i];
                                long jE5 = p0Var6.e();
                                aVar = (a) i1Var8.e;
                                int i12 = i1Var8.c;
                                zB = tVar.b(i12);
                                boolean zB6 = tVar2.b(i12);
                                aVar2 = (a) i1Var8.f;
                                if (aVar2 != null || (i2 = i1Var8.d) == 3 || (i2 == 0 && i1.h(aVar))) {
                                    aVar2 = aVar;
                                }
                                if (zB || aVar2.K) {
                                    b = -2;
                                } else {
                                    int i13 = aVar.y;
                                    b = -2;
                                    boolean z7 = i13 == -2;
                                    h1 h1Var = tVar.b[i12];
                                    h1 h1Var2 = tVar2.b[i12];
                                    if (!zB6 || !Objects.equals(h1Var2, h1Var) || z7 || i1Var8.f()) {
                                        i1.l(aVar2, jE5);
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                    i1 i1Var9 = i1VarArr2[i7];
                    if (!i1Var9.e(p0Var15, (a) i1Var9.e) || !i1Var9.e(p0Var15, (a) i1Var9.f)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
        }
        r0 r0Var6 = this.O;
        p0 p0Var20 = r0Var6.j;
        if (p0Var20 != null && r0Var6.i != p0Var20 && !p0Var20.h) {
            i1[] i1VarArr3 = this.e;
            androidx.media3.exoplayer.trackselection.t tVar5 = p0Var20.o;
            boolean z8 = true;
            for (int i14 = 0; i14 < i1VarArr3.length; i14++) {
                int iC = i1VarArr3[i14].c();
                i1 i1Var10 = i1VarArr3[i14];
                h hVar = this.K;
                int iJ = i1Var10.j((a) i1Var10.e, p0Var20, tVar5, hVar);
                int iJ2 = i1Var10.j((a) i1Var10.f, p0Var20, tVar5, hVar);
                if (iJ == 1) {
                    iJ = iJ2;
                }
                if ((iJ & 2) != 0 && (z2 = this.q0) && z2) {
                    this.q0 = false;
                    if (this.e0.p) {
                        this.E.f(2);
                    }
                }
                this.r0 -= iC - i1VarArr3[i14].c();
                z8 &= (iJ & 1) != 0;
            }
            if (z8) {
                for (int i15 = 0; i15 < i1VarArr3.length; i15++) {
                    if (tVar5.b(i15)) {
                        if (!(i1VarArr3[i15].d(p0Var20) != null)) {
                            i(p0Var20, i15, false, p0Var20.e());
                        }
                    }
                }
            }
            if (z8) {
                r0Var6.j.h = true;
            }
        }
        i1[] i1VarArr4 = this.e;
        r0 r0Var7 = this.O;
        boolean z9 = false;
        while (r0() && !this.i0 && (p0Var2 = r0Var7.i) != null && (p0Var3 = p0Var2.m) != null && this.t0 >= p0Var3.e() && p0Var3.h) {
            if (z9) {
                E();
            }
            this.B0 = false;
            p0 p0VarA = r0Var7.a();
            p0VarA.getClass();
            if (this.e0.b.a.equals(p0VarA.g.a.a)) {
                androidx.media3.exoplayer.source.v vVar = this.e0.b;
                if (vVar.b == -1) {
                    androidx.media3.exoplayer.source.v vVar2 = p0VarA.g.a;
                    if (vVar2.b != -1 || vVar.e == vVar2.e) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            q0 q0Var2 = p0VarA.g;
            boolean z10 = z;
            androidx.media3.exoplayer.source.v vVar3 = q0Var2.a;
            long j9 = q0Var2.b;
            this.e0 = y(vVar3, j9, q0Var2.d, j9, !z10, 0);
            P();
            B0();
            if (d() && p0VarA == r0Var7.k) {
                for (i1 i1Var11 : i1VarArr4) {
                    int i16 = i1Var11.d;
                    if (i16 == 3 || i16 == 4) {
                        boolean z11 = i16 == 4;
                        a aVar6 = (a) i1Var11.e;
                        a aVar7 = (a) i1Var11.f;
                        if (z11) {
                            aVar7.getClass();
                            aVar7.d(17, aVar6);
                        } else {
                            aVar7.getClass();
                            aVar6.d(17, aVar7);
                        }
                        i1Var11.d = i1Var11.d == 4 ? 0 : 1;
                    } else if (i16 == 2) {
                        i1Var11.d = 0;
                    }
                }
            }
            if (this.e0.e == 3) {
                t0();
            }
            androidx.media3.exoplayer.trackselection.t tVar6 = r0Var7.i.o;
            for (int i17 = 0; i17 < i1VarArr4.length; i17++) {
                if (tVar6.b(i17)) {
                    i1 i1Var12 = i1VarArr4[i17];
                    a aVar8 = (a) i1Var12.f;
                    a aVar9 = (a) i1Var12.e;
                    if (i1.h(aVar9)) {
                        aVar9.h();
                    } else if (aVar8 != null) {
                        if (aVar8.E != 0) {
                            aVar8.h();
                        }
                    }
                }
            }
            z9 = true;
        }
        this.z0.getClass();
    }
}
