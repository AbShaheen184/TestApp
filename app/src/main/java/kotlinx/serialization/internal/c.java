package kotlinx.serialization.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n {
    public final b b;

    public c() {
        super(kotlinx.serialization.json.k.a);
        kotlinx.serialization.descriptors.f fVar = kotlinx.serialization.json.k.b;
        fVar.getClass();
        this.b = new b(fVar);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object e() {
        return new ArrayList();
    }

    @Override // kotlinx.serialization.internal.a
    public final int f(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // kotlinx.serialization.internal.a
    public final Iterator g(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object l(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList;
    }

    @Override // kotlinx.serialization.internal.n
    public final void m(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
