package androidx.navigationevent;

import androidx.activity.y;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final y a;
    public final h b = new h();
    public final LinkedHashSet c;
    public final LinkedHashSet d;

    public c(y yVar) {
        this.a = yVar;
        new LinkedHashSet();
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
    }

    public static void a(c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        if (cVar.c.add(eVar)) {
            h hVar = cVar.b;
            hVar.getClass();
            if (eVar.c != null) {
                androidx.media3.exoplayer.hls.playlist.a.g(eVar, "' is already registered with a dispatcher", "Handler '");
                return;
            }
            hVar.f.addFirst(eVar);
            eVar.c = cVar;
            hVar.b();
        }
    }

    public final void b(g gVar) {
        if (this.d.add(gVar)) {
            this.b.a(this, gVar, -1);
        }
    }

    public final void c(m mVar, int i) {
        if (i != 1 && i != 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Unsupported priority value: "));
        } else if (this.d.add(mVar)) {
            this.b.a(this, mVar, i);
        }
    }

    public final void d(g gVar, b bVar) {
        h hVar = this.b;
        hVar.getClass();
        if (hVar.h != 0) {
            return;
        }
        e eVarC = hVar.c(-1);
        hVar.g = eVarC;
        hVar.h = -1;
        hVar.i = gVar;
        if (bVar != null) {
            if (eVarC != null) {
                eVarC.d(bVar);
            }
            hVar.a.setValue(new j(bVar));
        }
    }
}
