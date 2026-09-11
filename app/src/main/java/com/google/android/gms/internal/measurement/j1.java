package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 extends n0 implements RandomAccess, m1, i2 {
    public static final int[] A;
    public static final j1 B;
    public int[] y;
    public int z;

    static {
        int[] iArr = new int[0];
        A = iArr;
        B = new j1(iArr, 0, false);
    }

    public j1(int[] iArr, int i, boolean z) {
        super(z);
        this.y = iArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i2 = this.z)) {
            com.google.gson.b.n(p0.a(this.z, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        int[] iArr = this.y;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, iArr2, 0, i);
            System.arraycopy(this.y, i, iArr2, i3, this.z - i);
            this.y = iArr2;
        }
        this.y[i] = iIntValue;
        this.z++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        collection.getClass();
        if (!(collection instanceof j1)) {
            return super.addAll(collection);
        }
        j1 j1Var = (j1) collection;
        int i = j1Var.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.y;
        if (i3 > iArr.length) {
            this.y = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(j1Var.y, 0, this.y, this.z, j1Var.z);
        this.z = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.r1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final j1 L(int i) {
        if (i >= this.z) {
            return new j1(i == 0 ? A : Arrays.copyOf(this.y, i), this.z, true);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        f(i);
        return this.y[i];
    }

    public final void e(int i) {
        b();
        int i2 = this.z;
        int length = this.y.length;
        if (i2 == length) {
            int[] iArr = new int[com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, iArr, 0, this.z);
            this.y = iArr;
        }
        int[] iArr2 = this.y;
        int i3 = this.z;
        this.z = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return super.equals(obj);
        }
        j1 j1Var = (j1) obj;
        if (this.z != j1Var.z) {
            return false;
        }
        int[] iArr = j1Var.y;
        for (int i = 0; i < this.z; i++) {
            if (this.y[i] != iArr[i]) {
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
        return Integer.valueOf(this.y[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            i = (i * 31) + this.y[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.y[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        f(i);
        int[] iArr = this.y;
        int i2 = iArr[i];
        int i3 = this.z;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            com.google.gson.b.n("toIndex < fromIndex");
            return;
        }
        int[] iArr = this.y;
        System.arraycopy(iArr, i2, iArr, i, this.z - i2);
        this.z -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        f(i);
        int[] iArr = this.y;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
