package j$.nio.file;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements Iterator {
    public final Iterator a;

    public t(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return j$.desugar.sun.nio.fs.g.f(this.a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
    }
}
