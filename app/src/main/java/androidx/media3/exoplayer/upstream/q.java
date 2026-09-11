package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import androidx.media3.common.util.j0;
import androidx.media3.datasource.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements k {
    public final y A;
    public final p B;
    public volatile Object C;
    public final long e = androidx.media3.exoplayer.source.n.b.getAndIncrement();
    public final androidx.media3.datasource.l y;
    public final int z;

    public q(androidx.media3.datasource.h hVar, androidx.media3.datasource.l lVar, int i, p pVar) {
        this.A = new y(hVar);
        this.y = lVar;
        this.z = i;
        this.B = pVar;
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void c() {
        this.A.y = 0L;
        androidx.media3.datasource.j jVar = new androidx.media3.datasource.j(this.A, this.y);
        try {
            jVar.a();
            Uri uriV = this.A.e.v();
            uriV.getClass();
            this.C = this.B.j(uriV, jVar);
        } finally {
            j0.h(jVar);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.k
    public final void e() {
    }
}
