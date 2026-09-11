package coil3.transition;

import coil3.compose.j;
import coil3.decode.h;
import coil3.request.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements f {
    public final int b;

    public b(int i) {
        this.b = i;
        if (i > 0) {
            return;
        }
        net.luminis.tls.engine.impl.c.o("durationMillis must be > 0.");
        throw null;
    }

    @Override // coil3.transition.f
    public final g a(j jVar, coil3.request.j jVar2) {
        if (jVar2 instanceof p) {
            return ((p) jVar2).c == h.e ? new e(jVar, jVar2) : new c(jVar, jVar2, this.b);
        }
        return new e(jVar, jVar2);
    }
}
