package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 implements androidx.compose.runtime.tooling.c, Iterable, kotlin.jvm.internal.markers.a {
    public final f2 e;
    public final int y;
    public final int z;

    public g2(f2 f2Var, int i, int i2) {
        this.e = f2Var;
        this.y = i;
        this.z = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        return g2Var.y == this.y && g2Var.z == this.z && g2Var.e.equals(this.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() * 31) + this.y;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        f2 f2Var = this.e;
        if (f2Var.E != this.z) {
            h2.e();
        }
        int i = this.y;
        f2Var.h(i);
        return new m0(f2Var, i + 1, f2Var.e[(i * 5) + 3] + i);
    }
}
