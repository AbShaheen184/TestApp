package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends AbstractMap {
    public static final /* synthetic */ int D = 0;
    public boolean A;
    public volatile androidx.collection.a B;
    public Map C;
    public Object[] e;
    public int y;
    public Map z;

    public static c2 f() {
        c2 c2Var = new c2();
        Map map = Collections.EMPTY_MAP;
        c2Var.z = map;
        c2Var.C = map;
        return c2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x003a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0030 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int i4 = this.y;
        int i5 = i4 - 1;
        if (i5 < 0) {
            i = 0;
            while (i <= i5) {
                i3 = (i + i5) / 2;
                iCompareTo = comparable.compareTo(((d2) this.e[i3]).e);
                if (iCompareTo < 0) {
                    i5 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((d2) this.e[i5]).e);
            if (iCompareTo2 > 0) {
                i2 = i4 + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i5;
                }
                i = 0;
                while (i <= i5) {
                    i3 = (i + i5) / 2;
                    iCompareTo = comparable.compareTo(((d2) this.e[i3]).e);
                    if (iCompareTo < 0) {
                        i5 = i3 - 1;
                    } else {
                        if (iCompareTo > 0) {
                            return i3;
                        }
                        i = i3 + 1;
                    }
                }
                i2 = i + 1;
            }
        }
        return -i2;
    }

    public final void b() {
        if (this.A) {
            androidx.transition.k.n();
        }
    }

    public final d2 c(int i) {
        if (i < this.y) {
            return (d2) this.e[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (this.y != 0) {
            this.e = null;
            this.y = 0;
        }
        if (this.z.isEmpty()) {
            return;
        }
        this.z.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.z.containsKey(comparable);
    }

    public final Set d() {
        return this.z.isEmpty() ? Collections.EMPTY_SET : this.z.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.z.isEmpty() && !(this.z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.z = treeMap;
            this.C = treeMap.descendingMap();
        }
        return (SortedMap) this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.B == null) {
            this.B = new androidx.collection.a(this, 4);
        }
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return super.equals(obj);
        }
        c2 c2Var = (c2) obj;
        int size = size();
        if (size == c2Var.size()) {
            int i = this.y;
            if (i != c2Var.y) {
                return ((AbstractSet) entrySet()).equals(c2Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (c(i2).equals(c2Var.c(i2))) {
                }
            }
            if (i != size) {
                return this.z.equals(c2Var.z);
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int iA = a(comparable);
        if (iA >= 0) {
            return ((d2) this.e[iA]).setValue(obj);
        }
        b();
        if (this.e == null) {
            this.e = new Object[16];
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        int i2 = this.y;
        if (i2 == 16) {
            d2 d2Var = (d2) this.e[15];
            this.y = i2 - 1;
            e().put(d2Var.e, d2Var.y);
        }
        Object[] objArr = this.e;
        System.arraycopy(objArr, i, objArr, i + 1, (objArr.length - i) - 1);
        this.e[i] = new d2(this, comparable, obj);
        this.y++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((d2) this.e[iA]).y : this.z.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object[] objArr = this.e;
        Object obj = ((d2) objArr[i]).y;
        System.arraycopy(objArr, i + 1, objArr, i, (this.y - i) - 1);
        this.y--;
        if (!this.z.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            Object[] objArr2 = this.e;
            int i2 = this.y;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new d2(this, (Comparable) entry.getKey(), entry.getValue());
            this.y++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.y;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += this.e[i2].hashCode();
        }
        return this.z.size() > 0 ? this.z.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.z.isEmpty()) {
            return null;
        }
        return this.z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.z.size() + this.y;
    }
}
