package kotlin.collections;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements Iterator, kotlin.jvm.internal.markers.a {
    public int e;
    public Object y;

    public abstract void b();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.e;
        if (i == 0) {
            this.e = 3;
            b();
            return this.e == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        net.luminis.tls.engine.impl.c.o("hasNext called when the iterator is in the FAILED state.");
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 1) {
            this.e = 0;
            return this.y;
        }
        if (i != 2) {
            this.e = 3;
            b();
            if (this.e == 1) {
                this.e = 0;
                return this.y;
            }
        }
        org.mozilla.javascript.typedarrays.c.a();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
