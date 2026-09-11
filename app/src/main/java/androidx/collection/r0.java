package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements kotlin.jvm.internal.markers.e, Set, kotlin.jvm.internal.markers.a {
    public final p0 e;
    public final p0 y;

    public r0(p0 p0Var) {
        this.e = p0Var;
        this.y = p0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.y.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        p0 p0Var = this.y;
        int i = p0Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p0Var.k(it.next());
        }
        return i != p0Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.y.b();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.e.c(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.e.c(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r0.class != obj.getClass()) {
            return false;
        }
        return this.e.equals(((r0) obj).e);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.g();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.y.l(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        p0 p0Var = this.y;
        int i = p0Var.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p0Var.i(it.next());
        }
        return i != p0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:5:0x0014->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0056 A[EDGE_INSN: B:24:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:5:0x0014->B:17:0x0053], SYNTHETIC] */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        p0 p0Var = this.y;
        Object[] objArr = p0Var.b;
        int i = p0Var.d;
        long[] jArr = p0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!kotlin.collections.o.G(collection, objArr[i5])) {
                                p0Var.m(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                    if (i2 != length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return i != p0Var.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.d;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return kotlin.jvm.internal.k.c(this, objArr);
    }

    public final String toString() {
        return this.e.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.k.b(this);
    }
}
