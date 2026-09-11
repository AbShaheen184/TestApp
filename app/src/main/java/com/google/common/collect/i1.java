package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends m0 {
    public static final i1 E;
    public final transient h0 D;

    static {
        e0 e0Var = h0.y;
        E = new i1(a1.B, y0.y);
    }

    public i1(h0 h0Var, Comparator comparator) {
        super(comparator);
        this.D = h0Var;
    }

    @Override // com.google.common.collect.k0, com.google.common.collect.b0
    public final h0 b() {
        return this.D;
    }

    @Override // com.google.common.collect.b0
    public final int c(int i, Object[] objArr) {
        return this.D.c(i, objArr);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iT = t(obj, true);
        h0 h0Var = this.D;
        if (iT == h0Var.size()) {
            return null;
        }
        return h0Var.get(iT);
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.D, obj, this.A) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof g1) {
            collection = ((g1) collection).j();
        }
        Comparator comparator = this.A;
        if (!q.l(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        p1 it = iterator();
        Iterator it2 = collection.iterator();
        e0 e0Var = (e0) it;
        if (!e0Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = e0Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!e0Var.hasNext()) {
                        return false;
                    }
                    next2 = e0Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.b0
    public final Object[] d() {
        return this.D.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.D.v().listIterator(0);
    }

    @Override // com.google.common.collect.b0
    public final int e() {
        return this.D.e();
    }

    @Override // com.google.common.collect.k0, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.D.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.A;
        if (!q.l(comparator, set)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            p1 it2 = iterator();
            do {
                e0 e0Var = (e0) it2;
                if (!e0Var.hasNext()) {
                    return true;
                }
                next = e0Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.b0
    public final int f() {
        return this.D.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.D.get(0);
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iS = s(obj, true) - 1;
        if (iS == -1) {
            return null;
        }
        return this.D.get(iS);
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return this.D.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iT = t(obj, false);
        h0 h0Var = this.D;
        if (iT == h0Var.size()) {
            return null;
        }
        return h0Var.get(iT);
    }

    @Override // com.google.common.collect.b0
    /* JADX INFO: renamed from: i */
    public final p1 iterator() {
        return this.D.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        h0 h0Var = this.D;
        return h0Var.get(h0Var.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iS = s(obj, false) - 1;
        if (iS == -1) {
            return null;
        }
        return this.D.get(iS);
    }

    public final i1 r(int i, int i2) {
        h0 h0Var = this.D;
        if (i == 0 && i2 == h0Var.size()) {
            return this;
        }
        Comparator comparator = this.A;
        return i < i2 ? new i1(h0Var.subList(i, i2), comparator) : m0.p(comparator);
    }

    public final int s(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.D, obj, this.A);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch + 1 : iBinarySearch;
        }
        return ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D.size();
    }

    public final int t(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.D, obj, this.A);
        if (iBinarySearch >= 0) {
            return z ? iBinarySearch : iBinarySearch + 1;
        }
        return ~iBinarySearch;
    }
}
