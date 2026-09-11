package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends k0 {
    public static final Object[] F;
    public static final h1 G;
    public final transient Object[] A;
    public final transient int B;
    public final transient Object[] C;
    public final transient int D;
    public final transient int E;

    static {
        Object[] objArr = new Object[0];
        F = objArr;
        G = new h1(0, 0, 0, objArr, objArr);
    }

    public h1(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.A = objArr;
        this.B = i;
        this.C = objArr2;
        this.D = i2;
        this.E = i3;
    }

    @Override // com.google.common.collect.b0
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.A;
        int i2 = this.E;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.C;
            if (objArr.length != 0) {
                int iT = q.t(obj);
                while (true) {
                    int i = iT & this.D;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iT = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.b0
    public final Object[] d() {
        return this.A;
    }

    @Override // com.google.common.collect.b0
    public final int e() {
        return this.E;
    }

    @Override // com.google.common.collect.b0
    public final int f() {
        return 0;
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.k0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.B;
    }

    @Override // com.google.common.collect.b0
    /* JADX INFO: renamed from: i */
    public final p1 iterator() {
        return b().listIterator(0);
    }

    @Override // com.google.common.collect.k0
    public final h0 n() {
        return h0.j(this.E, this.A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.E;
    }
}
