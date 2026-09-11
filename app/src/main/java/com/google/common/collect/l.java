package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class l extends AbstractCollection implements List {
    public final Collection A;
    public final /* synthetic */ x0 B;
    public final /* synthetic */ x0 C;
    public final Object e;
    public Collection y;
    public final l z;

    public l(x0 x0Var, Object obj, List list, l lVar) {
        this.C = x0Var;
        this.B = x0Var;
        this.e = obj;
        this.y = list;
        this.z = lVar;
        this.A = lVar == null ? null : lVar.y;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.y.isEmpty();
        boolean zAdd = this.y.add(obj);
        if (zAdd) {
            this.B.B++;
            if (zIsEmpty) {
                b();
            }
        }
        return zAdd;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.y).addAll(i, collection);
        if (zAddAll) {
            this.C.B += this.y.size() - size;
            if (size == 0) {
                b();
            }
        }
        return zAddAll;
    }

    public final void b() {
        l lVar = this.z;
        if (lVar != null) {
            lVar.b();
        } else {
            this.B.A.put(this.e, this.y);
        }
    }

    public final void c() {
        Collection collection;
        l lVar = this.z;
        if (lVar != null) {
            lVar.c();
            if (lVar.y == this.A) {
                return;
            }
            androidx.collection.g.d();
            return;
        }
        if (!this.y.isEmpty() || (collection = (Collection) this.B.A.get(this.e)) == null) {
            return;
        }
        this.y = collection;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.y.clear();
        this.B.B -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        c();
        return this.y.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        c();
        return this.y.containsAll(collection);
    }

    public final void d() {
        l lVar = this.z;
        if (lVar != null) {
            lVar.d();
        } else if (this.y.isEmpty()) {
            this.B.A.remove(this.e);
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.y.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        c();
        return ((List) this.y).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        c();
        return this.y.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.y).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        c();
        return new c(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.y).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new k(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.y.remove(obj);
        if (zRemove) {
            this.B.B--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.y.removeAll(collection);
        if (zRemoveAll) {
            this.B.B += this.y.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.y.retainAll(collection);
        if (zRetainAll) {
            this.B.B += this.y.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        c();
        return ((List) this.y).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        c();
        return this.y.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        c();
        List listSubList = ((List) this.y).subList(i, i2);
        l lVar = this.z;
        if (lVar == null) {
            lVar = this;
        }
        boolean z = listSubList instanceof RandomAccess;
        x0 x0Var = this.C;
        Object obj = this.e;
        return z ? new h(x0Var, obj, listSubList, lVar) : new l(x0Var, obj, listSubList, lVar);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.y.toString();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        c();
        return new k(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        c();
        Object objRemove = ((List) this.y).remove(i);
        this.C.B--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        c();
        boolean zIsEmpty = this.y.isEmpty();
        ((List) this.y).add(i, obj);
        this.C.B++;
        if (zIsEmpty) {
            b();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.y.addAll(collection);
        if (zAddAll) {
            this.B.B += this.y.size() - size;
            if (size == 0) {
                b();
            }
        }
        return zAddAll;
    }
}
