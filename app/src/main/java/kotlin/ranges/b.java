package kotlin.ranges;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Iterable, kotlin.jvm.internal.markers.a {
    public final int e;
    public final int y;
    public final int z;

    public b(int i, int i2, int i3) {
        if (i3 == 0) {
            net.luminis.tls.engine.impl.c.o("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            net.luminis.tls.engine.impl.c.o("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.e = i;
        this.y = com.google.android.material.sidesheet.b.q(i, i2, i3);
        this.z = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (isEmpty() && ((b) obj).isEmpty()) {
            return true;
        }
        b bVar = (b) obj;
        return this.e == bVar.e && this.y == bVar.y && this.z == bVar.z;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.e * 31) + this.y) * 31) + this.z;
    }

    public boolean isEmpty() {
        int i = this.y;
        int i2 = this.z;
        int i3 = this.e;
        if (i2 > 0) {
            return i3 > i;
        }
        return i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new c(this.e, this.y, this.z);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.y;
        int i2 = this.z;
        int i3 = this.e;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
