package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends c implements n0, RandomAccess, s1 {
    public static final boolean[] A;
    public static final e B;
    public boolean[] y;
    public int z;

    static {
        boolean[] zArr = new boolean[0];
        A = zArr;
        B = new e(zArr, 0, false);
    }

    public e(boolean[] zArr, int i, boolean z) {
        super(z);
        this.y = zArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        if (i < 0 || i > (i2 = this.z)) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("Index:", i, ", Size:"), this.z);
            return;
        }
        boolean[] zArr = this.y;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[com.google.android.datatransport.runtime.backends.c.o(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, zArr2, 0, i);
            System.arraycopy(this.y, i, zArr2, i + 1, this.z - i);
            this.y = zArr2;
        }
        this.y[i] = zBooleanValue;
        this.z++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = u0.a;
        collection.getClass();
        if (!(collection instanceof e)) {
            return super.addAll(collection);
        }
        e eVar = (e) collection;
        int i = eVar.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.y;
        if (i3 > zArr.length) {
            this.y = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(eVar.y, 0, this.y, this.z, eVar.z);
        this.z = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(boolean z) {
        b();
        int i = this.z;
        boolean[] zArr = this.y;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[com.google.android.datatransport.runtime.backends.c.o(zArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, zArr2, 0, this.z);
            this.y = zArr2;
        }
        boolean[] zArr3 = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        zArr3[i2] = z;
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

    @Override // com.google.protobuf.t0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final e m(int i) {
        if (i >= this.z) {
            return new e(i == 0 ? A : Arrays.copyOf(this.y, i), this.z, true);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return super.equals(obj);
        }
        e eVar = (e) obj;
        if (this.z != eVar.z) {
            return false;
        }
        boolean[] zArr = eVar.y;
        for (int i = 0; i < this.z; i++) {
            if (this.y[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Boolean.valueOf(this.y[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.z; i2++) {
            int i3 = i * 31;
            boolean z = this.y[i2];
            byte[] bArr = u0.a;
            i = i3 + (z ? 1231 : 1237);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.y[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        boolean[] zArr = this.y;
        boolean z = zArr[i];
        int i2 = this.z;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            com.google.gson.b.n("toIndex < fromIndex");
            return;
        }
        boolean[] zArr = this.y;
        System.arraycopy(zArr, i2, zArr, i, this.z - i2);
        this.z -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b();
        d(i);
        boolean[] zArr = this.y;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }
}
