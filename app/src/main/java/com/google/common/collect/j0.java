package com.google.common.collect;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends a0 {
    @Override // com.google.common.collect.a0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public j0 a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public k0 g() {
        int i = this.b;
        if (i == 0) {
            int i2 = k0.z;
            return h1.G;
        }
        Object[] objArr = this.a;
        if (i != 1) {
            k0 k0VarK = k0.k(i, objArr);
            this.b = k0VarK.size();
            this.c = true;
            return k0VarK;
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        int i3 = k0.z;
        return new n1(obj);
    }
}
