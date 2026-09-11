package androidx.media3.exoplayer.dash;

import androidx.media3.datasource.y;
import java.io.IOException;
import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements androidx.media3.exoplayer.upstream.i {
    public final /* synthetic */ int e;
    public final Object y;

    public /* synthetic */ h(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final androidx.media3.exoplayer.upstream.h e(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, IOException iOException, int i) {
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
                i iVar = (i) this.y;
                androidx.media3.exoplayer.drm.d dVar = iVar.q;
                long j3 = qVar.e;
                androidx.media3.datasource.l lVar = qVar.y;
                y yVar = qVar.A;
                dVar.f(new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y), qVar.z, iOException, true);
                iVar.m.getClass();
                iVar.w(iOException);
                break;
            default:
                ((d) this.y).e.w(iOException);
                break;
        }
        return androidx.media3.exoplayer.upstream.n.e;
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void s(androidx.media3.exoplayer.upstream.k kVar, long j, long j2) {
        boolean z;
        switch (this.e) {
            case 0:
                androidx.media3.exoplayer.upstream.q qVar = (androidx.media3.exoplayer.upstream.q) kVar;
                i iVar = (i) this.y;
                long j3 = qVar.e;
                androidx.media3.datasource.l lVar = qVar.y;
                y yVar = qVar.A;
                androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(lVar, yVar.z, yVar.A, j, j2, yVar.y);
                iVar.m.getClass();
                iVar.q.d(nVar, qVar.z, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
                iVar.K = ((Long) qVar.C).longValue() - j;
                iVar.x(true);
                return;
            default:
                d dVar = (d) this.y;
                synchronized (androidx.media3.exoplayer.util.b.b) {
                    z = androidx.media3.exoplayer.util.b.c;
                    break;
                }
                if (z) {
                    dVar.a();
                    return;
                } else {
                    dVar.e.w(new IOException(new ConcurrentModificationException()));
                    return;
                }
        }
    }

    @Override // androidx.media3.exoplayer.upstream.i
    public final void w(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
        switch (this.e) {
            case 0:
                ((i) this.y).v((androidx.media3.exoplayer.upstream.q) kVar, j, j2);
                break;
        }
    }

    private final void a(androidx.media3.exoplayer.upstream.k kVar, long j, long j2, boolean z) {
    }
}
