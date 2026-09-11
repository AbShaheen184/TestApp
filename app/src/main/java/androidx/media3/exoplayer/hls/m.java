package androidx.media3.exoplayer.hls;

import android.net.Uri;
import android.os.Looper;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.core.t2;
import androidx.media3.common.c0;
import androidx.media3.common.d0;
import androidx.media3.common.j0;
import androidx.media3.common.w;
import androidx.media3.common.x;
import androidx.media3.common.y;
import androidx.media3.exoplayer.source.a1;
import androidx.media3.exoplayer.source.v;
import com.google.common.collect.h0;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends androidx.media3.exoplayer.source.a {
    public final d h;
    public final c i;
    public final com.google.android.material.shape.g j;
    public final androidx.media3.exoplayer.drm.f k;
    public final t2 l;
    public final boolean m;
    public final int n;
    public final androidx.media3.exoplayer.hls.playlist.e o;
    public final long p;
    public x q;
    public androidx.media3.exoplayer.upstream.f r;
    public c0 s;

    static {
        d0.a("media3.exoplayer.hls");
    }

    public m(c0 c0Var, c cVar, d dVar, com.google.android.material.shape.g gVar, androidx.media3.exoplayer.drm.f fVar, t2 t2Var, androidx.media3.exoplayer.hls.playlist.e eVar, long j, boolean z, int i) {
        this.s = c0Var;
        this.q = c0Var.c;
        this.i = cVar;
        this.h = dVar;
        this.j = gVar;
        this.k = fVar;
        this.l = t2Var;
        this.o = eVar;
        this.p = j;
        this.m = z;
        this.n = i;
    }

    public static androidx.media3.exoplayer.hls.playlist.i t(long j, List list) {
        androidx.media3.exoplayer.hls.playlist.i iVar = null;
        for (int i = 0; i < list.size(); i++) {
            androidx.media3.exoplayer.hls.playlist.i iVar2 = (androidx.media3.exoplayer.hls.playlist.i) list.get(i);
            long j2 = iVar2.B;
            if (j2 > j || !iVar2.I) {
                if (j2 > j) {
                    break;
                }
            } else {
                iVar = iVar2;
            }
        }
        return iVar;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final androidx.media3.exoplayer.source.u b(v vVar, c2 c2Var, long j) {
        androidx.media3.exoplayer.drm.d dVarA = a(vVar);
        androidx.media3.exoplayer.drm.d dVar = new androidx.media3.exoplayer.drm.d(this.d.c, 0, vVar);
        androidx.media3.exoplayer.upstream.f fVar = this.r;
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        return new l(this.h, this.o, this.i, fVar, this.k, dVar, this.l, dVarA, c2Var, this.j, this.m, this.n, kVar);
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized c0 h() {
        return this.s;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void j() throws IOException {
        androidx.media3.exoplayer.hls.playlist.e eVar = this.o;
        androidx.media3.exoplayer.upstream.n nVar = eVar.D;
        if (nVar != null) {
            nVar.b();
        }
        j0 j0Var = eVar.H;
        if (j0Var != null) {
            throw j0Var;
        }
        Uri uri = eVar.M;
        if (uri != null) {
            eVar.i(uri);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void l(androidx.media3.exoplayer.upstream.f fVar) {
        this.r = fVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        androidx.media3.exoplayer.analytics.k kVar = this.g;
        kVar.getClass();
        androidx.media3.exoplayer.drm.f fVar2 = this.k;
        fVar2.d(looperMyLooper, kVar);
        fVar2.b();
        androidx.media3.exoplayer.drm.d dVarA = a(null);
        y yVar = h().b;
        yVar.getClass();
        Uri uri = yVar.a;
        androidx.media3.exoplayer.hls.playlist.e eVar = this.o;
        eVar.getClass();
        eVar.E = androidx.media3.common.util.j0.q(null);
        eVar.C = dVarA;
        eVar.F = this;
        Map map = Collections.EMPTY_MAP;
        com.google.android.material.motion.a.m(uri, "The uri must be set.");
        androidx.media3.exoplayer.upstream.q qVar = new androidx.media3.exoplayer.upstream.q(((androidx.media3.datasource.g) eVar.e.e).f(), new androidx.media3.datasource.l(uri, 0L, 1, null, map, 0L, -1L, null, 1), 4, eVar.y.h());
        com.google.android.material.motion.a.q(eVar.D == null);
        androidx.media3.exoplayer.upstream.n nVar = new androidx.media3.exoplayer.upstream.n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        eVar.D = nVar;
        nVar.f(qVar, eVar, eVar.z.f(qVar.z));
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void n(androidx.media3.exoplayer.source.u uVar) {
        l lVar = (l) uVar;
        lVar.y.B.remove(lVar);
        for (r rVar : lVar.Q) {
            if (rVar.a0) {
                for (q qVar : rVar.S) {
                    qVar.k();
                    androidx.media3.exoplayer.dash.manifest.t tVar = qVar.h;
                    if (tVar != null) {
                        tVar.O(qVar.e);
                        qVar.h = null;
                        qVar.g = null;
                    }
                }
            }
            j jVar = rVar.A;
            int iM = jVar.r.m();
            androidx.media3.exoplayer.hls.playlist.e eVar = jVar.g;
            Uri uriC = jVar.e[iM].c();
            androidx.media3.exoplayer.hls.playlist.d dVar = (androidx.media3.exoplayer.hls.playlist.d) eVar.A.get(uriC);
            if (dVar != null) {
                androidx.media3.exoplayer.hls.playlist.c cVar = (androidx.media3.exoplayer.hls.playlist.c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uriC, uriC);
                cVar.getClass();
                cVar.I = false;
            }
            jVar.n = null;
            rVar.G.e(rVar);
            rVar.O.removeCallbacksAndMessages(null);
            rVar.e0 = true;
            rVar.P.clear();
        }
        lVar.N = null;
    }

    @Override // androidx.media3.exoplayer.source.a
    public final void p() {
        androidx.media3.exoplayer.hls.playlist.e eVar = this.o;
        eVar.M = null;
        eVar.N = null;
        eVar.G = null;
        eVar.I = null;
        eVar.J = null;
        eVar.K = null;
        eVar.L = null;
        eVar.H = null;
        eVar.P = -9223372036854775807L;
        eVar.D.e(null);
        eVar.D = null;
        HashMap map = eVar.A;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((androidx.media3.exoplayer.hls.playlist.d) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((androidx.media3.exoplayer.hls.playlist.c) it2.next()).z.e(null);
            }
        }
        eVar.E.removeCallbacksAndMessages(null);
        eVar.E = null;
        map.clear();
        this.k.c();
    }

    @Override // androidx.media3.exoplayer.source.a
    public final synchronized void s(c0 c0Var) {
        this.s = c0Var;
    }

    public final void u(androidx.media3.exoplayer.hls.playlist.n nVar) {
        long j;
        a1 a1Var;
        long j2;
        long jQ;
        long j3;
        boolean z = nVar.p;
        boolean z2 = nVar.g;
        h0 h0Var = nVar.r;
        long j4 = nVar.u;
        long jQ2 = nVar.e;
        int i = nVar.d;
        long j5 = nVar.h;
        long jD0 = z ? androidx.media3.common.util.j0.d0(j5) : -9223372036854775807L;
        long j6 = (i == 2 || i == 1) ? jD0 : -9223372036854775807L;
        androidx.media3.exoplayer.hls.playlist.e eVar = this.o;
        eVar.G.getClass();
        com.google.android.material.shape.g gVar = new com.google.android.material.shape.g();
        long j7 = 0;
        if (eVar.O) {
            androidx.media3.exoplayer.hls.playlist.m mVar = nVar.v;
            long j8 = j5 - eVar.P;
            boolean z3 = nVar.o;
            long j9 = z3 ? j8 + j4 : -9223372036854775807L;
            long jQ3 = nVar.p ? androidx.media3.common.util.j0.Q(androidx.media3.common.util.j0.C(this.p)) - (j5 + j4) : 0L;
            long j10 = this.q.a;
            if (j10 != -9223372036854775807L) {
                jQ = androidx.media3.common.util.j0.Q(j10);
            } else {
                if (jQ2 != -9223372036854775807L) {
                    j2 = j4 - jQ2;
                } else {
                    j2 = mVar.d;
                    if (j2 == -9223372036854775807L || nVar.n == -9223372036854775807L) {
                        j2 = mVar.c;
                        if (j2 == -9223372036854775807L) {
                            j2 = 3 * nVar.m;
                        }
                    }
                }
                jQ = j2 + jQ3;
            }
            long j11 = j4 + jQ3;
            long jK = androidx.media3.common.util.j0.k(jQ, jQ3, j11);
            x xVar = h().c;
            boolean z4 = xVar.d == -3.4028235E38f && xVar.e == -3.4028235E38f && mVar.c == -9223372036854775807L && mVar.d == -9223372036854775807L;
            x xVar2 = this.q;
            w wVar = new w();
            wVar.a = xVar2.a;
            wVar.b = xVar2.b;
            wVar.c = xVar2.c;
            wVar.d = xVar2.d;
            wVar.e = xVar2.e;
            wVar.a = androidx.media3.common.util.j0.d0(jK);
            wVar.d = z4 ? 1.0f : this.q.d;
            wVar.e = z4 ? 1.0f : this.q.e;
            x xVar3 = new x(wVar);
            this.q = xVar3;
            if (jQ2 == -9223372036854775807L) {
                jQ2 = j11 - androidx.media3.common.util.j0.Q(xVar3.a);
            }
            if (z2) {
                j7 = jQ2;
            } else {
                androidx.media3.exoplayer.hls.playlist.i iVarT = t(jQ2, nVar.s);
                if (iVarT != null) {
                    j3 = iVarT.B;
                } else if (!h0Var.isEmpty()) {
                    androidx.media3.exoplayer.hls.playlist.k kVar = (androidx.media3.exoplayer.hls.playlist.k) h0Var.get(androidx.media3.common.util.j0.d(h0Var, Long.valueOf(jQ2), true));
                    androidx.media3.exoplayer.hls.playlist.i iVarT2 = t(jQ2, kVar.J);
                    j3 = iVarT2 != null ? iVarT2.B : kVar.B;
                }
                j7 = j3;
            }
            a1Var = new a1(j6, jD0, j9, nVar.u, j8, j7, true, !z3, i == 2 && nVar.f, gVar, h(), this.q);
        } else {
            if (jQ2 == -9223372036854775807L || h0Var.isEmpty()) {
                j = 0;
            } else {
                if (!z2 && jQ2 != j4) {
                    jQ2 = ((androidx.media3.exoplayer.hls.playlist.k) h0Var.get(androidx.media3.common.util.j0.d(h0Var, Long.valueOf(jQ2), true))).B;
                }
                j = jQ2;
            }
            long j12 = nVar.u;
            a1Var = new a1(j6, jD0, j12, j12, 0L, j, true, false, true, gVar, h(), null);
        }
        m(a1Var);
    }
}
