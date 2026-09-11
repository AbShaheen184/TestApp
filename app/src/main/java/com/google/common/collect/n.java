package com.google.common.collect;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends AbstractCollection {
    public final /* synthetic */ int e;
    public final Object y;

    public n(AbstractMap abstractMap) {
        this.e = 2;
        this.y = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.e) {
            case 0:
                ((x0) this.y).d();
                break;
            case 1:
                ((u) this.y).clear();
                break;
            default:
                ((AbstractMap) this.y).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                Iterator it = ((x0) this.y).a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((AbstractMap) this.y).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.e) {
            case 2:
                return ((AbstractMap) this.y).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new a((x0) this.y);
            case 1:
                u uVar = (u) this.y;
                Map mapB = uVar.b();
                return mapB != null ? mapB.values().iterator() : new r(uVar, 2);
            default:
                return new v0(((AbstractMap) this.y).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.e) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.y;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (kotlin.collections.a0.n(obj, entry.getValue())) {
                            abstractMap.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.e) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.y;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.e) {
            case 2:
                AbstractMap abstractMap = (AbstractMap) this.y;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.e) {
            case 0:
                return ((x0) this.y).B;
            case 1:
                return ((u) this.y).size();
            default:
                return ((AbstractMap) this.y).size();
        }
    }

    public /* synthetic */ n(int i, Serializable serializable) {
        this.e = i;
        this.y = serializable;
    }
}
