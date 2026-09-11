package j$.nio.file;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements Iterator {
    public int a = 0;
    public final /* synthetic */ Path b;

    public n(Path path) {
        this.b = path;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a < this.b.getNameCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a < this.b.getNameCount()) {
            Path name = this.b.getName(this.a);
            this.a++;
            return name;
        }
        throw new NoSuchElementException();
    }
}
