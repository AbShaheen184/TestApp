package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends k0 {
    public final transient Object A;

    public n1(Object obj) {
        obj.getClass();
        this.A = obj;
    }

    @Override // com.google.common.collect.k0, com.google.common.collect.b0
    public final h0 b() {
        return h0.s(this.A);
    }

    @Override // com.google.common.collect.b0
    public final int c(int i, Object[] objArr) {
        objArr[i] = this.A;
        return i + 1;
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A.equals(obj);
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return false;
    }

    @Override // com.google.common.collect.k0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override // com.google.common.collect.b0
    /* JADX INFO: renamed from: i */
    public final p1 iterator() {
        return new o0(this.A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.A.toString() + ']';
    }
}
