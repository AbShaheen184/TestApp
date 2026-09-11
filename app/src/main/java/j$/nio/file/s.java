package j$.nio.file;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class s implements Iterable {
    public final Iterable a;

    public s(Iterable iterable) {
        this.a = iterable;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t(this.a.iterator());
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        this.a.forEach(new q(consumer, 1));
    }
}
