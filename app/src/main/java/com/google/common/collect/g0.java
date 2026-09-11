package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends h0 {
    public final transient int A;
    public final /* synthetic */ h0 B;
    public final transient int z;

    public g0(h0 h0Var, int i, int i2) {
        this.B = h0Var;
        this.z = i;
        this.A = i2;
    }

    @Override // com.google.common.collect.b0
    public final Object[] d() {
        return this.B.d();
    }

    @Override // com.google.common.collect.b0
    public final int e() {
        return this.B.f() + this.z + this.A;
    }

    @Override // com.google.common.collect.b0
    public final int f() {
        return this.B.f() + this.z;
    }

    @Override // java.util.List
    public final Object get(int i) {
        com.google.android.material.motion.a.j(i, this.A);
        return this.B.get(i + this.z);
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return true;
    }

    @Override // com.google.common.collect.h0, com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.h0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.A;
    }

    @Override // com.google.common.collect.h0, java.util.List
    /* JADX INFO: renamed from: x */
    public final h0 subList(int i, int i2) {
        com.google.android.material.motion.a.o(i, i2, this.A);
        int i3 = this.z;
        return this.B.subList(i + i3, i2 + i3);
    }

    @Override // com.google.common.collect.h0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
