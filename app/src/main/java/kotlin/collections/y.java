package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e;
    public final Iterator y;
    public int z;

    public y(kotlin.sequences.c cVar) {
        this.e = 1;
        this.y = cVar.a.iterator();
        this.z = cVar.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.e) {
            case 0:
                return this.y.hasNext();
            case 1:
                break;
            default:
                return this.z > 0 && this.y.hasNext();
        }
        while (true) {
            int i = this.z;
            it = this.y;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.z--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.e) {
            case 0:
                int i = this.z;
                this.z = i + 1;
                if (i >= 0) {
                    return new x(i, this.y.next());
                }
                com.google.common.base.c.w();
                throw null;
            case 1:
                break;
            default:
                int i2 = this.z;
                if (i2 != 0) {
                    this.z = i2 - 1;
                    return this.y.next();
                }
                org.mozilla.javascript.typedarrays.c.a();
                return null;
        }
        while (true) {
            int i3 = this.z;
            it = this.y;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.z--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(kotlin.sequences.m mVar) {
        this.e = 2;
        this.z = 5;
        this.y = mVar.a.iterator();
    }

    public y(Iterator it) {
        this.e = 0;
        it.getClass();
        this.y = it;
    }
}
