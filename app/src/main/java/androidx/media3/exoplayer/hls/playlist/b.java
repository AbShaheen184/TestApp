package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import androidx.compose.animation.core.t2;
import com.google.common.collect.e0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements v {
    public final /* synthetic */ e e;

    public b(e eVar) {
        this.e = eVar;
    }

    @Override // androidx.media3.exoplayer.hls.playlist.v
    public final void a() {
        this.e.B.remove(this);
    }

    @Override // androidx.media3.exoplayer.hls.playlist.v
    public final boolean b(Uri uri, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar, boolean z) {
        d dVar;
        e eVar = this.e;
        HashMap map = eVar.A;
        if (eVar.N == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d dVar2 = (d) map.get(uri);
            dVar2.getClass();
            x xVar = dVar2.a;
            int size = xVar.b.size();
            p1 it = k0.l(xVar.b.values()).iterator();
            int i = 0;
            while (it.hasNext()) {
                Uri uri2 = (Uri) it.next();
                d dVar3 = (d) map.get(uri2);
                if (dVar3 != null) {
                    c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar3.b, uri2, uri2);
                    cVar.getClass();
                    if (jElapsedRealtime <= cVar.F) {
                        i++;
                    }
                }
            }
            int size2 = eVar.I.size();
            e0 e0VarListIterator = eVar.I.listIterator(0);
            int i2 = 0;
            while (e0VarListIterator.hasNext()) {
                if (eVar.f((x) e0VarListIterator.next(), jElapsedRealtime)) {
                    i2++;
                }
            }
            androidx.media3.exoplayer.upstream.g gVar = new androidx.media3.exoplayer.upstream.g(size, i, size2, i2);
            eVar.z.getClass();
            androidx.media3.exoplayer.upstream.h hVarE = t2.e(gVar, lVar);
            if (hVarE != null && (dVar = (d) map.get(uri)) != null) {
                return d.c(dVar, uri, hVarE.b);
            }
        }
        return false;
    }
}
