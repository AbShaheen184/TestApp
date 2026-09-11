package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements ListIterator {
    public boolean e;
    public final /* synthetic */ ListIterator y;
    public final /* synthetic */ r0 z;

    public q0(r0 r0Var, ListIterator listIterator) {
        this.y = listIterator;
        this.z = r0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        ListIterator listIterator = this.y;
        listIterator.add(obj);
        listIterator.previous();
        this.e = false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.y.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.y.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ListIterator listIterator = this.y;
        if (listIterator.hasPrevious()) {
            this.e = true;
            return listIterator.previous();
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.z.b(this.y.nextIndex());
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ListIterator listIterator = this.y;
        if (listIterator.hasNext()) {
            this.e = true;
            return listIterator.next();
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return nextIndex() - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        com.google.android.material.motion.a.p("no calls to next() since the last call to remove()", this.e);
        this.y.remove();
        this.e = false;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        com.google.android.material.motion.a.q(this.e);
        this.y.set(obj);
    }
}
