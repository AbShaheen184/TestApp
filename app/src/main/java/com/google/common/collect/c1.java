package com.google.common.collect;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends k0 {
    public final transient f1 A;
    public final transient Object[] B;
    public final transient int C;

    public c1(f1 f1Var, Object[] objArr, int i) {
        this.A = f1Var;
        this.B = objArr;
        this.C = i;
    }

    @Override // com.google.common.collect.b0
    public final int c(int i, Object[] objArr) {
        return b().c(i, objArr);
    }

    @Override // com.google.common.collect.b0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.A.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.b0
    public final boolean h() {
        return true;
    }

    @Override // com.google.common.collect.b0
    /* JADX INFO: renamed from: i */
    public final p1 iterator() {
        return b().listIterator(0);
    }

    @Override // com.google.common.collect.k0
    public final h0 n() {
        return new b1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.C;
    }
}
