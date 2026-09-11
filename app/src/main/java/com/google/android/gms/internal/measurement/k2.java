package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k2 extends n0 implements RandomAccess {
    public static final Object[] A;
    public static final k2 B;
    public Object[] y;
    public int z;

    static {
        Object[] objArr = new Object[0];
        A = objArr;
        B = new k2(0, false, objArr);
    }

    public k2(int i, boolean z, Object[] objArr) {
        super(z);
        this.y = objArr;
        this.z = i;
    }

    @Override // com.google.android.gms.internal.measurement.r1
    public final /* bridge */ /* synthetic */ r1 L(int i) {
        if (i >= this.z) {
            return new k2(this.z, true, i == 0 ? A : Arrays.copyOf(this.y, i));
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.z)) {
            com.google.gson.b.n(p0.a(this.z, i, (byte) 13, "Index:", ", Size:"));
            return;
        }
        int i3 = i + 1;
        Object[] objArr = this.y;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, objArr2, 0, i);
            System.arraycopy(this.y, i, objArr2, i3, this.z - i);
            this.y = objArr2;
        }
        this.y[i] = obj;
        this.z++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.z) {
            com.google.gson.b.n(p0.a(this.z, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.z;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof k2)) {
            for (int i2 = 0; i2 < i; i2++) {
                if (!this.y[i2].equals(list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        k2 k2Var = (k2) obj;
        for (int i3 = 0; i3 < i; i3++) {
            if (!this.y[i3].equals(k2Var.y[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.y[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.z;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode = (iHashCode * 31) + this.y[i2].hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.n0, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.y;
        Object obj = objArr[i];
        int i2 = this.z;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.y;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.z;
        int length = this.y.length;
        if (i == length) {
            this.y = Arrays.copyOf(this.y, com.google.android.datatransport.runtime.backends.c.o(length, 3, 2, 1, 10));
        }
        Object[] objArr = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
