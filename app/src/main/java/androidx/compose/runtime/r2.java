package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements Iterator, kotlin.jvm.internal.markers.a {
    public final int A;
    public int B;
    public final f2 e;
    public final int y;
    public final s z;

    public r2(f2 f2Var, int i, n0 n0Var, s sVar) {
        this.e = f2Var;
        this.y = i;
        this.z = sVar;
        this.A = f2Var.E;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
