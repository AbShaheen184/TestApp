package kotlin.collections;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends r {
    public static void C(Collection collection, Iterable iterable) {
        collection.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static s D(Iterable iterable) {
        iterable.getClass();
        return new s(iterable, 0);
    }

    public static double E(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static ArrayList F(int i, List list) {
        list.getClass();
        com.google.android.material.motion.a.r(i, i);
        if (!(list instanceof RandomAccess)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            it.getClass();
            Iterator itG = !it.hasNext() ? t.e : com.google.android.material.resources.g.g(new e0(i, i, it, null));
            while (itG.hasNext()) {
                arrayList.add((List) itG.next());
            }
            return arrayList;
        }
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean G(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return O(iterable, obj) >= 0;
    }

    public static List H(List list) {
        int size = list.size() - 1;
        if (size <= 0) {
            return u.e;
        }
        if (size == 1) {
            return com.google.common.base.c.p(S(list));
        }
        ArrayList arrayList = new ArrayList(size);
        if (list instanceof RandomAccess) {
            int size2 = list.size();
            for (int i = 1; i < size2; i++) {
                arrayList.add(list.get(i));
            }
        } else {
            ListIterator listIterator = list.listIterator(1);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static ArrayList I(Iterable iterable) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object J(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            return K((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        androidx.transition.k.m("Collection is empty.");
        return null;
    }

    public static Object K(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(0);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object L(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object M(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object N(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int O(Iterable iterable, Object obj) {
        iterable.getClass();
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                com.google.common.base.c.w();
                throw null;
            }
            if (kotlin.jvm.internal.l.a(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void P(Iterable iterable, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, kotlin.jvm.functions.l lVar) {
        iterable.getClass();
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            com.google.android.material.sidesheet.b.c(sb, obj, lVar);
        }
        sb.append(charSequence3);
    }

    public static /* synthetic */ void Q(List list, StringBuilder sb, androidx.compose.ui.text.font.e eVar, int i) {
        if ((i & 64) != 0) {
            eVar = null;
        }
        P(list, sb, "\n", "", "", "...", eVar);
    }

    public static String R(Iterable iterable, CharSequence charSequence, String str, String str2, kotlin.jvm.functions.l lVar, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            lVar = null;
        }
        iterable.getClass();
        charSequence2.getClass();
        str3.getClass();
        StringBuilder sb = new StringBuilder();
        P(iterable, sb, charSequence2, str3, str4, "...", lVar);
        return sb.toString();
    }

    public static Object S(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.get(list.size() - 1);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object T(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable U(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList V(Iterable iterable, Object obj) {
        iterable.getClass();
        ArrayList arrayList = new ArrayList(p.y(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.l.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList W(Collection collection, Object obj) {
        collection.getClass();
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList X(Collection collection, List list) {
        collection.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size() + collection.size());
        arrayList.addAll(collection);
        arrayList.addAll(list);
        return arrayList;
    }

    public static Object Y(List list) {
        kotlin.random.a aVar = kotlin.random.d.e;
        if (list.isEmpty()) {
            androidx.transition.k.m("Collection is empty.");
            return null;
        }
        return list.get(kotlin.random.d.e.g(list.size()));
    }

    public static Object Z(ArrayList arrayList) {
        kotlin.random.a aVar = kotlin.random.d.e;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.get(kotlin.random.d.e.g(arrayList.size()));
    }

    public static Object a0(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            return arrayList.remove(0);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object b0(List list) {
        list.getClass();
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        androidx.transition.k.m("List is empty.");
        return null;
    }

    public static Object c0(AbstractList abstractList) {
        if (abstractList.isEmpty()) {
            return null;
        }
        return abstractList.remove(abstractList.size() - 1);
    }

    public static List d0(Iterable iterable) {
        iterable.getClass();
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return k0(iterable);
        }
        List listM0 = m0(iterable);
        Collections.reverse(listM0);
        return listM0;
    }

    public static List e0(List list) {
        list.getClass();
        if (list.size() <= 1) {
            return k0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        comparableArr.getClass();
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        array.getClass();
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List f0(Iterable iterable, Comparator comparator) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            List listM0 = m0(iterable);
            r.B(comparator, listM0);
            return listM0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return k0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        array.getClass();
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        List listAsList = Arrays.asList(array);
        listAsList.getClass();
        return listAsList;
    }

    public static List g0(int i, List list) {
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Requested element count ", i, " is less than zero."));
            return null;
        }
        if (i == 0) {
            return u.e;
        }
        if (i >= list.size()) {
            return k0(list);
        }
        if (i == 1) {
            return com.google.common.base.c.p(J(list));
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return com.google.common.base.c.t(arrayList);
    }

    public static byte[] h0(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static final void i0(Iterable iterable, AbstractCollection abstractCollection) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] j0(List list) {
        list.getClass();
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List k0(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            return com.google.common.base.c.t(m0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return u.e;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return com.google.common.base.c.p(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList l0(Collection collection) {
        collection.getClass();
        return new ArrayList(collection);
    }

    public static final List m0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        i0(iterable, arrayList);
        return arrayList;
    }

    public static Set n0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        i0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set o0(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return com.google.common.base.i.t(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(a0.u(collection.size()));
                i0(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            i0(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : com.google.common.base.i.t(linkedHashSet2.iterator().next());
            }
        }
        return w.e;
    }
}
