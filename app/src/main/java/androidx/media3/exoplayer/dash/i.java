package androidx.media3.exoplayer.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import androidx.media3.common.c0;
import androidx.media3.common.d0;
import androidx.media3.common.util.j0;
import androidx.media3.common.w;
import androidx.media3.common.x;
import androidx.media3.common.y;
import androidx.media3.exoplayer.source.u;
import androidx.media3.exoplayer.source.v;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends androidx.media3.exoplayer.source.a {
    public androidx.media3.exoplayer.upstream.n A;
    public androidx.media3.exoplayer.upstream.f B;
    public IOException C;
    public Handler D;
    public Uri E;
    public final Uri F;
    public androidx.media3.exoplayer.dash.manifest.c G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public int L;
    public long M;
    public int N;
    public c0 O;
    public x P;
    public final boolean h;
    public final androidx.media3.datasource.g i;
    public final androidx.appcompat.widget.x j;
    public final com.google.android.material.shape.g k;
    public final androidx.media3.exoplayer.drm.f l;
    public final t2 m;
    public final com.google.firebase.messaging.o n;
    public final long o;
    public final long p;
    public final androidx.media3.exoplayer.drm.d q;
    public final androidx.media3.exoplayer.upstream.p r;
    public final d s;
    public final Object t;
    public final SparseArray u;
    public final c v;
    public final c w;
    public final f x;
    public final androidx.media3.exoplayer.upstream.o y;
    public androidx.media3.datasource.h z;

    static {
        d0.a("media3.exoplayer.dash");
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.media3.exoplayer.dash.c] */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.media3.exoplayer.dash.c] */
    public i(c0 c0Var, androidx.media3.datasource.g gVar, androidx.media3.exoplayer.upstream.p pVar, androidx.appcompat.widget.x xVar, com.google.android.material.shape.g gVar2, androidx.media3.exoplayer.drm.f fVar, t2 t2Var, long j, long j2) {
        this.O = c0Var;
        this.P = c0Var.c;
        y yVar = c0Var.b;
        yVar.getClass();
        Uri uri = yVar.a;
        this.E = uri;
        this.F = uri;
        this.G = null;
        this.i = gVar;
        this.r = pVar;
        this.j = xVar;
        this.l = fVar;
        this.m = t2Var;
        this.o = j;
        this.p = j2;
        this.k = gVar2;
        this.n = new com.google.firebase.messaging.o(12);
        this.h = false;
        this.q = a(null);
        this.t = new Object();
        this.u = new SparseArray();
        this.x = new f(this);
        this.M = -9223372036854775807L;
        this.K = -9223372036854775807L;
        this.s = new d(this);
        this.y = new f(this);
        final int i = 0;
        this.v = new Runnable(this) { // from class: androidx.media3.exoplayer.dash.c
            public final /* synthetic */ i y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.y.z();
                        break;
                    default:
                        i iVar = this.y;
                        try {
                            iVar.x(false);
                        } catch (Exception e) {
                            iVar.C = new IOException(e);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.w = new Runnable(this) { // from class: androidx.media3.exoplayer.dash.c
            public final /* synthetic */ i y;

            {
                this.y = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.y.z();
                        break;
                    default:
                        i iVar = this.y;
                        try {
                            iVar.x(false);
                        } catch (Exception e) {
                            iVar.C = new IOException(e);
                        }
                        break;
                }
            }
        };
    }

    public static boolean t(androidx.media3.exoplayer.dash.manifest.h hVar) {
        List list = hVar.c;
        for (int i = 0; i < list.size(); i++) {
            int i2 = ((androidx.media3.exoplayer.dash.manifest.a) list.get(i)).b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final u b(v vVar, c2 c2Var, long j) {
        int iIntValue = ((Integer) vVar.a).intValue() - this.N;
        androidx.media3.exoplayer.drm.d dVarA = a(vVar);
        androidx.media3.exoplayer.drm.d dVar = new androidx.media3.exoplayer.drm.d(this.d.c, 0, vVar);
        int i = this.N + iIntValue;
        androidx.media3.exoplayer.dash.manifest.c cVar = this.G;
        androidx.media3.exoplayer.upstream.f fVar = this.B;
        long j2 = this.K;
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        b bVar = new b(i, cVar, this.n, iIntValue, this.j, fVar, this.l, dVar, this.m, dVarA, j2, this.y, c2Var, this.k, this.x, kVar);
        this.u.put(i, bVar);
        return bVar;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized c0 h() {
        return this.O;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void j() {
        this.y.b();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.B = fVar;
        Looper looperMyLooper = Looper.myLooper();
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        androidx.media3.exoplayer.drm.f fVar2 = this.l;
        fVar2.d(looperMyLooper, kVar);
        fVar2.b();
        if (this.h) {
            x(false);
            return;
        }
        this.z = this.i.f();
        this.A = new androidx.media3.exoplayer.upstream.n("DashMediaSource");
        this.D = j0.q(null);
        z();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(u uVar) {
        b bVar = (b) uVar;
        q qVar = bVar.J;
        qVar.F = true;
        qVar.A.removeCallbacksAndMessages(null);
        for (androidx.media3.exoplayer.source.chunk.h hVar : bVar.O) {
            hVar.D(bVar);
        }
        bVar.N = null;
        this.u.remove(bVar.e);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p() {
        this.H = false;
        this.z = null;
        androidx.media3.exoplayer.upstream.n nVar = this.A;
        if (nVar != null) {
            nVar.e(null);
            this.A = null;
        }
        x xVar = h().c;
        synchronized (this) {
            this.P = xVar;
        }
        this.I = 0L;
        this.J = 0L;
        this.E = this.F;
        this.C = null;
        Handler handler = this.D;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.D = null;
        }
        this.K = -9223372036854775807L;
        this.L = 0;
        this.M = -9223372036854775807L;
        this.u.clear();
        com.google.firebase.messaging.o oVar = this.n;
        ((HashMap) oVar.y).clear();
        ((HashMap) oVar.z).clear();
        ((HashMap) oVar.A).clear();
        this.l.c();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized void s(c0 c0Var) {
        this.O = c0Var;
        this.P = c0Var.c;
    }

    public final void u() {
        boolean z;
        androidx.media3.exoplayer.upstream.n nVar = this.A;
        d dVar = new d(this);
        synchronized (androidx.media3.exoplayer.util.b.b) {
            z = androidx.media3.exoplayer.util.b.c;
        }
        if (z) {
            dVar.a();
            return;
        }
        if (nVar == null) {
            nVar = new androidx.media3.exoplayer.upstream.n("SntpClient");
        }
        nVar.f(new com.google.firebase.heartbeatinfo.e(), new h(dVar, 1), 1);
    }

    public final void v(androidx.media3.exoplayer.upstream.q qVar, long j, long j2) {
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        androidx.media3.datasource.y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        this.m.getClass();
        this.q.c(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void w(IOException iOException) {
        androidx.media3.common.util.c.g("DashMediaSource", "Failed to resolve time offset.", iOException);
        this.K = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        x(true);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x028b  */
    /* JADX WARN: Code duplicated, block: B:133:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:166:0x033d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0344  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:213:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:236:0x0442  */
    /* JADX WARN: Code duplicated, block: B:238:0x044b  */
    /* JADX WARN: Code duplicated, block: B:243:0x048b  */
    /* JADX WARN: Code duplicated, block: B:247:0x0494  */
    /* JADX WARN: Code duplicated, block: B:249:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:250:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:252:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:266:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:267:0x04f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:268:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:270:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:272:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:274:0x0502  */
    /* JADX WARN: Code duplicated, block: B:279:0x03d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:321:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:325:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:329:? A[RETURN, SYNTHETIC] */
    public final void x(boolean z) {
        androidx.media3.exoplayer.dash.manifest.h hVar;
        long j;
        long j2;
        boolean z2;
        long jMax;
        boolean z3;
        long j3;
        long j4;
        long j5;
        x xVar;
        androidx.media3.exoplayer.dash.manifest.c cVar;
        long j6;
        List list;
        long jQ;
        long jD;
        long jQ2;
        long jQ3;
        long jQ4;
        int i;
        List list2;
        int i2;
        j jVarC;
        long jP;
        long jMin;
        x xVar2;
        long j7;
        float f;
        x xVar3;
        long jQ5;
        long jMin2;
        SparseArray sparseArray;
        int i3;
        boolean z4;
        SparseArray sparseArray2;
        androidx.media3.exoplayer.source.chunk.h[] hVarArr;
        c cVar2 = this.w;
        long j8 = this.p;
        SparseArray sparseArray3 = this.u;
        boolean z5 = false;
        int i4 = 0;
        while (i4 < sparseArray3.size()) {
            int iKeyAt = sparseArray3.keyAt(i4);
            if (iKeyAt >= this.N) {
                b bVar = (b) sparseArray3.valueAt(i4);
                androidx.media3.exoplayer.dash.manifest.c cVar3 = this.G;
                int i5 = iKeyAt - this.N;
                bVar.R = cVar3;
                bVar.S = i5;
                q qVar = bVar.J;
                qVar.E = z5;
                qVar.C = cVar3;
                Iterator it = qVar.B.entrySet().iterator();
                while (it.hasNext()) {
                    int i6 = i4;
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < qVar.C.h) {
                        it.remove();
                    }
                    i4 = i6;
                }
                i3 = i4;
                androidx.media3.exoplayer.source.chunk.h[] hVarArr2 = bVar.O;
                if (hVarArr2 != null) {
                    int length = hVarArr2.length;
                    int i7 = 0;
                    while (i7 < length) {
                        m mVar = hVarArr2[i7].B;
                        k[] kVarArr = mVar.i;
                        try {
                            mVar.k = cVar3;
                            mVar.l = i5;
                            long jD2 = cVar3.d(i5);
                            try {
                                ArrayList arrayListA = mVar.a();
                                sparseArray2 = sparseArray3;
                                hVarArr = hVarArr2;
                                int i8 = 0;
                                while (i8 < kVarArr.length) {
                                    try {
                                        k[] kVarArr2 = kVarArr;
                                        kVarArr2[i8] = kVarArr2[i8].a(jD2, (androidx.media3.exoplayer.dash.manifest.m) arrayListA.get(mVar.j.i(i8)));
                                        i8++;
                                        kVarArr = kVarArr2;
                                    } catch (androidx.media3.exoplayer.source.b e) {
                                        e = e;
                                        mVar.m = e;
                                    }
                                }
                            } catch (androidx.media3.exoplayer.source.b e2) {
                                e = e2;
                                sparseArray2 = sparseArray3;
                                hVarArr = hVarArr2;
                            }
                        } catch (androidx.media3.exoplayer.source.b e3) {
                            e = e3;
                            sparseArray2 = sparseArray3;
                            hVarArr = hVarArr2;
                        }
                        i7++;
                        sparseArray3 = sparseArray2;
                        hVarArr2 = hVarArr;
                    }
                    sparseArray = sparseArray3;
                    z4 = true;
                    bVar.N.o(bVar);
                } else {
                    sparseArray = sparseArray3;
                    z4 = true;
                }
                bVar.T = cVar3.b(i5).d;
                for (n nVar : bVar.P) {
                    for (androidx.media3.exoplayer.dash.manifest.g gVar : bVar.T) {
                        if (gVar.a().equals(nVar.B.a())) {
                            nVar.c(gVar, (cVar3.d && i5 == cVar3.m.size() + (-1)) ? z4 : false);
                            break;
                        }
                    }
                }
            } else {
                sparseArray = sparseArray3;
                i3 = i4;
            }
            i4 = i3 + 1;
            sparseArray3 = sparseArray;
            z5 = false;
        }
        int i9 = 1;
        androidx.media3.exoplayer.dash.manifest.h hVarB = this.G.b(0);
        int size = this.G.m.size() - 1;
        androidx.media3.exoplayer.dash.manifest.h hVarB2 = this.G.b(size);
        long jD3 = this.G.d(size);
        long jQ6 = j0.Q(j0.C(this.K));
        long jD4 = this.G.d(0);
        long j9 = hVarB.b;
        List list3 = hVarB.c;
        long jQ7 = j0.Q(j9);
        boolean zT = t(hVarB);
        int i10 = 0;
        while (true) {
            hVar = hVarB;
            if (i10 >= list3.size()) {
                j = 0;
                break;
            }
            androidx.media3.exoplayer.dash.manifest.a aVar = (androidx.media3.exoplayer.dash.manifest.a) list3.get(i10);
            j = 0;
            List list4 = aVar.c;
            int i11 = aVar.b;
            boolean z6 = (i11 == i9 || i11 == 2) ? false : true;
            if ((!zT || !z6) && !list4.isEmpty()) {
                j jVarC2 = ((androidx.media3.exoplayer.dash.manifest.m) list4.get(0)).c();
                if (jVarC2 == null || jVarC2.D(jD4, jQ6) == 0) {
                    jQ7 = jQ7;
                    break;
                }
                jQ7 = Math.max(jQ7, jVarC2.a(jVarC2.m(jD4, jQ6)) + jQ7);
            }
            i10++;
            i9 = 1;
            hVarB = hVar;
        }
        long j10 = hVarB2.b;
        List list5 = hVarB2.c;
        long jQ8 = j0.Q(j10);
        boolean zT2 = t(hVarB2);
        long jMin3 = Long.MAX_VALUE;
        int i12 = 0;
        while (true) {
            if (i12 >= list5.size()) {
                j2 = jMin3;
                break;
            }
            androidx.media3.exoplayer.dash.manifest.a aVar2 = (androidx.media3.exoplayer.dash.manifest.a) list5.get(i12);
            long j11 = jQ8;
            List list6 = aVar2.c;
            int i13 = aVar2.b;
            boolean z7 = (i13 == 1 || i13 == 2) ? false : true;
            if ((!zT2 || !z7) && !list6.isEmpty()) {
                j jVarC3 = ((androidx.media3.exoplayer.dash.manifest.m) list6.get(0)).c();
                if (jVarC3 == null) {
                    j2 = j11 + jD3;
                    break;
                }
                long jD5 = jVarC3.D(jD3, jQ6);
                if (jD5 == j) {
                    j2 = j11;
                    break;
                } else {
                    long jM = (jVarC3.m(jD3, jQ6) + jD5) - 1;
                    jMin3 = Math.min(jMin3, jVarC3.l(jM, jD3) + jVarC3.a(jM) + j11);
                }
            }
            i12++;
            jQ8 = j11;
            jQ7 = jQ7;
        }
        if (!this.G.d) {
            z2 = false;
            break;
        }
        int i14 = 0;
        while (true) {
            if (i14 >= list5.size()) {
                z2 = true;
                break;
            }
            j jVarC4 = ((androidx.media3.exoplayer.dash.manifest.m) ((androidx.media3.exoplayer.dash.manifest.a) list5.get(i14)).c.get(0)).c();
            if (jVarC4 == null || jVarC4.w()) {
                z2 = false;
                break;
            }
            i14++;
        }
        if (z2) {
            long j12 = this.G.f;
            if (j12 != -9223372036854775807L) {
                jMax = Math.max(jQ7, j2 - j0.Q(j12));
            } else {
                jMax = jQ7;
            }
        } else {
            jMax = jQ7;
        }
        long j13 = j2 - jMax;
        androidx.media3.exoplayer.dash.manifest.c cVar4 = this.G;
        if (cVar4.d) {
            com.google.android.material.motion.a.q(cVar4.a != -9223372036854775807L);
            long jQ9 = (jQ6 - j0.Q(this.G.a)) - jMax;
            x xVar4 = h().c;
            long jD0 = j0.d0(jQ9);
            j3 = -9223372036854775807L;
            long j14 = xVar4.c;
            if (j14 != -9223372036854775807L) {
                jMin = Math.min(jD0, j14);
            } else {
                w wVar = this.G.j;
                if (wVar != null) {
                    long j15 = wVar.c;
                    if (j15 != -9223372036854775807L) {
                        jMin = Math.min(jD0, j15);
                    } else {
                        jMin = jD0;
                    }
                } else {
                    jMin = jD0;
                }
            }
            long jD1 = j0.d0(jQ9 - j13);
            if (jD1 < j && jMin > j) {
                jD1 = j;
            }
            boolean z8 = z2;
            long j16 = this.G.c;
            if (j16 != -9223372036854775807L) {
                jD1 = Math.min(jD1 + j16, jD0);
            }
            long jK = jD1;
            long j17 = xVar4.b;
            if (j17 != -9223372036854775807L) {
                jK = j0.k(j17, jK, jD0);
            } else {
                w wVar2 = this.G.j;
                if (wVar2 != null) {
                    long j18 = wVar2.b;
                    if (j18 != -9223372036854775807L) {
                        jK = j0.k(j18, jK, jD0);
                    }
                }
            }
            long j19 = jK;
            long j20 = j19 > jMin ? j19 : jMin;
            synchronized (this) {
                xVar2 = this.P;
            }
            long jK2 = xVar2.a;
            if (jK2 == -9223372036854775807L) {
                androidx.media3.exoplayer.dash.manifest.c cVar5 = this.G;
                w wVar3 = cVar5.j;
                if (wVar3 != null) {
                    long j21 = wVar3.a;
                    if (j21 != -9223372036854775807L) {
                        jK2 = j21;
                    } else {
                        jK2 = cVar5.g;
                        if (jK2 == -9223372036854775807L) {
                            jK2 = this.o;
                        }
                    }
                } else {
                    jK2 = cVar5.g;
                    if (jK2 == -9223372036854775807L) {
                        jK2 = this.o;
                    }
                }
            }
            if (jK2 < j19) {
                jK2 = j19;
            }
            if (jK2 > j20) {
                jK2 = j0.k(j0.d0(jQ9 - Math.min(j8, j13 / 2)), j19, j20);
            }
            long j22 = j20;
            float f2 = xVar4.d;
            if (f2 == -3.4028235E38f) {
                w wVar4 = this.G.j;
                f2 = wVar4 != null ? wVar4.d : -3.4028235E38f;
            }
            float f3 = xVar4.e;
            if (f3 == -3.4028235E38f) {
                w wVar5 = this.G.j;
                f3 = wVar5 != null ? wVar5.e : -3.4028235E38f;
            }
            if (f2 == -3.4028235E38f && f3 == -3.4028235E38f) {
                w wVar6 = this.G.j;
                j7 = jQ9;
                z3 = z8;
                if (wVar6 == null || wVar6.a == -9223372036854775807L) {
                    f2 = 1.0f;
                    f = 1.0f;
                }
                w wVar7 = new w();
                wVar7.a = jK2;
                wVar7.b = j19;
                wVar7.c = j22;
                wVar7.d = f2;
                wVar7.e = f;
                xVar3 = new x(wVar7);
                synchronized (this) {
                    this.P = xVar3;
                }
                long jD6 = j0.d0(jMax) + this.G.a;
                synchronized (this) {
                    x xVar5 = this.P;
                }
                jQ5 = j7 - j0.Q(xVar5.a);
                jMin2 = Math.min(j8, j13 / 2);
                if (jQ5 < jMin2) {
                    j5 = jMin2;
                } else {
                    j5 = jQ5;
                }
                j4 = jD6;
            } else {
                j7 = jQ9;
                z3 = z8;
            }
            f = f3;
            w wVar8 = new w();
            wVar8.a = jK2;
            wVar8.b = j19;
            wVar8.c = j22;
            wVar8.d = f2;
            wVar8.e = f;
            xVar3 = new x(wVar8);
            synchronized (this) {
                this.P = xVar3;
                long jD7 = j0.d0(jMax) + this.G.a;
                synchronized (this) {
                    x xVar6 = this.P;
                    jQ5 = j7 - j0.Q(xVar6.a);
                    jMin2 = Math.min(j8, j13 / 2);
                    if (jQ5 < jMin2) {
                        j5 = jMin2;
                    } else {
                        j5 = jQ5;
                    }
                    j4 = jD7;
                }
            }
            m(new e(j, j4, j, i, jQ, j13, j5, cVar, c0VarH, xVar));
            if (this.h) {
            }
            this.D.removeCallbacks(cVar2);
            if (z3) {
                Handler handler = this.D;
                androidx.media3.exoplayer.dash.manifest.c cVar6 = this.G;
                long jC = j0.C(this.K);
                int size2 = cVar6.m.size() - 1;
                androidx.media3.exoplayer.dash.manifest.h hVarB3 = cVar6.b(size2);
                long j23 = hVarB3.b;
                list = hVarB3.c;
                jQ = j0.Q(j23);
                jD = cVar6.d(size2);
                jQ2 = j0.Q(jC);
                jQ3 = j0.Q(cVar6.a);
                jQ4 = j0.Q(cVar6.e);
                if (jQ4 != j3 || jQ4 >= 5000000) {
                    jQ4 = 5000000;
                }
                i = 0;
                while (i < list.size()) {
                    list2 = ((androidx.media3.exoplayer.dash.manifest.a) list.get(i)).c;
                    if (list2.isEmpty()) {
                        i2 = i;
                    } else {
                        i2 = i;
                        jVarC = ((androidx.media3.exoplayer.dash.manifest.m) list2.get(0)).c();
                        if (jVarC != null) {
                            jP = (jVarC.p(jD, jQ2) + (jQ3 + jQ)) - jQ2;
                            if (jP > j && (jP < jQ4 - 100000 || (jP > jQ4 && jP < jQ4 + 100000))) {
                                jQ4 = jP;
                            }
                        }
                    }
                    i = i2 + 1;
                }
                handler.postDelayed(cVar2, com.google.common.base.b.f(jQ4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                z();
                return;
            }
            if (z) {
                cVar = this.G;
                if (cVar.d) {
                    j6 = cVar.e;
                    if (j6 != j3) {
                        if (j6 == j) {
                            j6 = 5000;
                        }
                        this.D.postDelayed(this.v, Math.max(j, (this.I + j6) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
        z3 = z2;
        j3 = -9223372036854775807L;
        j4 = -9223372036854775807L;
        j5 = j;
        long jQ10 = jMax - j0.Q(hVar.b);
        androidx.media3.exoplayer.dash.manifest.c cVar7 = this.G;
        long j24 = cVar7.a;
        long j25 = this.K;
        int i15 = this.N;
        c0 c0VarH = h();
        if (this.G.d) {
            synchronized (this) {
                xVar = this.P;
            }
        } else {
            xVar = null;
        }
        m(new e(j24, j4, j25, i15, jQ10, j13, j5, cVar7, c0VarH, xVar));
        if (this.h) {
            this.D.removeCallbacks(cVar2);
            if (z3) {
                Handler handler2 = this.D;
                androidx.media3.exoplayer.dash.manifest.c cVar8 = this.G;
                long jC2 = j0.C(this.K);
                int size3 = cVar8.m.size() - 1;
                androidx.media3.exoplayer.dash.manifest.h hVarB4 = cVar8.b(size3);
                long j26 = hVarB4.b;
                list = hVarB4.c;
                jQ = j0.Q(j26);
                jD = cVar8.d(size3);
                jQ2 = j0.Q(jC2);
                jQ3 = j0.Q(cVar8.a);
                jQ4 = j0.Q(cVar8.e);
                if (jQ4 != j3) {
                    jQ4 = 5000000;
                } else {
                    jQ4 = 5000000;
                }
                i = 0;
                while (i < list.size()) {
                    list2 = ((androidx.media3.exoplayer.dash.manifest.a) list.get(i)).c;
                    if (list2.isEmpty()) {
                        i2 = i;
                    } else {
                        i2 = i;
                        jVarC = ((androidx.media3.exoplayer.dash.manifest.m) list2.get(0)).c();
                        if (jVarC != null) {
                            jP = (jVarC.p(jD, jQ2) + (jQ3 + jQ)) - jQ2;
                            if (jP > j) {
                                jQ4 = jP;
                            }
                        }
                    }
                    i = i2 + 1;
                }
                handler2.postDelayed(cVar2, com.google.common.base.b.f(jQ4, 1000L, RoundingMode.CEILING));
            }
            if (this.H) {
                z();
                return;
            }
            if (z) {
                cVar = this.G;
                if (cVar.d) {
                    j6 = cVar.e;
                    if (j6 != j3) {
                        if (j6 == j) {
                            j6 = 5000;
                        }
                        this.D.postDelayed(this.v, Math.max(j, (this.I + j6) - SystemClock.elapsedRealtime()));
                    }
                }
            }
        }
    }

    public final void y(androidx.media3.exoplayer.dash.manifest.u uVar, androidx.media3.exoplayer.upstream.p pVar) {
        androidx.media3.datasource.h hVar = this.z;
        Uri uri = Uri.parse(uVar.c);
        Map map = Collections.EMPTY_MAP;
        com.google.android.material.motion.a.m(uri, "The uri must be set.");
        this.A.f(new androidx.media3.exoplayer.upstream.q(hVar, new androidx.media3.datasource.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 5, pVar), new h(this, 0), 1);
    }

    public final void z() {
        Uri uri;
        this.D.removeCallbacks(this.v);
        if (this.A.c()) {
            return;
        }
        if (this.A.d()) {
            this.H = true;
            return;
        }
        synchronized (this.t) {
            uri = this.E;
        }
        this.H = false;
        Map map = Collections.EMPTY_MAP;
        com.google.android.material.motion.a.m(uri, "The uri must be set.");
        this.A.f(new androidx.media3.exoplayer.upstream.q(this.z, new androidx.media3.datasource.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, this.r), this.s, this.m.f(4));
    }
}
