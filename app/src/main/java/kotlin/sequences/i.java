package kotlin.sequences;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j implements Iterator, kotlin.coroutines.d, kotlin.jvm.internal.markers.a {
    public kotlin.coroutines.d A;
    public int e;
    public Object y;
    public Iterator z;

    @Override // kotlin.sequences.j
    public final void b(Object obj, kotlin.coroutines.d dVar) {
        this.y = obj;
        this.e = 3;
        this.A = dVar;
        dVar.getClass();
    }

    public final RuntimeException c() {
        int i = this.e;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.e);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.i getContext() {
        return kotlin.coroutines.j.e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                Iterator it = this.z;
                it.getClass();
                if (it.hasNext()) {
                    this.e = 2;
                    return true;
                }
                this.z = null;
            }
            this.e = 5;
            kotlin.coroutines.d dVar = this.A;
            dVar.getClass();
            this.A = null;
            dVar.resumeWith(y.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.e;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        if (i == 2) {
            this.e = 1;
            Iterator it = this.z;
            it.getClass();
            return it.next();
        }
        if (i != 3) {
            throw c();
        }
        this.e = 0;
        Object obj = this.y;
        this.y = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.d
    public final void resumeWith(Object obj) {
        kotlin.a.e(obj);
        this.e = 4;
    }
}
