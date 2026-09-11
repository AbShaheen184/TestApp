package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 extends n0 implements RandomAccess, q1, i2 {
    public static final long[] A;
    public static final x1 B;
    public long[] y;
    public int z;

    static {
        long[] jArr = new long[0];
        A = jArr;
        B = new x1(jArr, 0, false);
    }

    public x1(long[] jArr, int i, boolean z) {
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
            com.google.gson.b.n(p0.a(this.z, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        long[] jArr = this.y;
        int length = jArr.length;
        if (i2 < length) {
            System.arraycopy(jArr, i, jArr, i3, i2 - i);
        } else {
            long[] jArr2 = new long[com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, jArr2, 0, i);
            System.arraycopy(this.y, i, jArr2, i3, this.z - i);
            this.y = jArr2;
        }
        this.y[i] = jLongValue;
        this.z++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof x1)) {
            return super.addAll(collection);
        }
        x1 x1Var = (x1) collection;
        int i = x1Var.z;
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
        System.arraycopy(x1Var.y, 0, this.y, this.z, x1Var.z);
        this.z = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        f(i);
        return this.y[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.r1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final x1 L(int i) {
        if (i >= this.z) {
            return new x1(i == 0 ? A : Arrays.copyOf(this.y, i), this.z, true);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    public final void e(long j) {
        b();
        int i = this.z;
        int length = this.y.length;
        if (i == length) {
            long[] jArr = new long[com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, jArr, 0, this.z);
            this.y = jArr;
        }
        long[] jArr2 = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        jArr2[i2] = j;
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return super.equals(obj);
        }
        x1 x1Var = (x1) obj;
        if (this.z != x1Var.z) {
            return false;
        }
        long[] jArr = x1Var.y;
        for (int i = 0; i < this.z; i++) {
            if (this.y[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.z) {
            com.google.gson.b.n(p0.a(this.z, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Long.valueOf(this.y[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            long j = this.y[i2];
            byte[] bArr = p1.a;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
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

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        f(i);
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
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        b();
        f(i);
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
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Long) obj).longValue());
        return true;
    }
}
