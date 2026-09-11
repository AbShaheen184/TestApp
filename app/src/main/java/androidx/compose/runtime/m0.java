package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements Iterator, kotlin.jvm.internal.markers.a {
    public final int A;
    public final f2 e;
    public final int y;
    public int z;

    public m0(f2 f2Var, int i, int i2) {
        this.e = f2Var;
        this.y = i2;
        this.z = i;
        this.A = f2Var.E;
        if (f2Var.D) {
            h2.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.z < this.y;
    }

    @Override // java.util.Iterator
    public final Object next() {
        f2 f2Var = this.e;
        int i = f2Var.E;
        int i2 = this.A;
        if (i != i2) {
            h2.e();
        }
        int i3 = this.z;
        this.z = f2Var.e[(i3 * 5) + 3] + i3;
        return new g2(f2Var, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
