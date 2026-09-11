package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends a0 {
    @Override // com.google.common.collect.a0
    public final a0 a(Object obj) {
        b(obj);
        return this;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        q.e(length, objArr);
        d(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final a1 g() {
        this.c = true;
        return h0.j(this.b, this.a);
    }
}
