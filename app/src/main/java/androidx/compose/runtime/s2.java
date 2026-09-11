package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 implements androidx.compose.runtime.tooling.c, Iterable, kotlin.jvm.internal.markers.a {
    public final f2 e;
    public final int y;
    public final y1 z;

    public s2(f2 f2Var, int i, n0 n0Var, y1 y1Var) {
        this.e = f2Var;
        this.y = i;
        this.z = y1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) obj;
        return s2Var.y == this.y && s2Var.e.equals(this.e) && s2Var.z.equals(this.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.e.hashCode() + (this.y * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new r2(this.e, this.y, null, this.z);
    }
}
