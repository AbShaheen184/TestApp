package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class c implements Iterator {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e = 0;
    public final Iterator y;
    public Object z;

    public c(l lVar) {
        this.A = lVar;
        Collection collection = lVar.y;
        this.z = collection;
        this.y = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    public void b() {
        l lVar = (l) this.A;
        lVar.c();
        if (lVar.y == ((Collection) this.z)) {
            return;
        }
        androidx.collection.g.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            default:
                b();
                break;
        }
        return this.y.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                Map.Entry entry = (Map.Entry) this.y.next();
                this.z = (Collection) entry.getValue();
                return ((d) this.A).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.y.next();
                this.z = entry2;
                return entry2.getKey();
            default:
                b();
                return this.y.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                com.google.android.material.motion.a.p("no calls to next() since the last call to remove()", ((Collection) this.z) != null);
                this.y.remove();
                ((d) this.A).A.B -= ((Collection) this.z).size();
                ((Collection) this.z).clear();
                this.z = null;
                break;
            case 1:
                com.google.android.material.motion.a.p("no calls to next() since the last call to remove()", ((Map.Entry) this.z) != null);
                Collection collection = (Collection) ((Map.Entry) this.z).getValue();
                this.y.remove();
                ((e) this.A).y.B -= collection.size();
                collection.clear();
                this.z = null;
                break;
            default:
                this.y.remove();
                l lVar = (l) this.A;
                lVar.B.B--;
                lVar.d();
                break;
        }
    }

    public c(l lVar, ListIterator listIterator) {
        this.A = lVar;
        this.z = lVar.y;
        this.y = listIterator;
    }

    public c(e eVar, Iterator it) {
        this.y = it;
        this.A = eVar;
    }

    public c(d dVar) {
        this.A = dVar;
        this.y = dVar.z.entrySet().iterator();
    }
}
