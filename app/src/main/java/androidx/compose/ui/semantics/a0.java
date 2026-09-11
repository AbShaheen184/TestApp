package androidx.compose.ui.semantics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {
    public static final Comparator[] a;
    public static final j b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new z(new z(i == 0 ? f.z : f.y));
            i++;
        }
        a = comparatorArr;
        b = j.T;
    }

    public static final void a(p pVar, ArrayList arrayList, androidx.compose.animation.e eVar, androidx.compose.animation.e eVar2, androidx.collection.z zVar) {
        l lVar = pVar.d;
        Object objG = lVar.e.g(t.m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) eVar2.invoke(pVar)).booleanValue()) && ((Boolean) eVar.invoke(pVar)).booleanValue()) {
            arrayList.add(pVar);
        }
        if (zBooleanValue) {
            zVar.h(pVar.g, b(pVar, eVar, eVar2, p.j(7, pVar)));
            return;
        }
        List listJ = p.j(7, pVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((p) listJ.get(i), arrayList, eVar, eVar2, zVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d5  */
    public static final ArrayList b(p pVar, androidx.compose.animation.e eVar, androidx.compose.animation.e eVar2, List list) {
        int i;
        androidx.collection.z zVar = androidx.collection.o.a;
        androidx.collection.z zVar2 = new androidx.collection.z();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((p) list.get(i2), arrayList, eVar, eVar2, zVar2);
        }
        int i3 = 1;
        char c = pVar.c.X == androidx.compose.ui.unit.m.y ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                p pVar2 = (p) arrayList.get(i4);
                if (i4 == 0) {
                    i = i3;
                    arrayList2.add(new kotlin.k(pVar2.h(), com.google.common.base.c.s(pVar2)));
                    break;
                }
                float f = pVar2.h().b;
                float f2 = pVar2.h().d;
                int i5 = f >= f2 ? i3 : 0;
                int size3 = arrayList2.size() - i3;
                if (size3 >= 0) {
                    int i6 = 0;
                    while (true) {
                        androidx.compose.ui.geometry.c cVar = (androidx.compose.ui.geometry.c) ((kotlin.k) arrayList2.get(i6)).e;
                        i = i3;
                        float f3 = cVar.b;
                        float f4 = cVar.d;
                        int i7 = f3 >= f4 ? i : 0;
                        if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i6, new kotlin.k(new androidx.compose.ui.geometry.c(Math.max(cVar.a, 0.0f), Math.max(cVar.b, f), Math.min(cVar.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((kotlin.k) arrayList2.get(i6)).y));
                            ((List) ((kotlin.k) arrayList2.get(i6)).y).add(pVar2);
                            break;
                        }
                        if (i6 != size3) {
                            i6++;
                            i3 = i;
                        }
                    }
                } else {
                    i = i3;
                }
                arrayList2.add(new kotlin.k(pVar2.h(), com.google.common.base.c.s(pVar2)));
                break;
                if (i4 == size2) {
                    break;
                }
                i4++;
                i3 = i;
            }
        }
        kotlin.collections.r.B(f.A, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            kotlin.k kVar = (kotlin.k) arrayList2.get(i8);
            kotlin.collections.r.B(comparator, (List) kVar.y);
            arrayList3.addAll((Collection) kVar.y);
        }
        kotlin.collections.r.B(new y(b, 0), arrayList3);
        int size5 = 0;
        while (size5 <= arrayList3.size() - 1) {
            List list2 = (List) zVar2.b(((p) arrayList3.get(size5)).g);
            if (list2 != null) {
                if (((Boolean) eVar2.invoke(arrayList3.get(size5))).booleanValue()) {
                    size5++;
                } else {
                    arrayList3.remove(size5);
                }
                arrayList3.addAll(size5, list2);
                size5 += list2.size();
            } else {
                size5++;
            }
        }
        return arrayList3;
    }
}
