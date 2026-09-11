package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.compose.animation.core.t2;
import androidx.media3.common.i0;
import androidx.media3.common.j0;
import androidx.media3.datasource.y;
import com.google.common.collect.h0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements androidx.media3.exoplayer.upstream.i {
    public static final a Q = new a(0);
    public androidx.media3.exoplayer.drm.d C;
    public androidx.media3.exoplayer.upstream.n D;
    public Handler E;
    public androidx.media3.exoplayer.hls.m F;
    public q G;
    public j0 H;
    public h0 I;
    public h0 J;
    public h0 K;
    public h0 L;
    public Uri M;
    public n N;
    public boolean O;
    public final androidx.media3.exoplayer.hls.c e;
    public final u y;
    public final t2 z;
    public final CopyOnWriteArrayList B = new CopyOnWriteArrayList();
    public final HashMap A = new HashMap();
    public long P = -9223372036854775807L;

    public e(androidx.media3.exoplayer.hls.c cVar, t2 t2Var, u uVar) {
        this.e = cVar;
        this.y = uVar;
        this.z = t2Var;
    }

    public final void a(List list) {
        for (int i = 0; i < list.size(); i++) {
            x xVar = (x) list.get(i);
            d dVar = new d(this, xVar);
            p1 it = k0.l(xVar.b.values()).iterator();
            while (it.hasNext()) {
                this.A.put((Uri) it.next(), dVar);
            }
        }
    }

    public final n b(boolean z, Uri uri) {
        HashMap map = this.A;
        d dVar = (d) map.get(uri);
        if (dVar == null) {
            return null;
        }
        n nVarA = d.a(dVar, uri);
        if (nVarA != null && z) {
            h(uri);
            d dVar2 = (d) map.get(uri);
            dVar2.getClass();
            HashMap map2 = dVar2.b;
            c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(map2, uri, uri);
            cVar.getClass();
            if (!cVar.I) {
                c cVar2 = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(map2, uri, uri);
                cVar2.getClass();
                cVar2.I = true;
                n nVarA2 = d.a(dVar2, uri);
                if (nVarA2 != null && !nVarA2.o) {
                    d.b(dVar2, uri, true);
                }
            }
        }
        return nVarA;
    }

    public final h0 c(int i) {
        if (i == 0) {
            return this.I;
        }
        if (i == 1) {
            return this.J;
        }
        if (i == 2) {
            return this.K;
        }
        if (i != 3) {
            return null;
        }
        return this.L;
    }

    public final Uri d(Uri uri) {
        j jVar;
        n nVar = this.N;
        if (nVar == null || !nVar.v.e || (jVar = (j) nVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar.b));
        int i = jVar.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        int i2 = qVar.z;
        this.z.getClass();
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof j0) || (cause instanceof FileNotFoundException) || (cause instanceof androidx.media3.datasource.q) || (cause instanceof androidx.media3.exoplayer.upstream.m) || ((cause instanceof androidx.media3.datasource.i) && ((androidx.media3.datasource.i) cause).e == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        boolean z = jMin == -9223372036854775807L;
        this.C.f(nVar, i2, iOException, z);
        return z ? androidx.media3.exoplayer.upstream.n.f : new androidx.media3.exoplayer.upstream.h(jMin, 0, false);
    }

    public final boolean f(x xVar, long j) {
        d dVar = (d) this.A.get(xVar.c());
        if (dVar == null) {
            return false;
        }
        Iterator it = dVar.b.values().iterator();
        boolean z = true;
        while (it.hasNext()) {
            z &= j <= ((c) it.next()).F;
        }
        return z;
    }

    public final boolean g(Uri uri) {
        int i;
        d dVar = (d) this.A.get(uri);
        if (dVar == null) {
            return false;
        }
        c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uri, uri);
        cVar.getClass();
        if (cVar.B == null) {
            return false;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jMax = Math.max(30000L, androidx.media3.common.util.j0.d0(cVar.B.u));
        n nVar = cVar.B;
        return nVar.o || (i = nVar.d) == 2 || i == 1 || cVar.C + jMax > jElapsedRealtime;
    }

    public final void h(Uri uri) {
        if (uri.equals(this.M)) {
            return;
        }
        List list = this.G.d;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(((p) list.get(i)).a)) {
                n nVar = this.N;
                if (nVar == null || !nVar.o) {
                    this.M = uri;
                    d dVar = (d) this.A.get(uri);
                    dVar.getClass();
                    n nVarA = d.a(dVar, uri);
                    if (nVarA != null && nVarA.o) {
                        this.N = nVarA;
                        this.F.u(nVarA);
                        return;
                    } else {
                        Uri uriD = d(uri);
                        c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uri, uri);
                        cVar.getClass();
                        cVar.c(uriD);
                        return;
                    }
                }
                return;
            }
        }
    }

    public final void i(Uri uri) {
        d dVar = (d) this.A.get(uri);
        if (dVar != null) {
            c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uri, uri);
            cVar.getClass();
            cVar.z.b();
            IOException iOException = cVar.H;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void m(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
        androidx.media3.exoplayer.source.n nVar;
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        if (i == 0) {
            long j3 = qVar.e;
            nVar = new androidx.media3.exoplayer.source.n(qVar.y, j);
        } else {
            long j4 = qVar.e;
            androidx.media3.datasource.l lVar = qVar.y;
            y yVar = qVar.A;
            nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        }
        this.C.g(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        q qVar;
        androidx.media3.exoplayer.upstream.q qVar2 = (androidx.media3.exoplayer.upstream.q) kVar;
        r rVar = (r) qVar2.C;
        boolean z = rVar instanceof n;
        if (z) {
            String str = rVar.a;
            q qVar3 = q.l;
            Uri uri = Uri.parse(str);
            androidx.media3.common.q qVar4 = new androidx.media3.common.q();
            qVar4.a = "0";
            qVar4.m = i0.p("application/x-mpegURL");
            List listSingletonList = Collections.singletonList(new p(uri, new androidx.media3.common.r(qVar4), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            qVar = new q("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
        } else {
            qVar = (q) rVar;
        }
        this.G = qVar;
        try {
            this.I = x.b(qVar.d);
            this.J = x.a(qVar.e);
            this.K = x.a(qVar.f);
            this.L = x.a(qVar.g);
            this.M = ((x) this.I.get(0)).c();
            this.B.add(new b(this));
            a(this.I);
            a(this.J);
            a(this.K);
            a(this.L);
            androidx.media3.datasource.l lVar = qVar2.y;
            y yVar = qVar2.A;
            androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
            d dVar = (d) this.A.get(this.M);
            dVar.getClass();
            if (z) {
                Uri uri2 = qVar2.A.z;
                c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uri2, uri2);
                cVar.getClass();
                cVar.d((n) rVar, nVar);
            } else {
                d.b(dVar, this.M, false);
            }
            this.z.getClass();
            this.C.d(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (j0 e) {
            this.H = e;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        this.z.getClass();
        this.C.c(nVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
