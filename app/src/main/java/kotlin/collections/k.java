package kotlin.collections;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends f {
    public static final Object[] A = new Object[0];
    public int e;
    public Object[] y;
    public int z;

    public k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = A;
        } else {
            if (i <= 0) {
                net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Illegal Capacity: "));
                throw null;
            }
            objArr = new Object[i];
        }
        this.y = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.z;
        if (i < 0 || i > i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        n();
        e(this.z + 1);
        int iL = l(this.e + i);
        int i3 = this.z;
        if (i < ((i3 + 1) >> 1)) {
            if (iL == 0) {
                Object[] objArr = this.y;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iL - 1;
            }
            int length2 = this.e;
            if (length2 == 0) {
                Object[] objArr2 = this.y;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.e;
            Object[] objArr3 = this.y;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                n.D(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                n.D(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.y;
                objArr4[objArr4.length - 1] = objArr4[0];
                n.D(0, 1, length + 1, objArr4, objArr4);
            }
            this.y[length] = obj;
            this.e = i4;
        } else {
            int iL2 = l(i3 + this.e);
            Object[] objArr5 = this.y;
            if (iL < iL2) {
                n.D(iL + 1, iL, iL2, objArr5, objArr5);
            } else {
                n.D(1, 0, iL2, objArr5, objArr5);
                Object[] objArr6 = this.y;
                objArr6[0] = objArr6[objArr6.length - 1];
                n.D(iL + 1, iL, objArr6.length - 1, objArr6, objArr6);
            }
            this.y[iL] = obj;
        }
        this.z++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.z;
        if (i < 0 || i > i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.z) {
            return addAll(collection);
        }
        n();
        e(collection.size() + this.z);
        int iL = l(this.z + this.e);
        int iL2 = l(this.e + i);
        int size = collection.size();
        if (i >= ((this.z + 1) >> 1)) {
            int i3 = iL2 + size;
            Object[] objArr = this.y;
            if (iL2 < iL) {
                int i4 = size + iL;
                if (i4 <= objArr.length) {
                    n.D(i3, iL2, iL, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    n.D(i3 - objArr.length, iL2, iL, objArr, objArr);
                } else {
                    int length = iL - (i4 - objArr.length);
                    n.D(0, length, iL, objArr, objArr);
                    Object[] objArr2 = this.y;
                    n.D(i3, iL2, length, objArr2, objArr2);
                }
            } else {
                n.D(size, 0, iL, objArr, objArr);
                Object[] objArr3 = this.y;
                if (i3 >= objArr3.length) {
                    n.D(i3 - objArr3.length, iL2, objArr3.length, objArr3, objArr3);
                } else {
                    n.D(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.y;
                    n.D(i3, iL2, objArr4.length - size, objArr4, objArr4);
                }
            }
            d(iL2, collection);
            return true;
        }
        int i5 = this.e;
        int length2 = i5 - size;
        Object[] objArr5 = this.y;
        if (iL2 < i5) {
            n.D(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.y;
            if (size >= iL2) {
                n.D(objArr6.length - size, 0, iL2, objArr6, objArr6);
            } else {
                n.D(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.y;
                n.D(0, size, iL2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            n.D(length2, i5, iL2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iL2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                n.D(length2, i5, iL2, objArr5, objArr5);
            } else {
                n.D(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.y;
                n.D(0, this.e + length3, iL2, objArr8, objArr8);
            }
        }
        this.e = length2;
        d(j(iL2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        n();
        e(this.z + 1);
        int length = this.e;
        if (length == 0) {
            Object[] objArr = this.y;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.e = i;
        this.y[i] = obj;
        this.z++;
    }

    public final void addLast(Object obj) {
        n();
        e(b() + 1);
        this.y[l(b() + this.e)] = obj;
        this.z = b() + 1;
    }

    @Override // kotlin.collections.f
    public final int b() {
        return this.z;
    }

    @Override // kotlin.collections.f
    public final Object c(int i) {
        int i2 = this.z;
        if (i < 0 || i >= i2) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", i2));
            return null;
        }
        if (i == b() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        n();
        int iL = l(this.e + i);
        Object[] objArr = this.y;
        Object obj = objArr[iL];
        int i3 = this.z >> 1;
        int i4 = this.e;
        if (i < i3) {
            if (iL >= i4) {
                n.D(i4 + 1, i4, iL, objArr, objArr);
            } else {
                n.D(1, 0, iL, objArr, objArr);
                Object[] objArr2 = this.y;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.e;
                n.D(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.y;
            int i6 = this.e;
            objArr3[i6] = null;
            this.e = h(i6);
        } else {
            int iL2 = l((b() - 1) + i4);
            Object[] objArr4 = this.y;
            if (iL <= iL2) {
                n.D(iL, iL + 1, iL2 + 1, objArr4, objArr4);
            } else {
                n.D(iL, iL + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.y;
                objArr5[objArr5.length - 1] = objArr5[0];
                n.D(0, 1, iL2 + 1, objArr5, objArr5);
            }
            this.y[iL2] = null;
        }
        this.z--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            n();
            k(this.e, l(b() + this.e));
        }
        this.e = 0;
        this.z = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.y.length;
        while (i < length && it.hasNext()) {
            this.y[i] = it.next();
            i++;
        }
        int i2 = this.e;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.y[i3] = it.next();
        }
        this.z = collection.size() + this.z;
    }

    public final void e(int i) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.r("Deque is too big.");
            return;
        }
        Object[] objArr = this.y;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == A) {
            if (i < 10) {
                i = 10;
            }
            this.y = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        n.D(0, this.e, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.y;
        int length2 = objArr3.length;
        int i3 = this.e;
        n.D(length2 - i3, 0, i3, objArr3, objArr2);
        this.e = 0;
        this.y = objArr2;
    }

    public final Object f() {
        if (isEmpty()) {
            return null;
        }
        return this.y[this.e];
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.y[this.e];
        }
        androidx.transition.k.m("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iB = b();
        if (i >= 0 && i < iB) {
            return this.y[l(this.e + i)];
        }
        com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", iB));
        return null;
    }

    public final int h(int i) {
        Object[] objArr = this.y;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final Object i() {
        if (isEmpty()) {
            return null;
        }
        return this.y[l((size() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iL = l(b() + this.e);
        int length = this.e;
        if (length < iL) {
            while (length < iL) {
                if (kotlin.jvm.internal.l.a(obj, this.y[length])) {
                    i = this.e;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.e) < iL) {
            return -1;
        }
        int length2 = this.y.length;
        while (length < length2) {
            if (kotlin.jvm.internal.l.a(obj, this.y[length])) {
                i = this.e;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iL; i2++) {
            if (kotlin.jvm.internal.l.a(obj, this.y[i2])) {
                length = i2 + this.y.length;
                i = this.e;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final int j(int i) {
        return i < 0 ? i + this.y.length : i;
    }

    public final void k(int i, int i2) {
        Object[] objArr = this.y;
        if (i < i2) {
            n.K(i, i2, null, objArr);
        } else {
            n.K(i, objArr.length, null, objArr);
            n.K(0, i2, null, this.y);
        }
    }

    public final int l(int i) {
        Object[] objArr = this.y;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            androidx.transition.k.m("ArrayDeque is empty.");
            return null;
        }
        return this.y[l((size() - 1) + this.e)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iL = l(this.z + this.e);
        int i2 = this.e;
        if (i2 < iL) {
            length = iL - 1;
            if (i2 <= length) {
                while (!kotlin.jvm.internal.l.a(obj, this.y[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.e;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.e >= iL) {
            do {
                iL--;
                objArr = this.y;
                if (-1 >= iL) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.e;
                    if (i3 <= length) {
                        while (!kotlin.jvm.internal.l.a(obj, this.y[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.e;
                    }
                }
                return length - i;
            } while (!kotlin.jvm.internal.l.a(obj, objArr[iL]));
            length = iL + this.y.length;
            i = this.e;
            return length - i;
        }
        return -1;
    }

    public final void n() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iL;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.y.length != 0) {
            int iL2 = l(b() + this.e);
            int i = this.e;
            if (i < iL2) {
                iL = i;
                while (true) {
                    objArr = this.y;
                    if (i >= iL2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.y[iL] = obj;
                        iL++;
                    }
                    i++;
                }
                n.K(iL, iL2, null, objArr);
            } else {
                int length = this.y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.y;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.y[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iL = l(i2);
                for (int i3 = 0; i3 < iL2; i3++) {
                    Object[] objArr3 = this.y;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.y[iL] = obj3;
                        iL = h(iL);
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.z = j(iL - this.e);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            androidx.transition.k.m("ArrayDeque is empty.");
            return null;
        }
        n();
        Object[] objArr = this.y;
        int i = this.e;
        Object obj = objArr[i];
        objArr[i] = null;
        this.e = h(i);
        this.z = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            androidx.transition.k.m("ArrayDeque is empty.");
            return null;
        }
        n();
        int iL = l((size() - 1) + this.e);
        Object[] objArr = this.y;
        Object obj = objArr[iL];
        objArr[iL] = null;
        this.z = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        com.google.android.material.textfield.p.d(i, i2, this.z);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.z) {
            clear();
            return;
        }
        if (i3 == 1) {
            c(i);
            return;
        }
        n();
        int i4 = this.z - i2;
        int i5 = this.e;
        if (i < i4) {
            int iL = l((i - 1) + i5);
            int iL2 = l(this.e + (i2 - 1));
            while (i > 0) {
                int i6 = iL + 1;
                int iMin = Math.min(i, Math.min(i6, iL2 + 1));
                Object[] objArr = this.y;
                int i7 = iL2 - iMin;
                int i8 = iL - iMin;
                n.D(i7 + 1, i8 + 1, i6, objArr, objArr);
                iL = j(i8);
                iL2 = j(i7);
                i -= iMin;
            }
            int iL3 = l(this.e + i3);
            k(this.e, iL3);
            this.e = iL3;
        } else {
            int iL4 = l(i5 + i2);
            int iL5 = l(this.e + i);
            int i9 = this.z;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.y;
                i2 = Math.min(i9, Math.min(objArr2.length - iL4, objArr2.length - iL5));
                Object[] objArr3 = this.y;
                int i10 = iL4 + i2;
                n.D(iL5, iL4, i10, objArr3, objArr3);
                iL4 = l(i10);
                iL5 = l(iL5 + i2);
            }
            int iL6 = l(this.z + this.e);
            k(j(iL6 - i3), iL6);
        }
        this.z -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iL;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.y.length != 0) {
            int iL2 = l(b() + this.e);
            int i = this.e;
            if (i < iL2) {
                iL = i;
                while (true) {
                    objArr = this.y;
                    if (i >= iL2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.y[iL] = obj;
                        iL++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                n.K(iL, iL2, null, objArr);
            } else {
                int length = this.y.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.y;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.y[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iL = l(i2);
                for (int i3 = 0; i3 < iL2; i3++) {
                    Object[] objArr3 = this.y;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.y[iL] = obj3;
                        iL = h(iL);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                n();
                this.z = j(iL - this.e);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iB = b();
        if (i < 0 || i >= iB) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", iB));
            return null;
        }
        int iL = l(this.e + i);
        Object[] objArr = this.y;
        Object obj2 = objArr[iL];
        objArr[iL] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.z;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iL = l(this.z + this.e);
        int i2 = this.e;
        if (i2 < iL) {
            n.H(i2, iL, 2, this.y, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.y;
            n.D(0, this.e, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.y;
            n.D(objArr3.length - this.e, 0, iL, objArr3, objArr);
        }
        int i3 = this.z;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public k() {
        this.y = A;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        n();
        e(collection.size() + b());
        d(l(b() + this.e), collection);
        return true;
    }
}
