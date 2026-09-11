package androidx.media3.exoplayer.dash;

import android.net.Uri;
import androidx.media3.common.j0;
import androidx.media3.datasource.y;
import androidx.media3.exoplayer.dash.manifest.u;
import androidx.room.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements androidx.media3.exoplayer.upstream.i {
    public final /* synthetic */ i e;

    public void a() {
        long j;
        i iVar = this.e;
        synchronized (androidx.media3.exoplayer.util.b.b) {
            try {
                j = androidx.media3.exoplayer.util.b.c ? androidx.media3.exoplayer.util.b.d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        iVar.K = j;
        iVar.x(true);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        long jMin;
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        int i2 = qVar.z;
        i iVar = this.e;
        iVar.m.getClass();
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
        androidx.media3.exoplayer.upstream.h hVar = jMin == -9223372036854775807L ? androidx.media3.exoplayer.upstream.n.f : new androidx.media3.exoplayer.upstream.h(jMin, 0, false);
        iVar.q.f(nVar, i2, iOException, !hVar.a());
        return hVar;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public void m(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, int i) {
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
        this.e.q.g(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
        i iVar = this.e;
        long j3 = qVar.e;
        androidx.media3.datasource.l lVar = qVar.y;
        y yVar = qVar.A;
        androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
        iVar.m.getClass();
        iVar.q.d(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        androidx.media3.exoplayer.dash.manifest.c cVar = (androidx.media3.exoplayer.dash.manifest.c) qVar.C;
        androidx.media3.exoplayer.dash.manifest.c cVar2 = iVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j4 = cVar.b(0).b;
        int i = 0;
        while (i < size && iVar.G.b(i).b < j4) {
            i++;
        }
        if (cVar.d) {
            if (size - i > cVar.m.size()) {
                androidx.media3.common.util.c.t("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = iVar.M;
                if (j5 == -9223372036854775807L || cVar.h * 1000 > j5) {
                    iVar.L = 0;
                } else {
                    androidx.media3.common.util.c.t("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + iVar.M);
                }
            }
            int i2 = iVar.L;
            iVar.L = i2 + 1;
            if (i2 < iVar.m.f(qVar.z)) {
                iVar.D.postDelayed(iVar.v, Math.min((iVar.L - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new androidx.datastore.preferences.protobuf.i();
                return;
            }
        }
        iVar.G = cVar;
        iVar.H = cVar.d & iVar.H;
        iVar.I = j - j2;
        iVar.J = j;
        iVar.N += i;
        synchronized (iVar.t) {
            if (qVar.y.a.equals(iVar.E)) {
                Uri uriT = iVar.G.k;
                if (uriT == null) {
                    uriT = r.t(qVar.A.z);
                }
                iVar.E = uriT;
            }
        }
        androidx.media3.exoplayer.dash.manifest.c cVar3 = iVar.G;
        if (!cVar3.d || iVar.K != -9223372036854775807) {
            iVar.x(true);
            return;
        }
        u uVar = cVar3.i;
        if (uVar == null) {
            iVar.u();
            return;
        }
        String str = uVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                iVar.K = androidx.media3.common.util.j0.T(uVar.c) - iVar.J;
                iVar.x(true);
                return;
            } catch (j0 e) {
                iVar.w(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            iVar.y(uVar, new g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            iVar.y(uVar, new com.google.android.gms.common.internal.k(14));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            iVar.u();
        } else {
            iVar.w(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        this.e.v((androidx.media3.exoplayer.upstream.q) kVar, j, j2);
    }
}
