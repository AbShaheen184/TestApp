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
public final class b extends kotlin.collections.f implements RandomAccess, Serializable {
    public static final b A;
    public Object[] e;
    public int y;
    public boolean z;

    static {
        b bVar = new b(0);
        bVar.z = true;
        A = bVar;
    }

    public b(int i) {
        if (i >= 0) {
            this.e = new Object[i];
        } else {
            net.luminis.tls.engine.impl.c.o("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        int i2 = this.y;
        if (i < 0 || i > i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return;
        }
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.e[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        h();
        int i2 = this.y;
        if (i < 0 || i > i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return false;
        }
        int size = collection.size();
        e(i, collection, size);
        return size > 0;
    }

    @Override // kotlin.collections.f
    public final int b() {
        return this.y;
    }

    @Override // kotlin.collections.f
    public final Object c(int i) {
        h();
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            return j(i);
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.y);
    }

    public final void e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.e[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.e;
            int i = this.y;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (l.a(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.e[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.y;
        if (i >= 0 && i < i2) {
            return this.e[i];
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        return null;
    }

    public final void h() {
        if (this.z) {
            k.n();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.e;
        int i = this.y;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, int i2) {
        int i3 = this.y + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.e;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.e = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.e;
        n.D(i + i2, i, this.y, objArr2, objArr2);
        this.y += i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.y; i++) {
            if (l.a(this.e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.y == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.e;
        Object obj = objArr[i];
        n.D(i, i + 1, this.y, objArr, objArr);
        Object[] objArr2 = this.e;
        int i2 = this.y - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.y--;
        return obj;
    }

    public final void k(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.e;
        n.D(i, i + i2, this.y, objArr, objArr);
        Object[] objArr2 = this.e;
        int i3 = this.y;
        com.google.android.material.resources.b.t(objArr2, i3 - i2, i3);
        this.y -= i2;
    }

    public final int l(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.e;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.e;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        n.D(i + i4, i2 + i, this.y, objArr, objArr);
        Object[] objArr3 = this.e;
        int i7 = this.y;
        com.google.android.material.resources.b.t(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.y -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.y - 1; i >= 0; i--) {
            if (l.a(this.e[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.y;
        if (i >= 0 && i <= i2) {
            return new u(this, i);
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
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
        h();
        return l(0, this.y, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        h();
        return l(0, this.y, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        int i2 = this.y;
        if (i < 0 || i >= i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return null;
        }
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        p.d(i, i2, this.y);
        return new a(this.e, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.y;
        Object[] objArr2 = this.e;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        n.D(0, 0, i, objArr2, objArr);
        int i2 = this.y;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return com.google.android.material.resources.b.a(this.e, 0, this.y, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.y;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.e[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return n.J(this.e, 0, this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        h();
        int size = collection.size();
        e(this.y, collection, size);
        return size > 0;
    }
}
