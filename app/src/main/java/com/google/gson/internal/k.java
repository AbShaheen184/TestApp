package com.google.gson.internal;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Iterator {
    public final /* synthetic */ n A;
    public final /* synthetic */ int B;
    public m e;
    public m y = null;
    public int z;

    public k(n nVar, int i) {
        this.B = i;
        this.A = nVar;
        this.e = nVar.C.A;
        this.z = nVar.B;
    }

    public final Object b() {
        return c();
    }

    public final m c() {
        m mVar = this.e;
        n nVar = this.A;
        if (mVar == nVar.C) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        if (nVar.B != this.z) {
            androidx.collection.g.d();
            return null;
        }
        this.e = mVar.A;
        this.y = mVar;
        return mVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e != this.A.C;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.B) {
            case 1:
                return c().C;
            default:
                return b();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        m mVar = this.y;
        if (mVar == null) {
            org.mozilla.javascript.c.a();
            return;
        }
        n nVar = this.A;
        nVar.c(mVar, true);
        this.y = null;
        this.z = nVar.B;
    }
}
