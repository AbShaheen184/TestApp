package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements CharSequence {
    public final ArrayList A;
    public final List e;
    public final String y;
    public final ArrayList z;

    static {
        androidx.compose.foundation.text.input.internal.o oVar = c0.a;
    }

    public g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.e = list;
        this.y = str;
        int i = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i2 = 0; i2 < size; i2++) {
                e eVar = (e) list.get(i2);
                Object obj = eVar.a;
                if (obj instanceof e0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(eVar);
                } else if (obj instanceof s) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(eVar);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.z = arrayList;
        this.A = arrayList2;
        List listF0 = arrayList2 != null ? kotlin.collections.o.f0(arrayList2, new f(i)) : null;
        if (listF0 == null || listF0.isEmpty()) {
            return;
        }
        int i3 = ((e) kotlin.collections.o.K(listF0)).c;
        androidx.collection.y yVar = androidx.collection.m.a;
        androidx.collection.y yVar2 = new androidx.collection.y(1);
        yVar2.a(i3);
        int size2 = listF0.size();
        for (int i4 = 1; i4 < size2; i4++) {
            e eVar2 = (e) listF0.get(i4);
            while (true) {
                int i5 = yVar2.b;
                if (i5 == 0) {
                    break;
                }
                if (i5 == 0) {
                    androidx.transition.k.m("IntList is empty.");
                    throw null;
                }
                int i6 = yVar2.a[i5 - 1];
                int i7 = eVar2.b;
                int i8 = eVar2.c;
                if (i7 < i6) {
                    if (i8 > i6) {
                        androidx.compose.ui.text.internal.a.a("Paragraph overlap not allowed, end " + i8 + " should be less than or equal to " + i6);
                        break;
                    }
                    break;
                }
                yVar2.d(i5 - 1);
            }
            yVar2.a(eVar2.c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            androidx.compose.ui.text.internal.a.a("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.y;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String strSubstring = str.substring(i, i2);
        g gVar = h.a;
        if (i > i2) {
            androidx.compose.ui.text.internal.a.a("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.e;
        if (list == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                e eVar = (e) list.get(i3);
                int i4 = eVar.b;
                int i5 = eVar.c;
                if (h.b(i, i2, i4, i5)) {
                    arrayList.add(new e(Math.max(i, eVar.b) - i, eVar.d, eVar.a, Math.min(i2, i5) - i));
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        return new g(arrayList, strSubstring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.y.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.l.a(this.y, gVar.y) && kotlin.jvm.internal.l.a(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.y.hashCode() * 31;
        List list = this.e;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.y.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.y;
    }

    public /* synthetic */ g(String str) {
        this(str, kotlin.collections.u.e);
    }

    public g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
