package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 implements Iterator {
    public final Iterator e;

    public o1(Iterator it) {
        it.getClass();
        this.e = it;
    }

    public abstract Object b(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return b(this.e.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.e.remove();
    }
}
