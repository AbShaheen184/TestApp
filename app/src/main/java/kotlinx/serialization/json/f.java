package kotlinx.serialization.json;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlinx.serialization.a {
    public static final f a = new f();
    public static final e b = e.b;

    @Override // kotlinx.serialization.a
    public final Object a(kotlinx.serialization.encoding.b bVar) {
        com.google.android.material.sidesheet.b.d(bVar);
        k kVar = k.a;
        return new d((List) new kotlinx.serialization.internal.c().i(bVar));
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        com.google.android.material.sidesheet.b.b(nVar);
        k kVar = k.a;
        kotlinx.serialization.descriptors.f fVar = k.b;
        fVar.getClass();
        kotlinx.serialization.internal.b bVar = new kotlinx.serialization.internal.b(fVar);
        List list = dVar.e;
        int size = list.size();
        kotlinx.serialization.json.internal.n nVarA = nVar.a(bVar);
        Iterator it = list.iterator();
        for (int i = 0; i < size; i++) {
            nVarA.o(bVar, i, kVar, it.next());
        }
        nVarA.s(bVar);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return b;
    }
}
