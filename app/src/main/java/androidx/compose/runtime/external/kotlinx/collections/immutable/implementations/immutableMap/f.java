package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.ui.graphics.vector.g0;
import androidx.compose.ui.graphics.vector.i0;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterator, kotlin.jvm.internal.markers.a {
    public final /* synthetic */ int e = 0;
    public final Iterator y;

    public f(androidx.compose.runtime.internal.i iVar) {
        n[] nVarArr = new n[8];
        for (int i = 0; i < 8; i++) {
            nVarArr[i] = new p(this);
        }
        this.y = new d(iVar, nVarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.e) {
            case 0:
                return ((d) this.y).z;
            default:
                return this.y.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.e) {
            case 0:
                return (Map.Entry) ((d) this.y).next();
            default:
                return (i0) this.y.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.e) {
            case 0:
                ((d) this.y).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(g0 g0Var) {
        this.y = g0Var.G.iterator();
    }
}
