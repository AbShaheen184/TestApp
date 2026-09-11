package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class d extends AbstractMap {
    public final /* synthetic */ x0 A;
    public transient b e;
    public transient n y;
    public final transient Map z;

    public d(x0 x0Var, Map map) {
        this.A = x0Var;
        this.z = map;
    }

    public final c0 a(Map.Entry entry) {
        Object key = entry.getKey();
        List list = (List) ((Collection) entry.getValue());
        boolean z = list instanceof RandomAccess;
        x0 x0Var = this.A;
        return new c0(key, z ? new h(x0Var, key, list, null) : new l(x0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        x0 x0Var = this.A;
        if (this.z == x0Var.A) {
            x0Var.d();
            return;
        }
        c cVar = new c(this);
        while (cVar.hasNext()) {
            cVar.next();
            cVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.z;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        b bVar = this.e;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.e = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.z.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.z;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        List list = (List) collection;
        boolean z = list instanceof RandomAccess;
        x0 x0Var = this.A;
        return z ? new h(x0Var, obj, list, null) : new l(x0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.z.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        x0 x0Var = this.A;
        Set set = x0Var.e;
        if (set != null) {
            return set;
        }
        Set setC = x0Var.c();
        x0Var.e = setC;
        return setC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.z.remove(obj);
        if (collection == null) {
            return null;
        }
        x0 x0Var = this.A;
        Collection collectionE = x0Var.e();
        collectionE.addAll(collection);
        x0Var.B -= collection.size();
        collection.clear();
        return collectionE;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.z.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.z.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        n nVar = this.y;
        if (nVar != null) {
            return nVar;
        }
        n nVar2 = new n(this);
        this.y = nVar2;
        return nVar2;
    }
}
