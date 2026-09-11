package kotlin.collections.builders;

import androidx.compose.runtime.snapshots.u;
import androidx.transition.k;
import com.google.android.material.textfield.p;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.collections.n;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.collections.f implements RandomAccess, Serializable {
    public final a A;
    public final b B;
    public Object[] e;
    public final int y;
    public int z;

    public a(Object[] objArr, int i, int i2, a aVar, b bVar) {
        objArr.getClass();
        bVar.getClass();
        this.e = objArr;
        this.y = i;
        this.z = i2;
        this.A = aVar;
        this.B = bVar;
        ((AbstractList) this).modCount = ((AbstractList) bVar).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        int i2 = this.z;
        if (i < 0 || i > i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        } else {
            f(this.y + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        i();
        h();
        int i2 = this.z;
        if (i < 0 || i > i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        e(this.y + i, collection, size);
        return size > 0;
    }

    @Override // kotlin.collections.f
    public final int b() {
        h();
        return this.z;
    }

    @Override // kotlin.collections.f
    public final Object c(int i) {
        i();
        h();
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            return j(this.y + i);
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.y, this.z);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        b bVar = this.B;
        a aVar = this.A;
        if (aVar != null) {
            aVar.e(i, collection, i2);
        } else {
            b bVar2 = b.A;
            bVar.e(i, collection, i2);
        }
        this.e = bVar.e;
        this.z += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.z;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (l.a(objArr[this.y + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.B;
        a aVar = this.A;
        if (aVar != null) {
            aVar.f(i, obj);
        } else {
            b bVar2 = b.A;
            bVar.f(i, obj);
        }
        this.e = bVar.e;
        this.z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        int i2 = this.z;
        if (i >= 0 && i < i2) {
            return this.e[this.y + i];
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        return null;
    }

    public final void h() {
        if (((AbstractList) this.B).modCount == ((AbstractList) this).modCount) {
            return;
        }
        androidx.collection.g.d();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.e;
        int i = this.z;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.y + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.B.z) {
            k.n();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.z; i++) {
            if (l.a(this.e[this.y + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.z == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        Object objJ;
        ((AbstractList) this).modCount++;
        a aVar = this.A;
        if (aVar != null) {
            objJ = aVar.j(i);
        } else {
            b bVar = b.A;
            objJ = this.B.j(i);
        }
        this.z--;
        return objJ;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.A;
        if (aVar != null) {
            aVar.k(i, i2);
        } else {
            b bVar = b.A;
            this.B.k(i, i2);
        }
        this.z -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        int iL;
        a aVar = this.A;
        if (aVar != null) {
            iL = aVar.l(i, i2, collection, z);
        } else {
            b bVar = b.A;
            iL = this.B.l(i, i2, collection, z);
        }
        if (iL > 0) {
            ((AbstractList) this).modCount++;
        }
        this.z -= iL;
        return iL;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.z - 1; i >= 0; i--) {
            if (l.a(this.e[this.y + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        int i2 = this.z;
        if (i >= 0 && i <= i2) {
            return new u(this, i);
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return l(this.y, this.z, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        i();
        h();
        return l(this.y, this.z, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        int i2 = this.z;
        if (i < 0 || i >= i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.e;
        int i3 = this.y;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p.d(i, i2, this.z);
        return new a(this.e, this.y + i, i2 - i, this, this.B);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        h();
        int length = objArr.length;
        int i = this.z;
        Object[] objArr2 = this.e;
        int i2 = this.y;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        n.D(0, i2, i + i2, objArr2, objArr);
        int i3 = this.z;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return com.google.android.material.resources.b.a(this.e, this.y, this.z, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        f(this.y + this.z, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.e;
        int i = this.z;
        int i2 = this.y;
        return n.J(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        i();
        h();
        int size = collection.size();
        e(this.y + this.z, collection, size);
        return size > 0;
    }
}
