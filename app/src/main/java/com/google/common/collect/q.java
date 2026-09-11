package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public final /* synthetic */ int e = 2;

    public static int d(int i) {
        if (i < 3) {
            f(i, "expectedSize");
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) Math.ceil(((double) i) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void e(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                com.google.gson.b.h(androidx.privacysandbox.ads.adservices.java.internal.a.l(i2, "at index "));
                return;
            }
        }
    }

    public static void f(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static Object g(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            net.luminis.tls.engine.impl.c.o(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    public static boolean i(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static Object j(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object k(Iterable iterable) {
        Object next;
        if (!(iterable instanceof List)) {
            Iterator it = iterable.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    public static boolean l(Comparator comparator, Collection collection) {
        Object objComparator;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            objComparator = ((SortedSet) collection).comparator();
            if (objComparator == null) {
                objComparator = y0.y;
            }
        } else {
            if (!(collection instanceof m0)) {
                return false;
            }
            objComparator = ((m0) collection).A;
        }
        return comparator.equals(objComparator);
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static l1 n(Set set, k0 k0Var) {
        com.google.android.material.motion.a.m(set, "set1");
        com.google.android.material.motion.a.m(k0Var, "set2");
        return new l1(set, k0Var);
    }

    public static int o(int i, int i2, int i3) {
        return (i & (~i3)) | (i2 & i3);
    }

    public static ArrayList p(Object... objArr) {
        int length = objArr.length;
        f(length, "arraySize");
        ArrayList arrayList = new ArrayList(kotlin.collections.a0.C(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int q(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iT = t(obj);
        int i2 = iT & i;
        int iU = u(i2, obj3);
        if (iU != 0) {
            int i3 = ~i;
            int i4 = iT & i3;
            int i5 = -1;
            while (true) {
                int i6 = iU - 1;
                int i7 = iArr[i6];
                if ((i7 & i3) == i4 && kotlin.collections.a0.n(obj, objArr[i6]) && (objArr2 == null || kotlin.collections.a0.n(obj2, objArr2[i6]))) {
                    int i8 = i7 & i;
                    if (i5 == -1) {
                        v(i2, i8, obj3);
                        return i6;
                    }
                    iArr[i5] = o(iArr[i5], i8, i);
                    return i6;
                }
                int i9 = i7 & i;
                if (i9 == 0) {
                    break;
                }
                i5 = i6;
                iU = i9;
            }
        }
        return -1;
    }

    public static List r(List list) {
        if (list instanceof h0) {
            return ((h0) list).v();
        }
        if (list instanceof r0) {
            return ((r0) list).e;
        }
        return list instanceof RandomAccess ? new p0(list) : new r0(list);
    }

    public static int s(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static int t(Object obj) {
        return s(obj == null ? 0 : obj.hashCode());
    }

    public static int u(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i] & 65535 : ((int[]) obj)[i];
    }

    public static void v(int i, int i2, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }

    public static AbstractList w(List list, com.google.common.base.f fVar) {
        return list instanceof RandomAccess ? new t0(list, fVar) : new u0(list, fVar);
    }

    public abstract Object h();

    public String toString() {
        switch (this.e) {
            case 2:
                return h().toString();
            default:
                return super.toString();
        }
    }
}
