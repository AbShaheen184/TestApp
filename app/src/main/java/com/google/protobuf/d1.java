package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends c implements s0, RandomAccess, s1 {
    public static final long[] A;
    public static final d1 B;
    public long[] y;
    public int z;

    static {
        long[] jArr = new long[0];
        A = jArr;
        B = new d1(jArr, 0, false);
    }

    public d1(long[] jArr, int i, boolean z) {
        super(z);
        this.y = jArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        b();
        if (i < 0 || i > (i2 = this.z)) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("Index:", i, ", Size:"), this.z);
            return;
        }
        long[] jArr = this.y;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[com.google.android.datatransport.runtime.backends.c.o(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, jArr2, 0, i);
            System.arraycopy(this.y, i, jArr2, i + 1, this.z - i);
            this.y = jArr2;
        }
        this.y[i] = jLongValue;
        this.z++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = u0.a;
        collection.getClass();
        if (!(collection instanceof d1)) {
            return super.addAll(collection);
        }
        d1 d1Var = (d1) collection;
        int i = d1Var.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.y;
        if (i3 > jArr.length) {
            this.y = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(d1Var.y, 0, this.y, this.z, d1Var.z);
        this.z = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(long j) {
        b();
        int i = this.z;
        long[] jArr = this.y;
        if (i == jArr.length) {
            long[] jArr2 = new long[com.google.android.datatransport.runtime.backends.c.o(jArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, jArr2, 0, this.z);
            this.y = jArr2;
        }
        long[] jArr3 = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.z) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("Index:", i, ", Size:"), this.z);
        }
    }

    public final long e(int i) {
        d(i);
        return this.y[i];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        if (this.z != d1Var.z) {
            return false;
        }
        long[] jArr = d1Var.y;
        for (int i = 0; i < this.z; i++) {
            if (this.y[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.t0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final d1 m(int i) {
        if (i >= this.z) {
            return new d1(i == 0 ? A : Arrays.copyOf(this.y, i), this.z, true);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(e(i));
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i = 0; i < this.z; i++) {
            iA = (iA * 31) + u0.a(this.y[i]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.y[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        long[] jArr = this.y;
        long j = jArr[i];
        int i2 = this.z;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            com.google.gson.b.n("toIndex < fromIndex");
            return;
        }
        long[] jArr = this.y;
        System.arraycopy(jArr, i2, jArr, i, this.z - i2);
        this.z -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        d(i);
        long[] jArr = this.y;
        long j = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Long) obj).longValue());
        return true;
    }
}
