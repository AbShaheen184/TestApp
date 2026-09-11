package com.google.common.collect;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends h0 {
    public final transient h0 z;

    public f0(h0 h0Var) {
        this.z = h0Var;
    }

    @Override // com.google.common.collect.h0, com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.z.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0 h0Var = this.z;
        com.google.android.material.motion.a.j(i, h0Var.size());
        return h0Var.get((h0Var.size() - 1) - i);
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return this.z.h();
    }

    @Override // com.google.common.collect.h0, java.util.List
    public final int indexOf(Object obj) {
        h0 h0Var = this.z;
        int iLastIndexOf = h0Var.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (h0Var.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // com.google.common.collect.h0, com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.h0, java.util.List
    public final int lastIndexOf(Object obj) {
        h0 h0Var = this.z;
        int iIndexOf = h0Var.indexOf(obj);
        if (iIndexOf >= 0) {
            return (h0Var.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // com.google.common.collect.h0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.z.size();
    }

    @Override // com.google.common.collect.h0
    public final h0 v() {
        return this.z;
    }

    @Override // com.google.common.collect.h0, java.util.List
    /* JADX INFO: renamed from: x */
    public final h0 subList(int i, int i2) {
        h0 h0Var = this.z;
        com.google.android.material.motion.a.o(i, i2, h0Var.size());
        return h0Var.subList(h0Var.size() - i2, h0Var.size() - i).v();
    }

    @Override // com.google.common.collect.h0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
