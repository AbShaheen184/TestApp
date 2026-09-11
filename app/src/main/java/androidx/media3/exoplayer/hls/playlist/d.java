package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.os.SystemClock;
import com.google.common.collect.h0;
import com.google.common.collect.k0;
import com.google.common.collect.p1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final x a;
    public final HashMap b;
    public final /* synthetic */ e c;

    public d(e eVar, x xVar) {
        this.c = eVar;
        this.a = xVar;
        HashMap map = new HashMap();
        p1 it = k0.l(xVar.b.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) xVar.b.get(str);
            uri.getClass();
            map.put(uri, new c(this.c, uri, str));
        }
        this.b = map;
    }

    public static n a(d dVar, Uri uri) {
        c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uri, uri);
        cVar.getClass();
        return cVar.B;
    }

    public static void b(d dVar, Uri uri, boolean z) {
        c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(dVar.b, uri, uri);
        cVar.getClass();
        cVar.c(z ? cVar.a() : cVar.e);
    }

    public static boolean c(d dVar, Uri uri, long j) {
        HashMap map = dVar.b;
        c cVar = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(map, uri, uri);
        cVar.getClass();
        cVar.F = SystemClock.elapsedRealtime() + j;
        e eVar = dVar.c;
        x xVar = dVar.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (c cVar2 : map.values()) {
            if (!cVar2.y.equals(xVar.d) && jElapsedRealtime > cVar2.F) {
                Uri uriC = xVar.c();
                String str = cVar2.y;
                com.google.android.material.motion.a.q(xVar.b.containsKey(str));
                xVar.d = str;
                if (uriC.equals(eVar.M)) {
                    eVar.h(cVar2.e);
                }
                c cVar3 = (c) map.get(uriC);
                cVar3.getClass();
                cVar2.I = cVar3.I;
                cVar3.I = false;
                return true;
            }
        }
        Uri uri2 = eVar.M;
        if (uri2 == null || uri.equals(uri2)) {
            h0 h0Var = eVar.I;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            boolean z = false;
            for (int i = 0; i < h0Var.size(); i++) {
                Uri uriC2 = ((x) h0Var.get(i)).c();
                d dVar2 = (d) eVar.A.get(uriC2);
                dVar2.getClass();
                HashMap map2 = dVar2.b;
                c cVar4 = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(map2, uriC2, uriC2);
                cVar4.getClass();
                if (jElapsedRealtime2 > cVar4.F) {
                    eVar.M = uriC2;
                    Uri uriD = eVar.d(uriC2);
                    c cVar5 = (c) androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.c(map2, uriC2, uriC2);
                    cVar5.getClass();
                    cVar5.c(uriD);
                    z = true;
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}
