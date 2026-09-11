package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractSet {
    public final int e;
    public final /* synthetic */ w y;

    public v(w wVar, int i) {
        this.y = wVar;
        this.e = i;
    }

    public final int b() {
        int i = this.e;
        if (i == -1) {
            return 0;
        }
        return this.y.y[i];
    }

    public final int c() {
        return this.y.y[this.e + 1];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.y.e, b(), c(), obj, this.e == -1 ? w.C : x.b) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c() - b();
    }
}
