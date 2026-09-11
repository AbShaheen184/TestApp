package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends h0 {
    public final /* synthetic */ c1 z;

    public b1(c1 c1Var) {
        this.z = c1Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        c1 c1Var = this.z;
        com.google.android.material.motion.a.j(i, c1Var.C);
        Object[] objArr = c1Var.B;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.C;
    }
}
