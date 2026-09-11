package kotlin.collections;

import androidx.collection.b1;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b1 implements ListIterator {
    public final /* synthetic */ e A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i) {
        super(eVar, 6);
        this.A = eVar;
        int iB = eVar.b();
        if (i < 0 || i > iB) {
            com.google.gson.b.n(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.f("index: ", i, ", size: ", iB));
            throw null;
        }
        this.y = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.y > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.y;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        int i = this.y - 1;
        this.y = i;
        return this.A.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.y - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
