package kotlin.time;

import kotlin.collections.a0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public final long e;

    public static long a(long j) {
        return (1 | (j - 1)) == Long.MAX_VALUE ? a.l(a0.t(j)) : a0.D(e.b(), j);
    }

    public static final long d(long j, long j2) {
        int i = e.b;
        if (((j2 - 1) | 1) != Long.MAX_VALUE) {
            return (1 | (j - 1)) == Long.MAX_VALUE ? a0.t(j) : a0.D(j, j2);
        }
        if (j != j2) {
            return a.l(a0.t(j2));
        }
        g gVar = a.y;
        return 0L;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        f fVar = (f) obj;
        fVar.getClass();
        return a.e(d(this.e, fVar.e), 0L);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.e == ((f) obj).e;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e);
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.e + ')';
    }
}
