package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 implements kotlin.jvm.internal.markers.e, Set, kotlin.jvm.internal.markers.a {
    public final k0 e;
    public final k0 y;

    public n0(k0 k0Var) {
        k0Var.getClass();
        this.e = k0Var;
        this.y = k0Var;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.y.a(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        k0 k0Var = this.y;
        k0Var.getClass();
        int i = k0Var.g;
        for (Object obj : collection) {
            int iD = k0Var.d(obj);
            k0Var.b[iD] = obj;
            long[] jArr = k0Var.c;
            int i2 = k0Var.d;
            jArr[iD] = (((long) i2) & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((((long) iD) & 2147483647L) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            k0Var.d = iD;
            if (k0Var.e == Integer.MAX_VALUE) {
                k0Var.e = iD;
            }
        }
        return i != k0Var.g;
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
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.e, ((n0) obj).e);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.e.g == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new m0(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.y.g(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int iNumberOfTrailingZeros;
        collection.getClass();
        k0 k0Var = this.y;
        k0Var.getClass();
        int i = k0Var.g;
        Iterator it = collection.iterator();
        while (true) {
            int i2 = 1;
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            int iHashCode = (next != null ? next.hashCode() : 0) * (-862048943);
            int i4 = iHashCode ^ (iHashCode << 16);
            int i5 = i4 & 127;
            int i6 = k0Var.f;
            int i7 = (i4 >>> 7) & i6;
            while (true) {
                long[] jArr = k0Var.a;
                int i8 = i7 >> 3;
                int i9 = (i7 & 7) << 3;
                int i10 = i2;
                int i11 = i3;
                long j = (((-i9) >> 63) & (jArr[i8 + i2] << (64 - i9))) | (jArr[i8] >>> i9);
                long j2 = (((long) i5) * 72340172838076673L) ^ j;
                long j3 = -9187201950435737472L;
                long j4 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
                while (j4 != 0) {
                    iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i6;
                    long j5 = j3;
                    if (kotlin.jvm.internal.l.a(k0Var.b[iNumberOfTrailingZeros], next)) {
                        break;
                    }
                    j4 &= j4 - 1;
                    j3 = j5;
                }
                if ((j & ((~j) << 6) & j3) != 0) {
                    iNumberOfTrailingZeros = -1;
                    break;
                }
                i3 = i11 + 8;
                i7 = (i7 + i3) & i6;
                i2 = i10;
            }
            if (iNumberOfTrailingZeros >= 0) {
                k0Var.h(iNumberOfTrailingZeros);
            }
        }
        return i != k0Var.g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        return this.y.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.e.g;
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
