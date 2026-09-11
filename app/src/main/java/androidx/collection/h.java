package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Collection, Set, kotlin.jvm.internal.markers.b, kotlin.jvm.internal.markers.e {
    public int[] e;
    public Object[] y;
    public int z;

    public h(int i) {
        this.e = androidx.collection.internal.a.a;
        this.y = androidx.collection.internal.a.c;
        if (i > 0) {
            this.e = new int[i];
            this.y = new Object[i];
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iB;
        int i2 = this.z;
        if (obj == null) {
            iB = t.b(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iB = t.b(this, obj, iHashCode);
        }
        if (iB >= 0) {
            return false;
        }
        int i3 = ~iB;
        int[] iArr = this.e;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.y;
            int[] iArr2 = new int[i4];
            this.e = iArr2;
            this.y = new Object[i4];
            if (i2 != this.z) {
                g.d();
                return false;
            }
            if (iArr2.length != 0) {
                kotlin.collections.n.G(0, iArr.length, 6, iArr, iArr2);
                kotlin.collections.n.H(0, objArr.length, 6, objArr, this.y);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.e;
            int i5 = i3 + 1;
            kotlin.collections.n.C(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.y;
            kotlin.collections.n.D(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.z;
        if (i2 == i6) {
            int[] iArr4 = this.e;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.y[i3] = obj;
                this.z = i6 + 1;
                return true;
            }
        }
        g.d();
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.z;
        int i = this.z;
        int[] iArr = this.e;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.y;
            int[] iArr2 = new int[size];
            this.e = iArr2;
            this.y = new Object[size];
            if (i > 0) {
                kotlin.collections.n.G(0, i, 6, iArr, iArr2);
                kotlin.collections.n.H(0, this.z, 6, objArr, this.y);
            }
        }
        if (this.z != i) {
            g.d();
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object b(int i) {
        int i2 = this.z;
        Object[] objArr = this.y;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.e;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                kotlin.collections.n.C(i, i4, i2, iArr, iArr);
                Object[] objArr2 = this.y;
                kotlin.collections.n.D(i, i4, i2, objArr2, objArr2);
            }
            this.y[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.e = iArr2;
            this.y = new Object[i5];
            if (i > 0) {
                kotlin.collections.n.G(0, i, 6, iArr, iArr2);
                kotlin.collections.n.H(0, i, 6, objArr, this.y);
            }
            if (i < i3) {
                int i6 = i + 1;
                kotlin.collections.n.C(i, i6, i2, iArr, this.e);
                kotlin.collections.n.D(i, i6, i2, objArr, this.y);
            }
        }
        if (i2 == this.z) {
            this.z = i3;
            return obj;
        }
        g.d();
        return null;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.z != 0) {
            this.e = androidx.collection.internal.a.a;
            this.y = androidx.collection.internal.a.c;
            this.z = 0;
        }
        if (this.z == 0) {
            return;
        }
        g.d();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? t.b(this, null, 0) : t.b(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.z != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.z;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.y[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.e;
        int i = this.z;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.z <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iB = obj == null ? t.b(this, null, 0) : t.b(this, obj, obj.hashCode());
        if (iB < 0) {
            return false;
        }
        b(iB);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.z - 1; -1 < i; i--) {
            if (!kotlin.collections.o.G(collection, this.y[i])) {
                b(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.z;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.z;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        kotlin.collections.n.D(0, 0, this.z, this.y, objArr);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.z * 14);
        sb.append('{');
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.y[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return kotlin.collections.n.J(this.y, 0, this.z);
    }
}
