package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends c implements q0, RandomAccess, s1 {
    public static final float[] A;
    public static final f0 B;
    public float[] y;
    public int z;

    static {
        float[] fArr = new float[0];
        A = fArr;
        B = new f0(fArr, 0, false);
    }

    public f0(float[] fArr, int i, boolean z) {
        super(z);
        this.y = fArr;
        this.z = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        b();
        if (i < 0 || i > (i2 = this.z)) {
            com.google.gson.b.j(androidx.privacysandbox.ads.adservices.java.internal.a.v("Index:", i, ", Size:"), this.z);
            return;
        }
        float[] fArr = this.y;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[com.google.android.datatransport.runtime.backends.c.o(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, fArr2, 0, i);
            System.arraycopy(this.y, i, fArr2, i + 1, this.z - i);
            this.y = fArr2;
        }
        this.y[i] = fFloatValue;
        this.z++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        byte[] bArr = u0.a;
        collection.getClass();
        if (!(collection instanceof f0)) {
            return super.addAll(collection);
        }
        f0 f0Var = (f0) collection;
        int i = f0Var.z;
        if (i == 0) {
            return false;
        }
        int i2 = this.z;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.y;
        if (i3 > fArr.length) {
            this.y = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(f0Var.y, 0, this.y, this.z, f0Var.z);
        this.z = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(float f) {
        b();
        int i = this.z;
        float[] fArr = this.y;
        if (i == fArr.length) {
            float[] fArr2 = new float[com.google.android.datatransport.runtime.backends.c.o(fArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.y, 0, fArr2, 0, this.z);
            this.y = fArr2;
        }
        float[] fArr3 = this.y;
        int i2 = this.z;
        this.z = i2 + 1;
        fArr3[i2] = f;
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
    public final f0 m(int i) {
        if (i >= this.z) {
            return new f0(i == 0 ? A : Arrays.copyOf(this.y, i), this.z, true);
        }
        net.luminis.tls.engine.impl.c.a();
        return null;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return super.equals(obj);
        }
        f0 f0Var = (f0) obj;
        if (this.z != f0Var.z) {
            return false;
        }
        float[] fArr = f0Var.y;
        for (int i = 0; i < this.z; i++) {
            if (Float.floatToIntBits(this.y[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        d(i);
        return Float.valueOf(this.y[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.z; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.y[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.y[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        d(i);
        float[] fArr = this.y;
        float f = fArr[i];
        int i2 = this.z;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.z--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            com.google.gson.b.n("toIndex < fromIndex");
            return;
        }
        float[] fArr = this.y;
        System.arraycopy(fArr, i2, fArr, i, this.z - i2);
        this.z -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        b();
        d(i);
        float[] fArr = this.y;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Float) obj).floatValue());
        return true;
    }
}
