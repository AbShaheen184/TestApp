package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.n1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements List, kotlin.jvm.internal.markers.b {
    public int A;
    public final q e;
    public final int y;
    public int z;

    public a0(q qVar, int i, int i2) {
        this.e = qVar;
        this.y = i;
        this.z = r.g(qVar);
        this.A = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.y + this.A;
        q qVar = this.e;
        qVar.add(i, obj);
        this.A++;
        this.z = r.g(qVar);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.y;
        q qVar = this.e;
        boolean zAddAll = qVar.addAll(i2, collection);
        if (zAddAll) {
            this.A = collection.size() + this.A;
            this.z = r.g(qVar);
        }
        return zAddAll;
    }

    public final void b() {
        if (r.g(this.e) == this.z) {
            return;
        }
        androidx.collection.g.d();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.A > 0) {
            b();
            int i = this.A;
            int i2 = this.y;
            q qVar = this.e;
            qVar.e(i2, i + i2);
            this.A = 0;
            this.z = r.g(qVar);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        r.a(i, this.A);
        return this.e.get(this.y + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        int i = this.A;
        int i2 = this.y;
        Iterator it = com.google.android.material.resources.c.r(i2, i + i2).iterator();
        while (((kotlin.ranges.c) it).z) {
            int iNextInt = ((kotlin.collections.z) it).nextInt();
            if (kotlin.jvm.internal.l.a(obj, this.e.get(iNextInt))) {
                return iNextInt - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.A == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.A;
        int i2 = this.y;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (kotlin.jvm.internal.l.a(obj, this.e.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        xVar.e = i - 1;
        return new z(xVar, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.y + i;
        q qVar = this.e;
        Object objRemove = qVar.remove(i2);
        this.A--;
        this.z = r.g(qVar);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVar;
        f fVarJ;
        boolean zB;
        b();
        q qVar = this.e;
        int i2 = this.y;
        int i3 = this.A + i2;
        int size = qVar.size();
        do {
            synchronized (r.a) {
                v vVar = qVar.e;
                vVar.getClass();
                v vVar2 = (v) n.h(vVar);
                i = vVar2.d;
                cVar = vVar2.c;
            }
            cVar.getClass();
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.g gVarF = cVar.f();
            gVarF.subList(i2, i3).retainAll(collection);
            androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.c cVarD = gVarF.d();
            if (kotlin.jvm.internal.l.a(cVarD, cVar)) {
                break;
            }
            v vVar3 = qVar.e;
            vVar3.getClass();
            synchronized (n.c) {
                fVarJ = n.j();
                zB = r.b((v) n.w(vVar3, qVar, fVarJ), i, cVarD, true);
            }
            n.n(fVarJ, qVar);
        } while (!zB);
        int size2 = size - qVar.size();
        if (size2 > 0) {
            this.z = r.g(this.e);
            this.A -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        r.a(i, this.A);
        b();
        int i2 = i + this.y;
        q qVar = this.e;
        Object obj2 = qVar.set(i2, obj);
        this.z = r.g(qVar);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.A;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.A) {
            n1.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.y;
        return new a0(this.e, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.b(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.k.c(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.y + i;
        q qVar = this.e;
        qVar.add(i2, obj);
        this.A++;
        this.z = r.g(qVar);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.A, collection);
    }
}
