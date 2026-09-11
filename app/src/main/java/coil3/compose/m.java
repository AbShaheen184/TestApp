package coil3.compose;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    public static final m a = new m();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(coil3.q qVar, coil3.request.g gVar, kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i = lVar.A;
            if ((i & Integer.MIN_VALUE) != 0) {
                lVar.A = i - Integer.MIN_VALUE;
            } else {
                lVar = new l(this, cVar);
            }
        } else {
            lVar = new l(this, cVar);
        }
        Object objB = lVar.y;
        int i2 = lVar.A;
        if (i2 == 0) {
            kotlin.a.e(objB);
            lVar.e = gVar;
            lVar.A = 1;
            objB = qVar.b(gVar, lVar);
            Object obj = kotlin.coroutines.intrinsics.a.e;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = lVar.e;
            kotlin.a.e(objB);
        }
        coil3.request.j jVar = (coil3.request.j) objB;
        if (jVar instanceof coil3.request.p) {
            coil3.request.p pVar = (coil3.request.p) jVar;
            return new g(k.d(pVar.a, gVar.a, 1), pVar);
        }
        if (!(jVar instanceof coil3.request.c)) {
            coil3.g.a();
            return null;
        }
        coil3.request.c cVar2 = (coil3.request.c) jVar;
        coil3.k kVar = cVar2.a;
        return new e(kVar != null ? k.d(kVar, gVar.a, 1) : null, cVar2);
    }
}
