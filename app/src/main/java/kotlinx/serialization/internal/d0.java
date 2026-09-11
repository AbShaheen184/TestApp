package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a {
    public final kotlinx.serialization.a a;
    public final c0 b;

    public d0(kotlinx.serialization.a aVar) {
        y0 y0Var = y0.a;
        this.a = aVar;
        this.b = new c0(y0.b, aVar.d());
    }

    @Override // kotlinx.serialization.a
    public final void b(kotlinx.serialization.json.internal.n nVar, Object obj) {
        h(obj);
        c0 c0Var = this.b;
        c0Var.getClass();
        kotlinx.serialization.json.internal.n nVarA = nVar.a(c0Var);
        Iterator itG = g(obj);
        int i = 0;
        while (itG.hasNext()) {
            Map.Entry entry = (Map.Entry) itG.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            nVarA.o(c0Var, i, y0.a, key);
            i += 2;
            nVarA.o(c0Var, i2, this.a, value);
        }
        nVarA.s(c0Var);
    }

    @Override // kotlinx.serialization.a
    public final kotlinx.serialization.descriptors.e d() {
        return this.b;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object e() {
        return new LinkedHashMap();
    }

    @Override // kotlinx.serialization.internal.a
    public final int f(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap.size() * 2;
    }

    @Override // kotlinx.serialization.internal.a
    public final Iterator g(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.entrySet().iterator();
    }

    @Override // kotlinx.serialization.internal.a
    public final int h(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        return map.size();
    }

    @Override // kotlinx.serialization.internal.a
    public final void j(kotlinx.serialization.encoding.a aVar, int i, Object obj) {
        Map map = (Map) obj;
        map.getClass();
        y0 y0Var = y0.a;
        c0 c0Var = this.b;
        Object objW = aVar.w(c0Var, i, y0Var, null);
        int iS = aVar.s(c0Var);
        if (iS != i + 1) {
            net.luminis.tls.engine.impl.c.p(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("Value must follow key in a map, index for key: ", i, ", returned index for value: ", iS));
            return;
        }
        boolean zContainsKey = map.containsKey(objW);
        kotlinx.serialization.a aVar2 = this.a;
        map.put(objW, (!zContainsKey || (aVar2.d().e() instanceof kotlinx.serialization.descriptors.d)) ? aVar.w(c0Var, iS, aVar2, null) : aVar.w(c0Var, iS, aVar2, kotlin.collections.a0.r(objW, map)));
    }

    @Override // kotlinx.serialization.internal.a
    public final Object k(Object obj) {
        throw null;
    }

    @Override // kotlinx.serialization.internal.a
    public final Object l(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        linkedHashMap.getClass();
        return linkedHashMap;
    }
}
