package coil3.util;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final coil3.request.c a(coil3.request.g gVar, Throwable th) {
        coil3.k kVar;
        if (th instanceof coil3.request.m) {
            kotlin.jvm.functions.l lVar = gVar.n;
            coil3.request.e eVar = gVar.t;
            kVar = (coil3.k) lVar.invoke(gVar);
            if (kVar == null) {
                kVar = (coil3.k) eVar.j.invoke(gVar);
            }
            if (kVar == null && (kVar = (coil3.k) gVar.m.invoke(gVar)) == null) {
                kVar = (coil3.k) eVar.i.invoke(gVar);
            }
        } else {
            kVar = (coil3.k) gVar.m.invoke(gVar);
            if (kVar == null) {
                kVar = (coil3.k) gVar.t.i.invoke(gVar);
            }
        }
        return new coil3.request.c(kVar, gVar, th);
    }
}
