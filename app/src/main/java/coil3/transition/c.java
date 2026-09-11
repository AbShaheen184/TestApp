package coil3.transition;

import androidx.transition.k;
import coil3.compose.j;
import coil3.m;
import coil3.request.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g {
    public final j a;
    public final coil3.request.j b;
    public final int c;

    public c(j jVar, coil3.request.j jVar2, int i) {
        this.a = jVar;
        this.b = jVar2;
        this.c = i;
        if (i > 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("durationMillis must be > 0.");
        throw null;
    }

    @Override // coil3.transition.g
    public final void a() {
        this.a.getClass();
        coil3.request.j jVar = this.b;
        if (jVar.a() != null) {
            k.n();
            return;
        }
        boolean z = jVar instanceof p;
        a aVar = new a(jVar.b().p, this.c, (z && ((p) jVar).g) ? false : true);
        if (z) {
            m.c(aVar);
        } else if (jVar instanceof coil3.request.c) {
            m.c(aVar);
        } else {
            coil3.g.a();
        }
    }
}
