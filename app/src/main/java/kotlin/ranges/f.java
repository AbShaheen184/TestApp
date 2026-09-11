package kotlin.ranges;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Iterable, kotlin.jvm.internal.markers.a {
    public final long e;
    public final long y;
    public final long z;

    public f(long j, long j2) {
        this.e = j;
        if (j < j2) {
            long j3 = j2 % 1;
            long j4 = j % 1;
            long j5 = ((j3 < 0 ? j3 + 1 : j3) - (j4 < 0 ? j4 + 1 : j4)) % 1;
            j2 -= j5 < 0 ? j5 + 1 : j5;
        }
        this.y = j2;
        this.z = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        long j = this.e;
        long j2 = this.y;
        if (j > j2) {
            f fVar = (f) obj;
            if (fVar.e > fVar.y) {
                return true;
            }
        }
        f fVar2 = (f) obj;
        return j == fVar2.e && j2 == fVar2.y;
    }

    public final int hashCode() {
        long j = this.e;
        long j2 = this.y;
        if (j > j2) {
            return -1;
        }
        return (int) ((((long) 31) * (j ^ (j >>> 32))) + ((j2 >>> 32) ^ j2));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this.e, this.y, this.z);
    }

    public final String toString() {
        return this.e + ".." + this.y;
    }
}
