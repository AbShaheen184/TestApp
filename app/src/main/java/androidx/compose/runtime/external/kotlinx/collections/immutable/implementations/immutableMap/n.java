package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements Iterator, kotlin.jvm.internal.markers.a {
    public Object[] e = m.e.d;
    public int y;
    public int z;

    public final void b(Object[] objArr, int i, int i2) {
        this.e = objArr;
        this.y = i;
        this.z = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z < this.y;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
