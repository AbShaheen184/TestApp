package com.google.common.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends b0 implements List, RandomAccess {
    public static final e0 y = new e0(a1.B, 0);

    public static a1 j(int i, Object[] objArr) {
        return i == 0 ? a1.B : new a1(objArr, i);
    }

    public static d0 k() {
        return new d0(4);
    }

    public static d0 l(int i) {
        q.f(i, "expectedSize");
        return new d0(i);
    }

    public static h0 n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return a1.B;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return s(next);
        }
        d0 d0Var = new d0(4);
        d0Var.b(next);
        while (it.hasNext()) {
            d0Var.b(it.next());
        }
        return d0Var.g();
    }

    public static h0 o(Collection collection) {
        if (!(collection instanceof b0)) {
            Object[] array = collection.toArray();
            q.e(array.length, array);
            return j(array.length, array);
        }
        h0 h0VarB = ((b0) collection).b();
        if (!h0VarB.h()) {
            return h0VarB;
        }
        Object[] array2 = h0VarB.toArray(b0.e);
        return j(array2.length, array2);
    }

    public static a1 p(Object[] objArr) {
        if (objArr.length == 0) {
            return a1.B;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        q.e(objArr2.length, objArr2);
        return j(objArr2.length, objArr2);
    }

    public static a1 r(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        q.e(5, objArr);
        return j(5, objArr);
    }

    public static a1 s(Object obj) {
        Object[] objArr = {obj};
        q.e(1, objArr);
        return j(1, objArr);
    }

    public static a1 t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        q.e(2, objArr);
        return j(2, objArr);
    }

    public static a1 u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        com.google.android.material.motion.a.e("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        q.e(length, objArr2);
        return j(length, objArr2);
    }

    public static a1 w(Comparator comparator, List list) {
        comparator.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        q.e(array.length, array);
        Arrays.sort(array, comparator);
        return j(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.b0
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && kotlin.collections.a0.n(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (kotlin.collections.a0.n(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // com.google.common.collect.b0
    /* JADX INFO: renamed from: i */
    public final p1 iterator() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final e0 listIterator(int i) {
        com.google.android.material.motion.a.n(i, size());
        return isEmpty() ? y : new e0(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public h0 v() {
        return size() <= 1 ? this : new f0(this);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public h0 subList(int i, int i2) {
        com.google.android.material.motion.a.o(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        return i3 == 0 ? a1.B : new g0(this, i, i3);
    }

    @Override // com.google.common.collect.b0
    public final h0 b() {
        return this;
    }
}
