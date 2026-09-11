package com.google.common.collect;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends p1 {
    public final Object e;
    public boolean y;

    public o0(Object obj) {
        this.e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.y) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        this.y = true;
        return this.e;
    }
}
