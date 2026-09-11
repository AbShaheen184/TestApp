package com.google.android.gms.measurement.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Iterator {
    public final Iterator e;

    public s(t tVar) {
        this.e = tVar.e.keySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.e.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
