package coil3.svg;

import coil3.decode.j;
import coil3.decode.k;
import coil3.request.n;
import kotlin.jvm.functions.l;
import okio.h;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements j {
    public final c a = c.e;
    public final l b = f.g;
    public final boolean c = true;
    public final boolean d = true;

    @Override // coil3.decode.j
    public final k a(coil3.fetch.k kVar, n nVar) {
        if (!kotlin.jvm.internal.l.a(kVar.b, "image/svg+xml")) {
            h hVarP = kVar.a.P();
            if (!hVarP.A(0L, a.b) || hVarP.o(a.a) == -1) {
                return null;
            }
        }
        return new f(kVar.a, nVar, this.a, this.b, this.c, this.d);
    }
}
