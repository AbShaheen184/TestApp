package coil3.network;

import android.content.Context;
import coil3.w;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements coil3.fetch.h {
    public final kotlin.o a;
    public final kotlin.o b;
    public final coil3.memory.c c;
    public final kotlin.o d;

    public j(kotlin.jvm.functions.a aVar) {
        androidx.compose.runtime.saveable.f fVar = new androidx.compose.runtime.saveable.f(17);
        i iVar = i.e;
        androidx.compose.runtime.saveable.f fVar2 = new androidx.compose.runtime.saveable.f(18);
        this.a = new kotlin.o(aVar);
        this.b = kotlin.a.d(fVar);
        coil3.memory.c cVar = new coil3.memory.c(1, false);
        cVar.y = iVar;
        cVar.z = coil3.network.internal.b.a;
        this.c = cVar;
        this.d = kotlin.a.d(fVar2);
    }

    @Override // coil3.fetch.h
    public final coil3.fetch.i a(Object obj, coil3.request.n nVar, coil3.q qVar) {
        w wVar = (w) obj;
        if (!kotlin.jvm.internal.l.a(wVar.c, "http") && !kotlin.jvm.internal.l.a(wVar.c, "https")) {
            return null;
        }
        String str = wVar.a;
        kotlin.o oVar = this.a;
        kotlin.o oVar2 = new kotlin.o(new androidx.room.coroutines.d(qVar, 7));
        kotlin.o oVar3 = this.b;
        coil3.memory.c cVar = this.c;
        Context context = nVar.a;
        Object obj2 = cVar.z;
        coil3.network.internal.b bVar = coil3.network.internal.b.a;
        if (obj2 == bVar) {
            synchronized (cVar) {
                obj2 = cVar.z;
                if (obj2 == bVar) {
                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) cVar.y;
                    lVar.getClass();
                    Object objInvoke = lVar.invoke(context);
                    cVar.z = objInvoke;
                    cVar.y = null;
                    obj2 = objInvoke;
                }
            }
        }
        return new n(str, nVar, oVar, oVar2, oVar3, new kotlin.e(obj2), this.d);
    }
}
