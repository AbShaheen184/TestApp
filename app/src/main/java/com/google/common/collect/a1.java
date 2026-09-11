package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends h0 {
    public static final a1 B = new a1(new Object[0], 0);
    public final transient int A;
    public final transient Object[] z;

    public a1(Object[] objArr, int i) {
        this.z = objArr;
        this.A = i;
    }

    @Override // com.google.common.collect.h0, com.google.common.collect.b0
    public final int c(int i, Object[] objArr) {
        Object[] objArr2 = this.z;
        int i2 = this.A;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.b0
    public final Object[] d() {
        return this.z;
    }

    @Override // com.google.common.collect.b0
    public final int e() {
        return this.A;
    }

    @Override // com.google.common.collect.b0
    public final int f() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.google.android.material.motion.a.j(i, this.A);
        Object obj = this.z[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }
}
