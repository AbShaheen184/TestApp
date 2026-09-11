package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends AbstractMap {
    public static final /* synthetic */ int C = 0;
    public volatile androidx.collection.a A;
    public Map B;
    public List e;
    public Map y;
    public boolean z;

    public static w0 f() {
        w0 w0Var = new w0();
        w0Var.e = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        w0Var.y = map;
        w0Var.B = map;
        return w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0038 A[SYNTHETIC] */
    public final int a(Comparable comparable) {
        int i;
        int i2;
        int i3;
        int iCompareTo;
        int size = this.e.size();
        int i4 = size - 1;
        if (i4 < 0) {
            i = 0;
            while (i <= i4) {
                i3 = (i + i4) / 2;
                iCompareTo = comparable.compareTo(((x0) this.e.get(i3)).e);
                if (iCompareTo < 0) {
                    i4 = i3 - 1;
                } else {
                    if (iCompareTo > 0) {
                        return i3;
                    }
                    i = i3 + 1;
                }
            }
            i2 = i + 1;
        } else {
            int iCompareTo2 = comparable.compareTo(((x0) this.e.get(i4)).e);
            if (iCompareTo2 > 0) {
                i2 = size + 1;
            } else {
                if (iCompareTo2 == 0) {
                    return i4;
                }
                i = 0;
                while (i <= i4) {
                    i3 = (i + i4) / 2;
                    iCompareTo = comparable.compareTo(((x0) this.e.get(i3)).e);
                    if (iCompareTo < 0) {
                        i4 = i3 - 1;
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
        if (this.z) {
            androidx.transition.k.n();
        }
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.e.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.e.isEmpty()) {
            this.e.clear();
        }
        if (this.y.isEmpty()) {
            return;
        }
        this.y.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.y.containsKey(comparable);
    }

    public final Set d() {
        return this.y.isEmpty() ? Collections.EMPTY_SET : this.y.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.A == null) {
            this.A = new androidx.collection.a(this, 1);
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return super.equals(obj);
        }
        w0 w0Var = (w0) obj;
        int size = size();
        if (size == w0Var.size()) {
            int size2 = this.e.size();
            if (size2 != w0Var.e.size()) {
                return ((AbstractSet) entrySet()).equals(w0Var.entrySet());
            }
            for (int i = 0; i < size2; i++) {
                if (c(i).equals(w0Var.c(i))) {
                }
            }
            if (size2 != size) {
                return this.y.equals(w0Var.y);
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
            return ((x0) this.e.get(iA)).setValue(obj);
        }
        b();
        if (this.e.isEmpty() && !(this.e instanceof ArrayList)) {
            this.e = new ArrayList(16);
        }
        int i = -(iA + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.e.size() == 16) {
            x0 x0Var = (x0) this.e.remove(15);
            e().put(x0Var.e, x0Var.y);
        }
        this.e.add(i, new x0(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? ((x0) this.e.get(iA)).y : this.y.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((x0) this.e.remove(i)).y;
        if (!this.y.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.e;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new x0(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.e.size();
        int iHashCode = 0;
        for (int i = 0; i < size; i++) {
            iHashCode += ((x0) this.e.get(i)).hashCode();
        }
        return this.y.size() > 0 ? this.y.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return h(iA);
        }
        if (this.y.isEmpty()) {
            return null;
        }
        return this.y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.y.size() + this.e.size();
    }
}
