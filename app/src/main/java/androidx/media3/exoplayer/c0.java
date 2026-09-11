package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import androidx.compose.foundation.gestures.z1;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ExoPlayer, androidx.media3.common.q0 {
    public final long A;
    public final androidx.appcompat.widget.o B;
    public final androidx.compose.ui.node.a1 C;
    public final b0 D;
    public final androidx.media3.common.util.b E;
    public final androidx.media3.common.util.b F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public com.google.common.collect.k0 M;
    public final j1 N;
    public final k1 O;
    public androidx.media3.exoplayer.source.z0 P;
    public final l Q;
    public androidx.media3.common.m0 R;
    public androidx.media3.common.f0 S;
    public Object T;
    public Surface U;
    public SurfaceHolder V;
    public androidx.media3.exoplayer.video.spherical.k W;
    public boolean X;
    public TextureView Y;
    public final int Z;
    public androidx.media3.common.util.x a0;
    public final androidx.media3.exoplayer.trackselection.t b;
    public final androidx.media3.common.e b0;
    public final androidx.media3.common.m0 c;
    public boolean c0;
    public androidx.media3.common.text.c d0;
    public final Context e;
    public final boolean e0;
    public final c0 f;
    public boolean f0;
    public final a[] g;
    public final int g0;
    public final a[] h;
    public boolean h0;
    public final androidx.media3.exoplayer.trackselection.o i;
    public androidx.media3.common.f1 i0;
    public final androidx.media3.common.util.g0 j;
    public final long j0;
    public final q k;
    public final long k0;
    public final k0 l;
    public final long l0;
    public final androidx.media3.common.util.p m;
    public androidx.media3.common.f0 m0;
    public final CopyOnWriteArraySet n;
    public c1 n0;
    public final androidx.media3.common.t0 o;
    public int o0;
    public final ArrayList p;
    public long p0;
    public final boolean q;
    public final androidx.media3.exoplayer.analytics.g r;
    public final Looper s;
    public final androidx.media3.exoplayer.upstream.f t;
    public final androidx.media3.common.util.e0 u;
    public final x v;
    public final y w;
    public final androidx.compose.foundation.lazy.layout.b1 x;
    public final androidx.media3.common.util.m0 y;
    public final androidx.media3.common.util.n0 z;
    public final androidx.media3.common.u0 a = new androidx.media3.common.u0();
    public final androidx.media3.common.util.h d = new androidx.media3.common.util.h();

    static {
        androidx.media3.common.d0.a("media3.exoplayer");
    }

    public c0(k kVar) {
        try {
            androidx.media3.common.util.c.k("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.10.1] [" + androidx.media3.common.util.j0.a + "]");
            Context context = kVar.a;
            Looper looper = kVar.h;
            androidx.media3.common.util.e0 e0Var = kVar.b;
            this.e = context.getApplicationContext();
            this.r = new androidx.media3.exoplayer.analytics.g(e0Var);
            this.g0 = kVar.i;
            this.b0 = kVar.j;
            this.Z = kVar.k;
            this.c0 = false;
            this.A = kVar.t;
            x xVar = new x(this);
            this.v = xVar;
            this.w = new y();
            a[] aVarArrH = ((coil3.memory.c) kVar.c.y).h(new Handler(looper), xVar, xVar, xVar, xVar);
            this.g = aVarArrH;
            com.google.android.material.motion.a.q(aVarArrH.length > 0);
            this.h = new a[aVarArrH.length];
            int i = 0;
            while (true) {
                a[] aVarArr = this.h;
                if (i >= aVarArr.length) {
                    break;
                }
                int i2 = this.g[i].y;
                aVarArr[i] = null;
                i++;
            }
            this.i = (androidx.media3.exoplayer.trackselection.o) kVar.e.get();
            kVar.d.get();
            this.t = (androidx.media3.exoplayer.upstream.f) kVar.g.get();
            this.q = kVar.l;
            this.O = kVar.m;
            this.j0 = kVar.o;
            this.k0 = kVar.p;
            this.l0 = kVar.q;
            this.N = kVar.n;
            this.s = looper;
            this.u = e0Var;
            this.f = this;
            this.m = new androidx.media3.common.util.p(new CopyOnWriteArraySet(), looper, looper.getThread(), e0Var, new o(this), true);
            this.n = new CopyOnWriteArraySet();
            this.p = new ArrayList();
            this.P = new androidx.media3.exoplayer.source.z0();
            this.Q = l.a;
            a[] aVarArr2 = this.g;
            this.b = new androidx.media3.exoplayer.trackselection.t(new h1[aVarArr2.length], new androidx.media3.exoplayer.trackselection.q[aVarArr2.length], androidx.media3.common.c1.b, null);
            this.o = new androidx.media3.common.t0();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i3 = 0; i3 < 20; i3++) {
                int i4 = iArr[i3];
                com.google.android.material.motion.a.q(!false);
                sparseBooleanArray.append(i4, true);
            }
            this.i.getClass();
            com.google.android.material.motion.a.q(!false);
            sparseBooleanArray.append(29, true);
            com.google.android.material.motion.a.q(!false);
            androidx.media3.common.o oVar = new androidx.media3.common.o(sparseBooleanArray);
            SparseBooleanArray sparseBooleanArray2 = oVar.a;
            this.c = new androidx.media3.common.m0(oVar);
            SparseBooleanArray sparseBooleanArray3 = new SparseBooleanArray();
            for (int i5 = 0; i5 < sparseBooleanArray2.size(); i5++) {
                com.google.android.material.motion.a.j(i5, sparseBooleanArray2.size());
                int iKeyAt = sparseBooleanArray2.keyAt(i5);
                com.google.android.material.motion.a.q(!false);
                sparseBooleanArray3.append(iKeyAt, true);
            }
            com.google.android.material.motion.a.q(!false);
            sparseBooleanArray3.append(4, true);
            com.google.android.material.motion.a.q(!false);
            sparseBooleanArray3.append(10, true);
            com.google.android.material.motion.a.q(!false);
            this.R = new androidx.media3.common.m0(new androidx.media3.common.o(sparseBooleanArray3));
            this.j = this.u.a(this.s, null);
            q qVar = new q(this);
            this.k = qVar;
            this.n0 = c1.k(this.b);
            this.r.N(this.f, this.s);
            androidx.media3.exoplayer.analytics.k kVar2 = new androidx.media3.exoplayer.analytics.k(kVar.A);
            k0 k0Var = new k0(this.e, this.g, this.h, this.i, this.b, (g) kVar.f.get(), this.t, this.G, this.H, this.r, this.O, kVar.r, kVar.s, this.s, this.u, qVar, kVar2, this.Q, this.w, kVar.B);
            androidx.media3.common.util.g0 g0Var = k0Var.E;
            this.l = k0Var;
            Looper looper2 = k0Var.G;
            this.G = 0;
            androidx.media3.common.f0 f0Var = androidx.media3.common.f0.B;
            this.S = f0Var;
            this.m0 = f0Var;
            this.o0 = -1;
            this.d0 = androidx.media3.common.text.c.c;
            this.e0 = true;
            androidx.media3.exoplayer.analytics.g gVar = this.r;
            androidx.media3.common.util.p pVar = this.m;
            gVar.getClass();
            pVar.a(gVar);
            androidx.media3.exoplayer.upstream.f fVar = this.t;
            Handler handler = new Handler(this.s);
            androidx.media3.exoplayer.analytics.g gVar2 = this.r;
            fVar.getClass();
            gVar2.getClass();
            androidx.media3.exoplayer.hls.c cVar = fVar.c;
            cVar.getClass();
            CopyOnWriteArrayList<androidx.media3.exoplayer.upstream.c> copyOnWriteArrayList = (CopyOnWriteArrayList) cVar.e;
            for (androidx.media3.exoplayer.upstream.c cVar2 : copyOnWriteArrayList) {
                if (cVar2.b == gVar2) {
                    cVar2.c = true;
                    copyOnWriteArrayList.remove(cVar2);
                }
            }
            copyOnWriteArrayList.add(new androidx.media3.exoplayer.upstream.c(handler, gVar2));
            this.n.add(this.v);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 31) {
                this.u.a(k0Var.G, null).d(new u(this.e, kVar.y, this, kVar2));
            }
            Looper looper3 = this.s;
            androidx.media3.common.util.e0 e0Var2 = this.u;
            q qVar2 = new q(this);
            androidx.appcompat.widget.o oVar2 = new androidx.appcompat.widget.o();
            oVar2.b = e0Var2.a(looper2, null);
            oVar2.c = e0Var2.a(looper3, null);
            oVar2.e = 0;
            oVar2.f = 0;
            oVar2.d = qVar2;
            this.B = oVar2;
            int i7 = 13;
            oVar2.j(new androidx.activity.l(this, i7));
            androidx.compose.foundation.lazy.layout.b1 b1Var = new androidx.compose.foundation.lazy.layout.b1(kVar.a, looper2, kVar.h, this.v, this.u);
            this.x = b1Var;
            b1Var.p();
            boolean z = (kVar.u == Integer.MAX_VALUE || kVar.v == Integer.MAX_VALUE || kVar.w == Integer.MAX_VALUE || kVar.x == Integer.MAX_VALUE) ? false : true;
            androidx.media3.common.util.m0 m0Var = new androidx.media3.common.util.m0(context, looper2, this.u);
            this.y = m0Var;
            if (m0Var.b != z) {
                m0Var.b = z;
                m0Var.a(z, m0Var.c);
            }
            androidx.media3.common.util.e0 e0Var3 = this.u;
            androidx.media3.common.util.n0 n0Var = new androidx.media3.common.util.n0();
            new com.google.android.gms.common.internal.k(context.getApplicationContext(), i7);
            e0Var3.a(looper2, null);
            e0Var3.a(Looper.getMainLooper(), null);
            this.z = n0Var;
            int i8 = androidx.media3.common.j.c;
            this.i0 = androidx.media3.common.f1.d;
            this.a0 = androidx.media3.common.util.x.c;
            this.D = i6 >= 34 ? new b0(this, context) : null;
            this.E = new androidx.media3.common.util.b(7);
            this.F = new androidx.media3.common.util.b(7);
            this.C = new androidx.compose.ui.node.a1(this, this.v, this.u, kVar.u, kVar.v, kVar.w, kVar.x);
            g0Var.b(38, this.N).b();
            androidx.media3.common.e eVar = this.b0;
            androidx.media3.common.util.f0 f0VarC = androidx.media3.common.util.g0.c();
            f0VarC.a = g0Var.a.obtainMessage(31, 0, 0, eVar);
            f0VarC.b();
            J(1, 3, this.b0);
            J(2, 4, Integer.valueOf(this.Z));
            J(2, 5, 0);
            J(1, 9, Boolean.valueOf(this.c0));
            J(6, 8, this.w);
            J(-1, 16, Integer.valueOf(this.g0));
        } finally {
            this.d.c();
        }
    }

    public static long s(c1 c1Var) {
        androidx.media3.common.u0 u0Var = new androidx.media3.common.u0();
        androidx.media3.common.t0 t0Var = new androidx.media3.common.t0();
        c1Var.a.g(c1Var.b.a, t0Var);
        long j = c1Var.c;
        return j == -9223372036854775807L ? c1Var.a.m(t0Var.c, u0Var, 0L).l : t0Var.e + j;
    }

    public static c1 y(c1 c1Var, int i) {
        c1 c1VarH = c1Var.h(i);
        return (i == 1 || i == 4) ? c1VarH.b(false) : c1VarH;
    }

    public final Pair A(androidx.media3.common.v0 v0Var, int i, long j) {
        if (v0Var.p()) {
            this.o0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.p0 = j;
            return null;
        }
        if (i == -1 || i >= v0Var.o()) {
            i = v0Var.a(this.H);
            j = androidx.media3.common.util.j0.d0(v0Var.m(i, this.a, 0L).l);
        }
        return v0Var.i(this.a, this.o, i, androidx.media3.common.util.j0.Q(j));
    }

    public final void B(final int i, final int i2) {
        androidx.media3.common.util.x xVar = this.a0;
        if (i == xVar.a && i2 == xVar.b) {
            return;
        }
        this.a0 = new androidx.media3.common.util.x(i, i2);
        this.m.e(24, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.n
            @Override // androidx.media3.common.util.m
            public final void invoke(Object obj) {
                ((androidx.media3.common.o0) obj).D(i, i2);
            }
        });
        J(2, 14, new androidx.media3.common.util.x(i, i2));
    }

    public final void C() {
        V();
        c1 c1Var = this.n0;
        if (c1Var.e != 1) {
            return;
        }
        c1 c1VarF = c1Var.f(null);
        c1 c1VarY = y(c1VarF, c1VarF.a.p() ? 4 : 2);
        this.I++;
        this.l.E.a(29).b();
        T(c1VarY, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final void D(androidx.media3.common.o0 o0Var) {
        V();
        o0Var.getClass();
        androidx.media3.common.util.p pVar = this.m;
        if (pVar.i) {
            com.google.android.material.motion.a.q(Thread.currentThread() == pVar.a);
        }
        CopyOnWriteArraySet<androidx.media3.common.util.o> copyOnWriteArraySet = pVar.d;
        for (androidx.media3.common.util.o oVar : copyOnWriteArraySet) {
            if (oVar.a.equals(o0Var)) {
                androidx.media3.common.util.n nVar = pVar.c;
                oVar.d = true;
                if (nVar != null && oVar.c) {
                    oVar.c = false;
                    nVar.c(oVar.a, oVar.b.c());
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    public final void E() {
        androidx.media3.exoplayer.video.spherical.k kVar = this.W;
        x xVar = this.v;
        if (kVar != null) {
            e1 e1VarC = c(this.w);
            com.google.android.material.motion.a.q(!e1VarC.f);
            e1VarC.c = 10000;
            com.google.android.material.motion.a.q(!e1VarC.f);
            e1VarC.d = null;
            e1VarC.b();
            this.W.e.remove(xVar);
            this.W = null;
        }
        TextureView textureView = this.Y;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != xVar) {
                androidx.media3.common.util.c.t("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.Y.setSurfaceTextureListener(null);
            }
            this.Y = null;
        }
        SurfaceHolder surfaceHolder = this.V;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(xVar);
            this.V = null;
        }
    }

    public final void F(long j, int i, boolean z) {
        V();
        if (i == -1) {
            return;
        }
        com.google.android.material.motion.a.f(i >= 0);
        androidx.media3.common.v0 v0Var = this.n0.a;
        if (v0Var.p() || i < v0Var.o()) {
            androidx.media3.exoplayer.analytics.g gVar = this.r;
            if (!gVar.F) {
                androidx.media3.exoplayer.analytics.a aVarH = gVar.H();
                gVar.F = true;
                gVar.M(aVarH, -1, new o(17));
            }
            this.I++;
            if (x()) {
                androidx.media3.common.util.c.t("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                h0 h0Var = new h0(this.n0);
                h0Var.e(1);
                c0 c0Var = this.k.e;
                c0Var.j.d(new androidx.activity.c(9, c0Var, h0Var));
                return;
            }
            c1 c1VarH = this.n0;
            int i2 = c1VarH.e;
            if (i2 == 3 || (i2 == 4 && !v0Var.p())) {
                c1VarH = this.n0.h(2);
            }
            int iH = h();
            c1 c1VarZ = z(c1VarH, v0Var, A(v0Var, i, j));
            this.l.E.b(3, new j0(v0Var, i, androidx.media3.common.util.j0.Q(j))).b();
            T(c1VarZ, 0, true, 1, k(c1VarZ), iH, z);
        }
    }

    public final void G(long j) {
        F(j, h(), false);
    }

    public final void H() {
        int iE;
        int iE2;
        if (l().p() || x()) {
            V();
            return;
        }
        androidx.media3.common.v0 v0VarL = l();
        if (v0VarL.p()) {
            iE = -1;
        } else {
            int iH = h();
            V();
            int i = this.G;
            if (i == 1) {
                i = 0;
            }
            V();
            iE = v0VarL.e(iH, i, this.H);
        }
        if (!(iE != -1)) {
            if (v()) {
                androidx.media3.common.v0 v0VarL2 = l();
                if (!v0VarL2.p() && v0VarL2.m(h(), this.a, 0L).i) {
                    F(-9223372036854775807L, h(), false);
                    return;
                }
            }
            V();
            return;
        }
        androidx.media3.common.v0 v0VarL3 = l();
        if (v0VarL3.p()) {
            iE2 = -1;
        } else {
            int iH2 = h();
            V();
            int i2 = this.G;
            if (i2 == 1) {
                i2 = 0;
            }
            V();
            iE2 = v0VarL3.e(iH2, i2, this.H);
        }
        if (iE2 == -1) {
            V();
        } else if (iE2 == h()) {
            F(-9223372036854775807L, h(), true);
        } else {
            F(-9223372036854775807L, iE2, false);
        }
    }

    public final void I() {
        int iK;
        int iK2;
        int iK3;
        if (l().p() || x()) {
            V();
            return;
        }
        androidx.media3.common.v0 v0VarL = l();
        if (v0VarL.p()) {
            iK = -1;
        } else {
            int iH = h();
            V();
            int i = this.G;
            if (i == 1) {
                i = 0;
            }
            V();
            iK = v0VarL.k(iH, i, this.H);
        }
        boolean z = iK != -1;
        if (v()) {
            androidx.media3.common.v0 v0VarL2 = l();
            if (!(!v0VarL2.p() && v0VarL2.m(h(), this.a, 0L).h)) {
                if (!z) {
                    V();
                    return;
                }
                androidx.media3.common.v0 v0VarL3 = l();
                if (v0VarL3.p()) {
                    iK3 = -1;
                } else {
                    int iH2 = h();
                    V();
                    int i2 = this.G;
                    if (i2 == 1) {
                        i2 = 0;
                    }
                    V();
                    iK3 = v0VarL3.k(iH2, i2, this.H);
                }
                if (iK3 == -1) {
                    V();
                    return;
                } else if (iK3 == h()) {
                    F(-9223372036854775807L, h(), true);
                    return;
                } else {
                    F(-9223372036854775807L, iK3, false);
                    return;
                }
            }
        }
        if (z) {
            long j = j();
            V();
            if (j <= this.l0) {
                androidx.media3.common.v0 v0VarL4 = l();
                if (v0VarL4.p()) {
                    iK2 = -1;
                } else {
                    int iH3 = h();
                    V();
                    int i3 = this.G;
                    if (i3 == 1) {
                        i3 = 0;
                    }
                    V();
                    iK2 = v0VarL4.k(iH3, i3, this.H);
                }
                if (iK2 == -1) {
                    V();
                    return;
                } else if (iK2 == h()) {
                    F(-9223372036854775807L, h(), true);
                    return;
                } else {
                    F(-9223372036854775807L, iK2, false);
                    return;
                }
            }
        }
        G(0L);
    }

    public final void J(int i, int i2, Object obj) {
        for (a aVar : this.g) {
            if (i == -1 || aVar.y == i) {
                e1 e1VarC = c(aVar);
                com.google.android.material.motion.a.q(!e1VarC.f);
                e1VarC.c = i2;
                com.google.android.material.motion.a.q(!e1VarC.f);
                e1VarC.d = obj;
                e1VarC.b();
            }
        }
        for (a aVar2 : this.h) {
            if (aVar2 != null && (i == -1 || aVar2.y == i)) {
                e1 e1VarC2 = c(aVar2);
                com.google.android.material.motion.a.q(!e1VarC2.f);
                e1VarC2.c = i2;
                com.google.android.material.motion.a.q(!e1VarC2.f);
                e1VarC2.d = obj;
                e1VarC2.b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    public final void K(androidx.media3.exoplayer.source.a aVar) {
        V();
        List listSingletonList = Collections.singletonList(aVar);
        V();
        V();
        n(this.n0);
        j();
        this.I++;
        ArrayList arrayList = this.p;
        arrayList.clear();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < listSingletonList.size(); i++) {
            a1 a1Var = new a1((androidx.media3.exoplayer.source.a) listSingletonList.get(i), this.q);
            arrayList2.add(a1Var);
            arrayList.add(i, new z(a1Var.b, a1Var.a));
        }
        androidx.media3.exoplayer.source.z0 z0Var = this.P;
        int size = arrayList2.size();
        z0Var.getClass();
        this.P = new androidx.media3.exoplayer.source.z0(new Random(z0Var.a.nextLong())).a(size);
        g1 g1Var = new g1(arrayList, this.P);
        boolean zP = g1Var.p();
        int i2 = g1Var.d;
        if (!zP && -1 >= i2) {
            throw new androidx.media3.common.s();
        }
        int iA = g1Var.a(this.H);
        c1 c1VarZ = z(this.n0, g1Var, A(g1Var, iA, -9223372036854775807L));
        int i3 = c1VarZ.e;
        if (i3 == 1) {
            i3 = 1;
        } else if (g1Var.p()) {
            i3 = 4;
        } else if (iA != -1) {
            if (iA >= i2) {
                i3 = 4;
            } else {
                i3 = 2;
            }
        }
        c1 c1VarY = y(c1VarZ, i3);
        this.l.E.b(17, new g0(arrayList2, this.P, iA, androidx.media3.common.util.j0.Q(-9223372036854775807L))).b();
        T(c1VarY, 0, (this.n0.b.a.equals(c1VarY.b.a) || this.n0.a.p()) ? false : true, 4, k(c1VarY), -1, false);
    }

    public final void L(SurfaceHolder surfaceHolder) {
        this.X = false;
        this.V = surfaceHolder;
        surfaceHolder.addCallback(this.v);
        Surface surface = this.V.getSurface();
        if (surface == null || !surface.isValid()) {
            B(0, 0);
        } else {
            Rect surfaceFrame = this.V.getSurfaceFrame();
            B(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void M(boolean z) {
        V();
        S(1, z);
    }

    public final void N(int i) {
        V();
        if (this.G != i) {
            this.G = i;
            androidx.media3.common.util.g0 g0Var = this.l.E;
            g0Var.getClass();
            androidx.media3.common.util.f0 f0VarC = androidx.media3.common.util.g0.c();
            f0VarC.a = g0Var.a.obtainMessage(11, i, 0);
            f0VarC.b();
            r rVar = new r(i, 0);
            androidx.media3.common.util.p pVar = this.m;
            pVar.c(8, rVar);
            R();
            pVar.b();
        }
    }

    public final void O(androidx.media3.common.a1 a1Var) {
        androidx.media3.common.a1 a1VarA;
        V();
        androidx.media3.exoplayer.trackselection.o oVar = this.i;
        oVar.getClass();
        androidx.media3.common.a1 a1VarT = t();
        if (this.L) {
            this.M = a1Var.w;
            com.google.common.collect.k0 k0Var = this.N.a;
            androidx.media3.common.z0 z0VarA = a1Var.a();
            p1 it = k0Var.iterator();
            while (it.hasNext()) {
                z0VarA.i(((Integer) it.next()).intValue(), true);
            }
            a1VarA = z0VarA.a();
        } else {
            a1VarA = a1Var;
        }
        if (!a1VarA.equals(oVar.h())) {
            oVar.n(a1VarA);
        }
        if (a1VarT.equals(a1Var)) {
            return;
        }
        this.m.e(19, new androidx.activity.y(a1Var, 7));
    }

    public final void P(Object obj) {
        Object obj2 = this.T;
        boolean zB = true;
        boolean z = (obj2 == null || obj2 == obj) ? false : true;
        long j = z ? this.A : -9223372036854775807L;
        k0 k0Var = this.l;
        if (!k0Var.g0 && k0Var.G.getThread().isAlive()) {
            androidx.media3.common.util.h hVar = new androidx.media3.common.util.h(k0Var.M);
            k0Var.E.b(30, new Pair(obj, hVar)).b();
            if (j != -9223372036854775807L) {
                zB = hVar.b(j);
            }
        }
        if (z) {
            Object obj3 = this.T;
            Surface surface = this.U;
            if (obj3 == surface) {
                surface.release();
                this.U = null;
            }
        }
        this.T = obj;
        if (zB) {
            return;
        }
        Q(new j(2, new androidx.compose.ui.res.e("Detaching surface timed out.", 1), 1003));
    }

    public final void Q(j jVar) {
        c1 c1Var = this.n0;
        c1 c1VarC = c1Var.c(c1Var.b);
        c1VarC.q = c1VarC.s;
        c1VarC.r = 0L;
        c1 c1VarY = y(c1VarC, 1);
        if (jVar != null) {
            c1VarY = c1VarY.f(jVar);
        }
        this.I++;
        this.l.E.a(6).b();
        T(c1VarY, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void R() {
        int iK;
        int iE;
        androidx.media3.common.m0 m0Var = this.R;
        String str = androidx.media3.common.util.j0.a;
        c0 c0Var = this.f;
        boolean zX = c0Var.x();
        androidx.media3.common.u0 u0Var = c0Var.a;
        androidx.media3.common.v0 v0VarL = c0Var.l();
        boolean z = !v0VarL.p() && v0VarL.m(c0Var.h(), u0Var, 0L).h;
        androidx.media3.common.v0 v0VarL2 = c0Var.l();
        if (v0VarL2.p()) {
            iK = -1;
        } else {
            int iH = c0Var.h();
            c0Var.V();
            int i = c0Var.G;
            if (i == 1) {
                i = 0;
            }
            c0Var.V();
            iK = v0VarL2.k(iH, i, c0Var.H);
        }
        boolean z2 = iK != -1;
        androidx.media3.common.v0 v0VarL3 = c0Var.l();
        if (v0VarL3.p()) {
            iE = -1;
        } else {
            int iH2 = c0Var.h();
            c0Var.V();
            int i2 = c0Var.G;
            if (i2 == 1) {
                i2 = 0;
            }
            c0Var.V();
            iE = v0VarL3.e(iH2, i2, c0Var.H);
        }
        boolean z3 = iE != -1;
        boolean zV = c0Var.v();
        androidx.media3.common.v0 v0VarL4 = c0Var.l();
        boolean z4 = !v0VarL4.p() && v0VarL4.m(c0Var.h(), u0Var, 0L).i;
        boolean zP = c0Var.l().p();
        com.google.firebase.platforminfo.c cVar = new com.google.firebase.platforminfo.c(26);
        z1 z1Var = (z1) cVar.e;
        SparseBooleanArray sparseBooleanArray = this.c.a.a;
        z1Var.getClass();
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            com.google.android.material.motion.a.j(i3, sparseBooleanArray.size());
            z1Var.b(sparseBooleanArray.keyAt(i3));
        }
        boolean z5 = !zX;
        cVar.g(4, z5);
        cVar.g(5, z && !zX);
        cVar.g(6, z2 && !zX);
        cVar.g(7, !zP && (z2 || !zV || z) && !zX);
        cVar.g(8, z3 && !zX);
        cVar.g(9, !zP && (z3 || (zV && z4)) && !zX);
        cVar.g(10, z5);
        cVar.g(11, z && !zX);
        cVar.g(12, z && !zX);
        androidx.media3.common.m0 m0Var2 = new androidx.media3.common.m0(z1Var.c());
        this.R = m0Var2;
        if (m0Var2.equals(m0Var)) {
            return;
        }
        this.m.c(13, new q(this));
    }

    public final void S(int i, boolean z) {
        int i2;
        if (this.L) {
            i2 = 4;
        } else {
            i2 = (this.n0.n != 1 || z) ? 0 : 1;
        }
        c1 c1VarA = this.n0;
        if (c1VarA.l == z && c1VarA.n == i2 && c1VarA.m == i) {
            return;
        }
        this.I++;
        if (c1VarA.p) {
            c1VarA = c1VarA.a();
        }
        c1 c1VarE = c1VarA.e(i, i2, z);
        int i3 = i | (i2 << 4);
        androidx.media3.common.util.g0 g0Var = this.l.E;
        g0Var.getClass();
        androidx.media3.common.util.f0 f0VarC = androidx.media3.common.util.g0.c();
        f0VarC.a = g0Var.a.obtainMessage(1, z ? 1 : 0, i3);
        f0VarC.b();
        T(c1VarE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void T(final c1 c1Var, int i, boolean z, int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        androidx.media3.common.c0 c0Var;
        int i5;
        int i6;
        Object obj;
        androidx.media3.common.c0 c0Var2;
        Object obj2;
        long j2;
        long j3;
        long jS;
        long jS2;
        Object obj3;
        androidx.media3.common.c0 c0Var3;
        Object obj4;
        c1 c1Var2 = this.n0;
        this.n0 = c1Var;
        boolean zEquals = c1Var2.a.equals(c1Var.a);
        androidx.media3.common.u0 u0Var = this.a;
        androidx.media3.common.t0 t0Var = this.o;
        androidx.media3.common.v0 v0Var = c1Var2.a;
        androidx.media3.exoplayer.source.v vVar = c1Var2.b;
        androidx.media3.common.v0 v0Var2 = c1Var.a;
        androidx.media3.exoplayer.source.v vVar2 = c1Var.b;
        if (v0Var2.p() && v0Var.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (v0Var2.p() != v0Var.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (!v0Var.m(v0Var.g(vVar.a, t0Var).c, u0Var, 0L).a.equals(v0Var2.m(v0Var2.g(vVar2.a, t0Var).c, u0Var, 0L).a)) {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    org.mozilla.javascript.c.a();
                    return;
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        } else if (z && i2 == 0 && vVar.d < vVar2.d) {
            pair = new Pair(Boolean.TRUE, 0);
        } else {
            pair = (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            c0Var = c1Var.a.p() ? null : c1Var.a.m(c1Var.a.g(c1Var.b.a, this.o).c, this.a, 0L).c;
            this.m0 = androidx.media3.common.f0.B;
        } else {
            c0Var = null;
        }
        if (zBooleanValue || !c1Var2.j.equals(c1Var.j)) {
            androidx.media3.common.e0 e0VarA = this.m0.a();
            List list = c1Var.j;
            for (int i7 = 0; i7 < list.size(); i7++) {
                androidx.media3.common.h0 h0Var = (androidx.media3.common.h0) list.get(i7);
                int i8 = 0;
                while (true) {
                    androidx.media3.common.g0[] g0VarArr = h0Var.a;
                    if (i8 < g0VarArr.length) {
                        g0VarArr[i8].b(e0VarA);
                        i8++;
                    }
                }
            }
            this.m0 = new androidx.media3.common.f0(e0VarA);
        }
        androidx.media3.common.f0 f0VarA = a();
        boolean zEquals2 = f0VarA.equals(this.S);
        this.S = f0VarA;
        boolean z3 = c1Var2.l != c1Var.l;
        boolean z4 = c1Var2.e != c1Var.e;
        if (z4 || z3) {
            U();
        }
        boolean z5 = c1Var2.g != c1Var.g;
        if (!zEquals) {
            this.m.c(0, new s(c1Var, i, 0));
        }
        if (z) {
            androidx.media3.common.t0 t0Var2 = new androidx.media3.common.t0();
            if (c1Var2.a.p()) {
                i5 = i3;
                i6 = i5;
                obj = null;
                c0Var2 = null;
                obj2 = null;
            } else {
                Object obj5 = c1Var2.b.a;
                c1Var2.a.g(obj5, t0Var2);
                int i9 = t0Var2.c;
                int iB = c1Var2.a.b(obj5);
                obj = c1Var2.a.m(i9, this.a, 0L).a;
                c0Var2 = this.a.c;
                obj2 = obj5;
                i5 = i9;
                i6 = iB;
            }
            androidx.media3.exoplayer.source.v vVar3 = c1Var2.b;
            if (i2 == 0) {
                boolean zB = vVar3.b();
                androidx.media3.exoplayer.source.v vVar4 = c1Var2.b;
                if (zB) {
                    jS = t0Var2.a(vVar4.b, vVar4.c);
                    jS2 = s(c1Var2);
                } else {
                    if (vVar4.e != -1) {
                        jS = s(this.n0);
                    } else {
                        j2 = t0Var2.e;
                        j3 = t0Var2.d;
                        jS = j2 + j3;
                    }
                    jS2 = jS;
                }
            } else if (vVar3.b()) {
                jS = c1Var2.s;
                jS2 = s(c1Var2);
            } else {
                j2 = t0Var2.e;
                j3 = c1Var2.s;
                jS = j2 + j3;
                jS2 = jS;
            }
            long jD0 = androidx.media3.common.util.j0.d0(jS);
            long jD1 = androidx.media3.common.util.j0.d0(jS2);
            androidx.media3.exoplayer.source.v vVar5 = c1Var2.b;
            androidx.media3.common.p0 p0Var = new androidx.media3.common.p0(obj, i5, c0Var2, obj2, i6, jD0, jD1, vVar5.b, vVar5.c);
            androidx.media3.common.u0 u0Var2 = this.a;
            int iH = h();
            int i10 = i();
            if (this.n0.a.p()) {
                obj3 = null;
                c0Var3 = null;
                obj4 = null;
            } else {
                c1 c1Var3 = this.n0;
                Object obj6 = c1Var3.b.a;
                c1Var3.a.g(obj6, this.o);
                i10 = this.n0.a.b(obj6);
                Object obj7 = this.n0.a.m(iH, u0Var2, 0L).a;
                c0Var3 = u0Var2.c;
                obj4 = obj6;
                obj3 = obj7;
            }
            int i11 = i10;
            long jD2 = androidx.media3.common.util.j0.d0(j);
            long jD3 = this.n0.b.b() ? androidx.media3.common.util.j0.d0(s(this.n0)) : jD2;
            androidx.media3.exoplayer.source.v vVar6 = this.n0.b;
            this.m.c(11, new t(i2, p0Var, new androidx.media3.common.p0(obj3, iH, c0Var3, obj4, i11, jD2, jD3, vVar6.b, vVar6.c)));
        } else {
            zBooleanValue = zBooleanValue;
            zEquals2 = zEquals2;
            z4 = z4;
        }
        if (zBooleanValue) {
            this.m.c(1, new s(c0Var, iIntValue, 1));
        }
        if (c1Var2.f != c1Var.f) {
            final int i12 = 0;
            this.m.c(10, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj8) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj8;
                    switch (i12) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
            if (c1Var.f != null) {
                final int i13 = 1;
                this.m.c(10, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                    @Override // androidx.media3.common.util.m
                    public final void invoke(Object obj8) {
                        androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj8;
                        switch (i13) {
                            case 0:
                                o0Var.A(c1Var.f);
                                break;
                            case 1:
                                o0Var.B(c1Var.f);
                                break;
                            case 2:
                                o0Var.v(c1Var.i.d);
                                break;
                            case 3:
                                c1 c1Var4 = c1Var;
                                boolean z6 = c1Var4.g;
                                o0Var.getClass();
                                o0Var.e(c1Var4.g);
                                break;
                            case 4:
                                c1 c1Var5 = c1Var;
                                o0Var.y(c1Var5.e, c1Var5.l);
                                break;
                            case 5:
                                o0Var.i(c1Var.e);
                                break;
                            case 6:
                                c1 c1Var6 = c1Var;
                                o0Var.g(c1Var6.m, c1Var6.l);
                                break;
                            case 7:
                                o0Var.b(c1Var.n);
                                break;
                            case 8:
                                o0Var.G(c1Var.m());
                                break;
                            default:
                                o0Var.m(c1Var.o);
                                break;
                        }
                    }
                });
            }
        }
        androidx.media3.exoplayer.trackselection.t tVar = c1Var2.i;
        androidx.media3.exoplayer.trackselection.t tVar2 = c1Var.i;
        if (tVar != tVar2) {
            androidx.media3.exoplayer.trackselection.o oVar = this.i;
            Object obj8 = tVar2.e;
            oVar.getClass();
            final int i14 = 2;
            this.m.c(2, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i14) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.m.c(14, new androidx.activity.y(this.S, 6));
        }
        if (z5) {
            final int i15 = 3;
            this.m.c(3, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i15) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (z4 || z3) {
            final int i16 = 4;
            this.m.c(-1, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i16) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (z4) {
            final int i17 = 5;
            this.m.c(4, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i17) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (z3 || c1Var2.m != c1Var.m) {
            final int i18 = 6;
            this.m.c(5, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i18) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (c1Var2.n != c1Var.n) {
            final int i19 = 7;
            this.m.c(6, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i19) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (c1Var2.m() != c1Var.m()) {
            final int i20 = 8;
            this.m.c(7, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i20) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        if (!c1Var2.o.equals(c1Var.o)) {
            final int i21 = 9;
            this.m.c(12, new androidx.media3.common.util.m() { // from class: androidx.media3.exoplayer.m
                @Override // androidx.media3.common.util.m
                public final void invoke(Object obj9) {
                    androidx.media3.common.o0 o0Var = (androidx.media3.common.o0) obj9;
                    switch (i21) {
                        case 0:
                            o0Var.A(c1Var.f);
                            break;
                        case 1:
                            o0Var.B(c1Var.f);
                            break;
                        case 2:
                            o0Var.v(c1Var.i.d);
                            break;
                        case 3:
                            c1 c1Var4 = c1Var;
                            boolean z6 = c1Var4.g;
                            o0Var.getClass();
                            o0Var.e(c1Var4.g);
                            break;
                        case 4:
                            c1 c1Var5 = c1Var;
                            o0Var.y(c1Var5.e, c1Var5.l);
                            break;
                        case 5:
                            o0Var.i(c1Var.e);
                            break;
                        case 6:
                            c1 c1Var6 = c1Var;
                            o0Var.g(c1Var6.m, c1Var6.l);
                            break;
                        case 7:
                            o0Var.b(c1Var.n);
                            break;
                        case 8:
                            o0Var.G(c1Var.m());
                            break;
                        default:
                            o0Var.m(c1Var.o);
                            break;
                    }
                }
            });
        }
        R();
        this.m.b();
        if (c1Var2.p != c1Var.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((x) it.next()).e.U();
            }
        }
    }

    public final void U() {
        int iQ = q();
        androidx.media3.common.util.n0 n0Var = this.z;
        androidx.media3.common.util.m0 m0Var = this.y;
        boolean z = false;
        if (iQ != 1) {
            if (iQ == 2 || iQ == 3) {
                V();
                boolean z2 = this.n0.p;
                if (p() && !z2) {
                    z = true;
                }
                m0Var.b(z);
                n0Var.b(p());
                return;
            }
            if (iQ != 4) {
                org.mozilla.javascript.c.a();
                return;
            }
        }
        m0Var.b(false);
        n0Var.b(false);
    }

    public final void V() {
        this.d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            String str = androidx.media3.common.util.j0.a;
            Locale locale = Locale.US;
            String strJ = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.e0) {
                net.luminis.tls.engine.impl.c.r(strJ);
            } else {
                androidx.media3.common.util.c.u("ExoPlayerImpl", strJ, this.f0 ? null : new IllegalStateException());
                this.f0 = true;
            }
        }
    }

    public final androidx.media3.common.f0 a() {
        androidx.media3.common.v0 v0VarL = l();
        if (v0VarL.p()) {
            return this.m0;
        }
        androidx.media3.common.c0 c0Var = v0VarL.m(h(), this.a, 0L).c;
        androidx.media3.common.e0 e0VarA = this.m0.a();
        androidx.media3.common.f0 f0Var = c0Var.d;
        if (f0Var != null) {
            com.google.common.collect.h0 h0Var = f0Var.A;
            byte[] bArr = f0Var.f;
            CharSequence charSequence = f0Var.a;
            if (charSequence != null) {
                e0VarA.a = charSequence;
            }
            CharSequence charSequence2 = f0Var.b;
            if (charSequence2 != null) {
                e0VarA.b = charSequence2;
            }
            CharSequence charSequence3 = f0Var.c;
            if (charSequence3 != null) {
                e0VarA.c = charSequence3;
            }
            CharSequence charSequence4 = f0Var.d;
            if (charSequence4 != null) {
                e0VarA.d = charSequence4;
            }
            CharSequence charSequence5 = f0Var.e;
            if (charSequence5 != null) {
                e0VarA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = f0Var.g;
                e0VarA.f = bArr == null ? null : (byte[]) bArr.clone();
                e0VarA.g = num;
                androidx.media3.common.f0 f0Var2 = androidx.media3.common.f0.B;
            }
            Integer num2 = f0Var.h;
            if (num2 != null) {
                e0VarA.h = num2;
            }
            Integer num3 = f0Var.i;
            if (num3 != null) {
                e0VarA.i = num3;
            }
            Integer num4 = f0Var.j;
            if (num4 != null) {
                e0VarA.j = num4;
            }
            Boolean bool = f0Var.k;
            if (bool != null) {
                e0VarA.k = bool;
            }
            Integer num5 = f0Var.l;
            if (num5 != null) {
                e0VarA.l = num5;
            }
            Integer num6 = f0Var.m;
            if (num6 != null) {
                e0VarA.l = num6;
            }
            Integer num7 = f0Var.n;
            if (num7 != null) {
                e0VarA.m = num7;
            }
            Integer num8 = f0Var.o;
            if (num8 != null) {
                e0VarA.n = num8;
            }
            Integer num9 = f0Var.p;
            if (num9 != null) {
                e0VarA.o = num9;
            }
            Integer num10 = f0Var.q;
            if (num10 != null) {
                e0VarA.p = num10;
            }
            Integer num11 = f0Var.r;
            if (num11 != null) {
                e0VarA.q = num11;
            }
            CharSequence charSequence6 = f0Var.s;
            if (charSequence6 != null) {
                e0VarA.r = charSequence6;
            }
            CharSequence charSequence7 = f0Var.t;
            if (charSequence7 != null) {
                e0VarA.s = charSequence7;
            }
            CharSequence charSequence8 = f0Var.u;
            if (charSequence8 != null) {
                e0VarA.t = charSequence8;
            }
            Integer num12 = f0Var.v;
            if (num12 != null) {
                e0VarA.u = num12;
            }
            Integer num13 = f0Var.w;
            if (num13 != null) {
                e0VarA.v = num13;
            }
            CharSequence charSequence9 = f0Var.x;
            if (charSequence9 != null) {
                e0VarA.w = charSequence9;
            }
            CharSequence charSequence10 = f0Var.y;
            if (charSequence10 != null) {
                e0VarA.x = charSequence10;
            }
            Integer num14 = f0Var.z;
            if (num14 != null) {
                e0VarA.y = num14;
            }
            if (!h0Var.isEmpty()) {
                e0VarA.z = com.google.common.collect.h0.o(h0Var);
            }
        }
        return new androidx.media3.common.f0(e0VarA);
    }

    public final void b() {
        V();
        E();
        P(null);
        B(0, 0);
    }

    public final e1 c(d1 d1Var) {
        int iN = n(this.n0);
        androidx.media3.common.v0 v0Var = this.n0.a;
        if (iN == -1) {
            iN = 0;
        }
        k0 k0Var = this.l;
        return new e1(k0Var, d1Var, v0Var, iN, k0Var.G);
    }

    public final long d() {
        V();
        if (this.n0.a.p()) {
            return this.p0;
        }
        c1 c1Var = this.n0;
        long j = 0;
        if (c1Var.k.d != c1Var.b.d) {
            return androidx.media3.common.util.j0.d0(c1Var.a.m(h(), this.a, 0L).m);
        }
        long j2 = c1Var.q;
        if (this.n0.k.b()) {
            c1 c1Var2 = this.n0;
            c1Var2.a.g(c1Var2.k.a, this.o).d(this.n0.k.b);
        } else {
            j = j2;
        }
        c1 c1Var3 = this.n0;
        androidx.media3.common.v0 v0Var = c1Var3.a;
        Object obj = c1Var3.k.a;
        androidx.media3.common.t0 t0Var = this.o;
        v0Var.g(obj, t0Var);
        return androidx.media3.common.util.j0.d0(j + t0Var.e);
    }

    public final long e(c1 c1Var) {
        androidx.media3.exoplayer.source.v vVar = c1Var.b;
        long j = c1Var.c;
        androidx.media3.common.v0 v0Var = c1Var.a;
        if (!vVar.b()) {
            return androidx.media3.common.util.j0.d0(k(c1Var));
        }
        Object obj = c1Var.b.a;
        androidx.media3.common.t0 t0Var = this.o;
        v0Var.g(obj, t0Var);
        if (j == -9223372036854775807L) {
            return androidx.media3.common.util.j0.d0(v0Var.m(n(c1Var), this.a, 0L).l);
        }
        return androidx.media3.common.util.j0.d0(j) + androidx.media3.common.util.j0.d0(t0Var.e);
    }

    public final int f() {
        V();
        if (x()) {
            return this.n0.b.b;
        }
        return -1;
    }

    public final int g() {
        V();
        if (x()) {
            return this.n0.b.c;
        }
        return -1;
    }

    public final int h() {
        V();
        int iN = n(this.n0);
        if (iN == -1) {
            return 0;
        }
        return iN;
    }

    public final int i() {
        V();
        if (!this.n0.a.p()) {
            c1 c1Var = this.n0;
            return c1Var.a.b(c1Var.b.a);
        }
        int i = this.o0;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        V();
        return this.L;
    }

    public final long j() {
        V();
        return androidx.media3.common.util.j0.d0(k(this.n0));
    }

    public final long k(c1 c1Var) {
        if (c1Var.a.p()) {
            return androidx.media3.common.util.j0.Q(this.p0);
        }
        long jL = c1Var.p ? c1Var.l() : c1Var.s;
        if (c1Var.b.b()) {
            return jL;
        }
        androidx.media3.common.v0 v0Var = c1Var.a;
        Object obj = c1Var.b.a;
        androidx.media3.common.t0 t0Var = this.o;
        v0Var.g(obj, t0Var);
        return jL + t0Var.e;
    }

    public final androidx.media3.common.v0 l() {
        V();
        return this.n0.a;
    }

    public final androidx.media3.common.c1 m() {
        V();
        return this.n0.i.d;
    }

    public final int n(c1 c1Var) {
        return c1Var.a.p() ? this.o0 : c1Var.a.g(c1Var.b.a, this.o).c;
    }

    public final long o() {
        V();
        if (!x()) {
            androidx.media3.common.v0 v0VarL = l();
            if (v0VarL.p()) {
                return -9223372036854775807L;
            }
            return androidx.media3.common.util.j0.d0(v0VarL.m(h(), this.a, 0L).m);
        }
        c1 c1Var = this.n0;
        androidx.media3.exoplayer.source.v vVar = c1Var.b;
        androidx.media3.common.v0 v0Var = c1Var.a;
        Object obj = vVar.a;
        androidx.media3.common.t0 t0Var = this.o;
        v0Var.g(obj, t0Var);
        return androidx.media3.common.util.j0.d0(t0Var.a(vVar.b, vVar.c));
    }

    public final boolean p() {
        V();
        return this.n0.l;
    }

    public final int q() {
        V();
        return this.n0.e;
    }

    public final int r() {
        V();
        return this.n0.n;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        V();
        J(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z) {
        androidx.media3.common.a1 a1VarA;
        V();
        if (z == this.L) {
            return;
        }
        this.L = z;
        j1 j1Var = this.N;
        if (!j1Var.a.isEmpty()) {
            androidx.media3.exoplayer.trackselection.o oVar = this.i;
            oVar.getClass();
            androidx.media3.exoplayer.trackselection.j jVarH = oVar.h();
            if (z) {
                this.M = jVarH.w;
                com.google.common.collect.k0 k0Var = j1Var.a;
                androidx.media3.common.z0 z0VarA = jVarH.a();
                p1 it = k0Var.iterator();
                while (it.hasNext()) {
                    z0VarA.i(((Integer) it.next()).intValue(), true);
                }
                a1VarA = z0VarA.a();
            } else {
                jVarH.getClass();
                androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVarH);
                iVar.j(this.M);
                androidx.media3.exoplayer.trackselection.j jVar = new androidx.media3.exoplayer.trackselection.j(iVar);
                this.M = null;
                a1VarA = jVar;
            }
            if (!a1VarA.equals(jVarH)) {
                oVar.n(a1VarA);
            }
        }
        this.l.E.b(36, Boolean.valueOf(z)).b();
        c1 c1Var = this.n0;
        S(c1Var.m, c1Var.l);
    }

    public final androidx.media3.common.a1 t() {
        V();
        androidx.media3.exoplayer.trackselection.j jVarH = this.i.h();
        if (!this.L) {
            return jVarH;
        }
        jVarH.getClass();
        androidx.media3.exoplayer.trackselection.i iVar = new androidx.media3.exoplayer.trackselection.i(jVarH);
        iVar.j(this.M);
        return new androidx.media3.exoplayer.trackselection.j(iVar);
    }

    public final boolean u(int i) {
        V();
        return this.R.a.a.get(i);
    }

    public final boolean v() {
        androidx.media3.common.v0 v0VarL = l();
        return !v0VarL.p() && v0VarL.m(h(), this.a, 0L).a();
    }

    public final boolean w() {
        return q() == 3 && p() && r() == 0;
    }

    public final boolean x() {
        V();
        return this.n0.b.b();
    }

    public final c1 z(c1 c1Var, androidx.media3.common.v0 v0Var, Pair pair) {
        List list;
        com.google.android.material.motion.a.f(v0Var.p() || pair != null);
        androidx.media3.common.v0 v0Var2 = c1Var.a;
        long jE = e(c1Var);
        c1 c1VarJ = c1Var.j(v0Var);
        if (v0Var.p()) {
            androidx.media3.exoplayer.source.v vVar = c1.u;
            long jQ = androidx.media3.common.util.j0.Q(this.p0);
            c1 c1VarC = c1VarJ.d(vVar, jQ, jQ, jQ, 0L, androidx.media3.exoplayer.source.i1.d, this.b, com.google.common.collect.a1.B).c(vVar);
            c1VarC.q = c1VarC.s;
            return c1VarC;
        }
        Object obj = c1VarJ.b.a;
        boolean zEquals = obj.equals(pair.first);
        androidx.media3.exoplayer.source.v vVar2 = !zEquals ? new androidx.media3.exoplayer.source.v(pair.first) : c1VarJ.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jQ2 = androidx.media3.common.util.j0.Q(jE);
        if (!v0Var2.p()) {
            jQ2 -= v0Var2.g(obj, this.o).e;
            if (zEquals && jQ2 - jLongValue == 1 && jQ2 == v0Var2.g(obj, this.o).d) {
                jQ2--;
            }
        }
        if (!zEquals || jLongValue < jQ2) {
            androidx.media3.exoplayer.source.v vVar3 = vVar2;
            com.google.android.material.motion.a.q(!vVar3.b());
            androidx.media3.exoplayer.source.i1 i1Var = !zEquals ? androidx.media3.exoplayer.source.i1.d : c1VarJ.h;
            androidx.media3.exoplayer.trackselection.t tVar = !zEquals ? this.b : c1VarJ.i;
            if (zEquals) {
                list = c1VarJ.j;
            } else {
                com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
                list = com.google.common.collect.a1.B;
            }
            c1 c1VarC2 = c1VarJ.d(vVar3, jLongValue, jLongValue, jLongValue, 0L, i1Var, tVar, list).c(vVar3);
            c1VarC2.q = jLongValue;
            return c1VarC2;
        }
        if (jLongValue != jQ2) {
            androidx.media3.exoplayer.source.v vVar4 = vVar2;
            com.google.android.material.motion.a.q(!vVar4.b());
            long jMax = Math.max(0L, c1VarJ.r - (jLongValue - jQ2));
            long j = c1VarJ.q;
            if (c1VarJ.k.equals(c1VarJ.b)) {
                j = jLongValue + jMax;
            }
            c1 c1VarD = c1VarJ.d(vVar4, jLongValue, jLongValue, jLongValue, jMax, c1VarJ.h, c1VarJ.i, c1VarJ.j);
            c1VarD.q = j;
            return c1VarD;
        }
        int iB = v0Var.b(c1VarJ.k.a);
        if (iB != -1 && v0Var.f(iB, this.o, false).c == v0Var.g(vVar2.a, this.o).c) {
            return c1VarJ;
        }
        v0Var.g(vVar2.a, this.o);
        boolean zB = vVar2.b();
        androidx.media3.common.t0 t0Var = this.o;
        long jA = zB ? t0Var.a(vVar2.b, vVar2.c) : t0Var.d;
        androidx.media3.exoplayer.source.v vVar5 = vVar2;
        c1 c1VarC3 = c1VarJ.d(vVar5, c1VarJ.s, c1VarJ.s, c1VarJ.d, jA - c1VarJ.s, c1VarJ.h, c1VarJ.i, c1VarJ.j).c(vVar5);
        c1VarC3.q = jA;
        return c1VarC3;
    }
}
