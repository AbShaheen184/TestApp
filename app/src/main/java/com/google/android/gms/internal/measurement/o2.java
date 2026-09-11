package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends AbstractMap {
    public boolean A;
    public volatile androidx.collection.a B;
    public Map C;
    public Object[] e;
    public int y;
    public Map z;

    public o2() {
        Map map = Collections.EMPTY_MAP;
        this.z = map;
        this.C = map;
    }

    public final p2 a(int i) {
        if (i < this.y) {
            return (p2) this.e[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        return this.z.isEmpty() ? Collections.EMPTY_SET : this.z.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int iE = e(comparable);
        if (iE >= 0) {
            return ((p2) this.e[iE]).setValue(obj);
        }
        f();
        if (this.e == null) {
            this.e = new Object[16];
        }
        int i = -(iE + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.y == 16) {
            p2 p2Var = (p2) this.e[15];
            this.y = 15;
            g().put(p2Var.e, p2Var.y);
        }
        Object[] objArr = this.e;
        int length = objArr.length;
        System.arraycopy(objArr, i, objArr, i + 1, 15 - i);
        this.e[i] = new p2(this, comparable, obj);
        this.y++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
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
        return e(comparable) >= 0 || this.z.containsKey(comparable);
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.e;
        Object obj = ((p2) objArr[i]).y;
        System.arraycopy(objArr, i + 1, objArr, i, (this.y - i) - 1);
        this.y--;
        if (!this.z.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.e;
            int i2 = this.y;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new p2(this, (Comparable) entry.getKey(), entry.getValue());
            this.y++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.y;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int iCompareTo = comparable.compareTo(((p2) this.e[i2]).e);
            if (iCompareTo > 0) {
                return -(i + 1);
            }
            if (iCompareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int iCompareTo2 = comparable.compareTo(((p2) this.e[i4]).e);
            if (iCompareTo2 < 0) {
                i2 = i4 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i4;
                }
                i3 = i4 + 1;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.B == null) {
            this.B = new androidx.collection.a(this, 2);
        }
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2)) {
            return super.equals(obj);
        }
        o2 o2Var = (o2) obj;
        int size = size();
        if (size == o2Var.size()) {
            int i = this.y;
            if (i != o2Var.y) {
                return entrySet().equals(o2Var.entrySet());
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (a(i2).equals(o2Var.a(i2))) {
                }
            }
            if (i != size) {
                return this.z.equals(o2Var.z);
            }
            return true;
        }
        return false;
    }

    public final void f() {
        if (this.A) {
            androidx.transition.k.n();
        }
    }

    public final SortedMap g() {
        f();
        if (this.z.isEmpty() && !(this.z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.z = treeMap;
            this.C = treeMap.descendingMap();
        }
        return (SortedMap) this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        return iE >= 0 ? ((p2) this.e[iE]).y : this.z.get(comparable);
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
        f();
        Comparable comparable = (Comparable) obj;
        int iE = e(comparable);
        if (iE >= 0) {
            return d(iE);
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
