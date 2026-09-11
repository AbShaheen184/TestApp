package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Iterator {
    public final /* synthetic */ x0 B;
    public final Iterator e;
    public Object y = null;
    public Collection z = null;
    public Iterator A = n0.e;

    public a(x0 x0Var) {
        this.B = x0Var;
        this.e = x0Var.A.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e.hasNext() || this.A.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A.hasNext()) {
            Map.Entry entry = (Map.Entry) this.e.next();
            this.y = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.z = collection;
            this.A = collection.iterator();
        }
        return this.A.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A.remove();
        Collection collection = this.z;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.e.remove();
        }
        this.B.B--;
    }
}
